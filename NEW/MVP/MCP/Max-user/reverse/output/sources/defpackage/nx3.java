package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class nx3 {
    public static final nx3 d = new nx3(null, null, null);
    public final List a;
    public final List b;
    public final List c;

    public nx3(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    public static nx3 a(nx3 nx3Var, ArrayList arrayList, int i) {
        ArrayList arrayList2 = arrayList;
        if ((i & 1) != 0) {
            arrayList2 = nx3Var.a;
        }
        List list = nx3Var.b;
        List list2 = (i & 4) != 0 ? nx3Var.c : null;
        nx3Var.getClass();
        return new nx3(arrayList2, list, list2);
    }

    public final boolean b() {
        List list = this.a;
        if (list != null && !list.isEmpty()) {
            return false;
        }
        List list2 = this.b;
        if (list2 != null && !list2.isEmpty()) {
            return false;
        }
        List list3 = this.c;
        return list3 == null || list3.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx3)) {
            return false;
        }
        nx3 nx3Var = (nx3) obj;
        return fni.a(this.a, nx3Var.a) && fni.a(this.b, nx3Var.b) && fni.a(this.c, nx3Var.c);
    }

    public final int hashCode() {
        List list = this.a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactList(contacts=");
        sb.append(this.a);
        sb.append(", globalContacts=");
        sb.append(this.b);
        sb.append(", phonebook=");
        return az1.j(sb, this.c, ")");
    }
}
