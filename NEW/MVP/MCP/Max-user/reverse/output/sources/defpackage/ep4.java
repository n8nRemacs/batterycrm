package defpackage;

import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* loaded from: classes.dex */
public final class ep4 extends m0e {
    public static final ep4 b;

    static {
        int i = e3g.c;
        int i2 = e3g.d;
        long j = e3g.e;
        String str = e3g.a;
        ep4 ep4Var = new ep4();
        ep4Var.a = new e84(j, str, i, i2);
        b = ep4Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.z74
    public final z74 limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return i >= e3g.c ? LimitedDispatcherKt.namedOrThis(this, str) : super.limitedParallelism(i, str);
    }

    @Override // defpackage.z74
    public final String toString() {
        return "Dispatchers.Default";
    }
}
