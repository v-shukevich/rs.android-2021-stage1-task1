package subtask2

class BillCounter {


    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var b_actual = (bill.sum() - bill[k]) / 2

        return if (b > b_actual){
            "${b - b_actual}"

        }else "Bon Appetit"



    }
}
