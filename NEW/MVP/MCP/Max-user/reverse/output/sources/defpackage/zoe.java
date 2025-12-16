package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class zoe extends ape {
    public final Uri a;

    public zoe(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoe) && fni.a(this.a, ((zoe) obj).a);
    }

    public final int hashCode() {
        Uri uri = this.a;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    public final String toString() {
        return "ShowInviteDialog(qrCodeUri=" + this.a + ")";
    }
}
