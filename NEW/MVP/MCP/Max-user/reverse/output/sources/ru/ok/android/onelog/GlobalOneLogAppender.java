package ru.ok.android.onelog;

/* loaded from: classes2.dex */
public class GlobalOneLogAppender implements OneLogAppender {
    @Override // ru.ok.android.onelog.OneLogAppender
    public void append(OneLogItem oneLogItem) {
        OneLogImpl.getInstance().append(oneLogItem);
    }

    @Override // ru.ok.android.onelog.OneLogAppender, java.io.Flushable
    public void flush() {
        OneLogImpl.getInstance().flush();
    }
}
