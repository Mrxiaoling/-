package cn.ling.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *测试代码
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(5);
        bookShelf.appendBook(new Book("图解设计模式"));
        bookShelf.appendBook(new Book("Java编程思想"));
        bookShelf.appendBook(new Book("算法"));
        bookShelf.appendBook(new Book("TCP/IP协议：卷1"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());

        }

    }
}
