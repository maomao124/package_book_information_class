/**
 * Project name(项目名称)：封装图书信息类
 * Package(包名): PACKAGE_NAME
 * Class(类名): Book
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/8
 * Time(创建时间)： 18:37
 * Version(版本): 1.0
 * Description(描述)：
 * 基本信息包括图书名称（bookName）、总页数（pagelbtalNum），其中页数不能少于 200 页，否则输出错误信息，并赋予默认值 200。
 * 为各个属性设置赋值和取值方法。
 * 具有 details() 方法，该方法在控制台输出每本图书的名称和总页数。
 */

public class Book
{
    private String BookName;
    private int page;

    public String getBookName()
    {
        return BookName;
    }

    public void setBookName(String bookName)
    {
        BookName = bookName;
    }

    public int getPage()
    {
        return page;
    }

    public void setPage(int page)
    {
        if (page < 200)
        {
            System.err.println("书《" + this.BookName + "》的页数不能小于200页！");
            System.err.println("当前为" + page + "页，已自动调整为200页");
            this.page = 200;
        }
        else
        {
            this.page = page;
        }
    }

    public void details()
    {
        System.out.println("书《" + this.BookName + "》的总页数为：" + this.page + "页");
    }
}
