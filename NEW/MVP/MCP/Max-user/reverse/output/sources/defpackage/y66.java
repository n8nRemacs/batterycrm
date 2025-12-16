package defpackage;

/* loaded from: classes.dex */
public final class y66 implements vta, cof {
    public final aof a;
    public py4 b;

    public y66(aof aofVar) {
        this.a = aofVar;
    }

    @Override // defpackage.vta
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        this.b = py4Var;
        this.a.d(this);
    }

    @Override // defpackage.cof
    public final void cancel() {
        this.b.dispose();
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        this.a.f(obj);
    }

    @Override // defpackage.cof
    public final void g(long j) {
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}
