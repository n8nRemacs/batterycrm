package defpackage;

/* loaded from: classes2.dex */
public final class jlh {
    public static final ilh Companion = new ilh();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ jlh(String str, int i, String str2, String str3) {
        if (3 != (i & 3)) {
            g5j.c(i, 3, hlh.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlh)) {
            return false;
        }
        jlh jlhVar = (jlh) obj;
        return fni.a(this.a, jlhVar.a) && fni.a(this.b, jlhVar.b) && fni.a(this.c, jlhVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iE = u45.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        return iE + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ho7.l(wy1.l("WebAppBiometryAuthRequest(queryId=", this.a, ", requestId=", this.b, ", reason="), this.c, ")");
    }
}
