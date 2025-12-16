package defpackage;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class fyd implements b48, Closeable {
    public final String a;
    public final eyd b;
    public boolean c;

    public fyd(String str, eyd eydVar) {
        this.a = str;
        this.b = eydVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.b48
    public final void d(j48 j48Var, k38 k38Var) {
        if (k38Var == k38.ON_DESTROY) {
            this.c = false;
            j48Var.p().f(this);
        }
    }
}
