package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class hu6 implements g2h {
    public final Uri a;
    public final int b;
    public final int c;

    public hu6(Uri uri, int i, int i2) {
        this.a = uri;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.g2h
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.g2h
    public final long b() {
        return 0L;
    }

    @Override // defpackage.g2h
    public final long c() {
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu6)) {
            return false;
        }
        hu6 hu6Var = (hu6) obj;
        return fni.a(this.a, hu6Var.a) && this.b == hu6Var.b && this.c == hu6Var.c;
    }

    @Override // defpackage.g2h
    public final boolean g() {
        return false;
    }

    @Override // defpackage.g2h
    public final String getContentType() {
        return "video/mp4";
    }

    @Override // defpackage.g2h
    public final long getDuration() {
        return 0L;
    }

    @Override // defpackage.g2h
    public final int getHeight() {
        return this.c;
    }

    @Override // defpackage.g2h
    public final int getType() {
        return 3;
    }

    @Override // defpackage.g2h
    public final int getWidth() {
        return this.b;
    }

    @Override // defpackage.g2h
    public final long h() {
        return 0L;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + xrf.k(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // defpackage.g2h
    public final long i() {
        return 0L;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GifVideoContent(contentUri=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return ho7.j(sb, this.c, ")");
    }
}
