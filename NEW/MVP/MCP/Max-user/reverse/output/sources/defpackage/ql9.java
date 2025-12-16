package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class ql9 implements Serializable {
    public final vl9 a;
    public final String b;

    public ql9(vl9 vl9Var, String str) {
        this.a = vl9Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql9)) {
            return false;
        }
        ql9 ql9Var = (ql9) obj;
        return this.a == ql9Var.a && fni.a(this.b, ql9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MessageReaction(reactionType=" + this.a + ", id=" + this.b + ")";
    }
}
