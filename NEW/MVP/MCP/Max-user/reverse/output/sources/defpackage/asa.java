package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class asa extends AtomicReference implements vta {
    public final bsa a;
    public volatile boolean b;
    public volatile o1f c;
    public int d;

    public asa(bsa bsaVar) {
        this.a = bsaVar;
    }

    @Override // defpackage.vta
    public final void b() {
        this.b = true;
        this.a.g();
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        if (ty4.h(this, py4Var) && (py4Var instanceof osc)) {
            osc oscVar = (osc) py4Var;
            int iH = oscVar.h(7);
            if (iH == 1) {
                this.d = iH;
                this.c = oscVar;
                this.b = true;
                this.a.g();
                return;
            }
            if (iH == 2) {
                this.d = iH;
                this.c = oscVar;
            }
        }
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        if (this.d != 0) {
            this.a.g();
            return;
        }
        bsa bsaVar = this.a;
        if (bsaVar.get() == 0 && bsaVar.compareAndSet(0, 1)) {
            bsaVar.a.f(obj);
            if (bsaVar.decrementAndGet() == 0) {
                return;
            }
        } else {
            o1f r8fVar = this.c;
            if (r8fVar == null) {
                r8fVar = new r8f(bsaVar.d);
                this.c = r8fVar;
            }
            r8fVar.offer(obj);
            if (bsaVar.getAndIncrement() != 0) {
                return;
            }
        }
        bsaVar.h();
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        if (this.a.Y.b(th)) {
            bsa bsaVar = this.a;
            bsaVar.getClass();
            bsaVar.d();
            this.b = true;
            this.a.g();
        }
    }
}
