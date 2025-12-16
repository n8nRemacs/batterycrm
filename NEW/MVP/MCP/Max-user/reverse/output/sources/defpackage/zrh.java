package defpackage;

/* loaded from: classes2.dex */
public final class zrh extends l0g {
    public final String c;
    public final String d;

    public zrh(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrh)) {
            return false;
        }
        zrh zrhVar = (zrh) obj;
        return fni.a(this.c, zrhVar.c) && fni.a(this.d, zrhVar.d);
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // defpackage.pj0
    public final String toString() {
        return wy1.j("Response(url=", this.c, ", queryId=", this.d, ")");
    }
}
