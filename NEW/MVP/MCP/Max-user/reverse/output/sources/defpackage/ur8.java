package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ur8 extends AtomicReference implements vta, bs8, py4, v2f {
    public final /* synthetic */ int a;
    public final vta b;
    public final tm6 c;

    public /* synthetic */ ur8(vta vtaVar, tm6 tm6Var, int i) {
        this.a = i;
        this.b = vtaVar;
        this.c = tm6Var;
    }

    @Override // defpackage.bs8
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    Object objApply = this.c.apply(obj);
                    Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
                    lta ltaVar = (lta) objApply;
                    if (!e()) {
                        ltaVar.a(this);
                        break;
                    }
                } catch (Throwable th) {
                    raj.c(th);
                    this.b.onError(th);
                    return;
                }
                break;
            default:
                try {
                    Object objApply2 = this.c.apply(obj);
                    Objects.requireNonNull(objApply2, "The mapper returned a null Publisher");
                    lta ltaVar2 = (lta) objApply2;
                    if (!e()) {
                        ltaVar2.a(this);
                        break;
                    }
                } catch (Throwable th2) {
                    raj.c(th2);
                    this.b.onError(th2);
                }
                break;
        }
    }

    @Override // defpackage.vta
    public final void b() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                this.b.b();
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

    @Override // defpackage.vta
    public final void f(Object obj) {
        switch (this.a) {
            case 0:
                this.b.f(obj);
                break;
            default:
                this.b.f(obj);
                break;
        }
    }

    @Override // defpackage.vta
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
