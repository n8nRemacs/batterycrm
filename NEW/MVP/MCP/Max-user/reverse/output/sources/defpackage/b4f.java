package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface b4f extends Closeable, Flushable {
    void L(qu0 qu0Var, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // java.io.Flushable
    void flush();

    u9g m();
}
