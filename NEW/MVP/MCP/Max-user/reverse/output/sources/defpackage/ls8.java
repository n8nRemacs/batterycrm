package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ls8 implements Comparable {
    public final String a;
    public final long b;
    public final long c;
    public final String d;
    public final long o;

    public ls8(String str, long j, long j2, String str2, long j3) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
        this.o = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ls8 ls8Var = (ls8) obj;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long nanos = timeUnit.toNanos(this.b) + timeUnit.toNanos(this.c);
        ls8Var.getClass();
        int iC = fni.c(nanos, timeUnit.toNanos(ls8Var.b) + timeUnit.toNanos(ls8Var.c));
        Integer numValueOf = Integer.valueOf(iC);
        if (iC == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : this.a.compareTo(ls8Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls8)) {
            return false;
        }
        ls8 ls8Var = (ls8) obj;
        if (!this.a.equals(ls8Var.a) || this.b != ls8Var.b || this.c != ls8Var.c) {
            return false;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        return fni.a(this.d, ls8Var.d) && this.o == ls8Var.o;
    }

    public final int hashCode() {
        return Long.hashCode(this.o) + u45.e((TimeUnit.NANOSECONDS.hashCode() + a9h.a(a9h.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.d);
    }

    public final String toString() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        StringBuilder sbQ = xrf.q("Measurement(taskName=", this.b, this.a, ", dependencyDuration=");
        az1.r(this.c, ", executionDuration=", ", unit=", sbQ);
        sbQ.append(timeUnit);
        sbQ.append(", threadName=");
        sbQ.append(this.d);
        sbQ.append(", startTime=");
        return ho7.k(sbQ, this.o, ")");
    }
}
