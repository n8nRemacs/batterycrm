package defpackage;

/* loaded from: classes.dex */
public final class qy6 {
    public int a;
    public int b;
    public float c;
    public int d;
    public boolean e;
    public int f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy6)) {
            return false;
        }
        qy6 qy6Var = (qy6) obj;
        return this.a == qy6Var.a && this.b == qy6Var.b && Float.compare(this.c, qy6Var.c) == 0 && this.d == qy6Var.d && this.e == qy6Var.e && this.f == qy6Var.f;
    }

    public final int hashCode() {
        return az1.v(this.f) + a9h.b(xrf.k(this.d, hf3.b(xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31), 31), 31, this.e);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        float f = this.c;
        int i3 = this.d;
        boolean z = this.e;
        int i4 = this.f;
        StringBuilder sbK = wy1.k("PageState(pagesNumber=", i, ", selectedPageIndex=", i2, ", pageOffsetFraction=");
        sbK.append(f);
        sbK.append(", selectedBigDotIndex=");
        sbK.append(i3);
        sbK.append(", wasShiftedFromZeroToZero=");
        sbK.append(z);
        sbK.append(", dotsAnimationType=");
        sbK.append(i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "null" : "ALL_DOTS_TO_RIGHT" : "ALL_DOTS_TO_LEFT" : "BIG_DOTS_CHANGE" : "NONE");
        sbK.append(")");
        return sbK.toString();
    }
}
