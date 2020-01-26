const val MAX_EXPERIENCE: Int = 5000
const val PUB_NAME:String = "Unicorn's Horn"

fun main() {
    val playerName = "Estragon"
    var hasSteed:Boolean = false;
    var experiencePoints = 10000
    var publican_name:String = "unicorn man"
    var gold:Int = 50
    val STEEDS: List<String> = listOf("dragon", "minotaur")
    val DRINKS: List<String> = listOf("mead", "wine", "LaCroix")

    experiencePoints += 5
    if (experiencePoints > MAX_EXPERIENCE) {
        experiencePoints = MAX_EXPERIENCE
    }



    println(experiencePoints)
    println(playerName)
    println(playerName.reversed())
}
