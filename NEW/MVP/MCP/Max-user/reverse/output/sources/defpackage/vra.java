package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class vra implements vta, py4 {
    public final /* synthetic */ int a;
    public py4 b;
    public long c;
    public boolean d;
    public final Object o;

    public /* synthetic */ vra(int i, Object obj) {
        this.a = i;
        this.o = obj;
    }

    @Override // defpackage.vta
    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.d) {
                    this.d = true;
                    ((bs8) this.o).b();
                    break;
                }
                break;
            case 1:
                if (!this.d) {
                    this.d = true;
                    ((v2f) this.o).onError(new NoSuchElementException());
                    break;
                }
                break;
            default:
                if (!this.d) {
                    this.d = true;
                    this.b.dispose();
                    ((vta) this.o).b();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        switch (this.a) {
            case 0:
                if (ty4.i(this.b, py4Var)) {
                    this.b = py4Var;
                    ((bs8) this.o).c(this);
                    break;
                }
                break;
            case 1:
                if (ty4.i(this.b, py4Var)) {
                    this.b = py4Var;
                    ((v2f) this.o).c(this);
                    break;
                }
                break;
            default:
                vta vtaVar = (vta) this.o;
                if (ty4.i(this.b, py4Var)) {
                    this.b = py4Var;
                    if (this.c != 0) {
                        vtaVar.c(this);
                        break;
                    } else {
                        this.d = true;
                        py4Var.dispose();
                        cd5.a(vtaVar);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        switch (this.a) {
            case 0:
                this.b.dispose();
                break;
            case 1:
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
    public final void f(Object obj) {
        switch (this.a) {
            case 0:
                if (!this.d) {
                    long j = this.c;
                    if (j != 0) {
                        this.c = j + 1;
                        break;
                    } else {
                        this.d = true;
                        this.b.dispose();
                        ((bs8) this.o).a(obj);
                        break;
                    }
                }
                break;
            case 1:
                if (!this.d) {
                    long j2 = this.c;
                    if (j2 != 0) {
                        this.c = j2 + 1;
                        break;
                    } else {
                        this.d = true;
                        this.b.dispose();
                        ((v2f) this.o).a(obj);
                        break;
                    }
                }
                break;
            default:
                if (!this.d) {
                    long j3 = this.c;
                    long j4 = j3 - 1;
                    this.c = j4;
                    if (j3 > 0) {
                        boolean z = j4 == 0;
                        ((vta) this.o).f(obj);
                        if (z) {
                            b();
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (!this.d) {
                    this.d = true;
                    ((bs8) this.o).onError(th);
                    break;
                } else {
                    t8j.a(th);
                    break;
                }
            case 1:
                if (!this.d) {
                    this.d = true;
                    ((v2f) this.o).onError(th);
                    break;
                } else {
                    t8j.a(th);
                    break;
                }
            default:
                if (!this.d) {
                    this.d = true;
                    this.b.dispose();
                    ((vta) this.o).onError(th);
                    break;
                } else {
                    t8j.a(th);
                    break;
                }
        }
    }

    public vra(vta vtaVar, long j) {
        this.a = 2;
        this.o = vtaVar;
        this.c = j;
    }
}
