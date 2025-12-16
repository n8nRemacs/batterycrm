package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ira extends AtomicReference implements py4, v2f {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ira(AtomicInteger atomicInteger, int i) {
        this.a = i;
        this.b = atomicInteger;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0100  */
    @Override // defpackage.v2f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ira.a(java.lang.Object):void");
    }

    public void b() {
        if (e()) {
            return;
        }
        try {
            ((vta) this.b).b();
        } finally {
            ty4.a(this);
        }
    }

    @Override // defpackage.v2f
    public void c(py4 py4Var) {
        switch (this.a) {
            case 1:
                ty4.h(this, py4Var);
                break;
            default:
                ty4.h(this, py4Var);
                break;
        }
    }

    public void d(Object obj) {
        if (obj == null) {
            onError(bj5.a("onNext called with a null value."));
        } else {
            if (e()) {
                return;
            }
            ((vta) this.b).f(obj);
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        switch (this.a) {
            case 0:
                ty4.a(this);
                break;
            case 1:
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

    @Override // defpackage.v2f
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (e()) {
                    t8j.a(th);
                    return;
                }
                try {
                    ((vta) this.b).onError(th);
                    return;
                } finally {
                    ty4.a(this);
                }
            case 1:
                v66 v66Var = (v66) this.b;
                zl3 zl3Var = v66Var.d;
                zl3Var.c(this);
                if (v66Var.X.b(th)) {
                    v66Var.s0.cancel();
                    zl3Var.dispose();
                    v66Var.o.decrementAndGet();
                    v66Var.c();
                    return;
                }
                return;
            default:
                fsa fsaVar = (fsa) this.b;
                zl3 zl3Var2 = (zl3) fsaVar.c;
                zl3Var2.c(this);
                if (fsaVar.o.b(th)) {
                    ((py4) fsaVar.Z).dispose();
                    zl3Var2.dispose();
                    fsaVar.d.decrementAndGet();
                    if (fsaVar.getAndIncrement() == 0) {
                        fsaVar.a();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.a) {
            case 0:
                return ira.class.getSimpleName() + "{" + super.toString() + "}";
            default:
                return super.toString();
        }
    }

    public ira(vta vtaVar) {
        this.a = 0;
        this.b = vtaVar;
    }
}
