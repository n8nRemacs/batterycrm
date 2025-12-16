package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class yr8 extends or8 implements drf {
    public final Callable a;

    public yr8(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.or8
    public final void f(bs8 bs8Var) {
        z6 z6Var = new z6(1, pdf.c);
        bs8Var.c(z6Var);
        if (z6Var.e()) {
            return;
        }
        try {
            Object objCall = this.a.call();
            if (z6Var.e()) {
                return;
            }
            if (objCall == null) {
                bs8Var.b();
            } else {
                bs8Var.a(objCall);
            }
        } catch (Throwable th) {
            raj.c(th);
            if (z6Var.e()) {
                t8j.a(th);
            } else {
                bs8Var.onError(th);
            }
        }
    }

    @Override // defpackage.drf
    public final Object get() {
        return this.a.call();
    }
}
