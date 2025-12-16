package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class xt8 implements au8 {
    public final Uri a;

    public xt8(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xt8) && fni.a(this.a, ((xt8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SendFile(uri=" + this.a + ")";
    }
}
