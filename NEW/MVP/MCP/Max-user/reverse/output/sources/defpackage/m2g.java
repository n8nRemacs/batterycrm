package defpackage;

/* loaded from: classes2.dex */
public final class m2g {
    public final long a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final String k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final long o;
    public final String p;

    public m2g(long j, String str, long j2, long j3, long j4, long j5, String str2, boolean z, boolean z2, long j6, String str3, int i, boolean z3, boolean z4, String str4) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = str2;
        this.h = z;
        this.i = z2;
        this.j = j6;
        this.k = str3;
        this.l = i;
        this.m = z3;
        this.n = z4;
        this.o = (31 * j) + str.hashCode();
        this.p = str4;
    }

    public final boolean a() {
        return this.c > 0 || this.d > 0 || this.e > 0 || this.j > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2g)) {
            return false;
        }
        m2g m2gVar = (m2g) obj;
        return this.a == m2gVar.a && fni.a(this.b, m2gVar.b) && this.c == m2gVar.c && this.d == m2gVar.d && this.e == m2gVar.e && this.f == m2gVar.f && fni.a(this.g, m2gVar.g) && this.h == m2gVar.h && this.i == m2gVar.i && this.j == m2gVar.j && fni.a(this.k, m2gVar.k) && this.l == m2gVar.l && this.m == m2gVar.m && this.n == m2gVar.n && this.o == m2gVar.o && fni.a(this.p, m2gVar.p);
    }

    public final int hashCode() {
        return this.p.hashCode() + a9h.a(a9h.b(a9h.b(xrf.k(this.l, u45.e(a9h.a(a9h.b(a9h.b(u45.e(a9h.a(a9h.a(a9h.a(a9h.a(u45.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31), 31, this.m), 31, this.n), 31, this.o);
    }

    public final String toString() {
        boolean zA = wqi.a();
        String str = zA ? this.g : "******";
        String str2 = zA ? this.k : "******";
        StringBuilder sbN = ho7.n("TaskAttachDownloadData{messageId=", this.a, ", attachId='", this.b);
        az1.r(this.c, "', videoId=", ", audioId=", sbN);
        sbN.append(this.d);
        az1.r(this.e, ", mp4GifId=", ", stickerId=", sbN);
        hf3.e(this.f, ", url='", str, sbN);
        hf3.f("', notifyProgress=", ", checkAutoLoadConnection=", sbN, this.h, this.i);
        az1.r(this.j, ", fileId=", ", fileName='", sbN);
        sbN.append(str2);
        sbN.append("', invalidateCount=");
        sbN.append(this.l);
        sbN.append(", useOriginalExtension=");
        sbN.append(this.m);
        sbN.append(", notCopyVideoToGallery=");
        sbN.append(this.n);
        sbN.append("}");
        return sbN.toString();
    }
}
