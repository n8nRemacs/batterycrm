package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class on9 {
    public final Set a;
    public final Long b;
    public final boolean c;
    public final qn9 d;
    public final sn9 e;

    public on9(Set set, Long l, boolean z, qn9 qn9Var, sn9 sn9Var) {
        this.a = set;
        this.b = l;
        this.c = z;
        this.d = qn9Var;
        this.e = sn9Var;
    }

    public final vf6 a() {
        qn9 qn9Var = this.d;
        return new vf6(this.a, this.b, this.c, qn9Var != null ? qn9Var.a : null, this.e.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on9)) {
            return false;
        }
        on9 on9Var = (on9) obj;
        return fni.a(this.a, on9Var.a) && fni.a(this.b, on9Var.b) && this.c == on9Var.c && fni.a(this.d, on9Var.d) && fni.a(this.e, on9Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int iB = a9h.b((iHashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c);
        qn9 qn9Var = this.d;
        return this.e.hashCode() + ((iB + (qn9Var != null ? qn9Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ForwardMessagesData(messageIds=" + this.a + ", fwdAttachId=" + this.b + ", isForwardAttach=" + this.c + ", inputData=" + this.d + ", quoteData=" + this.e + ")";
    }
}
