package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class km2 extends id0 {
    public final yb9 b;
    public final s5g c;
    public final s5g d;
    public final List e;

    public km2(yb9 yb9Var, s5g s5gVar, s5g s5gVar2, List list) {
        super(4);
        this.b = yb9Var;
        this.c = s5gVar;
        this.d = s5gVar2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2)) {
            return false;
        }
        km2 km2Var = (km2) obj;
        return fni.a(this.b, km2Var.b) && fni.a(this.c, km2Var.c) && fni.a(this.d, km2Var.d) && fni.a(this.e, km2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xc0.d(xc0.d(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "ShowConfirmationBottomSheet(model=" + this.b + ", title=" + this.c + ", description=" + this.d + ", actions=" + this.e + ")";
    }
}
