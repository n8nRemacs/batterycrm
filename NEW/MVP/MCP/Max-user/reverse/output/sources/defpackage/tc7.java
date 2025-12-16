package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class tc7 {
    public static final tc7 d;
    public final List a;
    public final List b;
    public final List c;

    static {
        hd5 hd5Var = hd5.a;
        d = new tc7(hd5Var, hd5Var, hd5Var);
    }

    public tc7(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc7)) {
            return false;
        }
        tc7 tc7Var = (tc7) obj;
        return fni.a(this.a, tc7Var.a) && fni.a(this.b, tc7Var.b) && fni.a(this.c, tc7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xrf.l(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        if (this == d) {
            return tc7.class.getSimpleName().concat(".INITIAL");
        }
        StringBuilder sb = new StringBuilder("IdleSearchData(recentContacts=");
        sb.append(ue3.N(this.a, ",", "[", "]", new d73(25), 24));
        sb.append(", recentSearch=");
        sb.append(ue3.N(this.b, ",", "[", "]", new d73(26), 24));
        sb.append(", allContacts=");
        return ho7.l(sb, ue3.N(this.c, ",", "[", "]", new d73(27), 24), ")");
    }
}
