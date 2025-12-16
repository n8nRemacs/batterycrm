package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class y08 {
    public final String a;
    public final List b;

    public y08(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y08)) {
            return false;
        }
        y08 y08Var = (y08) obj;
        return fni.a(this.a, y08Var.a) && fni.a(this.b, y08Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        List list = this.b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "LastInputText(text=" + this.a + ", messageElementsData=" + this.b + ")";
    }
}
