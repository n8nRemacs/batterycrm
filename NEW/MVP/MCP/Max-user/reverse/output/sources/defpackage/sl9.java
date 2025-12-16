package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class sl9 implements Serializable {
    public final long a;
    public final ql9 b;

    public sl9(long j, ql9 ql9Var) {
        this.a = j;
        this.b = ql9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl9)) {
            return false;
        }
        sl9 sl9Var = (sl9) obj;
        return this.a == sl9Var.a && fni.a(this.b, sl9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MessageReactionEntry(userId=" + this.a + ", reaction=" + this.b + ")";
    }
}
