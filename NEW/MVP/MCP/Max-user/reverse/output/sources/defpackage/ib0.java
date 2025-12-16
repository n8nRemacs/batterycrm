package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class ib0 {
    public final hc3 a;
    public final HashMap b;

    public ib0(hc3 hc3Var, HashMap map) {
        this.a = hc3Var;
        this.b = map;
    }

    public final long a(l9c l9cVar, long j, int i) {
        long time = j - this.a.getTime();
        jb0 jb0Var = (jb0) this.b.get(l9cVar);
        long j2 = jb0Var.a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r12))), time), jb0Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ib0)) {
            return false;
        }
        ib0 ib0Var = (ib0) obj;
        return this.a.equals(ib0Var.a) && this.b.equals(ib0Var.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
