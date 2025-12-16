package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class zqb {
    public final arb a;
    public final long b;
    public long c = -1;
    public long d = -1;
    public long e = -1;
    public List f;

    public zqb(arb arbVar, long j) {
        this.a = arbVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqb)) {
            return false;
        }
        zqb zqbVar = (zqb) obj;
        return this.a == zqbVar.a && this.b == zqbVar.b;
    }

    public final int hashCode() {
        return a9h.a(this.a.hashCode() * 31, 961, this.b);
    }

    public final String toString() {
        return "PerfSpan(name=" + this.a + ", startTime=" + this.b + ", parentSpanName=null, prevSpanName=null)";
    }
}
