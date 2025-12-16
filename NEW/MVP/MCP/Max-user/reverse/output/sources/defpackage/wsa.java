package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class wsa extends AtomicBoolean implements vta, py4 {
    public final vta a;
    public final xsa b;
    public final vsa c;
    public py4 d;

    public wsa(vta vtaVar, xsa xsaVar, vsa vsaVar) {
        this.a = vtaVar;
        this.b = xsaVar;
        this.c = vsaVar;
    }

    @Override // defpackage.vta
    public final void b() {
        if (compareAndSet(false, true)) {
            this.b.t(this.c);
            this.a.b();
        }
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        if (ty4.i(this.d, py4Var)) {
            this.d = py4Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        this.d.dispose();
        if (compareAndSet(false, true)) {
            xsa xsaVar = this.b;
            vsa vsaVar = this.c;
            synchronized (xsaVar) {
                try {
                    vsa vsaVar2 = xsaVar.c;
                    if (vsaVar2 != null && vsaVar2 == vsaVar) {
                        long j = vsaVar.b - 1;
                        vsaVar.b = j;
                        if (j == 0 && vsaVar.c) {
                            xsaVar.u(vsaVar);
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.d.e();
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        this.a.f(obj);
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        if (!compareAndSet(false, true)) {
            t8j.a(th);
        } else {
            this.b.t(this.c);
            this.a.onError(th);
        }
    }
}
