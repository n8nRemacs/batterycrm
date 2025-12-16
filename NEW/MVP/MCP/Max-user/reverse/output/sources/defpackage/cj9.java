package defpackage;

import java.util.EnumSet;
import java.util.Map;

/* loaded from: classes2.dex */
public final class cj9 {
    public static final EnumSet g = EnumSet.of(bj9.c, bj9.d, bj9.o, bj9.X, bj9.Y, bj9.s0, bj9.t0, bj9.Z, bj9.v0);
    public final long a;
    public final String b;
    public final bj9 c;
    public final int d;
    public final int e;
    public final Map f;

    public cj9(long j, String str, bj9 bj9Var, int i, int i2, Map map) {
        this.a = j;
        this.b = str;
        this.c = bj9Var;
        this.d = i;
        this.e = i2;
        this.f = map;
    }

    public static cj9 a(cj9 cj9Var, int i, int i2, int i3) {
        long j = cj9Var.a;
        String str = cj9Var.b;
        bj9 bj9Var = cj9Var.c;
        if ((i3 & 8) != 0) {
            i = cj9Var.d;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = cj9Var.e;
        }
        Map map = cj9Var.f;
        cj9Var.getClass();
        return new cj9(j, str, bj9Var, i4, i2, map);
    }

    public final cj9 b() {
        if (this.e <= 0 || this.d < 0) {
            return null;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj9)) {
            return false;
        }
        cj9 cj9Var = (cj9) obj;
        return this.a == cj9Var.a && fni.a(this.b, cj9Var.b) && this.c == cj9Var.c && this.d == cj9Var.d && this.e == cj9Var.e && fni.a(this.f, cj9Var.f);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iK = xrf.k(this.e, xrf.k(this.d, (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31);
        Map map = this.f;
        return iK + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("MessageElementData(entityId=", this.a, ", entityName=", this.b);
        sbN.append(", type=");
        sbN.append(this.c);
        sbN.append(", from=");
        sbN.append(this.d);
        sbN.append(", length=");
        sbN.append(this.e);
        sbN.append(", attributes=");
        sbN.append(this.f);
        sbN.append(")");
        return sbN.toString();
    }
}
