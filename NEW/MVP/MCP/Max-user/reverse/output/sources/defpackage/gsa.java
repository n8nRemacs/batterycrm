package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class gsa implements vta, py4 {
    public final /* synthetic */ int a;
    public final vta b;
    public final tm6 c;
    public py4 d;

    public /* synthetic */ gsa(vta vtaVar, tm6 tm6Var, int i) {
        this.a = i;
        this.b = vtaVar;
        this.c = tm6Var;
    }

    @Override // defpackage.vta
    public final void b() {
        switch (this.a) {
            case 0:
                py4 py4Var = this.d;
                ty4 ty4Var = ty4.a;
                if (py4Var != ty4Var) {
                    this.d = ty4Var;
                    this.b.b();
                    break;
                }
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
                if (ty4.i(this.d, py4Var)) {
                    this.d = py4Var;
                    this.b.c(this);
                    break;
                }
                break;
            default:
                if (ty4.i(this.d, py4Var)) {
                    this.d = py4Var;
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
                this.d.dispose();
                this.d = ty4.a;
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
                if (this.d != ty4.a) {
                    try {
                        for (Object obj2 : (Iterable) this.c.apply(obj)) {
                            try {
                                try {
                                    Objects.requireNonNull(obj2, "The iterator returned a null value");
                                    this.b.f(obj2);
                                } catch (Throwable th) {
                                    raj.c(th);
                                    this.d.dispose();
                                    onError(th);
                                    return;
                                }
                            } catch (Throwable th2) {
                                raj.c(th2);
                                this.d.dispose();
                                onError(th2);
                                return;
                            }
                        }
                        break;
                    } catch (Throwable th3) {
                        raj.c(th3);
                        this.d.dispose();
                        onError(th3);
                        return;
                    }
                }
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
                py4 py4Var = this.d;
                ty4 ty4Var = ty4.a;
                if (py4Var != ty4Var) {
                    this.d = ty4Var;
                    this.b.onError(th);
                    break;
                } else {
                    t8j.a(th);
                    break;
                }
            default:
                vta vtaVar = this.b;
                try {
                    Object objApply = this.c.apply(th);
                    if (objApply != null) {
                        vtaVar.f(objApply);
                        vtaVar.b();
                        break;
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                        nullPointerException.initCause(th);
                        vtaVar.onError(nullPointerException);
                        break;
                    }
                } catch (Throwable th2) {
                    raj.c(th2);
                    vtaVar.onError(new CompositeException(th, th2));
                }
        }
    }
}
