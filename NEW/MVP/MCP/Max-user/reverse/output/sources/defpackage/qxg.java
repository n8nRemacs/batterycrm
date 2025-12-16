package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class qxg {
    public final Boolean a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Boolean h;
    public final Integer i;
    public final Integer j;
    public final Integer k;
    public final Boolean l;
    public final Boolean m;
    public final Boolean n;
    public final int o;
    public final int p;
    public final pxg q;
    public final int r;
    public final int s;
    public final Boolean t;
    public final Boolean u;
    public final Boolean v;
    public final int w;
    public final Boolean x;
    public final Boolean y;

    public qxg(oxg oxgVar) {
        this.a = oxgVar.a;
        this.b = oxgVar.b;
        this.c = oxgVar.c;
        this.d = oxgVar.d;
        this.e = oxgVar.e;
        this.f = oxgVar.f;
        this.g = oxgVar.g;
        this.h = oxgVar.h;
        this.i = oxgVar.i;
        this.j = oxgVar.j;
        this.k = oxgVar.k;
        this.l = oxgVar.l;
        this.m = oxgVar.m;
        this.n = oxgVar.n;
        this.o = oxgVar.o;
        this.p = oxgVar.p;
        this.q = oxgVar.q;
        this.r = oxgVar.r;
        this.s = oxgVar.s;
        this.t = oxgVar.t;
        this.u = oxgVar.u;
        this.v = oxgVar.v;
        this.w = oxgVar.w;
        this.x = oxgVar.x;
        this.y = oxgVar.y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qxg.class != obj.getClass()) {
            return false;
        }
        qxg qxgVar = (qxg) obj;
        return Objects.equals(this.a, qxgVar.a) && Objects.equals(this.b, qxgVar.b) && Objects.equals(this.c, qxgVar.c) && Objects.equals(this.d, qxgVar.d) && Objects.equals(this.e, qxgVar.e) && Objects.equals(this.f, qxgVar.f) && Objects.equals(this.g, qxgVar.g) && Objects.equals(this.h, qxgVar.h) && Objects.equals(this.i, qxgVar.i) && Objects.equals(this.j, qxgVar.j) && Objects.equals(this.k, qxgVar.k) && Objects.equals(this.l, qxgVar.l) && Objects.equals(this.m, qxgVar.m) && Objects.equals(this.n, qxgVar.n) && this.o == qxgVar.o && this.p == qxgVar.p && this.q == qxgVar.q && this.r == qxgVar.r && this.s == qxgVar.s && Objects.equals(this.t, qxgVar.t) && Objects.equals(this.u, qxgVar.u) && Objects.equals(this.v, qxgVar.v) && this.w == qxgVar.w && Objects.equals(this.x, qxgVar.x) && Objects.equals(this.y, qxgVar.y);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, az1.a(this.o), az1.a(this.p), this.q, az1.a(this.r), az1.a(this.s), this.t, this.u, this.v, az1.a(this.w), this.x, this.y);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserSettings{pushNewContacts=");
        sb.append(this.a);
        sb.append(", dontDustirbUntil=");
        sb.append(this.b);
        sb.append(", dialogsPushNotification='");
        ho7.r(sb, this.c, "', chatsPushNotification='", this.d, "', pushSound='");
        ho7.r(sb, this.e, "', dialogsPushSound='", this.f, "', chatsPushSound='");
        sb.append(this.g);
        sb.append("', hiddenOnline=");
        sb.append(this.h);
        sb.append(", led=");
        sb.append(this.i);
        sb.append(", dialogsLed=");
        sb.append(this.j);
        sb.append(", chatsLed=");
        sb.append(this.k);
        sb.append(", vibration=");
        sb.append(this.l);
        sb.append(", dialogsVibration=");
        sb.append(this.m);
        sb.append(", chatsVibration=");
        sb.append(this.n);
        sb.append(", chatsInvite=");
        sb.append(xrf.A(this.o));
        sb.append(", incomingCall=");
        sb.append(xrf.A(this.p));
        sb.append(", inactiveTtl=");
        sb.append(this.q);
        sb.append(", groupChatCallNotificationStatus=");
        int i = this.r;
        sb.append(i != 1 ? i != 2 ? "null" : "OFF" : "ON");
        sb.append(", suggestStickersStatus=");
        int i2 = this.s;
        sb.append(i2 != 1 ? i2 != 2 ? "null" : "OFF" : "ON");
        sb.append(", audioTranscriptionEnabled=");
        sb.append(this.t);
        sb.append(", safeMode=");
        sb.append(this.u);
        sb.append(", safeModeNoPin=");
        sb.append(this.v);
        sb.append(", searchByPhone=");
        sb.append(xrf.A(this.w));
        sb.append(", unsafeFiles=");
        sb.append(this.x);
        sb.append(", contentLevelAccess=");
        sb.append(this.y);
        sb.append("}");
        return sb.toString();
    }
}
