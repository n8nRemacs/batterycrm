package defpackage;

/* loaded from: classes2.dex */
public final class dn5 {
    public final long a;
    public final long b;

    public /* synthetic */ dn5() {
        this(-1L, -9223372036854775807L);
    }

    public final boolean a() {
        return this.a == -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn5)) {
            return false;
        }
        dn5 dn5Var = (dn5) obj;
        return this.a == dn5Var.a && this.b == dn5Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        if (a()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[" + this.a + "]");
        long j = this.b;
        if (j != -9223372036854775807L) {
            sb.append(" ");
            sb.append(zxg.m0(j));
            sb.append(" ms");
        }
        return sb.toString();
    }

    public dn5(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
