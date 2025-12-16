package defpackage;

/* loaded from: classes2.dex */
public final class mke {
    public final String a;
    public final String b;
    public final Long c;
    public final String d;
    public final String e;

    public mke(Long l, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mke)) {
            return false;
        }
        mke mkeVar = (mke) obj;
        return fni.a(this.a, mkeVar.a) && fni.a(this.b, mkeVar.b) && fni.a(this.c, mkeVar.c) && fni.a(this.d, mkeVar.d) && fni.a(this.e, mkeVar.e);
    }

    public final int hashCode() {
        int iE = u45.e(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        int iHashCode = (iE + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("SettingEntryBanner(iconUrl=", this.a, ", title=", this.b, ", appId=");
        sbL.append(this.c);
        sbL.append(", url=");
        sbL.append(this.d);
        sbL.append(", startParam=");
        return ho7.l(sbL, this.e, ")");
    }
}
