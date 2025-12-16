package defpackage;

/* loaded from: classes2.dex */
public final class si {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;
    public final String g;

    public si(long j, long j2, String str, String str2, String str3, Long l, String str4) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = l;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si)) {
            return false;
        }
        si siVar = (si) obj;
        return this.a == siVar.a && this.b == siVar.b && fni.a(this.c, siVar.c) && fni.a(this.d, siVar.d) && fni.a(this.e, siVar.e) && fni.a(this.f, siVar.f) && fni.a(this.g, siVar.g);
    }

    public final int hashCode() {
        int iE = u45.e(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.g;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "AnimojiEntity(id=", ", updateTime=");
        hf3.e(this.b, ", emoji=", this.c, sbL);
        ho7.r(sbL, ", lottieUrl=", this.d, ", lottiePlayUrl=", this.e);
        sbL.append(", setId=");
        sbL.append(this.f);
        sbL.append(", iconUrl=");
        sbL.append(this.g);
        sbL.append(")");
        return sbL.toString();
    }
}
