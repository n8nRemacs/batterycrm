package androidx.media3.exoplayer.audio;

import android.media.AudioTrack;
import androidx.media3.common.util.M;
import j.P;
import java.lang.reflect.Method;

/* compiled from: AudioTrackPositionTracker.java */
/* loaded from: classes.dex */
final class j {

    /* renamed from: A, reason: collision with root package name */
    public long f48908A;

    /* renamed from: B, reason: collision with root package name */
    public long f48909B;

    /* renamed from: C, reason: collision with root package name */
    public long f48910C;

    /* renamed from: D, reason: collision with root package name */
    public long f48911D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f48912E;

    /* renamed from: F, reason: collision with root package name */
    public long f48913F;

    /* renamed from: G, reason: collision with root package name */
    public long f48914G;

    /* renamed from: a, reason: collision with root package name */
    public final a f48915a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f48916b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public AudioTrack f48917c;

    /* renamed from: d, reason: collision with root package name */
    public int f48918d;

    /* renamed from: e, reason: collision with root package name */
    public int f48919e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public i f48920f;

    /* renamed from: g, reason: collision with root package name */
    public int f48921g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f48922h;

    /* renamed from: i, reason: collision with root package name */
    public long f48923i;

    /* renamed from: j, reason: collision with root package name */
    public float f48924j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f48925k;

    /* renamed from: l, reason: collision with root package name */
    public long f48926l;

    /* renamed from: m, reason: collision with root package name */
    public long f48927m;

    /* renamed from: n, reason: collision with root package name */
    @P
    public Method f48928n;

    /* renamed from: o, reason: collision with root package name */
    public long f48929o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f48930p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f48931q;

    /* renamed from: r, reason: collision with root package name */
    public long f48932r;

    /* renamed from: s, reason: collision with root package name */
    public long f48933s;

    /* renamed from: t, reason: collision with root package name */
    public long f48934t;

    /* renamed from: u, reason: collision with root package name */
    public long f48935u;

    /* renamed from: v, reason: collision with root package name */
    public long f48936v;

    /* renamed from: w, reason: collision with root package name */
    public int f48937w;

    /* renamed from: x, reason: collision with root package name */
    public int f48938x;

    /* renamed from: y, reason: collision with root package name */
    public long f48939y;

    /* renamed from: z, reason: collision with root package name */
    public long f48940z;

    /* compiled from: AudioTrackPositionTracker.java */
    public interface a {
    }

    public j(a aVar) {
        this.f48915a = aVar;
        if (M.f47887a >= 18) {
            try {
                this.f48928n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f48916b = new long[10];
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(boolean r28) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.j.a(boolean):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b() {
        /*
            r12 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r12.f48939y
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L2f
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            long r0 = r0 - r2
            float r2 = r12.f48924j
            long r0 = androidx.media3.common.util.M.t(r0, r2)
            int r2 = r12.f48921g
            long r2 = (long) r2
            long r0 = r0 * r2
            r2 = 999999(0xf423f, double:4.94065E-318)
            long r0 = r0 + r2
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r2
            long r2 = r12.f48909B
            long r4 = r12.f48908A
            long r4 = r4 + r0
            long r0 = java.lang.Math.min(r2, r4)
            return r0
        L2f:
            long r2 = r12.f48933s
            long r2 = r0 - r2
            r6 = 5
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L94
            android.media.AudioTrack r2 = r12.f48917c
            r2.getClass()
            int r3 = r2.getPlayState()
            r6 = 1
            if (r3 != r6) goto L46
            goto L92
        L46:
            int r2 = r2.getPlaybackHeadPosition()
            long r6 = (long) r2
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            boolean r2 = r12.f48922h
            r8 = 0
            if (r2 == 0) goto L65
            r2 = 2
            if (r3 != r2) goto L62
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L62
            long r10 = r12.f48934t
            r12.f48936v = r10
        L62:
            long r10 = r12.f48936v
            long r6 = r6 + r10
        L65:
            int r2 = androidx.media3.common.util.M.f47887a
            r10 = 29
            if (r2 > r10) goto L83
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L81
            long r10 = r12.f48934t
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 <= 0) goto L81
            r2 = 3
            if (r3 != r2) goto L81
            long r2 = r12.f48940z
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L92
            r12.f48940z = r0
            goto L92
        L81:
            r12.f48940z = r4
        L83:
            long r2 = r12.f48934t
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L90
            long r2 = r12.f48935u
            r4 = 1
            long r2 = r2 + r4
            r12.f48935u = r2
        L90:
            r12.f48934t = r6
        L92:
            r12.f48933s = r0
        L94:
            long r0 = r12.f48934t
            long r2 = r12.f48935u
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.j.b():long");
    }

    public final boolean c(long j12) {
        long jA2 = a(false);
        int i12 = this.f48921g;
        int i13 = M.f47887a;
        if (j12 <= ((jA2 * i12) + 999999) / 1000000) {
            if (!this.f48922h) {
                return false;
            }
            AudioTrack audioTrack = this.f48917c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() != 2 || b() != 0) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        this.f48926l = 0L;
        this.f48938x = 0;
        this.f48937w = 0;
        this.f48927m = 0L;
        this.f48911D = 0L;
        this.f48914G = 0L;
        this.f48925k = false;
    }
}
