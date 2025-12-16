package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class rl9 implements Serializable {
    public final ql9 a;
    public final int b;

    public rl9(ql9 ql9Var, int i) {
        this.a = ql9Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl9)) {
            return false;
        }
        rl9 rl9Var = (rl9) obj;
        return fni.a(this.a, rl9Var.a) && this.b == rl9Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MessageReactionCounter(reaction=" + this.a + ", count=" + this.b + ")";
    }
}
