package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class t05 implements u05 {
    public final Uri a;
    public final o05 b;

    public t05(Uri uri, o05 o05Var) {
        this.a = uri;
        this.b = o05Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t05)) {
            return false;
        }
        t05 t05Var = (t05) obj;
        return fni.a(this.a, t05Var.a) && this.b == t05Var.b;
    }

    public final int hashCode() {
        Uri uri = this.a;
        return this.b.hashCode() + ((uri == null ? 0 : uri.hashCode()) * 31);
    }

    public final String toString() {
        return "DownloadMediaCompleted(uri=" + this.a + ", cause=" + this.b + ")";
    }
}
