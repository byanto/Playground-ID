import java.util.ArrayList;
import java.util.List;

public class KMeans {

	private double[][] m_data;
	private double[][] m_clusters;
	
	public static void main(String[] args) {
		KMeans km = new KMeans();
		km.processArguments(args);
		System.out.println("Data [" + km.m_data.length + " items]:");
		for(int i = 0; i < km.m_data.length; i++){
			System.out.println("(" + km.m_data[i][0] + "," 
					+ km.m_data[i][1] + ")");
		}
		
		System.out.println("\nClusters [" + km.m_clusters.length + " items]:");
		for(int i = 0; i < km.m_clusters.length; i++){
			System.out.println("(" + km.m_clusters[i][0] + "," 
					+ km.m_clusters[i][1] + ")");
		}
		
		// Continue working with KMeans-Algorithm
	}
	
	private void processArguments(String[] args){
		boolean isData = false;
		List<double[]> dataList = new ArrayList<double[]>();
		List<double[]> clusterList = new ArrayList<double[]>();
		
		for(String arg : args){
			switch (arg) {
			case "-data":
				isData = true;
				break;
			case "-clusters":
				isData = false;
				break;
			default:
				double[] result = convertToArray(arg);
				if(isData){
					dataList.add(result);
				}else{
					clusterList.add(result);
				}
				break;
			}
		}
		
		m_data = new double[dataList.size()][2];
		for(int i = 0; i < dataList.size(); i++){
			m_data[i] = dataList.get(i);
		}
		
		m_clusters = new double[clusterList.size()][2];
		for(int i = 0; i < clusterList.size(); i++){
			m_clusters[i] = clusterList.get(i);
		}
		
	}
	
	private double[] convertToArray(String arg){
		if(!(arg.startsWith("(") && arg.endsWith(")"))){
			throw new IllegalArgumentException(
					"Invalid input argument. "
					+ "Data or cluster should be given in format (a,b)");
		}
		
		arg = arg.replaceAll("[()]", "");
		String[] input = arg.split(",");
		if(input.length != 2){
			throw new IllegalArgumentException("Invalid input argument. Data or cluster should be given in format (a,b)");
		}
		
		return new double[]{Double.valueOf(input[0]), Double.valueOf(input[1])};
		
	}
	
}
