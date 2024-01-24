class Square(_name: String) : Shape(_name) {
    private var length = 0.0
    private var height = 0.0

    override fun printDimensions() {
        println("Square dimensions: Width = $length, Height = $height")
        return
    }

    override fun getArea(): Double {
        return length * height
    }

    fun setDimensions(_length: Double, _height: Double) {
        length = _length
        height = _height
    }
}