package defpackage;

/* loaded from: classes2.dex */
public final class mx9 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final long f;

    public mx9(int i, boolean z, boolean z2, long j, long j2, int i2) {
        z = (i2 & 2) != 0 ? false : z;
        boolean z3 = (i2 & 4) == 0;
        z2 = (i2 & 8) != 0 ? false : z2;
        j = (i2 & 16) != 0 ? 0L : j;
        j2 = (i2 & 32) != 0 ? 0L : j2;
        this.a = i;
        this.b = z;
        this.c = z3;
        this.d = z2;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx9)) {
            return false;
        }
        mx9 mx9Var = (mx9) obj;
        return this.a == mx9Var.a && this.b == mx9Var.b && this.c == mx9Var.c && this.d == mx9Var.d && this.e == mx9Var.e && this.f == mx9Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + a9h.a(a9h.b(a9h.b(a9h.b(az1.v(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollWork(scrollType=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "TO_ANCHOR" : "TO_LAST_NEW" : "TO_LAST" : "TO_UNREAD");
        sb.append(", highlight=");
        sb.append(this.b);
        sb.append(", instant=");
        az1.t(", alignToBottom=", ", msgId=", sb, this.c, this.d);
        sb.append(this.e);
        return u45.i(this.f, ", time=", ")", sb);
    }
}
