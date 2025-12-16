package defpackage;

/* loaded from: classes2.dex */
public final class ro0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public ro0(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro0)) {
            return false;
        }
        ro0 ro0Var = (ro0) obj;
        return this.a == ro0Var.a && this.b == ro0Var.b && this.c == ro0Var.c && this.d == ro0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + a9h.b(a9h.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbP = ho7.p("BiometryInfo(available=", this.a, ", accessRequested=", this.b, ", accessGranted=");
        sbP.append(this.c);
        sbP.append(", tokenSaved=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
