package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class u27 {
    public final long a;
    public final long b;
    public final long c;
    public final List d;

    public u27(long j, long j2, long j3, List list) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u27)) {
            return false;
        }
        u27 u27Var = (u27) obj;
        return this.a == u27Var.a && this.b == u27Var.b && this.c == u27Var.c && fni.a(this.d, u27Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a9h.a(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "HighlightMessage(ts=", ", localId=");
        sbL.append(this.b);
        az1.r(this.c, ", serverId=", ", highlight=", sbL);
        return az1.j(sbL, this.d, ")");
    }
}
