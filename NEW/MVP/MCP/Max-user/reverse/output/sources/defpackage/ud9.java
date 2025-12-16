package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ud9 {
    public final List a;
    public final ArrayList b;
    public final ArrayList c;
    public final boolean d;
    public final boolean e;

    public ud9(List list, ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2) {
        this.a = list;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud9)) {
            return false;
        }
        ud9 ud9Var = (ud9) obj;
        return this.a.equals(ud9Var.a) && this.b.equals(ud9Var.b) && this.c.equals(ud9Var.c) && this.d == ud9Var.d && this.e == ud9Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + a9h.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(items=");
        sb.append(this.a);
        sb.append(", topActions=");
        sb.append(this.b);
        sb.append(", bottomAction=");
        sb.append(this.c);
        sb.append(", isSearch=");
        sb.append(this.d);
        sb.append(", isLoading=");
        return az1.k(sb, this.e, ")");
    }
}
