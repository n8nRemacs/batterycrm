package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class mra implements vta, py4 {
    public final vta a;
    public final long b;
    public final h0e c;
    public py4 d;

    public mra(vta vtaVar, long j, h0e h0eVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a = vtaVar;
        this.b = j;
        this.c = h0eVar;
    }

    @Override // defpackage.vta
    public final void b() {
        this.c.c(new r98(8, this), this.b, TimeUnit.MILLISECONDS);
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
        this.c.dispose();
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        this.c.c(new zn6(this, obj, false, 18), this.b, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        this.c.c(new yn6(this, th, false, 22), 0L, TimeUnit.MILLISECONDS);
    }
}
