package defpackage;

/* loaded from: classes.dex */
public final class ib1 implements jb1 {
    public final boolean a;
    public final boolean b;

    public ib1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib1)) {
            return false;
        }
        ib1 ib1Var = (ib1) obj;
        return this.a == ib1Var.a && this.b == ib1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xc0.g("End(isCallAccepted=", this.a, ", goToActiveBeforeEnd=", this.b, ")");
    }
}
