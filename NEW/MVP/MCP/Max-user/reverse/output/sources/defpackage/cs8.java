package defpackage;

/* loaded from: classes.dex */
public final class cs8 implements bs8, v2f, py4, vta {
    public final /* synthetic */ int a;
    public py4 b;
    public final Object c;

    public /* synthetic */ cs8(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    @Override // defpackage.bs8
    public void a(Object obj) {
        ((bs8) this.c).a(obj);
    }

    @Override // defpackage.bs8
    public final void b() {
        switch (this.a) {
            case 0:
                ((bs8) this.c).b();
                break;
            default:
                ((rk3) this.c).b();
                break;
        }
    }

    @Override // defpackage.bs8
    public final void c(py4 py4Var) {
        switch (this.a) {
            case 0:
                if (ty4.i(this.b, py4Var)) {
                    this.b = py4Var;
                    ((bs8) this.c).c(this);
                    break;
                }
                break;
            default:
                this.b = py4Var;
                ((rk3) this.c).c(this);
                break;
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        switch (this.a) {
            case 0:
                this.b.dispose();
                break;
            default:
                this.b.dispose();
                break;
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        switch (this.a) {
        }
        return this.b.e();
    }

    @Override // defpackage.vta
    public void f(Object obj) {
    }

    @Override // defpackage.bs8
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                ((bs8) this.c).b();
                break;
            default:
                ((rk3) this.c).onError(th);
                break;
        }
    }
}
