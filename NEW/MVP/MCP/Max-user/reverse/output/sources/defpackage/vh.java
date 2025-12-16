package defpackage;

/* loaded from: classes2.dex */
public final class vh {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public vh(long j, String str, String str2, String str3, String str4) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh)) {
            return false;
        }
        vh vhVar = (vh) obj;
        return this.a == vhVar.a && fni.a(this.b, vhVar.b) && fni.a(this.c, vhVar.c) && fni.a(this.d, vhVar.d) && fni.a(this.e, vhVar.e);
    }

    public final int hashCode() {
        int iE = u45.e(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("Animoji(id=", this.a, ", emoji=", this.b);
        ho7.r(sbN, ", lottieUrl=", this.c, ", effectLottieUrl=", this.d);
        return ctd.j(sbN, ", iconUrl=", this.e, ")");
    }
}
