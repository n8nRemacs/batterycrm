package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class oib extends id0 {
    public final Uri b;

    public oib(Uri uri) {
        super(13);
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oib) && fni.a(this.b, ((oib) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OpenExternalLink(url=" + this.b + ")";
    }
}
