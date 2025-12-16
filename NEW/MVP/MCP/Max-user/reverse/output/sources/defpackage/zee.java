package defpackage;

/* loaded from: classes.dex */
public final class zee extends d76 {
    public final oqg b;
    public boolean c;
    public lk6 d;
    public volatile boolean o;

    public zee(oqg oqgVar) {
        this.b = oqgVar;
    }

    @Override // defpackage.aof
    public final void b() {
        if (this.o) {
            return;
        }
        synchronized (this) {
            try {
                if (this.o) {
                    return;
                }
                this.o = true;
                if (!this.c) {
                    this.c = true;
                    this.b.b();
                    return;
                }
                lk6 lk6Var = this.d;
                if (lk6Var == null) {
                    lk6Var = new lk6(2, (byte) 0);
                    this.d = lk6Var;
                }
                lk6Var.m(tma.a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.aof
    public final void d(cof cofVar) {
        boolean z = true;
        if (!this.o) {
            synchronized (this) {
                try {
                    if (!this.o) {
                        if (this.c) {
                            lk6 lk6Var = this.d;
                            if (lk6Var == null) {
                                lk6Var = new lk6(2, (byte) 0);
                                this.d = lk6Var;
                            }
                            lk6Var.m(new sma(cofVar));
                            return;
                        }
                        this.c = true;
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            cofVar.cancel();
        } else {
            this.b.d(cofVar);
            h();
        }
    }

    @Override // defpackage.aof
    public final void f(Object obj) {
        if (this.o) {
            return;
        }
        synchronized (this) {
            try {
                if (this.o) {
                    return;
                }
                if (!this.c) {
                    this.c = true;
                    this.b.f(obj);
                    h();
                } else {
                    lk6 lk6Var = this.d;
                    if (lk6Var == null) {
                        lk6Var = new lk6(2, (byte) 0);
                        this.d = lk6Var;
                    }
                    lk6Var.m(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.i66
    public final void g(q76 q76Var) {
        this.b.e(q76Var);
    }

    public final void h() {
        lk6 lk6Var;
        while (true) {
            synchronized (this) {
                try {
                    lk6Var = this.d;
                    if (lk6Var == null) {
                        this.c = false;
                        return;
                    }
                    this.d = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            lk6Var.h(this.b);
        }
    }

    @Override // defpackage.aof
    public final void onError(Throwable th) {
        if (this.o) {
            t8j.a(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.o) {
                    this.o = true;
                    if (this.c) {
                        lk6 lk6Var = this.d;
                        if (lk6Var == null) {
                            lk6Var = new lk6(2, (byte) 0);
                            this.d = lk6Var;
                        }
                        ((Object[]) lk6Var.c)[0] = new rma(th);
                        return;
                    }
                    this.c = true;
                    z = false;
                }
                if (z) {
                    t8j.a(th);
                } else {
                    this.b.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
