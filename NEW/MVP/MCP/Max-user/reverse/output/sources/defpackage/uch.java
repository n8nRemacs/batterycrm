package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public abstract class uch {
    public final int a;
    public final Uri b;
    public final boolean c;

    public uch(int i, Uri uri, boolean z) {
        this.a = i;
        this.b = uri;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        uch uchVar = (uch) obj;
        return fni.a(this.b, uchVar.b) && this.a == uchVar.a && this.c == uchVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + utb.k(this.a, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "VideoSource(type: " + xrf.y(this.a) + ", isLive: " + this.c + ", uri: " + this.b + ")";
    }
}
