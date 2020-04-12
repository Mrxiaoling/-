package cn.ling.Iterator;

import java.util.Iterator;

/**
 * 要遍历的集合的接口，实现该接口的类将成为可以保存多个元素的集合
 */
public interface Aggregate {
    public abstract Iterator iterator();
}
