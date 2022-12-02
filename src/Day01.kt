fun main() {
    val testInput = getMaxInput("Day01_test")
    check(testInput == 24000)
    println(getMaxInput("Day01"))
}

private fun getMaxInput(fileName: String) = lists(fileName).maxOfOrNull { it.sum() }

private fun lists(fileName: String) = readInput(fileName).foldIndexed(mutableListOf<MutableList<Int>>()) { index, acc, s ->
    when {
        index == 0 || s.isBlank() -> acc.add(ArrayList())
        else -> acc.last().add(s.toInt())
    }
    acc
}
