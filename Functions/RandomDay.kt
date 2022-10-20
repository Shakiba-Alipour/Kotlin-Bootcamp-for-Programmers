fun main(args: Array<String>) {
    val cookie = getFortuneCookie()
    println("Your fortune is: $cookie")
}

fun getFortuneCookie(): String {
    val fortune = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    print("Enter your birthday: ")
    val birthday = (readLine().toIntOrNull()?) ?: 1
    val reminder = birthday / 7
    return fortune[reminder]
}
