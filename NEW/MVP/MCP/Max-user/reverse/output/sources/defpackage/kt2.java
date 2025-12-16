package defpackage;

/* loaded from: classes2.dex */
public final class kt2 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public kt2(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = z11;
        this.l = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt2)) {
            return false;
        }
        kt2 kt2Var = (kt2) obj;
        return this.a == kt2Var.a && this.b == kt2Var.b && this.c == kt2Var.c && this.d == kt2Var.d && this.e == kt2Var.e && this.f == kt2Var.f && this.g == kt2Var.g && this.h == kt2Var.h && this.i == kt2Var.i && this.j == kt2Var.j && this.k == kt2Var.k && this.l == kt2Var.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + a9h.b(a9h.b(a9h.b(a9h.b(a9h.b(a9h.b(a9h.b(a9h.b(a9h.b(a9h.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sbP = ho7.p("ChatOptions(signAdmin=", this.a, ", onlyOwnerCanChangeIconTitle=", this.b, ", official=");
        az1.t(", onlyAdminCanAddMember=", ", allCanPinMessage=", sbP, this.c, this.d);
        az1.t(", ok=", ", onlyAdminCanCall=", sbP, this.e, this.f);
        az1.t(", sentByPhone=", ", serviceChat=", sbP, this.g, this.h);
        az1.t(", membersCanSeePrivateLink=", ", contentLevelChat=", sbP, this.i, this.j);
        sbP.append(this.k);
        sbP.append(", aPlusChannel=");
        sbP.append(this.l);
        sbP.append(")");
        return sbP.toString();
    }
}
