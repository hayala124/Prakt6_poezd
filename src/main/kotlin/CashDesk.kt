import kotlin.collections.ArrayList
var number_ticket:Int = 0
var count_vagon = 0
open class CashDesk {
    fun sell_tickets(): Int {
        number_ticket = (5..201).random()
        return number_ticket
    }

    fun number_passengers(): String {
        var index = 1
        var message = ArrayList<String>()
        do {
            var passengers = (5..25).random()
            message.add (("Вагон номер $index вместимостью $passengers пассажиров").toString())
            number_ticket = number_ticket - passengers
            index += 1
            count_vagon = index-1
        } while (number_ticket >= 0)
        return message.map { it.padEnd(5) }.joinToString(separator = "\n")
    }

  fun Count_passenger(): Int {
        return count_vagon
    }
}