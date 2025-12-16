package defpackage;

/* loaded from: classes2.dex */
public final class ws5 {
    public final long a;
    public final long b;
    public final long c;
    public final int d;
    public final Long e;
    public final long f;
    public final Long g;
    public final String h;
    public final long i;
    public final long j;
    public final String k;
    public final long l;
    public final long m;

    public ws5(long j, long j2, long j3, int i, Long l, long j4, Long l2, String str, long j5, long j6, String str2, long j7, long j8) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = i;
        this.e = l;
        this.f = j4;
        this.g = l2;
        this.h = str;
        this.i = j5;
        this.j = j6;
        this.k = str2;
        this.l = j7;
        this.m = j8;
    }

    public static ws5 a(ws5 ws5Var) {
        return new ws5(ws5Var.a, ws5Var.b, ws5Var.c, 3, ws5Var.e, ws5Var.f, ws5Var.g, ws5Var.h, ws5Var.i, ws5Var.j, ws5Var.k, ws5Var.l, ws5Var.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws5)) {
            return false;
        }
        ws5 ws5Var = (ws5) obj;
        return this.a == ws5Var.a && this.b == ws5Var.b && this.c == ws5Var.c && this.d == ws5Var.d && fni.a(this.e, ws5Var.e) && this.f == ws5Var.f && fni.a(this.g, ws5Var.g) && fni.a(this.h, ws5Var.h) && this.i == ws5Var.i && this.j == ws5Var.j && fni.a(this.k, ws5Var.k) && this.l == ws5Var.l && this.m == ws5Var.m;
    }

    public final int hashCode() {
        int iK = utb.k(this.d, a9h.a(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
        Long l = this.e;
        int iA = a9h.a((iK + (l == null ? 0 : l.hashCode())) * 31, 31, this.f);
        Long l2 = this.g;
        int iHashCode = (iA + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.h;
        return Long.hashCode(this.m) + a9h.a(u45.e(a9h.a(a9h.a((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "FcmAnalyticsEntryDb(pushId=", ", chatId=");
        sbL.append(this.b);
        az1.r(this.c, ", messageId=", ", analyticsStatus=", sbL);
        int i = this.d;
        sbL.append(i != 1 ? i != 2 ? i != 3 ? "null" : "SENT" : "NOT_SENT" : "UNDEFINED");
        sbL.append(", senderUserId=");
        sbL.append(this.e);
        sbL.append(", contentLength=");
        sbL.append(this.f);
        sbL.append(", sentTime=");
        sbL.append(this.g);
        sbL.append(", eventKey=");
        sbL.append(this.h);
        sbL.append(", fcmSentTime=");
        sbL.append(this.i);
        az1.r(this.j, ", receivedTime=", ", pushType=", sbL);
        sbL.append(this.k);
        sbL.append(", time=");
        sbL.append(this.l);
        return u45.i(this.m, ", createdTime=", ")", sbL);
    }
}
