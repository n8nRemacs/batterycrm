package defpackage;

/* loaded from: classes2.dex */
public final class vxe implements xxe {
    public final double a;
    public final double b;
    public final Float c;

    public vxe(double d, double d2, Float f) {
        this.a = d;
        this.b = d2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxe)) {
            return false;
        }
        vxe vxeVar = (vxe) obj;
        return Double.compare(this.a, vxeVar.a) == 0 && Double.compare(this.b, vxeVar.b) == 0 && fni.a(this.c, vxeVar.c);
    }

    public final int hashCode() {
        int iHashCode = (Double.hashCode(this.b) + (Double.hashCode(this.a) * 31)) * 31;
        Float f = this.c;
        return Boolean.hashCode(true) + ((iHashCode + (f == null ? 0 : f.hashCode())) * 31);
    }

    public final String toString() {
        return "MoveCamera(lat=" + this.a + ", lon=" + this.b + ", zoom=" + this.c + ", animate=true)";
    }
}
