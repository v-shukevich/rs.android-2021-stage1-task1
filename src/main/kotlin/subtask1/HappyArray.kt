package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyArray = sadArray
        var tempArray = IntArray(0)

        var i = 1
        while (i <= happyArray.size - 2) {
            if ((happyArray[i - 1] + happyArray[i + 1]) < happyArray[i]) {
                for (index in happyArray.indices - i) {
                    tempArray += happyArray[index]
                }
                happyArray = tempArray
                tempArray = IntArray(0)
                i = 1
            }
            i++
        }
        return happyArray

        throw NotImplementedError("Not implemented")

        //        val happyArray = sadArray.toMutableList()
//        var index = 1
//
//        while (index <= happyArray.size - 2) {
//            if ((happyArray[index - 1] + happyArray[index + 1]) < happyArray[index]) {
//                happyArray.removeAt(index)
//                index = 1
//            }
//            index++
//        }
//        return happyArray.toIntArray()

    }
}

