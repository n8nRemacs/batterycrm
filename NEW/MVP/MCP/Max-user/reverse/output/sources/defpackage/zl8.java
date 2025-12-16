package defpackage;

/* loaded from: classes.dex */
public final class zl8 {
    public final String a;
    public final long b;
    public final long c;
    public final long d;

    public zl8(String str, long j, long j2, long j3) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl8)) {
            return false;
        }
        zl8 zl8Var = (zl8) obj;
        return fni.a(this.a, zl8Var.a) && this.b == zl8Var.b && this.c == zl8Var.c && this.d == zl8Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + a9h.a(a9h.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = xrf.q("LooperMessage(message=", this.b, this.a, ", startTime=");
        az1.r(this.c, ", endTime=", ", messageQueueSize=", sbQ);
        return ho7.k(sbQ, this.d, ")");
    }
}
