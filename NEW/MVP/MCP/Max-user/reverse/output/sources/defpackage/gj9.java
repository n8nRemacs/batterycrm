package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class gj9 {
    public final int A;
    public final long B;
    public final int C;
    public final long D;
    public final List E;
    public final xl9 F;
    public final Long G;
    public final Boolean H;
    public final long I;
    public final int J;
    public final int K;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final xi9 h;
    public final jm9 i;
    public final long j;
    public final String k;
    public final String l;
    public final jdc m;
    public final int n;
    public final boolean o;
    public final int p;
    public final long q;
    public final boolean r;
    public final long s;
    public final String t;
    public final String u;
    public final String v;
    public final long w;
    public final long x;
    public final long y;
    public final int z;

    public gj9(long j, long j2, long j3, long j4, long j5, long j6, String str, xi9 xi9Var, jm9 jm9Var, long j7, String str2, String str3, jdc jdcVar, int i, boolean z, int i2, long j8, boolean z2, long j9, String str4, String str5, String str6, int i3, long j10, long j11, int i4, long j12, int i5, int i6, long j13, int i7, long j14, List list, xl9 xl9Var, Long l, Boolean bool, long j15) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = str;
        this.h = xi9Var;
        this.i = jm9Var;
        this.j = j7;
        this.k = str2;
        this.l = str3;
        this.m = jdcVar;
        this.n = i;
        this.o = z;
        this.p = i2;
        this.q = j8;
        this.r = z2;
        this.s = j9;
        this.t = str4;
        this.u = str5;
        this.v = str6;
        this.J = i3;
        this.w = j10;
        this.x = j11;
        this.K = i4;
        this.y = j12;
        this.z = i5;
        this.A = i6;
        this.B = j13;
        this.C = i7;
        this.D = j14;
        this.E = list;
        this.F = xl9Var;
        this.G = l;
        this.H = bool;
        this.I = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj9)) {
            return false;
        }
        gj9 gj9Var = (gj9) obj;
        return this.a == gj9Var.a && this.b == gj9Var.b && this.c == gj9Var.c && this.d == gj9Var.d && this.e == gj9Var.e && this.f == gj9Var.f && fni.a(this.g, gj9Var.g) && this.h == gj9Var.h && this.i == gj9Var.i && this.j == gj9Var.j && fni.a(this.k, gj9Var.k) && fni.a(this.l, gj9Var.l) && fni.a(this.m, gj9Var.m) && this.n == gj9Var.n && this.o == gj9Var.o && this.p == gj9Var.p && this.q == gj9Var.q && this.r == gj9Var.r && this.s == gj9Var.s && fni.a(this.t, gj9Var.t) && fni.a(this.u, gj9Var.u) && fni.a(this.v, gj9Var.v) && this.J == gj9Var.J && this.w == gj9Var.w && this.x == gj9Var.x && this.K == gj9Var.K && this.y == gj9Var.y && this.z == gj9Var.z && this.A == gj9Var.A && this.B == gj9Var.B && this.C == gj9Var.C && this.D == gj9Var.D && fni.a(this.E, gj9Var.E) && fni.a(this.F, gj9Var.F) && fni.a(this.G, gj9Var.G) && fni.a(this.H, gj9Var.H) && this.I == gj9Var.I;
    }

    public final int hashCode() {
        int iA = a9h.a(a9h.a(a9h.a(a9h.a(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int iA2 = a9h.a((this.i.hashCode() + ((this.h.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.j);
        String str2 = this.k;
        int iHashCode = (iA2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        jdc jdcVar = this.m;
        int iA3 = a9h.a(a9h.b(a9h.a(xrf.k(this.p, a9h.b(xrf.k(this.n, (iHashCode2 + (jdcVar == null ? 0 : jdcVar.hashCode())) * 31, 31), 31, this.o), 31), 31, this.q), 31, this.r), 31, this.s);
        String str4 = this.t;
        int iHashCode3 = (iA3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.u;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.v;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        int i = this.J;
        int iL = xrf.l(this.E, a9h.a(xrf.k(this.C, a9h.a(xrf.k(this.A, xrf.k(this.z, a9h.a(utb.k(this.K, a9h.a(a9h.a((iHashCode5 + (i == 0 ? 0 : az1.v(i))) * 31, 31, this.w), 31, this.x), 31), 31, this.y), 31), 31), 31, this.B), 31), 31, this.D), 31);
        xl9 xl9Var = this.F;
        int iHashCode6 = (iL + (xl9Var == null ? 0 : xl9Var.hashCode())) * 31;
        Long l = this.G;
        int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.H;
        return Long.hashCode(this.I) + ((iHashCode7 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "MessageEntity(id=", ", serverId=");
        sbL.append(this.b);
        az1.r(this.c, ", time=", ", updateTime=", sbL);
        sbL.append(this.d);
        az1.r(this.e, ", sender=", ", cid=", sbL);
        hf3.e(this.f, ", text=", this.g, sbL);
        sbL.append(", deliveryStatus=");
        sbL.append(this.h);
        sbL.append(", status=");
        sbL.append(this.i);
        az1.r(this.j, ", timeLocal=", ", error=", sbL);
        ho7.r(sbL, this.k, ", localizedError=", this.l, ", attaches=");
        sbL.append(this.m);
        sbL.append(", mediaType=");
        sbL.append(this.n);
        sbL.append(", detectShare=");
        sbL.append(this.o);
        sbL.append(", messagesLinkType=");
        sbL.append(this.p);
        sbL.append(", messagesLinkId=");
        sbL.append(this.q);
        sbL.append(", insertedFromMessageLink=");
        sbL.append(this.r);
        az1.r(this.s, ", messagesLinkChatId=", ", messageLinkChatName=", sbL);
        ho7.r(sbL, this.t, ", messageLinkChatLink=", this.u, ", messageLinkChatIconUrl=");
        sbL.append(this.v);
        sbL.append(", messageLinkChatAccessType=");
        sbL.append(wy1.x(this.J));
        sbL.append(", messageLinkOutChatId=");
        sbL.append(this.w);
        az1.r(this.x, ", messageLinkOutMessageId=", ", type=", sbL);
        sbL.append(vb9.n(this.K));
        sbL.append(", chatId=");
        sbL.append(this.y);
        sbL.append(", channelViews=");
        sbL.append(this.z);
        sbL.append(", channelForwards=");
        sbL.append(this.A);
        az1.r(this.B, ", viewTime=", ", options=", sbL);
        sbL.append(this.C);
        sbL.append(", liveUntil=");
        sbL.append(this.D);
        sbL.append(", elements=");
        sbL.append(this.E);
        sbL.append(", reactions=");
        sbL.append(this.F);
        sbL.append(", timeToFire=");
        sbL.append(this.G);
        sbL.append(", notifySender=");
        sbL.append(this.H);
        return u45.i(this.I, ", reactionsUpdateTime=", ")", sbL);
    }
}
