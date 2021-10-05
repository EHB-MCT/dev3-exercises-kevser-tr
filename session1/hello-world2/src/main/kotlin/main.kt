fun main() {
    val arrayname = arrayOf("niko-talon","mina","widad");
    for (friend in arrayname){
        greeting(friend);
    }


}
fun greeting(name: String){
println("hello $name");
}