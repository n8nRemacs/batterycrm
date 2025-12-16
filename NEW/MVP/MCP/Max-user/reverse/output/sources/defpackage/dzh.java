package defpackage;

/* loaded from: classes2.dex */
public final class dzh {
    public static final czh Companion = new czh();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ dzh(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            g5j.c(i, 15, bzh.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzh)) {
            return false;
        }
        dzh dzhVar = (dzh) obj;
        return fni.a(this.a, dzhVar.a) && fni.a(this.b, dzhVar.b) && fni.a(this.c, dzhVar.c) && fni.a(this.d, dzhVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iE = u45.e(u45.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        String str2 = this.d;
        return iE + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("WebAppStorageSaveKeyRequest(queryId=", this.a, ", requestId=", this.b, ", key=");
        sbL.append(this.c);
        sbL.append(", value=");
        sbL.append(this.d);
        sbL.append(")");
        return sbL.toString();
    }
}
