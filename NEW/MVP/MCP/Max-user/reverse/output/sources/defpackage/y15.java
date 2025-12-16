package defpackage;

/* loaded from: classes2.dex */
public final class y15 implements z15 {
    public final int a;
    public final long b;
    public final long c;

    public y15(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y15)) {
            return false;
        }
        y15 y15Var = (y15) obj;
        return this.a == y15Var.a && this.b == y15Var.b && this.c == y15Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + a9h.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return u45.i(this.c, ", botId=", ")", xrf.q("Loading(progress=", this.b, ue6.a(this.a), ", time="));
    }
}
