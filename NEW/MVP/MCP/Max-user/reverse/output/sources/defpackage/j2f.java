package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class j2f extends AtomicReference implements vta, py4 {
    public final v2f a;
    public final hs8 b;
    public boolean c;

    public j2f(v2f v2fVar, hs8 hs8Var) {
        this.a = v2fVar;
        this.b = hs8Var;
    }

    @Override // defpackage.vta
    public final void b() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.k(new aqc(this, this.a, false, 2));
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        if (ty4.h(this, py4Var)) {
            this.a.c(this);
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        ty4.a(this);
    }

    @Override // defpackage.py4
    public final boolean e() {
        return ty4.c((py4) get());
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        ((py4) get()).dispose();
        b();
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        if (this.c) {
            t8j.a(th);
        } else {
            this.c = true;
            this.a.onError(th);
        }
    }
}
