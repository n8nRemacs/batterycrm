package defpackage;

/* loaded from: classes.dex */
public abstract class oj0 implements af4 {
    @Override // defpackage.af4
    public void a(pe4 pe4Var) {
    }

    @Override // defpackage.af4
    public final void b(pe4 pe4Var) {
        try {
            e(pe4Var);
        } finally {
            pe4Var.close();
        }
    }

    @Override // defpackage.af4
    public void c() {
    }

    @Override // defpackage.af4
    public final void d(pe4 pe4Var) {
        r0 r0Var = (r0) pe4Var;
        boolean zG = r0Var.g();
        try {
            f(r0Var);
        } finally {
            if (zG) {
                r0Var.close();
            }
        }
    }

    public abstract void e(pe4 pe4Var);

    public abstract void f(r0 r0Var);
}
