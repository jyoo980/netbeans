package intentions

infix fun Int.inf(p: Int) = this + p

fun toInfix() {
    val res = 42.inf(42)
}
