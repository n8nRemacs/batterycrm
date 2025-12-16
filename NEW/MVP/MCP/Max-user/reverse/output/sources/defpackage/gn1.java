package defpackage;

/* loaded from: classes.dex */
public final class gn1 {
    public static final gn1 g = new gn1(false, false, false, null, false, null);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final zi1 d;
    public final boolean e;
    public final CharSequence f;

    public gn1(boolean z, boolean z2, boolean z3, zi1 zi1Var, boolean z4, CharSequence charSequence) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = zi1Var;
        this.e = z4;
        this.f = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn1)) {
            return false;
        }
        gn1 gn1Var = (gn1) obj;
        return this.a == gn1Var.a && this.b == gn1Var.b && this.c == gn1Var.c && fni.a(this.d, gn1Var.d) && this.e == gn1Var.e && fni.a(this.f, gn1Var.f);
    }

    public final int hashCode() {
        int iB = a9h.b(a9h.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        zi1 zi1Var = this.d;
        int iB2 = a9h.b((iB + (zi1Var == null ? 0 : zi1Var.hashCode())) * 31, 31, this.e);
        CharSequence charSequence = this.f;
        return iB2 + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = ho7.p("CallScreenRecordState(isMe=", this.a, ", meIsAdmin=", this.b, ", isRecordStateEnabled=");
        sbP.append(this.c);
        sbP.append(", recordScreenOpponentId=");
        sbP.append(this.d);
        sbP.append(", isAdminDisableScreenRecord=");
        sbP.append(this.e);
        sbP.append(", userName=");
        sbP.append((Object) this.f);
        sbP.append(")");
        return sbP.toString();
    }
}
