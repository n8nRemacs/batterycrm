package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class xqa implements vta, py4 {
    public final /* synthetic */ int a;
    public Object b;
    public py4 c;
    public boolean d;
    public final Object o;

    public /* synthetic */ xqa(Object obj, m7c m7cVar, int i) {
        this.a = i;
        this.o = obj;
        this.b = m7cVar;
    }

    @Override // defpackage.vta
    public final void b() {
        switch (this.a) {
            case 0:
                vta vtaVar = (vta) this.o;
                if (!this.d) {
                    this.d = true;
                    vtaVar.f(Boolean.FALSE);
                    vtaVar.b();
                    break;
                }
                break;
            case 1:
                if (!this.d) {
                    this.d = true;
                    ((v2f) this.o).a(Boolean.FALSE);
                    break;
                }
                break;
            case 2:
                v2f v2fVar = (v2f) this.o;
                if (!this.d) {
                    this.d = true;
                    Object obj = this.b;
                    this.b = null;
                    if (obj == null) {
                        obj = null;
                    }
                    if (obj == null) {
                        v2fVar.onError(new NoSuchElementException());
                        break;
                    } else {
                        v2fVar.a(obj);
                        break;
                    }
                }
                break;
            case 3:
                ((vta) this.o).b();
                break;
            default:
                if (!this.d) {
                    this.d = true;
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
                if (ty4.i(this.c, py4Var)) {
                    this.c = py4Var;
                    ((vta) this.o).c(this);
                    break;
                }
                break;
            case 1:
                if (ty4.i(this.c, py4Var)) {
                    this.c = py4Var;
                    ((v2f) this.o).c(this);
                    break;
                }
                break;
            case 2:
                if (ty4.i(this.c, py4Var)) {
                    this.c = py4Var;
                    ((v2f) this.o).c(this);
                    break;
                }
                break;
            case 3:
                if (ty4.i(this.c, py4Var)) {
                    this.c = py4Var;
                    ((vta) this.o).c(this);
                    break;
                }
                break;
            default:
                if (ty4.i(this.c, py4Var)) {
                    this.c = py4Var;
                    ((vta) this.o).c(this);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        switch (this.a) {
            case 0:
                this.c.dispose();
                break;
            case 1:
                this.c.dispose();
                break;
            case 2:
                this.c.dispose();
                break;
            case 3:
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
                vta vtaVar = (vta) this.o;
                if (!this.d) {
                    try {
                        if (((m7c) this.b).test(obj)) {
                            this.d = true;
                            this.c.dispose();
                            vtaVar.f(Boolean.TRUE);
                            vtaVar.b();
                            break;
                        }
                    } catch (Throwable th) {
                        raj.c(th);
                        this.c.dispose();
                        onError(th);
                        return;
                    }
                }
                break;
            case 1:
                if (!this.d) {
                    try {
                        if (((m7c) this.b).test(obj)) {
                            this.d = true;
                            this.c.dispose();
                            ((v2f) this.o).a(Boolean.TRUE);
                            break;
                        }
                    } catch (Throwable th2) {
                        raj.c(th2);
                        this.c.dispose();
                        onError(th2);
                        return;
                    }
                }
                break;
            case 2:
                if (!this.d) {
                    if (this.b == null) {
                        this.b = obj;
                        break;
                    } else {
                        this.d = true;
                        this.c.dispose();
                        ((v2f) this.o).onError(new IllegalArgumentException("Sequence contains more than one element!"));
                        break;
                    }
                }
                break;
            case 3:
                vta vtaVar2 = (vta) this.o;
                if (this.d) {
                    vtaVar2.f(obj);
                    break;
                } else {
                    try {
                        if (!((hfd) this.b).test(obj)) {
                            this.d = true;
                            vtaVar2.f(obj);
                            break;
                        }
                    } catch (Throwable th3) {
                        raj.c(th3);
                        this.c.dispose();
                        vtaVar2.onError(th3);
                        return;
                    }
                }
                break;
            default:
                vta vtaVar3 = (vta) this.o;
                if (!this.d) {
                    vtaVar3.f(obj);
                    try {
                        if (((z2g) this.b).test(obj)) {
                            this.d = true;
                            this.c.dispose();
                            vtaVar3.b();
                            break;
                        }
                    } catch (Throwable th4) {
                        raj.c(th4);
                        this.c.dispose();
                        onError(th4);
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
                    ((vta) this.o).onError(th);
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
            case 2:
                if (!this.d) {
                    this.d = true;
                    ((v2f) this.o).onError(th);
                    break;
                } else {
                    t8j.a(th);
                    break;
                }
            case 3:
                ((vta) this.o).onError(th);
                break;
            default:
                if (!this.d) {
                    this.d = true;
                    ((vta) this.o).onError(th);
                    break;
                } else {
                    t8j.a(th);
                    break;
                }
        }
    }

    public xqa(v2f v2fVar) {
        this.a = 2;
        this.o = v2fVar;
    }
}
