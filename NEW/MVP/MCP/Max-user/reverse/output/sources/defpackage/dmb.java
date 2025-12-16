package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class dmb {
    public final String a;
    public final List b;
    public final Object c;
    public final Object d;

    public dmb(String str, List list, Object obj, Object obj2) {
        this.a = str;
        this.b = list;
        this.c = obj;
        this.d = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmb)) {
            return false;
        }
        dmb dmbVar = (dmb) obj;
        return fni.a(this.a, dmbVar.a) && fni.a(this.b, dmbVar.b) && fni.a(this.c, dmbVar.c) && fni.a(this.d, dmbVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iL = xrf.l(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        Object obj = this.c;
        int iHashCode = (iL + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.d;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "PagedSearchResult(query=" + this.a + ", items=" + this.b + ", resultsMarker=" + this.c + ", nextPageMarker=" + this.d + ")";
    }
}
