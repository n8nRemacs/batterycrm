package defpackage;

/* loaded from: classes2.dex */
public final class db6 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final String f;
    public final String g;
    public final String h;

    public db6(long j, String str, String str2, String str3, Long l, String str4, String str5, String str6) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = l;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db6)) {
            return false;
        }
        db6 db6Var = (db6) obj;
        return this.a == db6Var.a && fni.a(this.b, db6Var.b) && fni.a(this.c, db6Var.c) && fni.a(this.d, db6Var.d) && fni.a(this.e, db6Var.e) && fni.a(this.f, db6Var.f) && fni.a(this.g, db6Var.g) && fni.a(this.h, db6Var.h);
    }

    public final int hashCode() {
        int iE = u45.e(u45.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.e;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("FolderWidget(id=", this.a, ", name=", this.b);
        ho7.r(sbN, ", background=", this.c, ", description=", this.d);
        sbN.append(", appId=");
        sbN.append(this.e);
        sbN.append(", startParam=");
        sbN.append(this.f);
        ho7.r(sbN, ", url=", this.g, ", iconUrl=", this.h);
        sbN.append(")");
        return sbN.toString();
    }
}
