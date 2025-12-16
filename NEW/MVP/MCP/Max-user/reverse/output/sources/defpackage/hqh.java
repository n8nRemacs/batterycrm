package defpackage;

/* loaded from: classes2.dex */
public final class hqh {
    public static final gqh Companion = new gqh();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ hqh(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            g5j.c(i, 7, fqh.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqh)) {
            return false;
        }
        hqh hqhVar = (hqh) obj;
        return fni.a(this.a, hqhVar.a) && fni.a(this.b, hqhVar.b) && fni.a(this.c, hqhVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + u45.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ho7.l(wy1.l("WebAppDownloadFileRequest(requestId=", this.a, ", url=", this.b, ", fileName="), this.c, ")");
    }
}
