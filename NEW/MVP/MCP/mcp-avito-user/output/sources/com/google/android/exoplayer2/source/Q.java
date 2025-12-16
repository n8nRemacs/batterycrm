package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.util.C36585a;

/* compiled from: SinglePeriodTimeline.java */
/* loaded from: classes6.dex */
public final class Q extends s0 {

    /* renamed from: p, reason: collision with root package name */
    public static final Object f346097p = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final long f346098c;

    /* renamed from: d, reason: collision with root package name */
    public final long f346099d;

    /* renamed from: e, reason: collision with root package name */
    public final long f346100e = -9223372036854775807L;

    /* renamed from: f, reason: collision with root package name */
    public final long f346101f;

    /* renamed from: g, reason: collision with root package name */
    public final long f346102g;

    /* renamed from: h, reason: collision with root package name */
    public final long f346103h;

    /* renamed from: i, reason: collision with root package name */
    public final long f346104i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f346105j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f346106k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f346107l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    public final com.google.android.exoplayer2.source.hls.k f346108m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    public final com.google.android.exoplayer2.O f346109n;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    public final O.g f346110o;

    static {
        O.c cVar = new O.c();
        cVar.f343534a = "SinglePeriodTimeline";
        cVar.f343535b = Uri.EMPTY;
        cVar.a();
    }

    public Q(long j12, long j13, long j14, long j15, long j16, long j17, boolean z12, boolean z13, boolean z14, @j.P com.google.android.exoplayer2.source.hls.k kVar, com.google.android.exoplayer2.O o12, @j.P O.g gVar) {
        this.f346098c = j12;
        this.f346099d = j13;
        this.f346101f = j14;
        this.f346102g = j15;
        this.f346103h = j16;
        this.f346104i = j17;
        this.f346105j = z12;
        this.f346106k = z13;
        this.f346107l = z14;
        this.f346108m = kVar;
        o12.getClass();
        this.f346109n = o12;
        this.f346110o = gVar;
    }

    @Override // com.google.android.exoplayer2.s0
    public final int b(Object obj) {
        return f346097p.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.s0
    public final s0.b f(int i12, s0.b bVar, boolean z12) {
        C36585a.c(i12, 1);
        Object obj = z12 ? f346097p : null;
        long j12 = -this.f346103h;
        bVar.getClass();
        bVar.h(null, obj, 0, this.f346101f, j12, com.google.android.exoplayer2.source.ads.a.f346179h, false);
        return bVar;
    }

    @Override // com.google.android.exoplayer2.s0
    public final int h() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.s0
    public final Object l(int i12) {
        C36585a.c(i12, 1);
        return f346097p;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[PHI: r1
  0x002d: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v5 long) binds: [B:3:0x000c, B:5:0x0010, B:7:0x0016, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.exoplayer2.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.exoplayer2.s0.d m(int r25, com.google.android.exoplayer2.s0.d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            r2 = r25
            com.google.android.exoplayer2.util.C36585a.c(r2, r1)
            long r1 = r0.f346104i
            boolean r14 = r0.f346106k
            if (r14 == 0) goto L2d
            boolean r3 = r0.f346107l
            if (r3 != 0) goto L2d
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2d
            long r3 = r0.f346102g
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L26
        L23:
            r16 = r5
            goto L2f
        L26:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2d
            goto L23
        L2d:
            r16 = r1
        L2f:
            java.lang.Object r4 = com.google.android.exoplayer2.s0.d.f345877s
            long r1 = r0.f346102g
            r18 = r1
            r20 = 0
            com.google.android.exoplayer2.O r5 = r0.f346109n
            com.google.android.exoplayer2.source.hls.k r6 = r0.f346108m
            long r7 = r0.f346098c
            long r9 = r0.f346099d
            long r11 = r0.f346100e
            boolean r13 = r0.f346105j
            com.google.android.exoplayer2.O$g r15 = r0.f346110o
            r21 = 0
            long r1 = r0.f346103h
            r22 = r1
            r3 = r26
            r3.b(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.Q.m(int, com.google.android.exoplayer2.s0$d, long):com.google.android.exoplayer2.s0$d");
    }

    @Override // com.google.android.exoplayer2.s0
    public final int o() {
        return 1;
    }
}
