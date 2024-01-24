class Circle(_name: String) : Shape(_name) {
    private var radius = 0.0

    override fun printDimensions() {
        println("Circle dimensions: Radius = $radius")
    }

    override fun getArea(): Double {
        return radius * radius * 3.14
    }

    fun setDimensions(_radius: Double) {
        radius = _radius
    }
}