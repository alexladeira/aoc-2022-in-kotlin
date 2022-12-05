import kotlin.streams.toList

fun main() {
    val result = part1()
    println(result)
}

private fun part1() = readInput("Day04").fold(0) { acc, s ->
    val values = s.replace("-", ",").split(",").stream().mapToInt { it.toInt() }.toList()
    val firstRange = IntRange(values[0], values[1])
    val secondRange = IntRange(values[2], values[3])

    if ((firstRange.contains(secondRange.first) && firstRange.contains(secondRange.last)) || secondRange.contains(
            firstRange.first
        ) && secondRange.contains(firstRange.last)
    ) {
        acc + 1
    } else {
        acc
    }
}