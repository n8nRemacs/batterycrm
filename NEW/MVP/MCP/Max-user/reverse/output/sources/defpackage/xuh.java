package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class xuh implements avh {
    public final Uri a;

    public xuh(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xuh) && fni.a(this.a, ((xuh) obj).a);
    }

    public final int hashCode() {
        Uri uri = this.a;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    public final String toString() {
        return "UploadCameraPhoto(data=" + this.a + ")";
    }
}
