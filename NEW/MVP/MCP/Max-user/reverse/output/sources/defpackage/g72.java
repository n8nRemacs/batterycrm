package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class g72 {
    public static final g72 c = new g72(ue3.h0(new ArrayList()), null);
    public final Set a;
    public final wyi b;

    public g72(Set set, wyi wyiVar) {
        this.a = set;
        this.b = wyiVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g72)) {
            return false;
        }
        g72 g72Var = (g72) obj;
        return fni.a(g72Var.a, this.a) && fni.a(g72Var.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        wyi wyiVar = this.b;
        return iHashCode + (wyiVar != null ? wyiVar.hashCode() : 0);
    }
}
