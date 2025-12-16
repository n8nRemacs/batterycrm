package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class tlh implements vlh {
    public final n5g a;
    public final s5g b;
    public final List c;

    public tlh(n5g n5gVar, s5g s5gVar, List list) {
        int i = yud.a;
        this.a = n5gVar;
        this.b = s5gVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlh)) {
            return false;
        }
        tlh tlhVar = (tlh) obj;
        int i = yud.a;
        tlhVar.getClass();
        return this.a.equals(tlhVar.a) && this.b.equals(tlhVar.b) && this.c.equals(tlhVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xc0.d(xrf.k(this.a.c, Integer.hashCode(yud.B) * 31, 31), 31, this.b);
    }

    public final String toString() {
        return "RequestBiometryAccess(icon=" + yud.B + ", title=" + this.a + ", description=" + this.b + ", buttons=" + this.c + ")";
    }
}
