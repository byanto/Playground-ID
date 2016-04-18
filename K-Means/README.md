# K-Means dengan input data dan cluster dari command line

Contoh cara menjalankan program:
`java -data (10,50) (21,43) (54,23) (54,70) (2,2) -clusters (1,3) (5,8) (9,69)`

## Catatan:
* Gunakan option "-data" untuk meng-input data.
* Gunakan option "-clusters" untuk meng-input cluster.
* Data maupun cluster harus diberikan dalam format "(a,b)" dimana "a" adalah point pertama dan "b" adalah point kedua. Gunakan tanda "," untuk memisahkan point pertama dan point kedua. Tidak boleh ada spasi diantara "a" dan "b".

## Contoh Penggunaan

`java -data (10,50) (21,43) (54,23) (54,70) (2,2) -clusters (1,3) (5,8) (9,69)`

Output:

Data [5 items]:
(10.0,50.0)
(21.0,43.0)
(54.0,23.0)
(54.0,70.0)
(2.0,2.0)

Clusters [3 items]:
(1.0,3.0)
(5.0,8.0)
(9.0,69.0)

