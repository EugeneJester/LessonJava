// comments /**,  * , //
// Базовые еденицы в которых мы определяем метод, должен называться main принимает массив строк 
// Создание переменной:
// <тип>(данных) <индификатор>(или имя переменной); и точка с запятой это назыввется объявление переменной
// <индификатор>(ициализация переменной) =(знак равно оператор присваивания) <значение>(соответствующему типу которое мы объявили на первом этапе);

// примитивные типы данных хранения целых чисел
//  int, short
// вещественные числа
// double, float(обязательно будем исп-вать суффикс f «float e = 2.7f;)

// public class program {
//public static void main(String[] args) {
// float f = 123.45f;
//    }   
//}

// public class program {
//    public static void main(String[] args) {
//        double f = 123.45;
//        System.out.println(f);
// }    
//}

// ch - опеределяет отдельный символ ВНИМАНИЕ

//public class program {
//   public static void main(String[] args) {
//        char ch = '{';
//        System.out.println(ch);
//   }
//}

// boolean flag1(индефикатор, присвойте сразу значение) = 123 <= 234; 

// public class program {
//    public static void main(String[] args) {
//        boolean f = true ^ false; // &&  ||   ^-истина возвращает истину тогда и только тогда
//        System.out.println(f);
//    }
//}    

// Строки не просты

//Неявная типизация
//public class Program {
// public static void main(String[] args) {
//    var i = 123;                   // отссылка С# System.Controle.WriteLine(1+2);         закулисами компилятор делал раюоту самостоятельно
//    System.out.println(a); // 123  //             System.Controle.WriteLine("bye world");  
//    var d = 123.456;
//    System.out.println(d); // 123.456
//   }
//}

//public class program {
//    public static void main(String[] args) {
//       int i = 123_123_34;
//       System.out.println(Integer.MIN_VALUE); // есть тип данных. есть для него обертка для получения большего доступа/функционал того самого типа нужно помнить класс обертки  
//   }
//}  

//public class program {
//    public static void main(String[] args) {
//          String s = "qwer";
//           s.charAt(1)
//       System.out.println();
//   }
//}

//public class program {
// public static void main(String[] args) {
//    int i = 123; // для больших чисел контекста, числа можно делить на разряды нижним подчеркниванием 23_123_34
//    System.out.println(Integer.MAX_VALUE);
//  
//  }  
//
//}
//public class program {
//  public static void main(String[] args) {
//    int a = 123;
//    System.out.println(a++); // пофиксный инкремент а++, префексный инкремент ++а
//    System.out.println(a);
// }  
//}  

// операции сравнения
//public class program {
//    public static void main(String[] args) {
//    boolean f = 123 > 234;
//    System.out.println(f);
//
//    }
//
//}

//оператор пофикстный инкремента a++(ниже чем вывод), префексный инкремент ++а (выше, чем вывод),
//public class program {
//  public static void main(String[] args) {
//   int a = 123;
//   System.out.println(a++);
//    System.out.println(a);
//   
//   }  
//
//}

//подколки!!!!!!!
//public class program {
//    public static void main(String[] args) {
//        int a = 123;
//        a = --a-a--;
//
//    }
//}

//побитовые операции/ 
//public class program {
//    public static void main(String[] args) {
//        
//        int a = 8; // есть число 8 и мы сдвинули всё на 1 бит влево
//        // в двоичной сис-ме ()"а" в значении "8")  будет выглядить как 1000
//        // a = a << 1;
//        System.out.println(a << 1);
//        // 10000
//    }
//    
//}

//public class program {
//    public static void main(String[] args) {
//        int a = 18;
//        // 10010 
//        System.out.println(a >> 1); // >> сдвиг на 1 бит вправо
//        // 1001
//    }
//    
//}

//побитовые операции И ИЛИ (разделительное ИЛИ)
// И
//public class program {
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 2;
//        System.out.println(a | b); 
//        // 101 в двоич.сис-ме 5
//        // 010 в двоич.сис-ме 2 это 10 но надо одинаковое кол-во бит можем заменить 0
//       // 111 в итоге 5 или 2 будет 7, то есть обратная конвертация
//       
//    }
//    
//}

// Операция И
//public class program {
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 2;
//        System.out.println(a & b);
//        //101
//        //010
//        //000
//  
//    }    
//
//}    

// Операция разделительное ИЛИ
//public class program {
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 2;
//        System.out.println(a ^ b);
//101
//010
//111
//    }
//    
//}

//public class program {
//    public static void main(String[] args) {
//        String s = "qwer"; // длина строки 4, индекс 0..3
//        // boolean b = s.length() > 5 & s.charAt(4) == '1';
//        boolean b = s.length() > 5 && s.charAt(4) == '1';
//        boolean a = s.length() > 5 && s.charAt(4) == '1';
//       System.out.println(b);
        // System.out.println(a && b); // операция с двумя оперсантами
        // 1
        // 0
        // 1
//    }
//
//}

// Массивы

// Одномерные: int(одномерный массив)[] arr(индефикатор) = new(присвоить) int [10](кол-во элементов);
//public class program {
//   public static void main(String[] args) {
//       
//      int [] arr = new int[10]; // при иниализации можно указать в {}
//      arr[3] = 13;
//      System.out.println(arr[3]);
//
//   }
//}

//Многомерные массивы
//public class program {
//    public static void main(String[] args) {
//       int[] arr []  = new int[3][5];
//       for (int[] line : arr) {
//       for (int item : line) {
//   System.out.printf("%d ", item);
//    }
//    System.out.println();
//    }
//   }
//   }

//Преобразования, код с проблемой
//public class program {
//   public static void main(String[] args) {
//     byte b = Byte.parseByte("1211");
//     System.out.println(b);
//
//
//   }
//}

//НО
//class Program
//{
// public static void main(String[] args) {
// int[] a = new int[10];
// double[] d = a; // ИЗУЧАЕМ инварианты типов ковариантность и контравариантность
// }
//}

//Получение данных из терминала
//строки
//import java.util.Scanner;
//public class program {
// public static void main(String[] args) {
// Scanner iScanner = new Scanner(System.in);
// System.out.printf("name: ");
// String name = iScanner.nextLine();
// System.out.printf("Привет, %s!\n", name);
// iScanner.close();
// }
//}

//Проверка на соответствие получаемого типа, невалидные данные
//import java.util.Scanner;
//public class program {
// public static void main(String[] args) {
// Scanner iScanner = new Scanner(System.in);
// System.out.printf("int a: ");
// boolean flag = iScanner.hasNextInt();
// System.out.println(flag);
// int i = iScanner.nextInt();
// System.out.println(i);
// iScanner.close();
// } }

//Форматированный вывод
//public class program {
// public static void main(String[] args) {
//      String s = "qwe";
//      int a = 123;
//      String q = s + a; //контикантинация опасна 
//      System.out.println(q);
//    }
//}

//Виды спецификаторов
//public class Program {
// public static void main(String[] args) {
//    
// float pi = 3.1415f;
// System.out.printf("%f\n", pi); // 3,141500
// System.out.printf("%.2f\n", pi); // 3,14
// System.out.printf("%.3f\n", pi); // 3,141
// System.out.printf("%e\n", pi); // 3,141500e+00
// System.out.printf("%.2e\n", pi); // 3,14e+00
// System.out.printf("%.3e\n", pi); // 3,141e+00
// }
//}

//Функцмм и методы
//public class program {
// static void sayHi() {
// System.out.println("hi!");
// }
// static int sum(int a, int b) {
// return a+b;
// }
// static double factor(int n) {
// if(n==1)return 1;
// return n * factor(n-1);
// }
// public static void main(String[] args) {
// sayHi(); // hi!
// System.out.println(sum(1, 3)); // 4
//System.out.println(factor(5)); // 120.0
// }}

// Управляющие конструкции: условный оператор
//public class program {
// public static void main(String[] args) {
// int a = 1;
// int b = 2;
// int c;
// if (a > b) {
// c = a;
// } else {
//c = b;
// }
// System.out.println(c);
// }
//}

//public class program {
// public static void main(String[] args) {
// int a = 1;
// int b = 2;
// int c = 0;
// if (a > b) c = a;
// if (b > a) c = b;
// System.out.println(c);
// }
//}

//Управляющие конструкции: тернарный оператор
//public class program {
// public static void main(String[] args) {
// int a = 1;
// int b = 2;
// int min = a < b ? a : b;
// System.out.println(min);
// }
//}

// Оператор выбора
//public class program {
//     public static void main(String[] args) {
//        int a = 123;
//
//        switch (a) {
//            case 1: System.out.println("a"); 
//                break;
//             case 10: System.out.println("b"); 
//                break;
//        }
//     }
//    
//}


//Цикл while
//public class program {
 //public static void main(String[] args) {
 //  int value = 321;
 //  int count = 0;
 // while (value != 0) {
 //   value /= 10;
 //   count++;
 //}
 // System.out.println(count);
 //}
//}

//Цикл do while
//public class program {
// public static void main(String[] args) {
// int value = 321;
// int count = 0;
// do {
// value /= 10;
// count++;
// } while (value != 0);
// System.out.println(count);
//}
//}

//public class program {
//   public static void main(String[] args) {
//     for(int i = 0; 1 < 10; i++ ) {
//        if (i % 2 ==0)
//           contine;
//           System.out.println(i);
//        }
//    }
//}

// Вложенные циклы
//for: работает  только для коллекций
//public class program {
// public static void main(String[] args) {
// int arr[] = new int[10];
// for (int item : arr) {
// System.out.printf("%d ", item);
// }
// System.out.println();
// }
//}

//Работа с файлами. 

//Создание и запись\дозапись
//import java.io.FileWriter;
//import java.io.IOException;
//public class program {
// public static void main(String[] args) {
// try (FileWriter fw = new FileWriter("file.txt", false)) {
// fw.write("line 1");
// fw.append('\n');
// fw.append('2');
// fw.append('\n');
// fw.write("line 3");
// fw.flush();
// } catch (IOException ex) {
// System.out.println(ex.getMessage());
// }
// } }

// Чтение, Вариант посимвольно
//import java.io.*;
//public class program {
// public static void main(String[] args) throws Exception {
// FileReader fr = new FileReader("file.txt");
// int c;
// while ((c = fr.read()) != -1) {
// char ch = (char) c;
// if (ch == '\n') {
// System.out.print(ch);
// } else {
// System.out.print(ch);
// }
// }
// } }

 //Вариант построчно
//import java.io.*;
//public class program {
// public static void main(String[] args) throws Exception {
// BufferedReader br = new BufferedReader(new FileReader("file.txt"));
// String str;
// while ((str = br.readLine()) != null) {
// System.out.printf("== %s ==\n", str);
// }
// br.close();
// }
//}

//Задачи для самоконтроля
//1. Задана натуральная степень k. Сформировать случайным
//образом список коэффициентов (значения от 0 до 100)
//многочлена многочлен степени k.
//*Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0
//2. Даны два файла, в каждом из которых находится запись
//многочлена. Сформировать файл содержащий сумму
//многочленов