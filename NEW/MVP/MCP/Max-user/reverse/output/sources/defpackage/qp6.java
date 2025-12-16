package defpackage;

/* loaded from: classes2.dex */
public final class qp6 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final ynd f;
    public final ynd g;

    public qp6(int i, int i2, int i3, int i4, int i5, ynd yndVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = yndVar;
        this.g = i5 <= 0 ? null : new ynd(i5, i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp6)) {
            return false;
        }
        qp6 qp6Var = (qp6) obj;
        return this.a == qp6Var.a && this.b == qp6Var.b && this.c == qp6Var.c && this.d == qp6Var.d && this.e == qp6Var.e && fni.a(this.f, qp6Var.f);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f.hashCode() + xrf.k(this.e, xrf.k(this.d, xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("GalleryUiOptions(cellSize=", this.a, ", threshold=", this.b, ", spanCount=");
        hf3.g(sbK, this.c, ", spanSpacing=", this.d, ", thumbnailSize=");
        sbK.append(this.e);
        sbK.append(", albumsCoverResizeOptions=");
        sbK.append(this.f);
        sbK.append(", isItemAnimatorEnabled=false)");
        return sbK.toString();
    }
}
