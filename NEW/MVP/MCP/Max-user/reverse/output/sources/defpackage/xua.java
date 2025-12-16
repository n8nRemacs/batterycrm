package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class xua extends l0g {
    public final long X;
    public final String c;
    public final long d;
    public final long o;

    public xua(String str, long j, long j2, long j3) {
        this.c = str;
        this.d = j;
        this.o = j2;
        this.X = j3;
        this.a = TimeUnit.NANOSECONDS.toMillis(Math.abs(System.nanoTime() - j3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xua)) {
            return false;
        }
        xua xuaVar = (xua) obj;
        return fni.a(this.c, xuaVar.c) && this.d == xuaVar.d && this.o == xuaVar.o && this.X == xuaVar.X;
    }

    public final int hashCode() {
        return Long.hashCode(this.X) + a9h.a(a9h.a(this.c.hashCode() * 31, 31, this.d), 31, this.o);
    }

    @Override // defpackage.pj0
    public final String toString() {
        String str = this.c;
        StringBuilder sbQ = xrf.q("Response(token=", this.d, vmf.O(str, 0, str.length(), "*").toString(), " expiredDurationSec=");
        sbQ.append(")");
        return sbQ.toString();
    }

    public /* synthetic */ xua() {
        this("", 0L, 0L, 0L);
    }
}
