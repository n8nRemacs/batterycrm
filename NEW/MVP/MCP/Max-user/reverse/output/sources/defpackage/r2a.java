package defpackage;

/* loaded from: classes.dex */
public final class r2a implements ry9 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public r2a(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r2a.class == obj.getClass()) {
            r2a r2aVar = (r2a) obj;
            if (this.a == r2aVar.a && this.b == r2aVar.b && this.c == r2aVar.c && this.d == r2aVar.d && this.e == r2aVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return fsi.g(this.e) + ((fsi.g(this.d) + ((fsi.g(this.c) + ((fsi.g(this.b) + ((fsi.g(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }
}
