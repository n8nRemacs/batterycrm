package defpackage;

/* loaded from: classes2.dex */
public final class kf0 {
    public final jf0 a;
    public final lf0 b;
    public final mf0 c;
    public final nf0 d;

    public kf0(jf0 jf0Var, lf0 lf0Var, mf0 mf0Var, nf0 nf0Var) {
        this.a = jf0Var;
        this.b = lf0Var;
        this.c = mf0Var;
        this.d = nf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf0)) {
            return false;
        }
        kf0 kf0Var = (kf0) obj;
        return fni.a(this.a, kf0Var.a) && fni.a(this.b, kf0Var.b) && fni.a(this.c, kf0Var.c) && fni.a(this.d, kf0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xrf.k(this.c.a, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "BackgroundLocalColors(chips=" + this.a + ", fileType=" + this.b + ", tabBar=" + this.c + ", topBar=" + this.d + ")";
    }
}
