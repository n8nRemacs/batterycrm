package defpackage;

/* loaded from: classes.dex */
public final class ek1 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;

    public ek1(long j, long j2, String str, String str2, String str3, boolean z, String str4) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek1)) {
            return false;
        }
        ek1 ek1Var = (ek1) obj;
        return this.a == ek1Var.a && this.b == ek1Var.b && fni.a(this.c, ek1Var.c) && fni.a(this.d, ek1Var.d) && fni.a(this.e, ek1Var.e) && this.f == ek1Var.f && fni.a(this.g, ek1Var.g);
    }

    public final int hashCode() {
        int iA = a9h.a(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iB = a9h.b((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f);
        String str4 = this.g;
        return iB + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        boolean zA = wqi.a();
        String str = zA ? this.d : "*****";
        String str2 = zA ? this.e : "*****";
        String str3 = zA ? this.g : "*****";
        StringBuilder sbL = az1.l(this.a, "callerId=", " chatId=");
        hf3.e(this.b, " conversationId=", this.c, sbL);
        ho7.r(sbL, " callerName=", str, " avatar=", str2);
        sbL.append(" isVideo=");
        sbL.append(this.f);
        sbL.append(" conversationParams=");
        sbL.append(str3);
        return sbL.toString();
    }
}
