package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class m66 extends e2f implements nn6 {
    public final i66 a;
    public final kn6 b;
    public final pm0 c;

    public m66(i66 i66Var, kn6 kn6Var, pm0 pm0Var) {
        this.a = i66Var;
        this.b = kn6Var;
        this.c = pm0Var;
    }

    @Override // defpackage.nn6
    public final i66 d() {
        return new k66(this.a, this.b, this.c, 0);
    }

    @Override // defpackage.e2f
    public final void l(v2f v2fVar) {
        try {
            Object obj = this.b.a;
            Objects.requireNonNull(obj, "The initialSupplier returned a null value");
            this.a.c(new l66(v2fVar, obj, this.c));
        } catch (Throwable th) {
            raj.c(th);
            cd5.d(th, v2fVar);
        }
    }
}
