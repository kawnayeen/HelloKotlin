package Aquarium

/**
 * kawnayeen
 * 4/6/18
 */
fun main(args: Array<String>) {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()

    println("Length: ${myAquarium.length} " + "Width: ${myAquarium.width} " + "Height: ${myAquarium.height}")

    myAquarium.height = 80

    println("Height: ${myAquarium.height}")

    println("Volume: ${myAquarium.volume}")

    val smallAquarium = Aquarium(length = 20, width = 15,height = 30)
    println("Volume: ${smallAquarium.volume}")

    val smallAquarium2 = Aquarium(numberOfFish = 9)
    println("Length: ${smallAquarium2.length} " + "Width: ${smallAquarium2.width} " + "Height: ${smallAquarium2.height}")
}