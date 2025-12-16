package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class oma {
    public final Map a;
    public final ena b;
    public final int c;
    public final int d;
    public final String e;
    public final boolean f;
    public final String g;

    public oma(Map map, ena enaVar, int i, int i2, String str, boolean z, String str2) {
        this.a = map;
        this.b = enaVar;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = z;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oma)) {
            return false;
        }
        oma omaVar = (oma) obj;
        return fni.a(this.a, omaVar.a) && fni.a(this.b, omaVar.b) && this.c == omaVar.c && this.d == omaVar.d && fni.a(this.e, omaVar.e) && this.f == omaVar.f && fni.a(this.g, omaVar.g);
    }

    public final int hashCode() {
        int iB = a9h.b(u45.e(xrf.k(this.d, xrf.k(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31, this.e), 31, this.f);
        String str = this.g;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationData(notificationsMap=");
        sb.append(this.a);
        sb.append(", notificationSettings=");
        sb.append(this.b);
        sb.append(", totalUnreadMessagesCount=");
        hf3.g(sb, this.c, ", notificationId=", this.d, ", groupSummaryKey=");
        sb.append(this.e);
        sb.append(", checkCount=");
        sb.append(this.f);
        sb.append(", tag=");
        return ho7.l(sb, this.g, ")");
    }
}
