fun main() {
    val sum = part2()
    print(sum)
}

private fun part2() = readInput("Day03").chunked(3).fold(0) { acc, strings ->
    val lowerCaseRange = CharProgression.fromClosedRange('a', 'z', 1)
    strings[0].find { c -> strings[1].contains(c) && strings[2].contains(c) }.let { c ->
        if (lowerCaseRange.contains(c)) {
            acc + c!!.code - 96
        } else {
            acc + c!!.code - 38
        }
    }
}

private fun part1() = readInput("Day03").fold(0) { acc, s ->
    val str0 = s.substring(0, s.length / 2)
    val str1 = s.substring(s.length / 2)
    val lowerCaseRange = CharProgression.fromClosedRange('a', 'z', 1)
    str0.find { c -> str1.contains(c) }.let { c ->
        if (lowerCaseRange.contains(c)) {
            acc + c!!.code - 96
        } else {
            acc + c!!.code - 38
        }
    }
}