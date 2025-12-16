package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class cra extends e2f implements on6 {
    public final vr8 a;
    public final kn6 b;
    public final ycd c;

    public cra(vr8 vr8Var, kn6 kn6Var, ycd ycdVar) {
        this.a = vr8Var;
        this.b = kn6Var;
        this.c = ycdVar;
    }

    @Override // defpackage.on6
    public final vqa b() {
        return new bra(this.a, this.b, this.c, 0);
    }

    @Override // defpackage.e2f
    public final void l(v2f v2fVar) {
        try {
            Object obj = this.b.a;
            Objects.requireNonNull(obj, "The initialSupplier returned a null value");
            this.a.a(new ara(v2fVar, obj, this.c, 1));
        } catch (Throwable th) {
            raj.c(th);
            cd5.d(th, v2fVar);
        }
    }
}
