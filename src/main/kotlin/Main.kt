class BlogBoxApp {

    fun run() {
        // Test with 1-7 blog posts
        for (i in 1..7) blogBoxes(i)
    }

    private fun blogBoxes(count: Int) {
        // Put the letters "R", "B", and "W" into this array in the order they will appear on the page
        val myBoxes = arrayOfNulls<String>(count)

        // Write your code here
        setColors(myBoxes)

        // output boxes as ASCII art
        printBoxes(myBoxes)
    }

    private fun setColors(myBoxes: Array<String?>) {
        val count = myBoxes.size
        val startWithWhite = count % 3 == 1

        for (i in 1..count) {
            when (i % 3) {
                1 -> {
                    myBoxes[i - 1] = if (startWithWhite) "W" else "R"
                }
                2 -> {
                    myBoxes[i - 1] = if (startWithWhite) "R" else "B"
                }
                else -> {
                    myBoxes[i - 1] = if (startWithWhite) "B" else "W"
                }
            }
        }
    }

    private fun printBoxes(boxes: Array<String?>) {
        val separator = "-------------"

        println()
        println(separator)
        for (box in boxes) {
            when (box) {
                "W" -> {
                    println("|     W     |")
                    println(separator)
                }
                "R" -> {
                    print("|  R  |")
                }
                "B" -> {
                    println("  B  |")
                    println(separator)
                }
            }
        }
        println()
        println()
    }
}

fun main() {
    BlogBoxApp().run()
}
