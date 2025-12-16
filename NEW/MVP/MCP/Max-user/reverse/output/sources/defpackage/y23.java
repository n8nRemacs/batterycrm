package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class y23 {
    public static final y23 g = new y23(x23.c, "", tc7.d, hd5.a, true, false);
    public final x23 a;
    public final String b;
    public final tc7 c;
    public final List d;
    public final boolean e;
    public final boolean f;

    public y23(x23 x23Var, String str, tc7 tc7Var, List list, boolean z, boolean z2) {
        this.a = x23Var;
        this.b = str;
        this.c = tc7Var;
        this.d = list;
        this.e = z;
        this.f = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    public static y23 a(y23 y23Var, x23 x23Var, tc7 tc7Var, ArrayList arrayList, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            x23Var = y23Var.a;
        }
        x23 x23Var2 = x23Var;
        String str = y23Var.b;
        if ((i & 4) != 0) {
            tc7Var = y23Var.c;
        }
        tc7 tc7Var2 = tc7Var;
        ArrayList arrayList2 = arrayList;
        if ((i & 8) != 0) {
            arrayList2 = y23Var.d;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i & 16) != 0) {
            z = y23Var.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = y23Var.f;
        }
        y23Var.getClass();
        return new y23(x23Var2, str, tc7Var2, arrayList3, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y23)) {
            return false;
        }
        y23 y23Var = (y23) obj;
        return this.a == y23Var.a && fni.a(this.b, y23Var.b) && fni.a(this.c, y23Var.c) && fni.a(this.d, y23Var.d) && this.e == y23Var.e && this.f == y23Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + a9h.b(xrf.l(this.d, (this.c.hashCode() + u45.e(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31, this.e);
    }

    public final String toString() {
        if (this == g) {
            return y23.class.getSimpleName().concat(".INITIAL");
        }
        StringBuilder sb = new StringBuilder("ChatsListSearchState(type=");
        sb.append(this.a);
        sb.append(", searchQuery='");
        sb.append(uog.h(this.b));
        sb.append("', idleSearchData=");
        sb.append(this.c);
        sb.append(", searchResult=");
        sb.append(ue3.N(this.d, ",", "[", "]", new gf1(26), 24));
        sb.append(", scrollToTop=");
        sb.append(this.e);
        sb.append(", hasMoreMessages=");
        return az1.k(sb, this.f, ")");
    }
}
