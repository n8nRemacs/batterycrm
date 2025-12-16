package defpackage;

/* loaded from: classes2.dex */
public final class mj2 extends l0g {
    public final long c;
    public final int d;
    public final Boolean o;

    public mj2(long j, int i, Boolean bool) {
        this.c = j;
        this.d = i;
        this.o = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj2)) {
            return false;
        }
        mj2 mj2Var = (mj2) obj;
        return this.c == mj2Var.c && this.d == mj2Var.d && fni.a(this.o, mj2Var.o);
    }

    public final int hashCode() {
        int iK = xrf.k(this.d, Long.hashCode(this.c) * 31, 31);
        Boolean bool = this.o;
        return iK + (bool == null ? 0 : bool.hashCode());
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "Response(mark=" + this.c + ", unread=" + this.d + ", success=" + this.o + ")";
    }
}
