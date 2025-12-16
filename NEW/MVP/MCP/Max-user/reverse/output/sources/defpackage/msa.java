package defpackage;

/* loaded from: classes.dex */
public final class msa implements vta, py4 {
    public final /* synthetic */ int a;
    public final vta b;
    public py4 c;

    public /* synthetic */ msa(vta vtaVar, int i) {
        this.a = i;
        this.b = vtaVar;
    }

    private final void a(Object obj) {
    }

    @Override // defpackage.vta
    public final void b() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                this.b.b();
                break;
        }
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        switch (this.a) {
            case 0:
                if (ty4.i(this.c, py4Var)) {
                    this.c = py4Var;
                    this.b.c(this);
                    break;
                }
                break;
            default:
                this.c = py4Var;
                this.b.c(this);
                break;
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        switch (this.a) {
            case 0:
                this.c.dispose();
                break;
            default:
                this.c.dispose();
                break;
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        switch (this.a) {
        }
        return this.c.e();
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        switch (this.a) {
            case 0:
                this.b.f(obj);
                break;
        }
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.b.onError(th);
                break;
            default:
                this.b.onError(th);
                break;
        }
    }
}
