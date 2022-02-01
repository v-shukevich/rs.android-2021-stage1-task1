package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyArray : IntArray = IntArray(0)
        happyArray += sadArray[0]
        for (i in 1..sadArray.size-2){
            if (sadArray[i-1] + sadArray[i+1] > sadArray[i]){
                happyArray += sadArray[i]

            }
        }
        happyArray += sadArray[sadArray.size-1]
        return happyArray
        throw NotImplementedError("Not implemented")

    }
}
