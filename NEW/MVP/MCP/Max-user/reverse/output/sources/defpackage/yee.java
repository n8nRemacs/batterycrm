package defpackage;

/* loaded from: classes.dex */
public final class yee implements vta, py4 {
    public final vta a;
    public py4 b;
    public boolean c;
    public lk6 d;
    public volatile boolean o;

    public yee(vta vtaVar) {
        this.a = vtaVar;
    }

    @Override // defpackage.vta
    public final void b() {
        if (this.o) {
            return;
        }
        synchronized (this) {
            try {
                if (this.o) {
                    return;
                }
                if (!this.c) {
                    this.o = true;
                    this.c = true;
                    this.a.b();
                } else {
                    lk6 lk6Var = this.d;
                    if (lk6Var == null) {
                        lk6Var = new lk6(2, (byte) 0);
                        this.d = lk6Var;
                    }
                    lk6Var.m(tma.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        if (ty4.i(this.b, py4Var)) {
            this.b = py4Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        this.o = true;
        this.b.dispose();
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.b.e();
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        Object[] objArr;
        if (this.o) {
            return;
        }
        if (obj == null) {
            this.b.dispose();
            onError(bj5.a("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.o) {
                    return;
                }
                if (this.c) {
                    lk6 lk6Var = this.d;
                    if (lk6Var == null) {
                        lk6Var = new lk6(2, (byte) 0);
                        this.d = lk6Var;
                    }
                    lk6Var.m(obj);
                    return;
                }
                this.c = true;
                this.a.f(obj);
                while (true) {
                    synchronized (this) {
                        try {
                            lk6 lk6Var2 = this.d;
                            if (lk6Var2 == null) {
                                this.c = false;
                                return;
                            }
                            this.d = null;
                            vta vtaVar = this.a;
                            for (Object[] objArr2 = (Object[]) lk6Var2.c; objArr2 != null; objArr2 = objArr2[4]) {
                                for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                                    if (tma.c(vtaVar, objArr)) {
                                        return;
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        if (this.o) {
            t8j.a(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.o) {
                    if (this.c) {
                        this.o = true;
                        lk6 lk6Var = this.d;
                        if (lk6Var == null) {
                            lk6Var = new lk6(2, (byte) 0);
                            this.d = lk6Var;
                        }
                        ((Object[]) lk6Var.c)[0] = new rma(th);
                        return;
                    }
                    this.o = true;
                    this.c = true;
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
}
