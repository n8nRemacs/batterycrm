package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class pma {
    public final String a;
    public final boolean b;
    public final Uri c;

    public pma(String str, boolean z, Uri uri) {
        this.a = str;
        this.b = z;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pma)) {
            return false;
        }
        pma pmaVar = (pma) obj;
        return fni.a(this.a, pmaVar.a) && this.b == pmaVar.b && fni.a(this.c, pmaVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return ((this.c.hashCode() + a9h.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31) + 1911932022;
    }

    public final String toString() {
        return "NotificationImage(prefetchUrl=" + this.a + ", canBeLoadedFromNetwork=" + this.b + ", notificationImageUri=" + this.c + ", notificationImageMimeType=image/*)";
    }
}
