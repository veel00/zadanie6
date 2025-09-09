//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Введите первую цифру: ")
    val num1 = readln().toInt()
    print("Введите вторую цифру: ")
    val num2 = readln().toInt()

    if (num1 !in 0..9 || num2 !in 0..9) {
        println("Ошибка: введите цифры от 0 до 9")
        return
    }
    if (num1 == num2) {
        println("Ошибка: цифры должны быть различными")
        return
    }
    // составляем два возможных числа
    val res1 = num1 * 10 + num2
    val res2 = num2 * 10 + num1
    // Проверяем нечетные
    if (res1 % 2 != 0) {
        println("Нечетное число: $res1")
    } else if (res2 % 2 != 0) {
        println("Нечетное число: $res2")
    } else {
        println("Создать нечетное число невозможно")
    }
}