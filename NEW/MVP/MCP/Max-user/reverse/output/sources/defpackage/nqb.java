package defpackage;

/* loaded from: classes2.dex */
public final class nqb implements sqb {
    public final String a;
    public final c9a b;

    public nqb(String str, c9a c9aVar) {
        this.a = str;
        this.b = c9aVar;
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
        if (!(obj instanceof nqb)) {
            return false;
        }
        nqb nqbVar = (nqb) obj;
        return fni.a(this.a, nqbVar.a) && fni.a(this.b, nqbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CancelMetric(traceId=" + ceg.a(this.a) + ", localProperties=" + this.b + ")";
    }
}
