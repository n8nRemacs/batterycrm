package defpackage;

import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class ih2 extends l0g {
    public final Object c;
    public final qb2 d;
    public final LinkedHashSet o;

    public ih2(List list, qb2 qb2Var, LinkedHashSet linkedHashSet) {
        this.c = list;
        this.d = qb2Var;
        this.o = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih2)) {
            return false;
        }
        ih2 ih2Var = (ih2) obj;
        return this.c.equals(ih2Var.c) && fni.a(this.d, ih2Var.d) && this.o.equals(ih2Var.o);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        qb2 qb2Var = this.d;
        return this.o.hashCode() + ((iHashCode + (qb2Var == null ? 0 : qb2Var.hashCode())) * 31);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    @Override // defpackage.pj0
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatHistory.Response(messages=");
        gf1 gf1Var = new gf1(10);
        ?? r2 = this.c;
        sb.append(ue3.N(r2, ",", "[", "]", gf1Var, 24));
        sb.append(", chat=");
        sb.append(this.d);
        if (r2.isEmpty()) {
            sb.append(", messageIds=");
            sb.append(this.o);
        }
        sb.append(")");
        return sb.toString();
    }
}
