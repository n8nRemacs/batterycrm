package defpackage;

/* loaded from: classes.dex */
public final class u51 implements w51 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public u51(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    @Override // defpackage.w51
    public final boolean a() {
        return this.e;
    }

    @Override // defpackage.w51
    public final boolean b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u51)) {
            return false;
        }
        u51 u51Var = (u51) obj;
        return fni.a(this.a, u51Var.a) && this.b == u51Var.b && this.c == u51Var.c && this.d == u51Var.d && this.e == u51Var.e && this.f == u51Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + a9h.b(a9h.b(a9h.b(a9h.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Link(link=");
        sb.append(this.a);
        sb.append(", isNewLink=");
        sb.append(this.b);
        sb.append(", isVideoCall=");
        az1.t(", isFrontCameraEnabled=", ", isVideoEnabled=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", isAudioEnabled=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
