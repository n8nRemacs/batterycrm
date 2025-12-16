package defpackage;

/* loaded from: classes2.dex */
public final class gm2 extends id0 {
    public final long b;
    public final long c;

    public gm2(long j, long j2) {
        super(4);
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm2)) {
            return false;
        }
        gm2 gm2Var = (gm2) obj;
        return this.b == gm2Var.b && this.c == gm2Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return ho7.k(az1.l(this.b, "OpenMessage(chatId=", ", messageId="), this.c, ")");
    }
}
