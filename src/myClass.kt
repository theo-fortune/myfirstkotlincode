fun main() {
	var obj1 = Person("Fortune", 23)
	obj1.canVote(24)
}

class Person(var name: String, var age: Int) {
	lateinit var profession: String
	fun canVote(age: Int) {
		if (age < 18) {
			println("Cannot Vote")
		} else {
			println("Can Vote")
		}
	}
}