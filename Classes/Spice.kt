class Spice (var name: String, var spiciness : String = "mild"){
    var name: String
        set() {
            name = "curry"
        }

    var spiciness: int
        set() {
            spiciness = "mild"
        }

    val heat: int
        get(): int {
            if (spiciness == "mild") {
                return 5
            }
        }

    init {
        print("spicieness: " ${spiciness});
    }
}
