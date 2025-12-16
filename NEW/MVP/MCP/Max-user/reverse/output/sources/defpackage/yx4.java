package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class yx4 {
    public final long a;
    public final String b;
    public final boolean c;
    public final List d;
    public final boolean e;
    public final boolean f;

    public yx4(long j, String str, List list, boolean z, int i) {
        boolean z2 = (i & 4) == 0;
        list = (i & 8) != 0 ? hd5.a : list;
        z = (i & 16) != 0 ? false : z;
        boolean z3 = (i & 32) == 0;
        this.a = j;
        this.b = str;
        this.c = z2;
        this.d = list;
        this.e = z;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx4)) {
            return false;
        }
        yx4 yx4Var = (yx4) obj;
        return this.a == yx4Var.a && fni.a(this.b, yx4Var.b) && this.c == yx4Var.c && fni.a(this.d, yx4Var.d) && this.e == yx4Var.e && this.f == yx4Var.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iE = u45.e(Long.hashCode(this.a) * 31, 31, this.b);
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int iL = xrf.l(this.d, (iE + i) * 31, 31);
        boolean z2 = this.e;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (iL + i2) * 31;
        boolean z3 = this.f;
        return i3 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public final String toString() {
        return "SpaceConsumer(size=" + this.a + ", name=" + this.b + ", isDirectory=" + this.c + ", children=" + this.d + ", overflow=" + this.e + ", excluded=" + this.f + ')';
    }
}
