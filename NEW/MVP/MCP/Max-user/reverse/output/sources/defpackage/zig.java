package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class zig implements g2h {
    public final a4a a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final int f;
    public final Uri g;
    public final String h = "video/mp4";
    public final int i;
    public final int j;

    public zig(a4a a4aVar, long j, long j2, boolean z, int i) {
        this.a = a4aVar;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = j2 - j;
        this.f = i;
        this.g = Uri.parse(a4aVar.a);
        this.i = a4aVar.b;
        this.j = a4aVar.c;
    }

    @Override // defpackage.g2h
    public final Uri a() {
        return this.g;
    }

    @Override // defpackage.g2h
    public final long b() {
        return this.b;
    }

    @Override // defpackage.g2h
    public final long c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zig)) {
            return false;
        }
        zig zigVar = (zig) obj;
        return this.a.equals(zigVar.a) && this.b == zigVar.b && this.c == zigVar.c && this.d == zigVar.d && this.e == zigVar.e && this.f == zigVar.f;
    }

    @Override // defpackage.g2h
    public final boolean g() {
        return false;
    }

    @Override // defpackage.g2h
    public final String getContentType() {
        return this.h;
    }

    @Override // defpackage.g2h
    public final long getDuration() {
        return this.e;
    }

    @Override // defpackage.g2h
    public final int getHeight() {
        return this.j;
    }

    @Override // defpackage.g2h
    public final int getType() {
        return this.f;
    }

    @Override // defpackage.g2h
    public final int getWidth() {
        return this.i;
    }

    @Override // defpackage.g2h
    public final long h() {
        return 0L;
    }

    public final int hashCode() {
        return az1.v(this.f) + a9h.a(a9h.b(a9h.a(a9h.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // defpackage.g2h
    public final long i() {
        return 0L;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrimmedMp4VideoContent(item=");
        sb.append(this.a);
        sb.append(", startPosition=");
        sb.append(this.b);
        az1.r(this.c, ", endPosition=", ", isMute=", sb);
        sb.append(this.d);
        sb.append(", duration=");
        sb.append(this.e);
        sb.append(", type=");
        sb.append(xrf.x(this.f));
        sb.append(")");
        return sb.toString();
    }
}
