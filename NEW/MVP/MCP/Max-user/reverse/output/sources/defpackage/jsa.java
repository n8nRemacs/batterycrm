package defpackage;

/* loaded from: classes.dex */
public final class jsa implements rk3, qsc, osc {
    public final vta a;
    public py4 b;

    public jsa(vta vtaVar) {
        this.a = vtaVar;
    }

    @Override // defpackage.rk3, defpackage.bs8
    public final void b() {
        this.b = ty4.a;
        this.a.b();
    }

    @Override // defpackage.rk3, defpackage.bs8
    public final void c(py4 py4Var) {
        if (ty4.i(this.b, py4Var)) {
            this.b = py4Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.cof
    public final void cancel() {
    }

    @Override // defpackage.o1f
    public final void clear() {
    }

    @Override // defpackage.py4
    public final void dispose() {
        this.b.dispose();
        this.b = ty4.a;
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.cof
    public final void g(long j) {
    }

    @Override // defpackage.psc
    public final int h(int i) {
        return 2;
    }

    @Override // defpackage.o1f
    public final boolean isEmpty() {
        return true;
    }

    @Override // defpackage.o1f
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.rk3, defpackage.bs8
    public final void onError(Throwable th) {
        this.b = ty4.a;
        this.a.onError(th);
    }

    @Override // defpackage.o1f
    public final Object poll() {
        return null;
    }
}
