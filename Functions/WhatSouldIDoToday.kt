fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: int = 24) {
    return when {
        mood == "happy" && weather == "Sunny" -> "go for a walk"
        else -> "Stay home and read."
    }
}
