package defpackage;

/* loaded from: classes.dex */
public final class uy4 implements vta, py4 {
    public final vta a;
    public final gu3 b;
    public final p6 c;
    public py4 d;

    public uy4(vta vtaVar, gu3 gu3Var, p6 p6Var) {
        this.a = vtaVar;
        this.b = gu3Var;
        this.c = p6Var;
    }

    @Override // defpackage.vta
    public final void b() {
        py4 py4Var = this.d;
        ty4 ty4Var = ty4.a;
        if (py4Var != ty4Var) {
            this.d = ty4Var;
            this.a.b();
        }
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        vta vtaVar = this.a;
        try {
            this.b.accept(py4Var);
            if (ty4.i(this.d, py4Var)) {
                this.d = py4Var;
                vtaVar.c(this);
            }
        } catch (Throwable th) {
            raj.c(th);
            py4Var.dispose();
            this.d = ty4.a;
            cd5.c(th, vtaVar);
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        py4 py4Var = this.d;
        ty4 ty4Var = ty4.a;
        if (py4Var != ty4Var) {
            this.d = ty4Var;
            try {
                this.c.run();
            } catch (Throwable th) {
                raj.c(th);
                t8j.a(th);
            }
            py4Var.dispose();
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
        py4 py4Var = this.d;
        ty4 ty4Var = ty4.a;
        if (py4Var == ty4Var) {
            t8j.a(th);
        } else {
            this.d = ty4Var;
            this.a.onError(th);
        }
    }
}
