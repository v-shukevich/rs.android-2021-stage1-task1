package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        var i = 0
        var resultArray = emptyArray<String>()

        while (i < inputString.length) {
            when (inputString[i]) {
                '<' -> {
                    var count = 0
                    loop@ for (index in i + 1 until inputString.length) {
                        when (inputString[index]) {
                            '<' -> count++
                            '>' -> if (count == 0) {
                                resultArray += inputString.substring(i+1, index)
                                break@loop
                            } else if (count > 0) count--
                        }
                    }
                }
                '[' -> {
                    var count = 0
                    loop@ for (index in i + 1 until inputString.length) {
                        when (inputString[index]) {
                            '[' -> count++
                            ']' -> if (count == 0) {
                                resultArray += inputString.substring(i+1, index)
                                break@loop
                            } else if (count > 0) count--
                        }
                    }
                }
                '(' -> {
                    var count = 0
                    loop@ for (index in i + 1 until inputString.length) {
                        when (inputString[index]) {
                            '(' -> count++
                            ')' -> if (count == 0) {
                                resultArray += inputString.substring(i+1, index )
                                break@loop
                            } else if (count > 0) count--
                        }
                    }
                }
            }
            i++
        }
        return resultArray
    }
}
