package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class m9h extends n9h {
    public final g2h a;
    public final boolean b;
    public final Bitmap c;

    public m9h(g2h g2hVar, boolean z, Bitmap bitmap) {
        this.a = g2hVar;
        this.b = z;
        this.c = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9h)) {
            return false;
        }
        m9h m9hVar = (m9h) obj;
        return fni.a(this.a, m9hVar.a) && this.b == m9hVar.b && fni.a(this.c, m9hVar.c);
    }

    public final int hashCode() {
        g2h g2hVar = this.a;
        int iB = a9h.b((g2hVar == null ? 0 : g2hVar.hashCode()) * 31, 31, this.b);
        Bitmap bitmap = this.c;
        return iB + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public final String toString() {
        return "Pause(videoContent=" + this.a + ", isFirstFrameRendered=" + this.b + ", timelinePreview=" + this.c + ")";
    }
}
