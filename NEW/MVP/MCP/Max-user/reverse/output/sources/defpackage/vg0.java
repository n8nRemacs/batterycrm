package defpackage;

import android.graphics.drawable.GradientDrawable;

/* loaded from: classes2.dex */
public final class vg0 {
    public final GradientDrawable a;
    public final int b;
    public final float c;

    public vg0(GradientDrawable gradientDrawable, int i, int i2) {
        float f = (i2 & 8) != 0 ? 12.0f : 10.0f;
        this.a = gradientDrawable;
        this.b = i;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg0)) {
            return false;
        }
        vg0 vg0Var = (vg0) obj;
        return this.a.equals(vg0Var.a) && this.b == vg0Var.b && Float.compare(this.c, vg0Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + xrf.k(20, xrf.k(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Style(backgroundDrawable=" + this.a + ", width=" + this.b + ", height=20, textSize=" + this.c + ")";
    }
}
