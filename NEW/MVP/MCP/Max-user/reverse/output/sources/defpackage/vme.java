package defpackage;

/* loaded from: classes2.dex */
public final class vme implements wme {
    public final r5g a;
    public final int b;

    public vme(r5g r5gVar, int i) {
        this.a = r5gVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vme)) {
            return false;
        }
        vme vmeVar = (vme) obj;
        return this.a.equals(vmeVar.a) && this.b == vmeVar.b;
    }

    public final int hashCode() {
        return az1.v(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Text(text=" + this.a + ", alignment=" + ctd.w(this.b) + ")";
    }
}
