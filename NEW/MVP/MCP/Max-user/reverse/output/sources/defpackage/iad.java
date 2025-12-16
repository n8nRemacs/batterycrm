package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class iad {
    public final String a;
    public final long b;
    public final List c;

    public iad(long j, String str, List list) {
        this.a = str;
        this.b = j;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iad)) {
            return false;
        }
        iad iadVar = (iad) obj;
        return fni.a(this.a, iadVar.a) && this.b == iadVar.b && fni.a(this.c, iadVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a9h.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = xrf.q("ReactionsSectionEntity(id=", this.b, this.a, ", updateTime=");
        sbQ.append(", reactions=");
        sbQ.append(this.c);
        sbQ.append(")");
        return sbQ.toString();
    }
}
