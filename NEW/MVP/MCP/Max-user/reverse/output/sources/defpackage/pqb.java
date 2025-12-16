package defpackage;

/* loaded from: classes2.dex */
public final class pqb implements sqb {
    public final String a;
    public final c9a b;
    public final w8a c;

    public pqb(String str, c9a c9aVar, w8a w8aVar) {
        this.a = str;
        this.b = c9aVar;
        this.c = w8aVar;
    }

    @Override // defpackage.sqb
    public final String a() {
        return this.a;
    }

    @Override // defpackage.sqb
    public final c9a b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqb)) {
            return false;
        }
        pqb pqbVar = (pqb) obj;
        return this.a.equals(pqbVar.a) && this.b.equals(pqbVar.b) && this.c.equals(pqbVar.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.c.hashCode() + xrf.k(1, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "PrecomputedSpans(traceId=" + ceg.a(this.a) + ", localProperties=" + this.b + ", orderOfFirstSpan=1, spans=" + this.c + ", isLastSpanFinal=false)";
    }
}
