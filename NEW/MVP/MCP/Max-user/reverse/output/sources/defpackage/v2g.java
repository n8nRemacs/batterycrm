package defpackage;

/* loaded from: classes2.dex */
public final class v2g {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final long e = System.currentTimeMillis();

    public v2g(long j, long j2, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2g)) {
            return false;
        }
        v2g v2gVar = (v2g) obj;
        return this.a == v2gVar.a && this.b == v2gVar.b && fni.a(this.c, v2gVar.c) && fni.a(this.d, v2gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + u45.e(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "TaskFileFromWebAppDownloadData(requestId=", ", botId=");
        hf3.e(this.b, ", fileUrl=", this.c, sbL);
        return ctd.j(sbL, ", fileName=", this.d, ")");
    }
}
