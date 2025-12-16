package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ml9 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final List i;
    public final xl9 j;
    public final int k;
    public final long l;
    public final boolean m;
    public final long n;
    public final String o;
    public final String p;
    public final String q;
    public final int r;
    public final jm9 s;
    public final int t;
    public final long u;
    public final int v;
    public final long w;
    public final Long x;
    public final Boolean y;

    public ml9(long j, long j2, long j3, long j4, long j5, long j6, long j7, String str, List list, xl9 xl9Var, int i, long j8, boolean z, long j9, String str2, String str3, String str4, int i2, jm9 jm9Var, int i3, long j10, int i4, long j11, Long l, Boolean bool) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = str;
        this.i = list;
        this.j = xl9Var;
        this.k = i;
        this.l = j8;
        this.m = z;
        this.n = j9;
        this.o = str2;
        this.p = str3;
        this.q = str4;
        this.r = i2;
        this.s = jm9Var;
        this.t = i3;
        this.u = j10;
        this.v = i4;
        this.w = j11;
        this.x = l;
        this.y = bool;
    }

    public static ml9 a(ml9 ml9Var, long j, long j2, long j3, long j4, String str, xl9 xl9Var, int i, long j5, boolean z, long j6, String str2, String str3, String str4, int i2, int i3) {
        return new ml9((i3 & 1) != 0 ? ml9Var.a : j, (i3 & 2) != 0 ? ml9Var.b : j2, ml9Var.c, (i3 & 8) != 0 ? ml9Var.d : j3, ml9Var.e, ml9Var.f, (i3 & 64) != 0 ? ml9Var.g : j4, (i3 & 128) != 0 ? ml9Var.h : str, ml9Var.i, (i3 & 512) != 0 ? ml9Var.j : xl9Var, (i3 & 1024) != 0 ? ml9Var.k : i, j5, (i3 & 4096) != 0 ? ml9Var.m : z, (i3 & 8192) != 0 ? ml9Var.n : j6, (i3 & 16384) != 0 ? ml9Var.o : str2, (32768 & i3) != 0 ? ml9Var.p : str3, (65536 & i3) != 0 ? ml9Var.q : str4, (i3 & 131072) != 0 ? ml9Var.r : i2, ml9Var.s, ml9Var.t, ml9Var.u, ml9Var.v, ml9Var.w, ml9Var.x, ml9Var.y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml9)) {
            return false;
        }
        ml9 ml9Var = (ml9) obj;
        return this.a == ml9Var.a && this.b == ml9Var.b && this.c == ml9Var.c && this.d == ml9Var.d && this.e == ml9Var.e && this.f == ml9Var.f && this.g == ml9Var.g && fni.a(this.h, ml9Var.h) && fni.a(this.i, ml9Var.i) && fni.a(this.j, ml9Var.j) && this.k == ml9Var.k && this.l == ml9Var.l && this.m == ml9Var.m && this.n == ml9Var.n && fni.a(this.o, ml9Var.o) && fni.a(this.p, ml9Var.p) && fni.a(this.q, ml9Var.q) && this.r == ml9Var.r && this.s == ml9Var.s && this.t == ml9Var.t && this.u == ml9Var.u && this.v == ml9Var.v && this.w == ml9Var.w && fni.a(this.x, ml9Var.x) && fni.a(this.y, ml9Var.y);
    }

    public final int hashCode() {
        int iA = a9h.a(a9h.a(a9h.a(a9h.a(a9h.a(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        int iL = xrf.l(this.i, (iA + (str == null ? 0 : str.hashCode())) * 31, 31);
        xl9 xl9Var = this.j;
        int iA2 = a9h.a(a9h.b(a9h.a(xrf.k(this.k, (iL + (xl9Var == null ? 0 : xl9Var.hashCode())) * 31, 31), 31, this.l), 31, this.m), 31, this.n);
        String str2 = this.o;
        int iHashCode = (iA2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.p;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.q;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        int i = this.r;
        int iA3 = a9h.a(xrf.k(this.v, a9h.a(utb.k(this.t, (this.s.hashCode() + ((iHashCode3 + (i == 0 ? 0 : az1.v(i))) * 31)) * 31, 31), 31, this.u), 31), 31, this.w);
        Long l = this.x;
        int iHashCode4 = (iA3 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.y;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "MessagePartEntity(id=", ", serverId=");
        sbL.append(this.b);
        az1.r(this.c, ", time=", ", chatId=", sbL);
        sbL.append(this.d);
        az1.r(this.e, ", updateTime=", ", sender=", sbL);
        sbL.append(this.f);
        az1.r(this.g, ", cid=", ", text=", sbL);
        sbL.append(this.h);
        sbL.append(", elements=");
        sbL.append(this.i);
        sbL.append(", reactions=");
        sbL.append(this.j);
        sbL.append(", messagesLinkType=");
        sbL.append(this.k);
        sbL.append(", messagesLinkId=");
        sbL.append(this.l);
        sbL.append(", insertedFromMessageLink=");
        sbL.append(this.m);
        az1.r(this.n, ", messagesLinkChatId=", ", messageLinkChatName=", sbL);
        ho7.r(sbL, this.o, ", messageLinkChatLink=", this.p, ", messageLinkChatIconUrl=");
        sbL.append(this.q);
        sbL.append(", messageLinkChatAccessType=");
        sbL.append(wy1.x(this.r));
        sbL.append(", status=");
        sbL.append(this.s);
        sbL.append(", type=");
        sbL.append(vb9.n(this.t));
        sbL.append(", viewTime=");
        utb.n(sbL, this.u, ", options=", this.v);
        az1.r(this.w, ", liveUntil=", ", timeToFire=", sbL);
        sbL.append(this.x);
        sbL.append(", notifySender=");
        sbL.append(this.y);
        sbL.append(")");
        return sbL.toString();
    }
}
