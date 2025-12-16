package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class h82 {
    public final v82 a;
    public final List b;

    public h82(v82 v82Var, List list) {
        this.a = v82Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h82)) {
            return false;
        }
        h82 h82Var = (h82) obj;
        return fni.a(this.a, h82Var.a) && fni.a(this.b, h82Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "State(screenState=" + this.a + ", items=" + this.b + ")";
    }
}
