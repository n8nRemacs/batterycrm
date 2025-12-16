package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class xac {
    public final long a;
    public final Object b;
    public final Object c;
    public final ku3 d;

    public xac(long j, Map map, List list, ku3 ku3Var) {
        this.a = j;
        this.b = map;
        this.c = list;
        this.d = ku3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xac)) {
            return false;
        }
        xac xacVar = (xac) obj;
        return this.a == xacVar.a && this.b.equals(xacVar.b) && this.c.equals(xacVar.c) && this.d.equals(xacVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Profile(serverId=" + this.a + ", restrictions=" + this.b + ", profileOptions=" + this.c + ", contact=" + this.d + ")";
    }
}
