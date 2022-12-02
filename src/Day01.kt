fun main() {
    val testInput = getMaxInput("Day01_test")
    check(45000 == testInput)
    println(getMaxInput("Day01"))
}

private fun getMaxInput(fileName: String) = lists(fileName).map { it.sum() }.sortedDescending().take(3).sum();

private fun lists(fileName: String) =
    readInput(fileName).foldIndexed(mutableListOf<MutableList<Int>>()) { index, acc, s ->
        when {
            index == 0 || s.isBlank() -> acc.add(ArrayList())
            else -> acc.last().add(s.toInt())
        }
        acc
    }
