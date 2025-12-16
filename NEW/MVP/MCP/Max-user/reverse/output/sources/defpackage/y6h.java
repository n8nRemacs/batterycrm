package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class y6h {
    public final Uri a;
    public boolean b;

    public y6h(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6h)) {
            return false;
        }
        y6h y6hVar = (y6h) obj;
        return fni.a(this.a, y6hVar.a) && this.b == y6hVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PendingFragment(uri=" + this.a + ", finalized=" + this.b + ")";
    }
}
