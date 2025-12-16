package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ip2 {
    public static final ip2 c = new ip2(null, 3, 0);
    public final List a;
    public final int b;

    public ip2(int i, List list) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip2)) {
            return false;
        }
        ip2 ip2Var = (ip2) obj;
        return fni.a(this.a, ip2Var.a) && this.b == ip2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MediaState(items=" + this.a + ", initialPosition=" + this.b + ")";
    }

    public /* synthetic */ ip2(List list, int i, int i2) {
        this(-1, (i & 1) != 0 ? hd5.a : list);
    }
}
