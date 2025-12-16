package defpackage;

/* loaded from: classes.dex */
public final class naf {
    public final maf a;
    public final boolean b;
    public final boolean c;
    public final cm6 d;

    public naf(maf mafVar, boolean z, boolean z2, cm6 cm6Var) {
        this.a = mafVar;
        this.b = z;
        this.c = z2;
        this.d = cm6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof naf)) {
            return false;
        }
        naf nafVar = (naf) obj;
        return fni.a(this.a, nafVar.a) && this.b == nafVar.b && this.c == nafVar.c && fni.a(this.d, nafVar.d);
    }

    public final int hashCode() {
        int iB = a9h.b(a9h.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        cm6 cm6Var = this.d;
        return iB + (cm6Var == null ? 0 : cm6Var.hashCode());
    }

    public final String toString() {
        return "StartCallParams(type=" + this.a + ", isVideo=" + this.b + ", isAudio=" + this.c + ", callbackPrepare=" + this.d + ")";
    }
}
