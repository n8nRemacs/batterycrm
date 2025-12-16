package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class o67 implements g2h {
    public final String a;
    public final ry b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final Uri k;
    public final long l;
    public final String m = "video/hls";

    public o67(String str, ry ryVar, long j, long j2, long j3, boolean z, boolean z2, int i, int i2, int i3) {
        this.a = str;
        this.b = ryVar;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = z;
        this.g = z2;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = Uri.parse(str);
        this.l = j2;
    }

    @Override // defpackage.g2h
    public final Uri a() {
        return this.k;
    }

    @Override // defpackage.g2h
    public final long b() {
        return 0L;
    }

    @Override // defpackage.g2h
    public final long c() {
        return this.l;
    }

    @Override // defpackage.g2h
    public final g2h e(long j) {
        return new o67(this.a, this.b, this.c, this.d, j, this.f, this.g, this.h, this.i, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o67)) {
            return false;
        }
        o67 o67Var = (o67) obj;
        return fni.a(this.a, o67Var.a) && fni.a(this.b, o67Var.b) && this.c == o67Var.c && this.d == o67Var.d && this.e == o67Var.e && this.f == o67Var.f && this.g == o67Var.g && this.h == o67Var.h && this.i == o67Var.i && this.j == o67Var.j;
    }

    @Override // defpackage.g2h
    public final ry f() {
        return this.b;
    }

    @Override // defpackage.g2h
    public final boolean g() {
        return this.f;
    }

    @Override // defpackage.g2h
    public final String getContentType() {
        return this.m;
    }

    @Override // defpackage.g2h
    public final long getDuration() {
        return this.d;
    }

    @Override // defpackage.g2h
    public final int getHeight() {
        return this.i;
    }

    @Override // defpackage.g2h
    public final int getType() {
        return this.j;
    }

    @Override // defpackage.g2h
    public final int getWidth() {
        return this.h;
    }

    @Override // defpackage.g2h
    public final long h() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ry ryVar = this.b;
        return az1.v(this.j) + xrf.k(this.i, xrf.k(this.h, a9h.b(a9h.b(a9h.a(a9h.a(a9h.a((iHashCode + (ryVar == null ? 0 : ryVar.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31), 31);
    }

    @Override // defpackage.g2h
    public final long i() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsVideoContent(url=");
        sb.append(this.a);
        sb.append(", videoCollage=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        az1.r(this.d, ", duration=", ", initSeekPos=", sb);
        sb.append(this.e);
        sb.append(", isLive=");
        sb.append(this.f);
        sb.append(", isMute=");
        sb.append(this.g);
        sb.append(", width=");
        sb.append(this.h);
        sb.append(", height=");
        sb.append(this.i);
        sb.append(", type=");
        sb.append(xrf.x(this.j));
        sb.append(")");
        return sb.toString();
    }
}
