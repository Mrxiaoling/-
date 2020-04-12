package cn.ling.adapter.classadapter;

/**
 * 适配器，负责将现有的（Banner）转换成需求（Print）
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner (String string) {
        super(string);
    }
    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
