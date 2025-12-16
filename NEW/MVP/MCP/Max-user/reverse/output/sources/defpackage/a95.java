package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class a95 {
    public final xec a;
    public final List b;

    public a95(xec xecVar, List list) {
        this.a = xecVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a95)) {
            return false;
        }
        a95 a95Var = (a95) obj;
        return fni.a(this.a, a95Var.a) && fni.a(this.b, a95Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "State(appBarState=" + this.a + ", items=" + this.b + ")";
    }
}
