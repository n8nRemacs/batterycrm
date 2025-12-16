package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class zt1 implements cu1 {
    public final p5g a;
    public final r5g b;
    public final List c;
    public final long d;

    public zt1(p5g p5gVar, r5g r5gVar, o98 o98Var, long j) {
        this.a = p5gVar;
        this.b = r5gVar;
        this.c = o98Var;
        this.d = j;
    }

    @Override // defpackage.cu1
    public final long a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt1)) {
            return false;
        }
        zt1 zt1Var = (zt1) obj;
        return this.a.equals(zt1Var.a) && this.b.equals(zt1Var.b) && fni.a(this.c, zt1Var.c) && this.d == zt1Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + xrf.l(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "Multi(title=" + this.a + ", subtitle=" + this.b + ", avatarInfo=" + this.c + ", lastUpdate=" + this.d + ")";
    }
}
