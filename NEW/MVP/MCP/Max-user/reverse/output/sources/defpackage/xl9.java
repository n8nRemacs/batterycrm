package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class xl9 {
    public final List a;
    public final int b;
    public final f9d c;

    public xl9(List list, int i, f9d f9dVar) {
        this.a = list;
        this.b = i;
        this.c = f9dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl9)) {
            return false;
        }
        xl9 xl9Var = (xl9) obj;
        return fni.a(this.a, xl9Var.a) && this.b == xl9Var.b && fni.a(this.c, xl9Var.c);
    }

    public final int hashCode() {
        int iK = xrf.k(this.b, this.a.hashCode() * 31, 31);
        f9d f9dVar = this.c;
        return iK + (f9dVar == null ? 0 : f9dVar.hashCode());
    }

    public final String toString() {
        return "MessageReactionsData(reactions=" + this.a + ", totalCount=" + this.b + ", yourReaction=" + this.c + ")";
    }
}
