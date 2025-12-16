package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class y6e {
    public final List a;
    public final Object b;

    public y6e(List list, Object obj) {
        this.a = list;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6e)) {
            return false;
        }
        y6e y6eVar = (y6e) obj;
        return fni.a(this.a, y6eVar.a) && fni.a(this.b, y6eVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "SearchResultPage(items=" + this.a + ", marker=" + this.b + ")";
    }
}
