package defpackage;

/* loaded from: classes2.dex */
public final class vk7 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final byte e;
    public final byte f;
    public final long g;
    public final long h;
    public final String i;
    public final uk7 j;
    public final long k;
    public final long l;
    public final long m;
    public final int n;

    public vk7(String str, String str2, boolean z, String str3, byte b, byte b2, long j, long j2, String str4, uk7 uk7Var, long j3, long j4, long j5, int i) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = b;
        this.f = b2;
        this.g = j;
        this.h = j2;
        this.i = str4;
        this.j = uk7Var;
        this.k = j3;
        this.l = j4;
        this.m = j5;
        this.n = i;
    }

    public static vk7 a(vk7 vk7Var, long j, long j2, long j3, int i, int i2) {
        return new vk7(vk7Var.a, vk7Var.b, vk7Var.c, vk7Var.d, vk7Var.e, vk7Var.f, vk7Var.g, vk7Var.h, vk7Var.i, vk7Var.j, (i2 & 1024) != 0 ? vk7Var.k : j, (i2 & 2048) != 0 ? vk7Var.l : j2, (i2 & 4096) != 0 ? vk7Var.m : j3, (i2 & 8192) != 0 ? vk7Var.n : i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk7)) {
            return false;
        }
        vk7 vk7Var = (vk7) obj;
        return fni.a(this.a, vk7Var.a) && fni.a(this.b, vk7Var.b) && this.c == vk7Var.c && fni.a(this.d, vk7Var.d) && this.e == vk7Var.e && this.f == vk7Var.f && this.g == vk7Var.g && this.h == vk7Var.h && fni.a(this.i, vk7Var.i) && fni.a(this.j, vk7Var.j) && this.k == vk7Var.k && this.l == vk7Var.l && this.m == vk7Var.m && this.n == vk7Var.n;
    }

    public final int hashCode() {
        int iB = a9h.b(u45.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Integer.hashCode(this.n) + a9h.a(a9h.a(a9h.a((u45.e(a9h.a(a9h.a((Byte.hashCode(this.f) + ((Byte.hashCode(this.e) + ((iB + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i) + this.j.a) * 31, 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("InformerBannerEntity(id=", this.a, ", title=", this.b, ", isTitleAnimated=");
        sbL.append(this.c);
        sbL.append(", description=");
        sbL.append(this.d);
        sbL.append(", priority=");
        hf3.g(sbL, this.e, ", repeat=", this.f, ", rerunMillis=");
        sbL.append(this.g);
        az1.r(this.h, ", animojiId=", ", url=", sbL);
        sbL.append(this.i);
        sbL.append(", type=");
        sbL.append(this.j);
        sbL.append(", clickTime=");
        sbL.append(this.k);
        az1.r(this.l, ", showTime=", ", closeTime=", sbL);
        utb.n(sbL, this.m, ", showCount=", this.n);
        sbL.append(")");
        return sbL.toString();
    }
}
