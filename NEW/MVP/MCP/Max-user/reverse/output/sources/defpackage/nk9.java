package defpackage;

import android.net.Uri;
import android.text.Layout;

/* loaded from: classes2.dex */
public final class nk9 implements qk9 {
    public final String a;
    public final int b;
    public final Layout c;
    public final Uri d;
    public final boolean e;

    public nk9(String str, int i, Layout layout, Uri uri, boolean z) {
        this.a = str;
        this.b = i;
        this.c = layout;
        this.d = uri;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk9)) {
            return false;
        }
        nk9 nk9Var = (nk9) obj;
        return fni.a(this.a, nk9Var.a) && this.b == nk9Var.b && fni.a(this.c, nk9Var.c) && fni.a(this.d, nk9Var.d) && this.e == nk9Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (this.c.hashCode() + xrf.k(this.b, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31;
        Uri uri = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM = utb.m(this.b, "Media(url=", this.a, ", attachCount=", ", description=");
        sbM.append(this.c);
        sbM.append(", lowResPreviewUri=");
        sbM.append(this.d);
        sbM.append(", isRoundPreview=");
        return az1.k(sbM, this.e, ")");
    }
}
