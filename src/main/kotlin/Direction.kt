class Direction {
    val cities = listOf("Cанкт-Петербург", "Москва", "Новосибирск", "Нижний Новгород", "Екатеринбург", "Великий Новгород", "Казань",
        "Красноярск", "Омск", "Воронеж", "Ростов-на-Дону", "Челябинск", "Пермь", "Тюмень", "Саратов", "Волгоград")

    fun createRoute(): String
     {
         val starting_point = cities.random()
         val end_point = cities.minus(starting_point).random()
         return "$starting_point - $end_point"
    }
}
