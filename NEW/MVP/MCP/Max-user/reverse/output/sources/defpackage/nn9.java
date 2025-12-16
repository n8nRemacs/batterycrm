package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class nn9 {
    public final Set a;
    public final Long b;
    public final boolean c;

    public nn9(Set set, Long l, boolean z) {
        this.a = set;
        this.b = l;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn9)) {
            return false;
        }
        nn9 nn9Var = (nn9) obj;
        return fni.a(this.a, nn9Var.a) && fni.a(this.b, nn9Var.b) && this.c == nn9Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForwardIds(messageIds=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", isForwardAttach=");
        return az1.k(sb, this.c, ")");
    }
}
