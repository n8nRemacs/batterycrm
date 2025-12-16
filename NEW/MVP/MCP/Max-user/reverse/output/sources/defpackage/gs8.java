package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class gs8 extends AtomicReference implements bs8, py4, rk3 {
    public final /* synthetic */ int a;
    public final v2f b;
    public final e2f c;

    public /* synthetic */ gs8(v2f v2fVar, e2f e2fVar, int i) {
        this.a = i;
        this.b = v2fVar;
        this.c = e2fVar;
    }

    @Override // defpackage.bs8
    public void a(Object obj) {
        this.b.a(obj);
    }

    @Override // defpackage.bs8
    public final void b() {
        switch (this.a) {
            case 0:
                py4 py4Var = (py4) get();
                if (py4Var != ty4.a && compareAndSet(py4Var, null)) {
                    this.c.k(new h79(this.b, 24, this));
                    break;
                }
                break;
            default:
                this.c.k(new aqc(this, this.b, false, 2));
                break;
        }
    }

    @Override // defpackage.bs8
    public final void c(py4 py4Var) {
        switch (this.a) {
            case 0:
                if (ty4.h(this, py4Var)) {
                    this.b.c(this);
                    break;
                }
                break;
            default:
                if (ty4.h(this, py4Var)) {
                    this.b.c(this);
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
                this.b.onError(th);
                break;
            default:
                this.b.onError(th);
                break;
        }
    }
}
