package defpackage;

/* loaded from: classes2.dex */
public final class vbe extends xbe {
    public final String b;
    public final long c;
    public final int d;

    public vbe(long j, String str, int i) {
        super(str);
        this.b = str;
        this.c = j;
        this.d = i;
    }

    @Override // defpackage.xbe
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbe)) {
            return false;
        }
        vbe vbeVar = (vbe) obj;
        return fni.a(this.b, vbeVar.b) && this.c == vbeVar.c && this.d == vbeVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + a9h.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = xrf.q("Neuro(uri=", this.c, this.b, ", photoId=");
        sbQ.append(", categoryId=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}
