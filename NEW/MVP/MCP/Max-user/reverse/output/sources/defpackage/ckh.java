package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ckh {
    public final String a;
    public final long b;
    public final long c;
    public final Thread d;
    public final List e;

    public ckh(String str, long j, long j2, Thread thread, List list) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = thread;
        this.e = list;
    }

    public static ckh a(ckh ckhVar, long j, Thread thread, int i) {
        String str = ckhVar.a;
        long j2 = ckhVar.b;
        if ((i & 4) != 0) {
            j = ckhVar.c;
        }
        return new ckh(str, j2, j, thread, ckhVar.e);
    }

    public final long b(long j) {
        long j2 = this.b;
        long j3 = this.c;
        if (s65.e(j3, j2)) {
            j3 = j;
        }
        return s65.k(j, j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckh)) {
            return false;
        }
        ckh ckhVar = (ckh) obj;
        return fni.a(this.a, ckhVar.a) && s65.e(this.b, ckhVar.b) && s65.e(this.c, ckhVar.c) && fni.a(this.d, ckhVar.d) && fni.a(this.e, ckhVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = s65.d;
        int iA = a9h.a(a9h.a(iHashCode, 31, this.b), 31, this.c);
        Thread thread = this.d;
        return this.e.hashCode() + ((iA + (thread == null ? 0 : thread.hashCode())) * 31);
    }

    public final String toString() {
        String strN = s65.n(this.b);
        String strN2 = s65.n(this.c);
        StringBuilder sbL = wy1.l("WatchdogTask(submitThread=", this.a, ", submitTime=", strN, ", startTime=");
        sbL.append(strN2);
        sbL.append(", runningThread=");
        sbL.append(this.d);
        sbL.append(", stacktrace=");
        return az1.j(sbL, this.e, ")");
    }
}
