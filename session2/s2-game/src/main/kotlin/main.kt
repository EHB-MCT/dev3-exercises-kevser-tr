
fun main (){
    println("help,help,heeeellllpppp")
    println("help me to find my phone in this mess")
    challengeOne()
}

 fun challengeOne(){
     println("Where would I have left my phone? Guess out of the 3 where the location could be?")
     val answersQuiz = setOf<String>(" the toilet", "my room", "my bf's house")
     val answer = "the toilet"
     println(answersQuiz)
     val userInput= readLine()
        if (answersQuiz.contains(userInput) ){
            success()
            } else{
                    gameOver()
            }
 }
fun success(){
println("sadly, you are right")
challengeTwo()
}
fun gameOver(){
println("YOU ARE WRONG BITCCHH")
}
fun challengeTwo(){
    println("LEVEL UP, Welcome to the sec stage")
    println("You will have to pick a number, a high and a low one")
    val diceResult = (1..6).random()
    val userAnswer = readLine()
    if (userAnswer == "low" && (1..3).contains(diceResult)){
        //win
    }else if (userAnswer == "high" && (4..6).contains(diceResult)){
     //win
    }else {
        //game-over
    }
}

