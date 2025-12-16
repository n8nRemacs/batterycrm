package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ul9 implements Serializable {
    public final ArrayList a;
    public final int b;
    public final ql9 c;

    public ul9(ArrayList arrayList, int i, ql9 ql9Var) {
        this.a = arrayList;
        this.b = i;
        this.c = ql9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul9)) {
            return false;
        }
        ul9 ul9Var = (ul9) obj;
        return this.a.equals(ul9Var.a) && this.b == ul9Var.b && fni.a(this.c, ul9Var.c);
    }

    public final int hashCode() {
        int iK = xrf.k(this.b, this.a.hashCode() * 31, 31);
        ql9 ql9Var = this.c;
        return iK + (ql9Var == null ? 0 : ql9Var.hashCode());
    }

    public final String toString() {
        return "MessageReactionInfo(counters=" + this.a + ", totalCount=" + this.b + ", yourReaction=" + this.c + ")";
    }
}
