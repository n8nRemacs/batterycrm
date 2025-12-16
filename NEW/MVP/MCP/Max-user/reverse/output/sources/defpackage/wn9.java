package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class wn9 implements zn9 {
    public final Uri a;

    public wn9(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wn9) && fni.a(this.a, ((wn9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SendImage(mediaUri=" + this.a + ")";
    }
}
