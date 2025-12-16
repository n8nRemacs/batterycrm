package defpackage;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class qq0 extends CountDownLatch implements vta, py4 {
    public Object a;
    public Throwable b;
    public py4 c;
    public volatile boolean d;

    @Override // defpackage.vta
    public final void b() {
        countDown();
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        this.c = py4Var;
        if (this.d) {
            py4Var.dispose();
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        this.d = true;
        py4 py4Var = this.c;
        if (py4Var != null) {
            py4Var.dispose();
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        if (this.a == null) {
            this.a = obj;
            this.c.dispose();
            countDown();
        }
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        if (this.a == null) {
            this.b = th;
        }
        countDown();
    }
}
