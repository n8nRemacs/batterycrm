package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class v08 extends AtomicReference implements vta, py4 {
    public final gu3 a;
    public final gu3 b;
    public final p6 c;
    public final r8j d = pdf.e;

    public v08(gu3 gu3Var, gu3 gu3Var2, p6 p6Var) {
        this.a = gu3Var;
        this.b = gu3Var2;
        this.c = p6Var;
    }

    @Override // defpackage.vta
    public final void b() {
        if (e()) {
            return;
        }
        lazySet(ty4.a);
        try {
            this.c.run();
        } catch (Throwable th) {
            raj.c(th);
            t8j.a(th);
        }
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        if (ty4.h(this, py4Var)) {
            try {
                this.d.getClass();
            } catch (Throwable th) {
                raj.c(th);
                py4Var.dispose();
                onError(th);
            }
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        ty4.a(this);
    }

    @Override // defpackage.py4
    public final boolean e() {
        return get() == ty4.a;
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        if (e()) {
            return;
        }
        try {
            this.a.accept(obj);
        } catch (Throwable th) {
            raj.c(th);
            ((py4) get()).dispose();
            onError(th);
        }
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        if (e()) {
            t8j.a(th);
            return;
        }
        lazySet(ty4.a);
        try {
            this.b.accept(th);
        } catch (Throwable th2) {
            raj.c(th2);
            t8j.a(new CompositeException(th, th2));
        }
    }
}
