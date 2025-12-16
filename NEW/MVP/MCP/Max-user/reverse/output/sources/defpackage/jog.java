package defpackage;

/* loaded from: classes2.dex */
public final class jog {
    public final s5g a;
    public final s5g b;
    public final s5g c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean g;

    public /* synthetic */ jog(n5g n5gVar, s5g s5gVar, int i, int i2, int i3) {
        this(n5gVar, (i3 & 2) != 0 ? null : s5gVar, null, (i3 & 8) != 0, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) == 0);
    }

    public static jog a(jog jogVar, s5g s5gVar) {
        s5g s5gVar2 = jogVar.a;
        s5g s5gVar3 = jogVar.b;
        boolean z = jogVar.d;
        int i = jogVar.e;
        int i2 = jogVar.f;
        boolean z2 = jogVar.g;
        jogVar.getClass();
        return new jog(s5gVar2, s5gVar3, s5gVar, z, i, i2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jog)) {
            return false;
        }
        jog jogVar = (jog) obj;
        return fni.a(this.a, jogVar.a) && fni.a(this.b, jogVar.b) && fni.a(this.c, jogVar.c) && this.d == jogVar.d && this.e == jogVar.e && this.f == jogVar.f && this.g == jogVar.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        s5g s5gVar = this.b;
        int iHashCode2 = (iHashCode + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31;
        s5g s5gVar2 = this.c;
        return Boolean.hashCode(this.g) + xrf.k(this.f, xrf.k(this.e, a9h.b((iHashCode2 + (s5gVar2 != null ? s5gVar2.hashCode() : 0)) * 31, 31, this.d), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputState(hint=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", error=");
        sb.append(this.c);
        sb.append(", showMaxLengthLabel=");
        sb.append(this.d);
        sb.append(", minLength=");
        hf3.g(sb, this.e, ", maxLength=", this.f, ", typingPassword=");
        return az1.k(sb, this.g, ")");
    }

    public jog(s5g s5gVar, s5g s5gVar2, s5g s5gVar3, boolean z, int i, int i2, boolean z2) {
        this.a = s5gVar;
        this.b = s5gVar2;
        this.c = s5gVar3;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.g = z2;
    }
}
