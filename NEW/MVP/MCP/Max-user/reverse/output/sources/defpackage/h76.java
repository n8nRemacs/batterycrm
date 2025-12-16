package defpackage;

/* loaded from: classes.dex */
public final class h76 extends dof implements q76 {
    public final cfe Z;
    public final zee s0;
    public final e76 t0;
    public long u0;

    public h76(cfe cfeVar, zee zeeVar, e76 e76Var) {
        this.Z = cfeVar;
        this.s0 = zeeVar;
        this.t0 = e76Var;
    }

    @Override // defpackage.aof
    public final void b() {
        this.t0.cancel();
        this.Z.b();
    }

    @Override // defpackage.dof, defpackage.cof
    public final void cancel() {
        super.cancel();
        this.t0.cancel();
    }

    @Override // defpackage.aof
    public final void f(Object obj) {
        this.u0++;
        this.Z.f(obj);
    }

    @Override // defpackage.aof
    public final void onError(Throwable th) {
        h(xd5.a);
        long j = this.u0;
        if (j != 0) {
            this.u0 = 0L;
            e(j);
        }
        this.t0.g(1L);
        this.s0.f(th);
    }
}
