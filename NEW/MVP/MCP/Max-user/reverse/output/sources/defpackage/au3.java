package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class au3 {
    public final Uri a;
    public final boolean b;

    public au3(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!au3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        au3 au3Var = (au3) obj;
        return fni.a(this.a, au3Var.a) && this.b == au3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
