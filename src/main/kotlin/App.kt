import com.google.common.collect.ImmutableList

fun main() {
    val message = ImmutableList.of("Hello", "from", "Kotlin + Gradle Lock 🎉")
    println(message.joinToString(" "))
}
