package defpackage;

/* loaded from: classes.dex */
public final class bfe extends snf implements zr {
    public final lqc a;
    public boolean b;
    public lk6 c;
    public volatile boolean d;

    public bfe(lqc lqcVar) {
        this.a = lqcVar;
    }

    @Override // defpackage.vta
    public final void b() {
        if (this.d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.d) {
                    return;
                }
                this.d = true;
                if (!this.b) {
                    this.b = true;
                    this.a.b();
                    return;
                }
                lk6 lk6Var = this.c;
                if (lk6Var == null) {
                    lk6Var = new lk6(2, (byte) 0);
                    this.c = lk6Var;
                }
                lk6Var.m(tma.a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        boolean z = true;
        if (!this.d) {
            synchronized (this) {
                try {
                    if (!this.d) {
                        if (this.b) {
                            lk6 lk6Var = this.c;
                            if (lk6Var == null) {
                                lk6Var = new lk6(2, (byte) 0);
                                this.c = lk6Var;
                            }
                            lk6Var.m(new qma(py4Var));
                            return;
                        }
                        this.b = true;
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            py4Var.dispose();
        } else {
            this.a.c(py4Var);
            t();
        }
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        if (this.d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.d) {
                    return;
                }
                if (!this.b) {
                    this.b = true;
                    this.a.f(obj);
                    t();
                } else {
                    lk6 lk6Var = this.c;
                    if (lk6Var == null) {
                        lk6Var = new lk6(2, (byte) 0);
                        this.c = lk6Var;
                    }
                    lk6Var.m(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        this.a.a(vtaVar);
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        if (this.d) {
            t8j.a(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.d) {
                    this.d = true;
                    if (this.b) {
                        lk6 lk6Var = this.c;
                        if (lk6Var == null) {
                            lk6Var = new lk6(2, (byte) 0);
                            this.c = lk6Var;
                        }
                        ((Object[]) lk6Var.c)[0] = new rma(th);
                        return;
                    }
                    this.b = true;
                    z = false;
                }
                if (z) {
                    t8j.a(th);
                } else {
                    this.a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void t() {
        lk6 lk6Var;
        while (true) {
            synchronized (this) {
                try {
                    lk6Var = this.c;
                    if (lk6Var == null) {
                        this.b = false;
                        return;
                    }
                    this.c = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            lk6Var.z(this);
        }
    }

    @Override // defpackage.m7c
    public final boolean test(Object obj) {
        return tma.c(this.a, obj);
    }
}
