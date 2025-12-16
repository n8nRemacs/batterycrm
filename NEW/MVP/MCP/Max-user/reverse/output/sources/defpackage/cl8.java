package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class cl8 {
    public final List a;
    public final int b;

    public cl8(int i, List list) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl8)) {
            return false;
        }
        cl8 cl8Var = (cl8) obj;
        return fni.a(this.a, cl8Var.a) && this.b == cl8Var.b;
    }

    public final int hashCode() {
        return az1.v(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MIUIContextMenuViewState(items=");
        sb.append(this.a);
        sb.append(", menuState=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "SHOWED" : "SELECTION" : "HIDDEN");
        sb.append(")");
        return sb.toString();
    }
}
