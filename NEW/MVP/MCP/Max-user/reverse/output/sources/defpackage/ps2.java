package defpackage;

import android.graphics.Bitmap;
import java.util.List;

/* loaded from: classes2.dex */
public final class ps2 {
    public final long a;
    public final String b;
    public final long c;
    public final String d;
    public final qs2 e;
    public final List f;
    public final List g;
    public final Bitmap h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final long l;
    public final long m;
    public final String n;
    public final long o;

    public ps2(long j, String str, long j2, String str2, qs2 qs2Var, List list, List list2, Bitmap bitmap, int i, boolean z, boolean z2, long j3, long j4, String str3, long j5) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = str2;
        this.e = qs2Var;
        this.f = list;
        this.g = list2;
        this.h = bitmap;
        this.i = i;
        this.j = z;
        this.k = z2;
        this.l = j3;
        this.m = j4;
        this.n = str3;
        this.o = j5;
    }

    public static ps2 a(ps2 ps2Var, List list, boolean z, int i) {
        long j = ps2Var.a;
        String str = ps2Var.b;
        long j2 = ps2Var.c;
        String str2 = ps2Var.d;
        qs2 qs2Var = ps2Var.e;
        List list2 = (i & 32) != 0 ? ps2Var.f : hd5.a;
        List list3 = (i & 64) != 0 ? ps2Var.g : list;
        Bitmap bitmap = ps2Var.h;
        int i2 = (i & 256) != 0 ? ps2Var.i : 0;
        boolean z2 = (i & 512) != 0 ? ps2Var.j : z;
        boolean z3 = ps2Var.k;
        long j3 = ps2Var.l;
        boolean z4 = z2;
        long j4 = ps2Var.m;
        String str3 = ps2Var.n;
        long j5 = ps2Var.o;
        ps2Var.getClass();
        return new ps2(j, str, j2, str2, qs2Var, list2, list3, bitmap, i2, z4, z3, j3, j4, str3, j5);
    }

    public final boolean b() {
        gl9 gl9Var = (gl9) ue3.Q(this.f);
        return gl9Var != null && gl9Var.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps2)) {
            return false;
        }
        ps2 ps2Var = (ps2) obj;
        return this.a == ps2Var.a && fni.a(this.b, ps2Var.b) && this.c == ps2Var.c && fni.a(this.d, ps2Var.d) && this.e == ps2Var.e && fni.a(this.f, ps2Var.f) && fni.a(this.g, ps2Var.g) && fni.a(this.h, ps2Var.h) && this.i == ps2Var.i && this.j == ps2Var.j && this.k == ps2Var.k && this.l == ps2Var.l && this.m == ps2Var.m && fni.a(this.n, ps2Var.n) && this.o == ps2Var.o;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iL = xrf.l(this.g, xrf.l(this.f, (this.e.hashCode() + u45.e(a9h.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d)) * 31, 31), 31);
        Bitmap bitmap = this.h;
        int iA = a9h.a(a9h.a(a9h.b(a9h.b(xrf.k(this.i, (iL + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        String str2 = this.n;
        return Long.hashCode(this.o) + ((iA + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ChatNotification(pushId=" + this.a + ", eventKey=" + this.b + ", chatServerId=" + this.c + "', chatNotificationType=" + this.e + ", displayMessages=" + ue3.N(this.f, ",", "[", "]", new gf1(19), 24) + ", droppedMessages=" + this.g.size() + ", totalUnreadMessagesCount=" + this.i + ", needNotify=" + this.j + ", showNotificationText=" + this.k + ", lastMessageId=" + this.l + ", lastMessageDate=" + this.m + ", pushType=" + this.n + ", createdTime=" + this.o + ", isScheduled=" + b() + ")";
    }
}
