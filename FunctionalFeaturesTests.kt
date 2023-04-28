data class Animal(var name: String, var species: String)

fun xyz() {
    var x = 1
    val y = x
    val z = y

    x = 2
    println(x)
    println(y)
    println(z)
}

fun x2() {
    var animals = arrayOf(
        Animal("Poppy", "rabbit"),
        Animal("Caro", "dog"),
        Animal("Teddy", "dog"),
        Animal("Molly", "fish"),
        Animal("Jimmy", "cat"),
        Animal("Harold", "fish")
    )

    println("Dogs: " +
            animals.filter{ it.species == "dog"}
                .sortedBy{ it.name }
                .joinToString{ it.name })

    println(('a'..'z').joinToString(""))

    xyz()

    try {
        "1^".toInt()
    } catch (e: NumberFormatException) {
        println("NumberFormatException: " + e.message)
    }
}

