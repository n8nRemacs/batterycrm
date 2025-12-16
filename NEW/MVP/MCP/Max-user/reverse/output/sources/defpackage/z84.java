package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class z84 {
    public final List a;
    public final List b;

    public z84(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z84.class == obj.getClass()) {
            z84 z84Var = (z84) obj;
            List list = z84Var.b;
            List list2 = z84Var.a;
            List list3 = this.a;
            if (list3 == null ? list2 != null : !list3.equals(list2)) {
                return false;
            }
            List list4 = this.b;
            if (list4 != null) {
                return list4.equals(list);
            }
            if (list == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        List list2 = this.b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "CountryCodeProxiesEntry{countries=" + this.a + ", connectionHosts=" + this.b + '}';
    }
}
