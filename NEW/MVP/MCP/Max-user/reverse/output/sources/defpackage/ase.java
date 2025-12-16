package defpackage;

/* loaded from: classes2.dex */
public final class ase {
    public final int a;
    public final n5g b;
    public final boolean c;

    public ase(int i, n5g n5gVar, boolean z) {
        this.a = i;
        this.b = n5gVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ase)) {
            return false;
        }
        ase aseVar = (ase) obj;
        return this.a == aseVar.a && fni.a(this.b, aseVar.b) && this.c == aseVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xrf.k(this.b.c, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", isNegative=");
        return az1.k(sb, this.c, ")");
    }
}
