package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class ecc implements hcc {
    public final Uri a;

    public ecc(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ecc) && this.a.equals(((ecc) obj).a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1911932022;
    }

    public final String toString() {
        return "ShareMedia(localUrl=" + this.a + ", mimetype=image/*)";
    }
}
