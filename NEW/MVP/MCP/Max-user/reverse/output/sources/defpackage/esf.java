package defpackage;

import android.view.Surface;

/* loaded from: classes.dex */
public final class esf {
    public final Surface a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;

    public esf(Surface surface, int i, int i2, int i3, boolean z) {
        hsi.a("orientationDegrees must be 0, 90, 180, or 270", i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270);
        this.a = surface;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esf)) {
            return false;
        }
        esf esfVar = (esf) obj;
        return this.b == esfVar.b && this.c == esfVar.c && this.d == esfVar.d && this.e == esfVar.e && this.a.equals(esfVar.a);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + (this.e ? 1 : 0);
    }
}
