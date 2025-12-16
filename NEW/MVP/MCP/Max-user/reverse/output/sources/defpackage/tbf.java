package defpackage;

/* loaded from: classes2.dex */
public final class tbf {
    public final xy a;
    public final wib b;

    public tbf(xy xyVar, wib wibVar) {
        this.a = xyVar;
        this.b = wibVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbf)) {
            return false;
        }
        tbf tbfVar = (tbf) obj;
        return fni.a(this.a, tbfVar.a) && fni.a(this.b, tbfVar.b);
    }

    public final int hashCode() {
        xy xyVar = this.a;
        return this.b.hashCode() + ((xyVar == null ? 0 : xyVar.hashCode()) * 31);
    }

    public final String toString() {
        return "StartMessage(media=" + this.a + ", text=" + this.b + ")";
    }
}
