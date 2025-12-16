package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ic9 {
    public final List a;
    public final List b;

    public ic9(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic9)) {
            return false;
        }
        ic9 ic9Var = (ic9) obj;
        return fni.a(this.a, ic9Var.a) && fni.a(this.b, ic9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MemberListActionsWrapper(topActions=" + this.a + ", bottomActions=" + this.b + ")";
    }
}
