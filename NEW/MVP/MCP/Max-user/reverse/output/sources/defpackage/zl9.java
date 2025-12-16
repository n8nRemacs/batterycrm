package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class zl9 {
    public final Object a;
    public final xl9 b;
    public final tl9 c;
    public final long d;

    public zl9(List list, xl9 xl9Var, tl9 tl9Var, long j) {
        this.a = list;
        this.b = xl9Var;
        this.c = tl9Var;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl9)) {
            return false;
        }
        zl9 zl9Var = (zl9) obj;
        return this.a.equals(zl9Var.a) && fni.a(this.b, zl9Var.b) && fni.a(this.c, zl9Var.c) && this.d == zl9Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xl9 xl9Var = this.b;
        int iHashCode2 = (iHashCode + (xl9Var == null ? 0 : xl9Var.hashCode())) * 31;
        tl9 tl9Var = this.c;
        return Long.hashCode(this.d) + ((iHashCode2 + (tl9Var != null ? tl9Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MessageReactionsDetailedData(reactionEntries=" + this.a + ", reactionsInfo=" + this.b + ", yourReactionEntry=" + this.c + ", markerForNextQuery=" + this.d + ")";
    }
}
