public class Shap {
    static void main() {
        //Пользователь вводит small  и big
        int small = Integer.parseInt(IO.readln("введите кол-во карт в тоненькой колоде: "));
        int big =  Integer.parseInt(IO.readln("введите кол-во карт в последней колоде: "));
        //amount = ?

        //Вычислить количество действий count
        int count = countSteps(small, big);
        //Вывести count
        IO.println(count);
    }

    private static int countSteps(int small, int big) {
        return 333;
    }
}
