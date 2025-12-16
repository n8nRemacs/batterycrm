package defpackage;

/* loaded from: classes2.dex */
public final class a15 implements c15 {
    public final int a;
    public final long b;
    public final long c;

    public a15(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a15)) {
            return false;
        }
        a15 a15Var = (a15) obj;
        return this.a == a15Var.a && this.b == a15Var.b && this.c == a15Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + a9h.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return u45.i(this.c, ", chatId=", ")", xrf.q("Loading(progress=", this.b, ue6.a(this.a), ", time="));
    }
}
