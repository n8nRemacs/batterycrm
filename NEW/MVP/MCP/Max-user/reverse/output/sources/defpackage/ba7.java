package defpackage;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class ba7 implements Closeable {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;
    public final Closeable d;

    public /* synthetic */ ba7(int i, Object obj, Closeable closeable, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
        this.d = closeable;
    }

    private final void l() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                break;
            default:
                pk6 pk6Var = (pk6) this.d;
                if (pk6Var != null) {
                    pk6Var.close();
                    break;
                }
                break;
        }
    }
}
