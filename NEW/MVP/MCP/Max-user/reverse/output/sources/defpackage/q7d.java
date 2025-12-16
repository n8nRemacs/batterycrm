package defpackage;

/* loaded from: classes.dex */
public final class q7d {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public q7d(long j, long j2, String str) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final q7d a(q7d q7dVar, String str) {
        q7d q7dVar2;
        long j;
        String strH = koi.h(str, this.c);
        if (q7dVar != null) {
            long j2 = q7dVar.b;
            if (strH.equals(koi.h(str, q7dVar.c))) {
                long j3 = this.b;
                if (j3 != -1) {
                    j = j2;
                    long j4 = this.a;
                    q7dVar2 = null;
                    if (j4 + j3 == q7dVar.a) {
                        return new q7d(j4, j != -1 ? j3 + j : -1L, strH);
                    }
                } else {
                    q7dVar2 = null;
                    j = j2;
                }
                if (j == -1) {
                    return q7dVar2;
                }
                long j5 = q7dVar.a;
                if (j5 + j == this.a) {
                    return new q7d(j5, j3 != -1 ? j + j3 : -1L, strH);
                }
                return q7dVar2;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q7d.class == obj.getClass()) {
            q7d q7dVar = (q7d) obj;
            if (this.a == q7dVar.a && this.b == q7dVar.b && this.c.equals(q7dVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        String str = this.c;
        StringBuilder sb = new StringBuilder(u45.f(81, str));
        sb.append("RangedUri(referenceUri=");
        sb.append(str);
        sb.append(", start=");
        sb.append(this.a);
        return u45.i(this.b, ", length=", ")", sb);
    }
}
