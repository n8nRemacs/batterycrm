package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class za9 {
    public final Uri a;

    public za9(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof za9) && fni.a(this.a, ((za9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SendFile(uri=" + this.a + ")";
    }
}
