package defpackage;

/* loaded from: classes2.dex */
public final class ek7 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final byte e;
    public final byte f;
    public final long g;
    public final long h;
    public final String i;
    public final byte j;

    public ek7(String str, String str2, boolean z, String str3, byte b, byte b2, long j, long j2, String str4, byte b3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = b;
        this.f = b2;
        this.g = j;
        this.h = j2;
        this.i = str4;
        this.j = b3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek7)) {
            return false;
        }
        ek7 ek7Var = (ek7) obj;
        return fni.a(this.a, ek7Var.a) && fni.a(this.b, ek7Var.b) && this.c == ek7Var.c && fni.a(this.d, ek7Var.d) && this.e == ek7Var.e && this.f == ek7Var.f && s65.e(this.g, ek7Var.g) && this.h == ek7Var.h && fni.a(this.i, ek7Var.i) && this.j == ek7Var.j;
    }

    public final int hashCode() {
        int iB = a9h.b(u45.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (Byte.hashCode(this.f) + ((Byte.hashCode(this.e) + ((iB + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        int i = s65.d;
        return Byte.hashCode(this.j) + u45.e(a9h.a(a9h.a(iHashCode, 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        String strN = s65.n(this.g);
        StringBuilder sbL = wy1.l("InformerBanner(id=", this.a, ", title=", this.b, ", isTitleAnimated=");
        sbL.append(this.c);
        sbL.append(", description=");
        sbL.append(this.d);
        sbL.append(", priority=");
        hf3.g(sbL, this.e, ", repeat=", this.f, ", rerun=");
        sbL.append(strN);
        sbL.append(", animojiId=");
        sbL.append(this.h);
        sbL.append(", url=");
        sbL.append(this.i);
        sbL.append(", type=");
        sbL.append((int) this.j);
        sbL.append(")");
        return sbL.toString();
    }
}
