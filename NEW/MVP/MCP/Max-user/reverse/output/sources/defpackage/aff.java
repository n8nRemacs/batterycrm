package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class aff {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final String e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final int k;
    public final long l;
    public final String m;
    public final boolean n;
    public final int o;
    public final String p;

    public aff(long j, long j2, int i, int i2, String str, long j3, String str2, String str3, String str4, List list, int i3, long j4, String str5, boolean z, int i4, String str6) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = j3;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = list;
        this.k = i3;
        this.l = j4;
        this.m = str5;
        this.n = z;
        this.o = i4;
        this.p = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aff)) {
            return false;
        }
        aff affVar = (aff) obj;
        return this.a == affVar.a && this.b == affVar.b && this.c == affVar.c && this.d == affVar.d && fni.a(this.e, affVar.e) && this.f == affVar.f && fni.a(this.g, affVar.g) && fni.a(this.h, affVar.h) && fni.a(this.i, affVar.i) && fni.a(this.j, affVar.j) && this.k == affVar.k && this.l == affVar.l && fni.a(this.m, affVar.m) && this.n == affVar.n && this.o == affVar.o && fni.a(this.p, affVar.p);
    }

    public final int hashCode() {
        int iK = xrf.k(this.d, xrf.k(this.c, a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31), 31);
        String str = this.e;
        int iA = a9h.a((iK + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iA2 = a9h.a(utb.k(this.k, xrf.l(this.j, (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31), 31, this.l);
        String str5 = this.m;
        int iK2 = utb.k(this.o, a9h.b((iA2 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.n), 31);
        String str6 = this.p;
        return iK2 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "StickerEntity(id=", ", stickerId=");
        utb.n(sbL, this.b, ", width=", this.c);
        sbL.append(", height=");
        sbL.append(this.d);
        sbL.append(", url=");
        sbL.append(this.e);
        az1.r(this.f, ", updateTime=", ", mp4Url=", sbL);
        ho7.r(sbL, this.g, ", firstUrl=", this.h, ", previewUrl=");
        sbL.append(this.i);
        sbL.append(", tags=");
        sbL.append(this.j);
        sbL.append(", stickerType=");
        sbL.append(ctd.r(this.k));
        sbL.append(", setId=");
        sbL.append(this.l);
        sbL.append(", lottieUrl=");
        sbL.append(this.m);
        sbL.append(", audio=");
        sbL.append(this.n);
        sbL.append(", authorType=");
        sbL.append(ctd.p(this.o));
        sbL.append(", videoUrl=");
        sbL.append(this.p);
        sbL.append(")");
        return sbL.toString();
    }
}
