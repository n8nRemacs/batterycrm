package defpackage;

/* loaded from: classes2.dex */
public final class yq3 {
    public volatile long a;
    public volatile long b;
    public volatile int c;
    public volatile long d;
    public volatile long e;
    public volatile long f;
    public volatile String g = "";
    public volatile int h = -1;

    public yq3(boolean z) {
        if (z) {
            this.a = System.currentTimeMillis();
        }
    }

    public final zq3 a() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.a;
        return new zq3(j, (1 > j3 || j3 > j2) ? -1L : this.b - this.a, this.d, this.e, this.f, this.g, this.h, this.c);
    }
}
