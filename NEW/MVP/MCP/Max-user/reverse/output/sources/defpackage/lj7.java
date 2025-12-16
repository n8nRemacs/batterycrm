package defpackage;

/* loaded from: classes.dex */
public final class lj7 implements af4 {
    public final int a;
    public final /* synthetic */ mj7 b;

    public lj7(mj7 mj7Var, int i) {
        this.b = mj7Var;
        this.a = i;
    }

    @Override // defpackage.af4
    public final void a(pe4 pe4Var) {
        if (this.a == 0) {
            this.b.j(((r0) pe4Var).c());
        }
    }

    @Override // defpackage.af4
    public final void b(pe4 pe4Var) {
        mj7.n(this.b, this.a, pe4Var);
    }

    @Override // defpackage.af4
    public final void c() {
    }

    @Override // defpackage.af4
    public final void d(pe4 pe4Var) {
        Throwable th;
        int i;
        if (!pe4Var.e()) {
            if (((r0) pe4Var).g()) {
                mj7.n(this.b, this.a, pe4Var);
                return;
            }
            return;
        }
        mj7 mj7Var = this.b;
        int i2 = this.a;
        r0 r0Var = (r0) pe4Var;
        boolean zG = r0Var.g();
        synchronized (mj7Var) {
            try {
                int i3 = mj7Var.i;
                if (r0Var == mj7Var.q(i2) && i2 != mj7Var.i) {
                    if (mj7Var.r() == null || (zG && i2 < mj7Var.i)) {
                        mj7Var.i = i2;
                        i = i2;
                    } else {
                        i = i3;
                    }
                    while (i3 > i) {
                        pe4 pe4VarP = mj7Var.p(i3);
                        if (pe4VarP != null) {
                            pe4VarP.close();
                        }
                        i3--;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (r0Var == mj7Var.r()) {
            mj7Var.k(null, i2 == 0 && r0Var.g(), r0Var.a);
        }
        if (mj7Var.k.incrementAndGet() != mj7Var.j || (th = mj7Var.l) == null) {
            return;
        }
        mj7Var.i(th, mj7Var.m);
    }
}
