fun main() {
    println("fun main")
    testSimple()
    println(testFuncRetSimple("aaa"))
    println("test named args")
    println(testNamedArgs(x = 1, z = 3, y = 2))
    println(testDefaultArgs(x=1)) //3
    println(testDefaultArgs(y=1)) //2
    println(testDefaultArgs()) //3
}

fun testSimple(): String {
    println("fun testSimple")
//    return 5 // Err т.к. String
    return "fun testSimple"
}

fun testFuncRet(s: String): String {
    return "testFuncRet input=" + s
}

fun testFuncRetSimple(s: String) = "testFuncRet input=" + s

fun testNamedArgs(x: Int, y: Int, z: Int): Int {
    return x + y + z
}

fun testDefaultArgs(x: Int = 1, y: Int = 2): Int {
    return x + y;
}