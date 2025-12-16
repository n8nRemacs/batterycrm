package defpackage;

import android.text.Layout;

/* loaded from: classes2.dex */
public final class jk9 implements lk9 {
    public final long a;
    public final String b;
    public final long c;
    public final Layout d;
    public final Layout e;

    public jk9(long j, String str, long j2, Layout layout, Layout layout2) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = layout;
        this.e = layout2;
    }

    @Override // defpackage.lk9
    public final Layout a() {
        return this.d;
    }

    @Override // defpackage.lk9
    public final Layout b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk9)) {
            return false;
        }
        jk9 jk9Var = (jk9) obj;
        return this.a == jk9Var.a && fni.a(this.b, jk9Var.b) && this.c == jk9Var.c && fni.a(this.d, jk9Var.d) && fni.a(this.e, jk9Var.e);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (this.d.hashCode() + a9h.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31;
        Layout layout = this.e;
        return iHashCode2 + (layout != null ? layout.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("Channel(chatId=", this.a, ", channelLink=", this.b);
        az1.r(this.c, ", forwardedMessageId=", ", bodyLayout=", sbN);
        sbN.append(this.d);
        sbN.append(", forwardedTitleLayout=");
        sbN.append(this.e);
        sbN.append(")");
        return sbN.toString();
    }
}
