fun main() {
    val stackk: Stack = Stack()
    println("პირვანდელი სტეკი ${stackk.stack} ")
    stackk.adding()
    stackk.removing()
    val queuee: Queue = Queue()
    println("პირვანდელი რიგი ${queuee.queue}")
    queuee.queueadding()
    queuee.queueremoving()


}

// სტეკი ანუ LIFO
class Stack {
    var stack: MutableList<Int> = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
    fun adding() {
        stack.add(10)
        println("ახალი ელემენტის დამატების შემდეგ $stack")


    }

    fun removing() {

        stack.removeAt(stack.lastIndex)
        println("LIFO მეთოდის თანახმად უკანასკნელი დამატებული ამოიშლება პირველი $stack")
    }


}
// რიგი ანუ FIFO
class Queue {
    var queue: MutableList<Int> = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
    fun queueadding() {
        queue.add(10)
        println("ახალი ელემენტის დამატების შემდეგ $queue")


    }

    fun queueremoving() {

        queue.removeAt(0)
        println("FIFO მეთოდის თანახმად რიგში პირველი დამატებული ამოიშლება პირველი $queue")
    }
}
