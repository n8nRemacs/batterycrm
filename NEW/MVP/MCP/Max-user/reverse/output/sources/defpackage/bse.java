package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class bse extends id0 {
    public final s5g b;
    public final List c;
    public final s5g d;

    public bse(n5g n5gVar, s5g s5gVar, List list) {
        super(21);
        this.b = s5gVar;
        this.c = list;
        this.d = n5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bse)) {
            return false;
        }
        bse bseVar = (bse) obj;
        return fni.a(this.b, bseVar.b) && fni.a(this.c, bseVar.c) && fni.a(this.d, bseVar.d);
    }

    public final int hashCode() {
        int iL = xrf.l(this.c, this.b.hashCode() * 31, 31);
        s5g s5gVar = this.d;
        return iL + (s5gVar == null ? 0 : s5gVar.hashCode());
    }

    public final String toString() {
        return "OpenConfirmationDialog(title=" + this.b + ", buttons=" + this.c + ", desc=" + this.d + ")";
    }
}
