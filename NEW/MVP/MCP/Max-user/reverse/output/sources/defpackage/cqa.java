package defpackage;

import kotlinx.serialization.json.internal.b;

/* loaded from: classes.dex */
public final class cqa implements zy7 {
    public final zy7 a;
    public final see b;

    public cqa(zy7 zy7Var) {
        this.a = zy7Var;
        this.b = new see(zy7Var.d());
    }

    @Override // defpackage.zy7
    public final void a(b bVar, Object obj) {
        if (obj != null) {
            bVar.p(this.a, obj);
        } else {
            bVar.m();
        }
    }

    @Override // defpackage.zy7
    public final Object b(lh4 lh4Var) {
        if (lh4Var.v()) {
            return lh4Var.d(this.a);
        }
        return null;
    }

    @Override // defpackage.zy7
    public final ree d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && cqa.class == obj.getClass() && fni.a(this.a, ((cqa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
