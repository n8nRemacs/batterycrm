package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class wo6 implements t98 {
    public final vo6 a;
    public final Uri b;
    public final boolean c;
    public final long d;

    public wo6(vo6 vo6Var, Uri uri, boolean z) {
        this.a = vo6Var;
        this.b = uri;
        this.c = z;
        this.d = vo6Var.a.b().hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo6)) {
            return false;
        }
        wo6 wo6Var = (wo6) obj;
        return fni.a(this.a, wo6Var.a) && fni.a(this.b, wo6Var.b) && this.c == wo6Var.c;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GalleryAlbumUiItem(album=");
        sb.append(this.a);
        sb.append(", cover=");
        sb.append(this.b);
        sb.append(", isSelected=");
        return az1.k(sb, this.c, ")");
    }
}
