package defpackage;

/* loaded from: classes.dex */
public final class r7d {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public r7d(long j, long j2, String str) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final r7d a(r7d r7dVar, String str) {
        r7d r7dVar2;
        long j;
        String strD = moi.d(str, this.c);
        if (r7dVar != null) {
            long j2 = r7dVar.b;
            if (strD.equals(moi.d(str, r7dVar.c))) {
                long j3 = this.b;
                if (j3 != -1) {
                    j = j2;
                    long j4 = this.a;
                    r7dVar2 = null;
                    if (j4 + j3 == r7dVar.a) {
                        return new r7d(j4, j != -1 ? j3 + j : -1L, strD);
                    }
                } else {
                    r7dVar2 = null;
                    j = j2;
                }
                if (j == -1) {
                    return r7dVar2;
                }
                long j5 = r7dVar.a;
                if (j5 + j == this.a) {
                    return new r7d(j5, j3 != -1 ? j + j3 : -1L, strD);
                }
                return r7dVar2;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r7d.class == obj.getClass()) {
            r7d r7dVar = (r7d) obj;
            if (this.a == r7dVar.a && this.b == r7dVar.b && this.c.equals(r7dVar.c)) {
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
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return ho7.k(sb, this.b, ")");
    }
}
