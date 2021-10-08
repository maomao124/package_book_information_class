/**
 * Project name(项目名称)：封装图书信息类
 * Package(包名): PACKAGE_NAME
 * Class(类名): BookTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/8
 * Time(创建时间)： 18:44
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class BookTest
{
    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        System.out.print("\033[1;94m");
        Book b1 = new Book();
        Book b2 = new Book();
        b1.setBookName("格林童话");
        b1.setPage(189);
        b2.setBookName("安徒生童话");
        b2.setPage(587);
        b1.details();
        b2.details();
        System.out.print("\033[0;0m");
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        //------------------------------------------------------
    }
}
