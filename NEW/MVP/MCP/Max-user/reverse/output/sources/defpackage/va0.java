package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class va0 {
    public final Uri a;

    public va0(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null outputUri");
        }
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof va0) {
            return this.a.equals(((va0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "OutputResults{outputUri=" + this.a + "}";
    }
}
