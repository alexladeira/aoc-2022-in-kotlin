fun main() {
    val finalValues = mapOf("X" to 1, "Y" to 2, "Z" to 3)
    val sum = readInput("Day02").fold(0) { acc, s ->
        val values = s.split(" ")
        when {
            "A" == values[0] && "Z" == values[1] || "C" == values[0] && "Y" == values[1] || "B" == values[0] && "X" == values[1] -> acc + finalValues[values[1]]!!
            "A" == values[0] && "X" == values[1] || "C" == values[0] && "Z" == values[1] || "B" == values[0] && "Y" == values[1] -> acc + finalValues[values[1]]!! + 3
            else -> acc + finalValues[values[1]]!! + 6
        }
    }
    print(sum)
}