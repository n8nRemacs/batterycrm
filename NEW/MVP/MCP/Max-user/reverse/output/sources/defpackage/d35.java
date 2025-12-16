package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class d35 {
    public final Map a;
    public final Map b;

    public d35(Map map, Map map2) {
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d35)) {
            return false;
        }
        d35 d35Var = (d35) obj;
        return fni.a(this.a, d35Var.a) && fni.a(this.b, d35Var.b);
    }

    public final int hashCode() {
        Map map = this.a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map map2 = this.b;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        return "DraftUpdates(discarded=" + this.a + ", saved=" + this.b + ")";
    }
}
