open class Triangle (_name: String) : Shape(_name) {
    private var side1 = 0.0
    private var side2 = 0.0
    private var side3 = 0.0

    override fun printDimensions() {
        println("Triangle dimensions: Side1 = $side1, Side2 = $side2, Side3 = $side3")
    }

    override fun getArea(): Double {
        val s = (side1 + side2 + side3) / 2
        val area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3))
        return area
    }

    fun setDimensions(_side1: Double, _side2: Double, _side3: Double) {
        side1 = _side1
        side2 = _side2
        side3 = _side3
    }
}