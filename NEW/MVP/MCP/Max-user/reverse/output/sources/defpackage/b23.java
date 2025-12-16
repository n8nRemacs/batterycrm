package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b23 implements c23 {
    public final Set a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final Map e;
    public final gf1 f;
    public final o00 g;

    public b23(Set set, Set set2, Set set3, Set set4, Map map) {
        gf1 gf1Var = kc3.u0;
        o00 o00Var = ve2.I;
        this.a = set;
        this.b = set2;
        this.c = set3;
        this.d = set4;
        this.e = map;
        this.f = gf1Var;
        this.g = o00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b23)) {
            return false;
        }
        b23 b23Var = (b23) obj;
        return fni.a(this.a, b23Var.a) && fni.a(this.b, b23Var.b) && fni.a(this.c, b23Var.c) && fni.a(this.d, b23Var.d) && fni.a(this.e, b23Var.e) && fni.a(this.f, b23Var.f) && fni.a(this.g, b23Var.g);
    }

    @Override // defpackage.c23
    public final Comparator getComparator() {
        return this.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Filter(includedChats=" + this.a + ", includedFilters=" + this.b + ", excludedChats=" + this.c + ", excludedFilters=" + this.d + ", subjects=" + this.e + ", filterPredicate=" + this.f + ", comparator=" + this.g + ")";
    }
}
