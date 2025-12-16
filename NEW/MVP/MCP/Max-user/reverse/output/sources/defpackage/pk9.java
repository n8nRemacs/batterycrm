package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class pk9 implements qk9 {
    public final String a;
    public final Uri b;

    public pk9(Uri uri, String str) {
        this.a = str;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk9)) {
            return false;
        }
        pk9 pk9Var = (pk9) obj;
        return fni.a(this.a, pk9Var.a) && fni.a(this.b, pk9Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Uri uri = this.b;
        return iHashCode + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        return "Sticker(url=" + this.a + ", lowResPreviewUri=" + this.b + ")";
    }
}
