package defpackage;

/* loaded from: classes.dex */
public final class cfe implements q76, cof {
    public final aof a;
    public cof b;
    public boolean c;
    public lk6 d;
    public volatile boolean o;

    public cfe(aof aofVar) {
        this.a = aofVar;
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

    @Override // defpackage.cof
    public final void cancel() {
        this.b.cancel();
    }

    @Override // defpackage.aof
    public final void d(cof cofVar) {
        if (fof.h(this.b, cofVar)) {
            this.b = cofVar;
            this.a.d(this);
        }
    }

    @Override // defpackage.aof
    public final void f(Object obj) {
        lk6 lk6Var;
        if (this.o) {
            return;
        }
        if (obj == null) {
            this.b.cancel();
            onError(bj5.a("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.o) {
                    return;
                }
                if (this.c) {
                    lk6 lk6Var2 = this.d;
                    if (lk6Var2 == null) {
                        lk6Var2 = new lk6(2, (byte) 0);
                        this.d = lk6Var2;
                    }
                    lk6Var2.m(obj);
                    return;
                }
                this.c = true;
                this.a.f(obj);
                do {
                    synchronized (this) {
                        try {
                            lk6Var = this.d;
                            if (lk6Var == null) {
                                this.c = false;
                                return;
                            }
                            this.d = null;
                        } finally {
                        }
                    }
                } while (!lk6Var.h(this.a));
            } finally {
            }
        }
    }

    @Override // defpackage.cof
    public final void g(long j) {
        this.b.g(j);
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
