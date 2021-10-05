fun main {
    val options = arrayOf("rock","paper","scissor")
    val computerChoice= options.random()
    val userChoice = readLine()

    printIn("Computer Picked $computerChoice")
    printIn("User Picked $userChoice")
}