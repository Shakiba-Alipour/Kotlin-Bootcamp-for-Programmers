fun getBirthday() : int{
    val birthday = (readLine().toIntOrNull()?) ?: 1
    return birthday
}

fun getFortune(birthday : int) : String{
    val fortune = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    return when (birthday){
        28 -> "Good luck!"
        else fortune[birthday/7]
    }
}
