package defpackage;

/* loaded from: classes2.dex */
public final class gj7 extends sj0 {
    public final boolean X;
    public final long Y;
    public final long b;
    public final long c;
    public final boolean d;
    public final rs4 o;

    public gj7(long j, long j2, boolean z, rs4 rs4Var, boolean z2, long j3) {
        this.b = j;
        this.c = j2;
        this.d = z;
        this.o = rs4Var;
        this.X = z2;
        this.Y = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj7)) {
            return false;
        }
        gj7 gj7Var = (gj7) obj;
        return this.b == gj7Var.b && this.c == gj7Var.c && this.d == gj7Var.d && this.o == gj7Var.o && this.X == gj7Var.X && this.Y == gj7Var.Y;
    }

    public final int hashCode() {
        return Long.hashCode(this.Y) + a9h.b((this.o.hashCode() + a9h.b(a9h.a(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d)) * 31, 31, this.X);
    }

    @Override // defpackage.sj0
    public final String toString() {
        StringBuilder sbL = az1.l(this.b, "IncomingMessageEvent(chatId=", ", messageId=");
        sbL.append(this.c);
        sbL.append(", isInvisiblePush=");
        sbL.append(this.d);
        sbL.append(", itemType=");
        sbL.append(this.o);
        sbL.append(", isControl=");
        sbL.append(this.X);
        return u45.i(this.Y, ", sender=", ")", sbL);
    }
}
