package defpackage;

/* loaded from: classes2.dex */
public final class vo6 {
    public final uo6 a;
    public int b;
    public boolean c;
    public final boolean d;

    public vo6(uo6 uo6Var, int i, boolean z, boolean z2) {
        this.a = uo6Var;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public static vo6 a(vo6 vo6Var, int i, int i2) {
        uo6 uo6Var = vo6Var.a;
        boolean z = (i2 & 4) != 0 ? vo6Var.c : true;
        boolean z2 = vo6Var.d;
        vo6Var.getClass();
        return new vo6(uo6Var, i, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo6)) {
            return false;
        }
        vo6 vo6Var = (vo6) obj;
        return fni.a(this.a, vo6Var.a) && this.b == vo6Var.b && this.c == vo6Var.c && this.d == vo6Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + a9h.b(xrf.k(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "GalleryAlbum(type=" + this.a + ", totalCount=" + this.b + ", isLoaded=" + this.c + ", hasImages=" + this.d + ")";
    }
}
