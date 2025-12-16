package defpackage;

import android.graphics.Rect;

/* loaded from: classes2.dex */
public final class gd0 extends id0 {
    public final Rect b;
    public final long c;
    public final boolean d;

    public gd0(Rect rect, long j, boolean z) {
        super(0);
        this.b = rect;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd0)) {
            return false;
        }
        gd0 gd0Var = (gd0) obj;
        return fni.a(this.b, gd0Var.b) && this.c == gd0Var.c && this.d == gd0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + a9h.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        String strB = m26.b(this.c);
        StringBuilder sb = new StringBuilder("OnCropSuccess(croppedBounds=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(strB);
        sb.append(", imageOrientationChanged=");
        return az1.k(sb, this.d, ")");
    }
}
