package defpackage;

/* loaded from: classes2.dex */
public final class qqb implements sqb {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final boolean e;
    public final c9a f;

    public qqb(String str, String str2, int i, long j, boolean z, c9a c9aVar) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = z;
        this.f = c9aVar;
    }

    @Override // defpackage.sqb
    public final String a() {
        return this.a;
    }

    @Override // defpackage.sqb
    public final c9a b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqb)) {
            return false;
        }
        qqb qqbVar = (qqb) obj;
        return fni.a(this.a, qqbVar.a) && fni.a(this.b, qqbVar.b) && this.c == qqbVar.c && this.d == qqbVar.d && this.e == qqbVar.e && fni.a(this.f, qqbVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + a9h.b(a9h.a(xrf.k(this.c, u45.e(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("Span(traceId=", ceg.a(this.a), ", name=", this.b, ", order=");
        sbL.append(this.c);
        sbL.append(", sliceTime=");
        sbL.append(this.d);
        sbL.append(", isFinal=");
        sbL.append(this.e);
        sbL.append(", localProperties=");
        sbL.append(this.f);
        sbL.append(")");
        return sbL.toString();
    }
}
