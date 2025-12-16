package defpackage;

/* loaded from: classes2.dex */
public final class sja extends l0g {
    public final int X;
    public final long c;
    public final long d;
    public final long o;

    public sja(int i, long j, long j2, long j3) {
        this.c = j;
        this.d = j2;
        this.o = j3;
        this.X = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sja)) {
            return false;
        }
        sja sjaVar = (sja) obj;
        return this.c == sjaVar.c && this.d == sjaVar.d && this.o == sjaVar.o && this.X == sjaVar.X;
    }

    public final int hashCode() {
        return Integer.hashCode(this.X) + a9h.a(a9h.a(Long.hashCode(this.c) * 31, 31, this.d), 31, this.o);
    }

    @Override // defpackage.pj0
    public final String toString() {
        StringBuilder sbL = az1.l(this.c, "Response(chatId=", ", userId=");
        sbL.append(this.d);
        az1.r(this.o, ", mark=", ", unread=", sbL);
        return ho7.j(sbL, this.X, ")");
    }
}
