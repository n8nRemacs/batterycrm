package defpackage;

/* loaded from: classes2.dex */
public final class d91 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public d91(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d91)) {
            return false;
        }
        d91 d91Var = (d91) obj;
        return this.a == d91Var.a && this.b == d91Var.b && this.c == d91Var.c && this.d == d91Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + fui.b(fui.b(Boolean.hashCode(this.a) * 31, this.b), this.c);
    }

    public final String toString() {
        StringBuilder sbP = ho7.p("CallFlags(startedAsP2P=", this.a, ", initialVideoEnabled=", this.b, ", forceRelayPolicy=");
        sbP.append(this.c);
        sbP.append(", isSessionStateEnabled=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
