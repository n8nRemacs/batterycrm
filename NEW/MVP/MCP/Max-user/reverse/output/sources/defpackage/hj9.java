package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class hj9 implements oj9 {
    public final Set a;
    public final boolean b;

    public hj9(Set set, boolean z) {
        this.a = set;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj9)) {
            return false;
        }
        hj9 hj9Var = (hj9) obj;
        return this.a.equals(hj9Var.a) && this.b == hj9Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Add(messageIds=" + this.a + ", isSelf=" + this.b + ")";
    }
}
