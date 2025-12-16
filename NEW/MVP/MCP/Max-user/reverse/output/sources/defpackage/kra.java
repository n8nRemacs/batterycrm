package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class kra implements vta, py4 {
    public boolean X;
    public final yee a;
    public final h0e b;
    public py4 c;
    public jra d;
    public volatile long o;

    public kra(yee yeeVar, h0e h0eVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a = yeeVar;
        this.b = h0eVar;
    }

    @Override // defpackage.vta
    public final void b() {
        if (this.X) {
            return;
        }
        this.X = true;
        jra jraVar = this.d;
        if (jraVar != null) {
            ty4.a(jraVar);
        }
        if (jraVar != null) {
            jraVar.run();
        }
        this.a.b();
        this.b.dispose();
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        if (ty4.i(this.c, py4Var)) {
            this.c = py4Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        this.c.dispose();
        this.b.dispose();
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        if (this.X) {
            return;
        }
        long j = this.o + 1;
        this.o = j;
        jra jraVar = this.d;
        if (jraVar != null) {
            ty4.a(jraVar);
        }
        jra jraVar2 = new jra(obj, j, this);
        this.d = jraVar2;
        ty4.d(jraVar2, this.b.c(jraVar2, 1000L, TimeUnit.MILLISECONDS));
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        if (this.X) {
            t8j.a(th);
            return;
        }
        jra jraVar = this.d;
        if (jraVar != null) {
            ty4.a(jraVar);
        }
        this.X = true;
        this.a.onError(th);
        this.b.dispose();
    }
}
