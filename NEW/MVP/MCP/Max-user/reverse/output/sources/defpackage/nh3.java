package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class nh3 implements sh3 {
    public final List a;
    public final boolean b;
    public final Long c;

    public nh3(Long l, List list, boolean z) {
        this.a = list;
        this.b = z;
        this.c = l;
    }

    public static nh3 a(nh3 nh3Var, List list, int i) {
        boolean z = (i & 2) != 0 ? nh3Var.b : false;
        Long l = nh3Var.c;
        nh3Var.getClass();
        return new nh3(l, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh3)) {
            return false;
        }
        nh3 nh3Var = (nh3) obj;
        return fni.a(this.a, nh3Var.a) && this.b == nh3Var.b && fni.a(this.c, nh3Var.c);
    }

    public final int hashCode() {
        int iB = a9h.b(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        return iB + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Result(items=" + this.a + ", hasMore=" + this.b + ", marker=" + this.c + ")";
    }
}
