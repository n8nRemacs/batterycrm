package defpackage;

/* loaded from: classes.dex */
public final class eh1 extends gh1 {
    public final boolean a;
    public final zi1 b;

    public eh1(zi1 zi1Var, boolean z) {
        this.a = z;
        this.b = zi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh1)) {
            return false;
        }
        eh1 eh1Var = (eh1) obj;
        return this.a == eh1Var.a && fni.a(this.b, eh1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "HasOpenAction(hasAction=" + this.a + ", opponentId=" + this.b + ")";
    }
}
