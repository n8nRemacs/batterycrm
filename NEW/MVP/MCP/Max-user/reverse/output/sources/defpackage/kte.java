package defpackage;

/* loaded from: classes2.dex */
public final class kte implements m00 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final od7 g;
    public final long h;

    public kte(long j, String str, String str2, String str3, String str4, String str5, od7 od7Var, long j2) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = od7Var;
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kte)) {
            return false;
        }
        kte kteVar = (kte) obj;
        return this.a == kteVar.a && fni.a(this.b, kteVar.b) && fni.a(this.c, kteVar.c) && fni.a(this.d, kteVar.d) && fni.a(this.e, kteVar.e) && fni.a(this.f, kteVar.f) && fni.a(this.g, kteVar.g) && this.h == kteVar.h;
    }

    public final int hashCode() {
        int iE = u45.e(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        od7 od7Var = this.g;
        return Long.hashCode(this.h) + ((iHashCode4 + (od7Var != null ? od7Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("ShareAttachModel(shareId=", this.a, ", url=", this.b);
        ho7.r(sbN, ", host=", this.c, ", title=", this.d);
        ho7.r(sbN, ", description=", this.e, ", embedUrl=", this.f);
        sbN.append(", previewConfig=");
        sbN.append(this.g);
        sbN.append(", messageId=");
        return ho7.k(sbN, this.h, ")");
    }
}
