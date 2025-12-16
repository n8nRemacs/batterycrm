package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class z3f extends AtomicReference implements v2f {
    public final y3f a;
    public final int b;

    public z3f(y3f y3fVar, int i) {
        this.a = y3fVar;
        this.b = i;
    }

    @Override // defpackage.v2f
    public final void a(Object obj) {
        y3f y3fVar = this.a;
        v2f v2fVar = y3fVar.a;
        Object[] objArr = y3fVar.d;
        if (objArr != null) {
            objArr[this.b] = obj;
        }
        if (y3fVar.decrementAndGet() == 0) {
            try {
                Object objApply = y3fVar.b.apply(objArr);
                Objects.requireNonNull(objApply, "The zipper returned a null value");
                y3fVar.d = null;
                v2fVar.a(objApply);
            } catch (Throwable th) {
                raj.c(th);
                y3fVar.d = null;
                v2fVar.onError(th);
            }
        }
    }

    @Override // defpackage.v2f
    public final void c(py4 py4Var) {
        ty4.h(this, py4Var);
    }

    @Override // defpackage.v2f
    public final void onError(Throwable th) {
        this.a.a(this.b, th);
    }
}
