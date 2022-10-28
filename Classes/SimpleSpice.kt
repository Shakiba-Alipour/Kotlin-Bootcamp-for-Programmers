class SimpleSpice {
    var name: String
        set() {
            name = "curry"
        }

    var spiciness: int
        set() {
            spiciness = "mild"
        }

    val heat: int
        get():int {
            if (spiciness == "mild") {
                return 5
            }
        }
}
