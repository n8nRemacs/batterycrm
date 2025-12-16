package defpackage;

/* loaded from: classes.dex */
public final class in1 {
    public static final in1 g = new in1(false, false, null, false, false, false);
    public final boolean a;
    public final boolean b;
    public final zi1 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public in1(boolean z, boolean z2, zi1 zi1Var, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = zi1Var;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public final boolean a() {
        return this.a && this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in1)) {
            return false;
        }
        in1 in1Var = (in1) obj;
        return this.a == in1Var.a && this.b == in1Var.b && fni.a(this.c, in1Var.c) && this.d == in1Var.d && this.e == in1Var.e && this.f == in1Var.f;
    }

    public final int hashCode() {
        int iB = a9h.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        zi1 zi1Var = this.c;
        return Boolean.hashCode(this.f) + a9h.b(a9h.b((iB + (zi1Var == null ? 0 : zi1Var.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbP = ho7.p("CallScreenSharingState(isMe=", this.a, ", isSharingStateEnabled=", this.b, ", sharedScreenOpponentId=");
        sbP.append(this.c);
        sbP.append(", isAdminDisableScreenSharing=");
        sbP.append(this.d);
        sbP.append(", isMeAudioSharingEnabled=");
        sbP.append(this.e);
        sbP.append(", isMeAdmin=");
        sbP.append(this.f);
        sbP.append(")");
        return sbP.toString();
    }
}
