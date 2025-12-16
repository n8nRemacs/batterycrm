package defpackage;

/* loaded from: classes2.dex */
public final class tgc {
    public final n5g a;
    public final int b;
    public final i62 c;

    public tgc(n5g n5gVar, int i, i62 i62Var) {
        this.a = n5gVar;
        this.b = i;
        this.c = i62Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgc)) {
            return false;
        }
        tgc tgcVar = (tgc) obj;
        return this.a.equals(tgcVar.a) && this.b == tgcVar.b && this.c.equals(tgcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xrf.k(this.b, Integer.hashCode(this.a.c) * 31, 31);
    }

    public final String toString() {
        return "ShowCancellableSnackbar(title=" + this.a + ", bottomMargin=" + this.b + ", cancelAction=" + this.c + ")";
    }
}
