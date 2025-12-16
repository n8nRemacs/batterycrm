package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class zcc extends ddc {
    public final n5g b;
    public final n5g c;
    public final List d;

    public zcc(n5g n5gVar, n5g n5gVar2, List list) {
        this.b = n5gVar;
        this.c = n5gVar2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcc)) {
            return false;
        }
        zcc zccVar = (zcc) obj;
        return this.b.equals(zccVar.b) && this.c.equals(zccVar.c) && this.d.equals(zccVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xrf.k(this.c.c, Integer.hashCode(this.b.c) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowConfirmation(title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", buttons=");
        return az1.j(sb, this.d, ")");
    }
}
