package defpackage;

/* loaded from: classes2.dex */
public final class hme extends id0 {
    public final n5g b;
    public final Integer c;

    public hme(n5g n5gVar, Integer num) {
        super(17);
        this.b = n5gVar;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hme)) {
            return false;
        }
        hme hmeVar = (hme) obj;
        return this.b.equals(hmeVar.b) && this.c.equals(hmeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b.c) * 31);
    }

    public final String toString() {
        return "ShowSnackbar(message=" + this.b + ", iconRes=" + this.c + ")";
    }
}
