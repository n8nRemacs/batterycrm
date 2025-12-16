package ru.ok.android.onelog;

import java.io.Flushable;

/* loaded from: classes2.dex */
public interface OneLogAppender extends Flushable {
    void append(OneLogItem oneLogItem);

    @Override // java.io.Flushable
    void flush();
}
