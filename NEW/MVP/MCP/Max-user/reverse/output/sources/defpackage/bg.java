package defpackage;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class bg implements Closeable {
    public final int a;
    public final qk4 b;

    public bg(int i, qk4 qk4Var) {
        this.a = i;
        this.b = qk4Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
