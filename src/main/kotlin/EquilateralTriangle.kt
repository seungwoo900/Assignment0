class EquilateralTriangle (_name: String) : Triangle(_name) {
    private var side = 0.0

    override fun printDimensions() {
        println("Equilateral Triangle dimensions: Side = $side")
    }

    override fun getArea(): Double {
        return side * side * Math.sqrt(3.0) / 4;
    }

    fun setDimensions(_side: Double) {
        side = _side
    }
}