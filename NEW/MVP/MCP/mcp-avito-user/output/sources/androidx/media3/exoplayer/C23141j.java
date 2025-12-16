package androidx.media3.exoplayer;

import androidx.media3.common.util.C23110a;

/* compiled from: DefaultLoadControl.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.exoplayer.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C23141j implements H {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.h f49202a;

    /* renamed from: b, reason: collision with root package name */
    public final long f49203b;

    /* renamed from: c, reason: collision with root package name */
    public final long f49204c;

    /* renamed from: d, reason: collision with root package name */
    public final long f49205d;

    /* renamed from: e, reason: collision with root package name */
    public final long f49206e;

    /* renamed from: f, reason: collision with root package name */
    public final int f49207f;

    /* renamed from: g, reason: collision with root package name */
    public final long f49208g;

    /* renamed from: h, reason: collision with root package name */
    public int f49209h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f49210i;

    /* compiled from: DefaultLoadControl.java */
    /* renamed from: androidx.media3.exoplayer.j$a */
    public static final class a {
    }

    public C23141j() {
        androidx.media3.exoplayer.upstream.h hVar = new androidx.media3.exoplayer.upstream.h();
        l(2500, 0, "bufferForPlaybackMs", "0");
        l(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        l(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        l(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        l(50000, 50000, "maxBufferMs", "minBufferMs");
        l(0, 0, "backBufferDurationMs", "0");
        this.f49202a = hVar;
        long j12 = 50000;
        this.f49203b = androidx.media3.common.util.M.F(j12);
        this.f49204c = androidx.media3.common.util.M.F(j12);
        this.f49205d = androidx.media3.common.util.M.F(2500);
        this.f49206e = androidx.media3.common.util.M.F(5000);
        this.f49207f = -1;
        this.f49209h = 13107200;
        this.f49208g = androidx.media3.common.util.M.F(0);
    }

    public static void l(int i12, int i13, String str, String str2) {
        C23110a.a(str + " cannot be less than " + str2, i12 >= i13);
    }

    @Override // androidx.media3.exoplayer.H
    public final boolean a() {
        return false;
    }

    @Override // androidx.media3.exoplayer.H
    public final long b() {
        return this.f49208g;
    }

    @Override // androidx.media3.exoplayer.H
    public final boolean c(long j12, float f12, boolean z12, long j13) {
        int i12;
        int i13 = androidx.media3.common.util.M.f47887a;
        if (f12 != 1.0f) {
            j12 = Math.round(j12 / f12);
        }
        long jMin = z12 ? this.f49206e : this.f49205d;
        if (j13 != -9223372036854775807L) {
            jMin = Math.min(j13 / 2, jMin);
        }
        if (jMin > 0 && j12 < jMin) {
            androidx.media3.exoplayer.upstream.h hVar = this.f49202a;
            synchronized (hVar) {
                i12 = hVar.f50123e * hVar.f50120b;
            }
            if (i12 < this.f49209h) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.H
    public final androidx.media3.exoplayer.upstream.h d() {
        return this.f49202a;
    }

    @Override // androidx.media3.exoplayer.H
    public final void e() {
        m(true);
    }

    @Override // androidx.media3.exoplayer.H
    public final void f() {
        m(false);
    }

    @Override // androidx.media3.exoplayer.H
    public final void g() {
        m(true);
    }

    @Override // androidx.media3.exoplayer.H
    public final boolean h(long j12, float f12) {
        int i12;
        androidx.media3.exoplayer.upstream.h hVar = this.f49202a;
        synchronized (hVar) {
            i12 = hVar.f50123e * hVar.f50120b;
        }
        boolean z12 = i12 >= this.f49209h;
        long j13 = this.f49204c;
        long jMin = this.f49203b;
        if (f12 > 1.0f) {
            jMin = Math.min(androidx.media3.common.util.M.t(jMin, f12), j13);
        }
        if (j12 < Math.max(jMin, 500000L)) {
            this.f49210i = !z12;
            if (z12 && j12 < 500000) {
                androidx.media3.common.util.s.g();
            }
        } else if (j12 >= j13 || z12) {
            this.f49210i = false;
        }
        return this.f49210i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.media3.exoplayer.H
    public final void j(c0[] c0VarArr, androidx.media3.exoplayer.source.Y y12, androidx.media3.exoplayer.trackselection.k[] kVarArr) {
        int iMax = this.f49207f;
        if (iMax == -1) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int i14 = 13107200;
                if (i12 < c0VarArr.length) {
                    if (kVarArr[i12] != null) {
                        switch (c0VarArr[i12].m()) {
                            case -2:
                                i14 = 0;
                                i13 += i14;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i14 = 144310272;
                                i13 += i14;
                                break;
                            case 1:
                                i13 += i14;
                                break;
                            case 2:
                                i14 = 131072000;
                                i13 += i14;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i14 = 131072;
                                i13 += i14;
                                break;
                        }
                    }
                    i12++;
                } else {
                    iMax = Math.max(13107200, i13);
                }
            }
        }
        this.f49209h = iMax;
        this.f49202a.f(iMax);
    }

    public final void m(boolean z12) {
        int i12 = this.f49207f;
        if (i12 == -1) {
            i12 = 13107200;
        }
        this.f49209h = i12;
        this.f49210i = false;
        if (z12) {
            androidx.media3.exoplayer.upstream.h hVar = this.f49202a;
            synchronized (hVar) {
                if (hVar.f50119a) {
                    hVar.f(0);
                }
            }
        }
    }
}
