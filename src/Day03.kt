fun main() {
    val sum = readInput("Day03").fold(0) { acc, s ->
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

    print(sum)
}