package defpackage;

/* loaded from: classes2.dex */
public final class oqb implements sqb {
    public final String a;
    public final lqb b;
    public final c9a c;

    public oqb(String str, lqb lqbVar, c9a c9aVar) {
        this.a = str;
        this.b = lqbVar;
        this.c = c9aVar;
    }

    @Override // defpackage.sqb
    public final String a() {
        return this.a;
    }

    @Override // defpackage.sqb
    public final c9a b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqb)) {
            return false;
        }
        oqb oqbVar = (oqb) obj;
        return fni.a(this.a, oqbVar.a) && fni.a(this.b, oqbVar.b) && fni.a(this.c, oqbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FailMetric(traceId=" + ceg.a(this.a) + ", errorType=" + this.b + ", localProperties=" + this.c + ")";
    }
}
