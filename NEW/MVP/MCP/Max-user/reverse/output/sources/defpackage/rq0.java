package defpackage;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class rq0 extends CountDownLatch implements v2f, rk3, bs8 {
    public Object a;
    public Throwable b;
    public py4 c;
    public volatile boolean d;

    @Override // defpackage.v2f
    public final void a(Object obj) {
        this.a = obj;
        countDown();
    }

    @Override // defpackage.rk3, defpackage.bs8
    public final void b() {
        countDown();
    }

    @Override // defpackage.v2f
    public final void c(py4 py4Var) {
        this.c = py4Var;
        if (this.d) {
            py4Var.dispose();
        }
    }

    public final Object d() throws InterruptedException {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                this.d = true;
                py4 py4Var = this.c;
                if (py4Var != null) {
                    py4Var.dispose();
                }
                throw bj5.d(e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw bj5.d(th);
    }

    @Override // defpackage.v2f
    public final void onError(Throwable th) {
        this.b = th;
        countDown();
    }
}
