package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes2.dex */
public final class c4a implements g2h {
    public final List a;
    public final ry b;
    public final long c;
    public final long d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final long i;
    public final Uri j;
    public final String k;

    public c4a(List list, ry ryVar, long j, long j2, boolean z, int i, int i2, int i3) {
        this.a = list;
        this.b = ryVar;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = j2;
        this.j = list.isEmpty() ? Uri.EMPTY : ((a4a) list.get(0)).e;
        this.k = "video/mp4";
    }

    @Override // defpackage.g2h
    public final Uri a() {
        return this.j;
    }

    @Override // defpackage.g2h
    public final long b() {
        return 0L;
    }

    @Override // defpackage.g2h
    public final long c() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4a)) {
            return false;
        }
        c4a c4aVar = (c4a) obj;
        return fni.a(this.a, c4aVar.a) && fni.a(this.b, c4aVar.b) && this.c == c4aVar.c && this.d == c4aVar.d && this.e == c4aVar.e && this.f == c4aVar.f && this.g == c4aVar.g && this.h == c4aVar.h;
    }

    @Override // defpackage.g2h
    public final ry f() {
        return this.b;
    }

    @Override // defpackage.g2h
    public final boolean g() {
        return false;
    }

    @Override // defpackage.g2h
    public final String getContentType() {
        return this.k;
    }

    @Override // defpackage.g2h
    public final long getDuration() {
        return this.d;
    }

    @Override // defpackage.g2h
    public final int getHeight() {
        return this.g;
    }

    @Override // defpackage.g2h
    public final int getType() {
        return this.h;
    }

    @Override // defpackage.g2h
    public final int getWidth() {
        return this.f;
    }

    @Override // defpackage.g2h
    public final long h() {
        return 0L;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ry ryVar = this.b;
        return az1.v(this.h) + xrf.k(this.g, xrf.k(this.f, a9h.b(a9h.a(a9h.a((iHashCode + (ryVar == null ? 0 : ryVar.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31), 31);
    }

    @Override // defpackage.g2h
    public final long i() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mp4VideoContent(items=");
        sb.append(this.a);
        sb.append(", videoCollage=");
        sb.append(this.b);
        sb.append(", videoId=");
        sb.append(this.c);
        az1.r(this.d, ", duration=", ", isMute=", sb);
        sb.append(this.e);
        sb.append(", width=");
        sb.append(this.f);
        sb.append(", height=");
        sb.append(this.g);
        sb.append(", type=");
        sb.append(xrf.x(this.h));
        sb.append(")");
        return sb.toString();
    }
}
