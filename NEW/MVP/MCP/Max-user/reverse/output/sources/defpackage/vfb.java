package defpackage;

/* loaded from: classes2.dex */
public final class vfb {
    public final int a;
    public final int b;
    public final int c;

    public vfb(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfb)) {
            return false;
        }
        vfb vfbVar = (vfb) obj;
        return this.a == vfbVar.a && this.b == vfbVar.b && this.c == vfbVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return ho7.j(wy1.k("MenuItem(id=", this.a, ", titleRes=", this.b, ", iconRes="), this.c, ", isDisabled=false)");
    }
}
