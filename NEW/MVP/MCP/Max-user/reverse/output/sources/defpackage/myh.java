package defpackage;

/* loaded from: classes2.dex */
public final class myh {
    public static final lyh Companion = new lyh();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ myh(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            g5j.c(i, 7, kyh.a.d());
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
        if (!(obj instanceof myh)) {
            return false;
        }
        myh myhVar = (myh) obj;
        return fni.a(this.a, myhVar.a) && fni.a(this.b, myhVar.b) && fni.a(this.c, myhVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + u45.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return ho7.l(wy1.l("WebAppStorageGetKeyRequest(queryId=", this.a, ", requestId=", this.b, ", key="), this.c, ")");
    }
}
