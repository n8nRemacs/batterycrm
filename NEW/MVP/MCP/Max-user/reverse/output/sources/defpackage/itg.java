package defpackage;

/* loaded from: classes2.dex */
public final class itg extends sj0 {
    public final long b;
    public final long c;
    public final boolean d;

    public itg(long j, long j2, boolean z) {
        this.b = j;
        this.c = j2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itg)) {
            return false;
        }
        itg itgVar = (itg) obj;
        return this.b == itgVar.b && this.c == itgVar.c && this.d == itgVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + a9h.a(Long.hashCode(this.b) * 31, 31, this.c);
    }

    @Override // defpackage.sj0
    public final String toString() {
        StringBuilder sbL = az1.l(this.b, "UpdateMessageEvent(chatId=", ", messageId=");
        sbL.append(this.c);
        sbL.append(", reactionsChanged=");
        sbL.append(this.d);
        sbL.append(")");
        return sbL.toString();
    }
}
