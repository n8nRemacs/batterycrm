package defpackage;

/* loaded from: classes.dex */
public final class pc1 extends cda {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public pc1(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        super(qqg.a);
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc1)) {
            return false;
        }
        pc1 pc1Var = (pc1) obj;
        return fni.a(this.b, pc1Var.b) && this.c == pc1Var.c && this.d == pc1Var.d && this.e == pc1Var.e && this.f == pc1Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + a9h.b(a9h.b(a9h.b(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenLink(link=");
        sb.append(this.b);
        sb.append(", isVideoCall=");
        sb.append(this.c);
        sb.append(", isVideoEnabled=");
        az1.t(", isAudioEnabled=", ", isFront=", sb, this.d, this.e);
        return az1.k(sb, this.f, ")");
    }
}
