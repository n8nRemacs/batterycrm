package defpackage;

/* loaded from: classes2.dex */
public final class gnf {
    public final inf a;
    public final lnf b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public gnf(inf infVar, lnf lnfVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = infVar;
        this.b = lnfVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnf)) {
            return false;
        }
        gnf gnfVar = (gnf) obj;
        return this.a.equals(gnfVar.a) && this.b.equals(gnfVar.b) && this.c == gnfVar.c && this.d == gnfVar.d && this.e == gnfVar.e && this.f == gnfVar.f && this.g == gnfVar.g && this.h == gnfVar.h && this.i == gnfVar.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + xrf.k(this.h, xrf.k(this.g, xrf.k(this.f, xrf.k(this.e, xrf.k(this.d, xrf.k(this.c, xrf.k(1308622847, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StrokeColors(local=");
        sb.append(this.a);
        sb.append(", separator=");
        sb.append(this.b);
        sb.append(", contrastSecondaryStatic=1308622847, contrastStatic=");
        hf3.g(sb, this.c, ", negative=", this.d, ", positive=");
        hf3.g(sb, this.e, ", secondary=", this.f, ", tertiary=");
        hf3.g(sb, this.g, ", themed=", this.h, ", transparent=");
        return ho7.j(sb, this.i, ")");
    }
}
