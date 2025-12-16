package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class xqc {
    public final Uri a;
    public final Bitmap b;

    public xqc(Uri uri, Bitmap bitmap) {
        this.a = uri;
        this.b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqc)) {
            return false;
        }
        xqc xqcVar = (xqc) obj;
        return fni.a(this.a, xqcVar.a) && fni.a(this.b, xqcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "QrCode(uri=" + this.a + ", bitmap=" + this.b + ")";
    }
}
