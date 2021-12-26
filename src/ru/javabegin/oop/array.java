//Написать программу, удаляющую из вещественного массива A размерности N «лишние» элементы так,
//чтобы оставшиеся элементы оказались упорядоченными по возрастанию (начиная от первого
//элемента): первый элемент не удаляется, второй элемент удаляется, если он меньше первого, третий —
//если он меньше предыдущего элемента, оставленного в массиве, и т. д. Например, массив 5.5, 2.5, 4.6,
//7.2, 5.8, 9.4 должен быть преобразован к виду 5.5, 7.2, 9.4. а экран должны выводиться как
//оригинальное состояние массива, так и итоговое.
package ru.javabegin.oop;
import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элеменов массива:");
        int n = in.nextInt();
        System.out.println("Введите элементы массива:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        //сколько элементов в новом массиве
        //  с нулевого элемента до nго элемента с шагом 1
        int jmax= arr[0];
        int r = 1;
        for (int i = 0; i < n - 1; i = i + 1) /* колво итераций которое повторится в цикле*/ {
            /*if (arr[jmax] < arr[jmax + 1]) {
                r = r+1;
                jmax= jmax+1;
            } */
//посчитаем количество элементов нового массива

            if (arr[i] < arr[i + 1] && arr[i+1] > jmax) {
                r = r + 1;

               if ( arr[i+1] > jmax ) {
                    jmax = arr[i+1];
                }
            }/*else{
                arr[jmax]=arr[i];
                    if (arr[jmax]>arr[i]){
                        i = i+1;
                    }
                }*/

        }
            int[] newarr = new int[r];
            newarr[0] = arr[0];
            int r1 = 1;
        jmax= newarr[0];
            for ( int i = 0; i < n - 1; i = i + 1) /* колво итераций которое повторится в цикле*/ {
                if (arr[i] < arr[i + 1] && arr[i+1]>jmax) {

                    newarr[r1] = arr[i+1];
                    if ( arr[i+1] > jmax  ) {
                        jmax = arr[i+1];
                    }
                    if (r1<r) {
                        r1 = r1 + 1;
                    }
                }
            }
            System.out.println(r);
            System.out.println(Arrays.toString(newarr));

        }

}
