fun main() {
    var finishTrip = true
    while (finishTrip) {
        println("Шаг 1 - Создать направление")
        val direction = Direction().createRoute()
        println("Маршрут поезда $direction\n")

        println("Шаг 2 - Продать билеты")
        val ticket = CashDesk().sell_tickets()
        println("Продано $ticket билетов\n")

        println("Шаг 3 - Собрать состав")
        val structure = CashDesk().number_passengers()
        println("$structure\n")

        val count_passenger = CashDesk().Count_passenger()
        println("Шаг 4 - Отправить состав")
        println("Поезд $direction, состоящий из $count_passenger вагонов отправлен\n")

        var error_input = true
        while (error_input) {
            println("Выберите дальнейшее действие:\nEXIT - если хотите выйти из программы\nИначе - если хотите продолжить")
            val step = FastTrain().replay()
            when (step) {
                "EXIT" -> {
                    finishTrip = false
                    error_input = false
                }
                "Иначе" -> {
                    finishTrip = true
                    error_input = false
                }
                else -> {
                    println("ОШИБКА ВВОДА!\n")
                    error_input = true
                }
            }
        }
    }
}