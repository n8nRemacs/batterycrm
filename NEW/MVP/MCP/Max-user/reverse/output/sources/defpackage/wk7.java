package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class wk7 {
    public final Uri a;

    public wk7(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wk7) && fni.a(this.a, ((wk7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenLink(url=" + this.a + ")";
    }
}
