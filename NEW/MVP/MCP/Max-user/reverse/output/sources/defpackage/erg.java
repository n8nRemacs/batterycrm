package defpackage;

/* loaded from: classes.dex */
public final class erg implements frg {
    public final s5g a;
    public final int b;
    public final bdb c;

    public erg(s5g s5gVar, int i, bdb bdbVar) {
        this.a = s5gVar;
        this.b = i;
        this.c = bdbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erg)) {
            return false;
        }
        erg ergVar = (erg) obj;
        return fni.a(this.a, ergVar.a) && this.b == ergVar.b && this.c == ergVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + xrf.k(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.a + ", icon=" + this.b + ", style=" + this.c + ")";
    }
}
