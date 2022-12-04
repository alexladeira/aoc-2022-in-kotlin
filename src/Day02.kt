fun main() {
    val finalValues = mapOf("X" to 1, "Y" to 2, "Z" to 3)
    val sum = readInput("Day02").fold(0) { acc, s ->
        val values = s.split(" ").toMutableList()
        values[1] = updateSecondValue(values)

        when {
            "A" == values[0] && "Z" == values[1] || "C" == values[0] && "Y" == values[1] || "B" == values[0] && "X" == values[1] -> acc + finalValues[values[1]]!!
            "A" == values[0] && "X" == values[1] || "C" == values[0] && "Z" == values[1] || "B" == values[0] && "Y" == values[1] -> acc + finalValues[values[1]]!! + 3
            else -> acc + finalValues[values[1]]!! + 6
        }
    }
    print(sum)
}

fun updateSecondValue(values: List<String>): String {
    return if (values[1] == "X") {
        val lose = mapOf("A" to "Z", "B" to "X", "C" to "Y")
        lose[values[0]]!!
    } else if (values[1] == "Y") {
        val draw = mapOf("A" to "X", "B" to "Y", "C" to "Z")
        draw[values[0]]!!
    } else {
        val win = mapOf("A" to "Y", "B" to "Z", "C" to "X")
        win[values[0]]!!
    }
}