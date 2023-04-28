package example.myapp

fun main() {
    buildAquarium()
}

fun buildAquarium() {
    val a = Aquarium(numberOfFish = 29)
    a.printSize()
    a.volume = 70
    a.printSize()
}
