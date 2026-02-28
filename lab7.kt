data class Student(val fullName: String, var id: Int, var grade: Double)

val students = listOf(
    Student("John", 223, 140.0),
    Student("Mark", 548, 120.0),
    Student("Natali", 342, 150.0),
    Student("Sara", 781, 130.0)
)

fun getStudentById(id: Int): Student? {
    return students.find { it.id == id }
}

fun searchInStudents(name: String): Student? {
    return students.find { it.fullName.lowercase() == name.lowercase() }
}

fun main() {
    println("Please, Enter the student's ID")
    val id = readlnOrNull()?.toIntOrNull()

    if (id != null) {
        println(getStudentById(id) ?: "Student not found")
    } else {
        println("Invalid ID")
    }

    println("Please, Enter the student's name")
    val name = readlnOrNull()

    if (name != null) {
        println(searchInStudents(name) ?: "Student not found")
    }
}
