import java.io.File

fun main() {
    val file = File("resources/tab2.csv")

    file.forEachLine {
        println(it)
    }

    file.forEachLine { line ->
        println(line)
    }

    file.forEachLine() { line ->
        println(line)
    }

    file.forEachLine(Charsets.UTF_8) { line ->
        println(line)
    }

    file.forEachLine( Charsets.UTF_8, action = { line->
        println(line)
    })

    file.forEachLine(Charsets.UTF_8, action = action)
    file.forEachLine(Charsets.UTF_8, action = ::f)
}


val action: (String) -> Unit = { line ->
    println(line)
}

fun f(line:String){
    println(line)
}