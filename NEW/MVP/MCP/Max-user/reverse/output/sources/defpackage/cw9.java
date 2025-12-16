package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class cw9 {
    public final long a;
    public final long b;
    public final long c;
    public final List d;
    public final boolean e;
    public final boolean f;

    public cw9(long j, long j2, long j3, List list, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = list;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw9)) {
            return false;
        }
        cw9 cw9Var = (cw9) obj;
        return this.a == cw9Var.a && this.b == cw9Var.b && this.c == cw9Var.c && fni.a(this.d, cw9Var.d) && this.e == cw9Var.e && this.f == cw9Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + a9h.b(xrf.l(this.d, a9h.a(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "MessagesListWidgetArgs(chatId=", ", loadMark=");
        sbL.append(this.b);
        az1.r(this.c, ", loadMessageId=", ", highlights=", sbL);
        sbL.append(this.d);
        sbL.append(", shouldHighlightMessage=");
        sbL.append(this.e);
        sbL.append(", shouldSkipUnreadDecoration=");
        return az1.k(sbL, this.f, ")");
    }
}
