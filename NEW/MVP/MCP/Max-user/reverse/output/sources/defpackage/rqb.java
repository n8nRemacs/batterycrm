package defpackage;

/* loaded from: classes2.dex */
public final class rqb implements sqb {
    public final String a;
    public final long b;
    public final c9a c;

    public rqb(String str, long j, c9a c9aVar) {
        this.a = str;
        this.b = j;
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
        if (!(obj instanceof rqb)) {
            return false;
        }
        rqb rqbVar = (rqb) obj;
        return fni.a(this.a, rqbVar.a) && this.b == rqbVar.b && fni.a(this.c, rqbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a9h.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = xrf.q("StartMetric(traceId=", this.b, ceg.a(this.a), ", sliceTime=");
        sbQ.append(", localProperties=");
        sbQ.append(this.c);
        sbQ.append(")");
        return sbQ.toString();
    }
}
