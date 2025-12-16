package defpackage;

/* loaded from: classes2.dex */
public final class pyh {
    public static final oyh Companion = new oyh();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ pyh(String str, int i, String str2, String str3) {
        if (7 != (i & 7)) {
            g5j.c(i, 7, nyh.a.d());
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
        if (!(obj instanceof pyh)) {
            return false;
        }
        pyh pyhVar = (pyh) obj;
        return fni.a(this.a, pyhVar.a) && fni.a(this.b, pyhVar.b) && fni.a(this.c, pyhVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + u45.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ho7.l(wy1.l("WebAppStorageGetKeyResponse(requestId=", this.a, ", key=", this.b, ", value="), this.c, ")");
    }

    public pyh(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
