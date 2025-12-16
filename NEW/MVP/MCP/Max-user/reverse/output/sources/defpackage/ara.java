package defpackage;

/* loaded from: classes.dex */
public final class ara implements vta, py4 {
    public final Object X;
    public final /* synthetic */ int a;
    public final ycd b;
    public final Object c;
    public py4 d;
    public boolean o;

    public /* synthetic */ ara(Object obj, Object obj2, ycd ycdVar, int i) {
        this.a = i;
        this.X = obj;
        this.b = ycdVar;
        this.c = obj2;
    }

    @Override // defpackage.vta
    public final void b() {
        switch (this.a) {
            case 0:
                vta vtaVar = (vta) this.X;
                if (!this.o) {
                    this.o = true;
                    vtaVar.f(this.c);
                    vtaVar.b();
                    break;
                }
                break;
            default:
                if (!this.o) {
                    this.o = true;
                    ((v2f) this.X).a(this.c);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        switch (this.a) {
            case 0:
                if (ty4.i(this.d, py4Var)) {
                    this.d = py4Var;
                    ((vta) this.X).c(this);
                    break;
                }
                break;
            default:
                if (ty4.i(this.d, py4Var)) {
                    this.d = py4Var;
                    ((v2f) this.X).c(this);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        switch (this.a) {
            case 0:
                this.d.dispose();
                break;
            default:
                this.d.dispose();
                break;
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        switch (this.a) {
        }
        return this.d.e();
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        switch (this.a) {
            case 0:
                if (!this.o) {
                    try {
                        this.b.accept(this.c, obj);
                        break;
                    } catch (Throwable th) {
                        raj.c(th);
                        this.d.dispose();
                        onError(th);
                        return;
                    }
                }
                break;
            default:
                if (!this.o) {
                    try {
                        this.b.accept(this.c, obj);
                        break;
                    } catch (Throwable th2) {
                        raj.c(th2);
                        this.d.dispose();
                        onError(th2);
                    }
                }
                break;
        }
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (!this.o) {
                    this.o = true;
                    ((vta) this.X).onError(th);
                    break;
                } else {
                    t8j.a(th);
                    break;
                }
            default:
                if (!this.o) {
                    this.o = true;
                    ((v2f) this.X).onError(th);
                    break;
                } else {
                    t8j.a(th);
                    break;
                }
        }
    }
}
