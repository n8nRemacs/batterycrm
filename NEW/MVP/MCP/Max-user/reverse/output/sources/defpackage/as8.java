package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class as8 extends AtomicReference implements bs8, py4, Runnable, v2f {
    public final /* synthetic */ int a;
    public final j0e b;
    public Object c;
    public Throwable d;
    public final Object o;

    public /* synthetic */ as8(Object obj, j0e j0eVar, int i) {
        this.a = i;
        this.o = obj;
        this.b = j0eVar;
    }

    @Override // defpackage.bs8
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.c = obj;
                ty4.d(this, this.b.b(this));
                break;
            default:
                this.c = obj;
                ty4.d(this, this.b.b(this));
                break;
        }
    }

    @Override // defpackage.bs8
    public void b() {
        ty4.d(this, this.b.b(this));
    }

    @Override // defpackage.bs8
    public final void c(py4 py4Var) {
        switch (this.a) {
            case 0:
                if (ty4.h(this, py4Var)) {
                    ((bs8) this.o).c(this);
                    break;
                }
                break;
            default:
                if (ty4.h(this, py4Var)) {
                    ((v2f) this.o).c(this);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        switch (this.a) {
            case 0:
                ty4.a(this);
                break;
            default:
                ty4.a(this);
                break;
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        switch (this.a) {
        }
        return ty4.c((py4) get());
    }

    @Override // defpackage.bs8
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.d = th;
                ty4.d(this, this.b.b(this));
                break;
            default:
                this.d = th;
                ty4.d(this, this.b.b(this));
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bs8 bs8Var = (bs8) this.o;
                Throwable th = this.d;
                if (th == null) {
                    Object obj = this.c;
                    if (obj == null) {
                        bs8Var.b();
                        break;
                    } else {
                        this.c = null;
                        bs8Var.a(obj);
                        break;
                    }
                } else {
                    this.d = null;
                    bs8Var.onError(th);
                    break;
                }
            default:
                v2f v2fVar = (v2f) this.o;
                Throwable th2 = this.d;
                if (th2 == null) {
                    v2fVar.a(this.c);
                    break;
                } else {
                    v2fVar.onError(th2);
                    break;
                }
        }
    }
}
