import java.util.ArrayList;

public class Sun {

    private static Integer soma(int[] list, int index) {
        if (index >= list.length) {
            return 0;
        } else {
            return list[index] + soma(list, index + 1);
        }
    }


    private static Integer conta(int[] list, int index) {
        if (index >= list.length) {
            return 0;
        } else {
            return 1 + conta(list, index + 1);
        }
    }

    public static void main(String[] args) {
        int[] myList = {2, 4, 6};
        System.out.println(soma(myList, 0));
        System.out.println(conta(myList, 0));
    }


}