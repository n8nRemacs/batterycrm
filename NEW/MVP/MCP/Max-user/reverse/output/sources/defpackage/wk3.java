package defpackage;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class wk3 extends e2f {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ wk3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.e2f
    public final void l(v2f v2fVar) {
        Object obj;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((hk3) obj2).f(new a3b(this, v2fVar));
                return;
            case 1:
                ((ora) obj2).a(new xqa(v2fVar));
                return;
            case 2:
                i2f i2fVar = new i2f(v2fVar);
                v2fVar.c(i2fVar);
                try {
                    ((w2f) obj2).i(i2fVar);
                    return;
                } catch (Throwable th) {
                    raj.c(th);
                    i2fVar.onError(th);
                    return;
                }
            case 3:
                try {
                    Object obj3 = ((drf) obj2).get();
                    Objects.requireNonNull(obj3, "The singleSupplier returned a null SingleSource");
                    ((e2f) ((m3f) obj3)).k(v2fVar);
                    return;
                } catch (Throwable th2) {
                    raj.c(th2);
                    cd5.d(th2, v2fVar);
                    return;
                }
            case 4:
                try {
                    obj = ((kn6) obj2).a;
                } catch (Throwable th3) {
                    th = th3;
                    raj.c(th);
                }
                if (obj == null) {
                    throw bj5.a("Supplier returned a null Throwable.");
                }
                aj5 aj5Var = bj5.a;
                th = (Throwable) obj;
                cd5.d(th, v2fVar);
                return;
            case 5:
                py4 z6Var = new z6(1, pdf.c);
                v2fVar.c(z6Var);
                if (z6Var.e()) {
                    return;
                }
                try {
                    Object objCall = ((Callable) obj2).call();
                    Objects.requireNonNull(objCall, "The callable returned a null value");
                    if (z6Var.e()) {
                        return;
                    }
                    v2fVar.a(objCall);
                    return;
                } catch (Throwable th4) {
                    raj.c(th4);
                    if (z6Var.e()) {
                        t8j.a(th4);
                        return;
                    } else {
                        v2fVar.onError(th4);
                        return;
                    }
                }
            default:
                v2fVar.c(cd5.a);
                v2fVar.a(obj2);
                return;
        }
    }
}
