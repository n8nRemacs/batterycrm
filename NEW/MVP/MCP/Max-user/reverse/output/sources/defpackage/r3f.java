package defpackage;

/* loaded from: classes.dex */
public final class r3f extends hs4 implements v2f {
    public py4 c;

    @Override // defpackage.v2f
    public final void c(py4 py4Var) {
        if (ty4.i(this.c, py4Var)) {
            this.c = py4Var;
            this.a.d(this);
        }
    }

    @Override // defpackage.cof
    public final void cancel() {
        set(4);
        this.b = null;
        this.c.dispose();
    }

    @Override // defpackage.v2f
    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}
