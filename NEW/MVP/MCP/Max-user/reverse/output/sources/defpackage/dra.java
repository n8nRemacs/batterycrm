package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class dra extends AtomicReference implements vta {
    public final /* synthetic */ int a;
    public final vta b;
    public final AtomicInteger c;

    public /* synthetic */ dra(vta vtaVar, AtomicInteger atomicInteger, int i) {
        this.a = i;
        this.b = vtaVar;
        this.c = atomicInteger;
    }

    @Override // defpackage.vta
    public final void b() {
        switch (this.a) {
            case 0:
                era eraVar = (era) this.c;
                eraVar.s0 = false;
                eraVar.a();
                break;
            default:
                fra fraVar = (fra) this.c;
                fraVar.Y = false;
                fraVar.a();
                break;
        }
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        switch (this.a) {
            case 0:
                ty4.d(this, py4Var);
                break;
            default:
                ty4.d(this, py4Var);
                break;
        }
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        switch (this.a) {
            case 0:
                this.b.f(obj);
                break;
            default:
                ((yee) this.b).f(obj);
                break;
        }
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                era eraVar = (era) this.c;
                if (eraVar.d.b(th)) {
                    if (!eraVar.X) {
                        eraVar.Z.dispose();
                    }
                    eraVar.s0 = false;
                    eraVar.a();
                    break;
                }
                break;
            default:
                ((fra) this.c).dispose();
                ((yee) this.b).onError(th);
                break;
        }
    }
}
