import java.util.*

fun main(args: Array<String>) {

    val square = Square("test Square")
    val circle = Circle("test Circle")
    val triangle = Triangle("test Triangle")
    val equilateralTriangle = EquilateralTriangle("test EquilateralTriangle")

    val reader = Scanner(System.`in`)

    print("Enter length and height: ")
    var length: Double = reader.nextDouble()
    var height: Double = reader.nextDouble()
    square.setDimensions(length,height)
    println(square.name)
    square.printDimensions()
    println(square.getArea())

    println()

    print("Enter radius: ")
    var radius: Double = reader.nextDouble()
    circle.setDimensions(radius)
    println(circle.name)
    circle.printDimensions()
    println(circle.getArea())

    println()

    print("Enter side1, side2, and side3: ")
    var side1: Double = reader.nextDouble()
    var side2: Double = reader.nextDouble()
    var side3: Double = reader.nextDouble()
    triangle.setDimensions(side1, side2, side3)
    println(triangle.name)
    triangle.printDimensions()
    println(triangle.getArea())

    println()

    print("Enter side: ")
    var side: Double = reader.nextDouble()
    equilateralTriangle.setDimensions(side)
    println(equilateralTriangle.name)
    equilateralTriangle.printDimensions()
    println(equilateralTriangle.getArea())

    reader.close()
}