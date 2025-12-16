package defpackage;

/* loaded from: classes2.dex */
public final class lt5 {
    public final long a;
    public final long b;
    public final ot5 c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;
    public final long i;
    public final String j;
    public final String k;
    public final boolean l;
    public final boolean m;

    public lt5(long j, long j2, ot5 ot5Var, String str, String str2, long j3, long j4, String str3, long j5, String str4, String str5, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = ot5Var;
        this.d = str;
        this.e = str2;
        this.f = j3;
        this.g = j4;
        this.h = str3;
        this.i = j5;
        this.j = str4;
        this.k = str5;
        this.l = z;
        this.m = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt5)) {
            return false;
        }
        lt5 lt5Var = (lt5) obj;
        return this.a == lt5Var.a && this.b == lt5Var.b && this.c == lt5Var.c && fni.a(this.d, lt5Var.d) && fni.a(this.e, lt5Var.e) && this.f == lt5Var.f && this.g == lt5Var.g && fni.a(this.h, lt5Var.h) && this.i == lt5Var.i && fni.a(this.j, lt5Var.j) && fni.a(this.k, lt5Var.k) && this.l == lt5Var.l && this.m == lt5Var.m;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + a9h.a(Long.hashCode(this.a) * 31, 31, this.b)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iA = a9h.a(u45.e(a9h.a(a9h.a((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str3 = this.j;
        int iHashCode3 = (iA + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        return Boolean.hashCode(this.m) + a9h.b((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.l);
    }

    public final String toString() {
        boolean zA = wqi.a();
        long j = this.g;
        ot5 ot5Var = this.c;
        long j2 = this.b;
        long j3 = this.a;
        long j4 = this.f;
        long j5 = this.i;
        if (!zA) {
            StringBuilder sb = new StringBuilder();
            sb.append(lt5.class.getSimpleName());
            sb.append("(pushId=");
            sb.append(j5);
            az1.r(j4, ",sender=", ",chatServerId=", sb);
            sb.append(j3);
            az1.r(j2, ",messageId=", ",type=", sb);
            sb.append(ot5Var);
            sb.append(",time=");
            sb.append(j);
            sb.append(",hasText=");
            return az1.k(sb, this.h.length() > 0, ")");
        }
        StringBuilder sbL = az1.l(j3, "FcmNotification(chatServerId=", ", messageId=");
        sbL.append(j2);
        sbL.append(", fcmNotificationType=");
        sbL.append(ot5Var);
        ho7.r(sbL, ", chatTitle=", this.d, ", senderUserName=", this.e);
        az1.r(j4, ", senderUserId=", ", time=", sbL);
        hf3.e(j, ", text=", "***", sbL);
        az1.r(j5, ", pushId=", ", eventLey=", sbL);
        ho7.r(sbL, this.j, ", largeImageUrl=", this.k, ", isScheduledMessage=");
        sbL.append(this.l);
        sbL.append(", hasAnyError=");
        sbL.append(this.m);
        sbL.append(")");
        return sbL.toString();
    }
}
