package defpackage;

/* loaded from: classes.dex */
public final class hgd {
    public final long a;
    public final n5g b;
    public final iza c;

    public hgd(long j, n5g n5gVar, iza izaVar) {
        this.a = j;
        this.b = n5gVar;
        this.c = izaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgd)) {
            return false;
        }
        hgd hgdVar = (hgd) obj;
        return this.a == hgdVar.a && this.b.equals(hgdVar.b) && this.c == hgdVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + xrf.k(this.b.c, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "ButtonState(id=" + this.a + ", textSource=" + this.b + ", mode=" + this.c + ")";
    }
}
