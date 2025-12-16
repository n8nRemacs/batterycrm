package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class n66 extends AtomicReference implements v2f, vta {
    public final /* synthetic */ int a;
    public final AtomicInteger b;

    public /* synthetic */ n66(AtomicInteger atomicInteger, int i) {
        this.a = i;
        this.b = atomicInteger;
    }

    @Override // defpackage.v2f
    public void a(Object obj) {
        switch (this.a) {
            case 0:
                o66 o66Var = (o66) this.b;
                o66Var.y0 = obj;
                o66Var.z0 = 2;
                o66Var.a();
                break;
            default:
                hra hraVar = (hra) this.b;
                hraVar.u0 = obj;
                hraVar.v0 = 2;
                hraVar.a();
                break;
        }
    }

    @Override // defpackage.vta
    public void b() {
        fsa fsaVar = (fsa) this.b;
        ty4.a(fsaVar.Y);
        vta vtaVar = fsaVar.b;
        wy wyVar = fsaVar.o;
        if (fsaVar.getAndIncrement() == 0) {
            wyVar.e(vtaVar);
        }
    }

    @Override // defpackage.v2f
    public final void c(py4 py4Var) {
        switch (this.a) {
            case 0:
                ty4.d(this, py4Var);
                break;
            case 1:
                ty4.d(this, py4Var);
                break;
            default:
                ty4.h(this, py4Var);
                break;
        }
    }

    @Override // defpackage.vta
    public void f(Object obj) {
        ((fsa) this.b).d();
    }

    @Override // defpackage.v2f
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                o66 o66Var = (o66) this.b;
                if (o66Var.a.b(th)) {
                    if (o66Var.c != 3) {
                        o66Var.o.cancel();
                    }
                    o66Var.z0 = 0;
                    o66Var.a();
                    break;
                }
                break;
            case 1:
                hra hraVar = (hra) this.b;
                if (hraVar.a.b(th)) {
                    if (hraVar.c != 3) {
                        hraVar.o.dispose();
                    }
                    hraVar.v0 = 0;
                    hraVar.a();
                    break;
                }
                break;
            default:
                fsa fsaVar = (fsa) this.b;
                ty4.a(fsaVar.Y);
                vta vtaVar = fsaVar.b;
                wy wyVar = fsaVar.o;
                if (wyVar.b(th) && fsaVar.getAndIncrement() == 0) {
                    wyVar.e(vtaVar);
                    break;
                }
                break;
        }
    }

    public n66(fsa fsaVar) {
        this.a = 2;
        this.b = fsaVar;
    }
}
