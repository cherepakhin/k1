fun main() {
    println("start\n=============")
    val items = listOf("arange", "apple", "banana")
    for (item in items) {
        println(item)
    }
    println("Test get by index from array\n=============")
    println("items.get(1)==" + items.get(1))
    println(items.get(1) == "arange")
    println(items.get(1) == "apple")
    println(items.get(1).equals("apple"))

    var i: Int = 0
    println("while\n=============")
    while (i < items.size) {
        println("Item $i = ${items[i]}")
        i++
    }

    // Диапазоны
    println(5 in 5..10)
    println("Диапазон от 5..10")
    for (i in 5..10)
        println(i)
    println("Диапазон от 5..9")
    for (i in 5 until 10)
        println(i)
    println("Диапазон от 10..5")
    for (i in 10 downTo 5)
        println(i)
    println("Диапазон от 0..100 с шагом 10")
    for (i in 0..100 step 10)
        println(i)


//    println("Диапазон от 1..10")
//    for(i in 5..10)
//        println(i)
}