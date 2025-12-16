package defpackage;

/* loaded from: classes2.dex */
public final class hg3 {
    public final gg3 a;
    public final ig3 b;

    public hg3(gg3 gg3Var, ig3 ig3Var) {
        this.a = gg3Var;
        this.b = ig3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg3)) {
            return false;
        }
        hg3 hg3Var = (hg3) obj;
        return fni.a(this.a, hg3Var.a) && fni.a(this.b, hg3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommonActionColors(background=" + this.a + ", icon=" + this.b + ")";
    }
}
