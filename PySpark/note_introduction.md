## RDD 
- datos dsitribuidos
- tolerante a fallos 
- operaciones paralelizadas
- trabajar con datos de multiples fuentes

## funcionamiento spark
1. Spark context (driver)
2. el dirver pide los recursos al cluster manager
3. cluster manager lanza los executor (ejecutor de cada nodo)
4. separa la tarea en cada uno de los nosos 
5. se hace el calculo en memoria 
6. si falla un nodo se manda a otro


## operacion rdd
- transformaciones
    collect -> matriz
    count -> numero
    first -> primer elemento
    take -> matriz n
- acciones
    filter -> aplica funcion y devulve lo que cumple
    map -> tranforma sin cambiar el total de elementos
    flatmap -> transforma y cambia el numero de elementos


## agrupaciones rdd
vienen en tuplas (clave, valor)
reduce -> agrega elementos rdd usando una funcion que devuelve solo un elemento

reducebykey -> Agrega elementos pares rdd usaudno una funcion que devuelve pares de rdd

son parecidos al group by

## cambios constantes
- spark sql dataframes (estructurados)
- mlib
- graphX
- spark streaming