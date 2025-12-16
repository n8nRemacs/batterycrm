package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class b39 {
    public final String a;
    public final RectF b;
    public final Rect c;

    public b39(String str, RectF rectF, Rect rect) {
        this.a = str;
        this.b = rectF;
        this.c = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b39)) {
            return false;
        }
        b39 b39Var = (b39) obj;
        return fni.a(this.a, b39Var.a) && fni.a(this.b, b39Var.b) && fni.a(this.c, b39Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "OnCropSuccess(path=" + this.a + ", relativeCrop=" + this.b + ", absoluteCrop=" + this.c + ")";
    }
}
