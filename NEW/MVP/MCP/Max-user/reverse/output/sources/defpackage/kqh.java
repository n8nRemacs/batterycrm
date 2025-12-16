package defpackage;

/* loaded from: classes2.dex */
public final class kqh {
    public static final jqh Companion = new jqh();
    public final String a;
    public final String b;

    public /* synthetic */ kqh(int i, String str, String str2) {
        if (3 != (i & 3)) {
            g5j.c(i, 3, iqh.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqh)) {
            return false;
        }
        kqh kqhVar = (kqh) obj;
        return fni.a(this.a, kqhVar.a) && fni.a(this.b, kqhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return wy1.j("WebAppDownloadFileResponse(requestId=", this.a, ", status=", this.b, ")");
    }

    public kqh(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
