package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class guh implements avh {
    public final Uri a;

    public guh(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof guh) && fni.a(this.a, ((guh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InternalNavigation(uri=" + this.a + ")";
    }
}
