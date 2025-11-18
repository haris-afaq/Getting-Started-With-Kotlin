fun main() {

    val student1 = Student()
    student1.name = "Arish"
    student1.rollNumber = 17
    student1.university = "University of Peshawar"
    student1.batch = 22
    student1.shift = "Morning"
    student1.printInfo()
}

class Student {
    var university = ""
    var name = ""
    var rollNumber = 0
    var batch = 0
    var shift = ""

    fun printInfo() {
        println("University: $university, Name: $name, Roll Number: $rollNumber, Class: $batch, Shift: $shift")
    }
}
