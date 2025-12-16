package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class ibc implements jbc {
    public final Uri a;

    public ibc(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ibc) && fni.a(this.a, ((ibc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShareImage(uri=" + this.a + ")";
    }
}
