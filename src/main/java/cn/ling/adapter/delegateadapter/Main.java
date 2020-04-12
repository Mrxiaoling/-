package cn.ling.adapter.delegateadapter;

import cn.ling.adapter.classadapter.Print;
import cn.ling.adapter.classadapter.PrintBanner;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello") ;
        p.printStrong();
        p.printWeak();
    }

}
