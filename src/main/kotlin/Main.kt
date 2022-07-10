class BlogBoxApp {

    fun run() {
        // Test with 1-7 blog posts
        for (i in 1..7) blogBoxes(i)
    }

    private fun blogBoxes(count: Int) {
        // Put the letters "R", "B", and "W" into this array in the order they will appear on the page
        val myBoxes = arrayOfNulls<String>(count)

        val startWithWhite = count % 3 == 1

        // Write your code here
        if (startWithWhite) {
            for (i in 1..count) {
                if (i % 3 == 1) {
                    myBoxes[i - 1] = "W"
                } else if (i % 3 == 2) {
                    myBoxes[i - 1] = "R"
                } else {
                    myBoxes[i - 1] = "B"
                }
            }
        } else {
            for (i in 1..count) {
                if (i % 3 == 1) {
                    myBoxes[i - 1] = "R"
                } else if (i % 3 == 2) {
                    myBoxes[i - 1] = "B"
                } else {
                    myBoxes[i - 1] = "W"
                }
            }
        }

        // output boxes as ASCII art
        printBoxes(myBoxes)
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
