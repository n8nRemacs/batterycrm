package androidx.media3.exoplayer.source;

import androidx.media3.common.C23108t;
import androidx.media3.common.util.C23110a;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.g0;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.InterfaceC23174z;

/* compiled from: ClippingMediaPeriod.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.exoplayer.source.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23152c implements InterfaceC23174z, InterfaceC23174z.a {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC23174z f49737b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public InterfaceC23174z.a f49738c;

    /* renamed from: d, reason: collision with root package name */
    public a[] f49739d = new a[0];

    /* renamed from: e, reason: collision with root package name */
    public long f49740e;

    /* renamed from: f, reason: collision with root package name */
    public long f49741f;

    /* renamed from: g, reason: collision with root package name */
    public long f49742g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public ClippingMediaSource.IllegalClippingException f49743h;

    /* compiled from: ClippingMediaPeriod.java */
    /* renamed from: androidx.media3.exoplayer.source.c$a */
    public final class a implements P {

        /* renamed from: b, reason: collision with root package name */
        public final P f49744b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f49745c;

        public a(P p12) {
            this.f49744b = p12;
        }

        @Override // androidx.media3.exoplayer.source.P
        public final int b(long j12) {
            if (C23152c.this.a()) {
                return -3;
            }
            return this.f49744b.b(j12);
        }

        @Override // androidx.media3.exoplayer.source.P
        public final void c() {
            this.f49744b.c();
        }

        @Override // androidx.media3.exoplayer.source.P
        public final int e(androidx.media3.exoplayer.F f12, DecoderInputBuffer decoderInputBuffer, int i12) {
            C23152c c23152c = C23152c.this;
            if (c23152c.a()) {
                return -3;
            }
            if (this.f49745c) {
                decoderInputBuffer.f48328b = 4;
                return -4;
            }
            long bufferedPositionUs = c23152c.getBufferedPositionUs();
            int iE2 = this.f49744b.e(f12, decoderInputBuffer, i12);
            if (iE2 != -5) {
                long j12 = c23152c.f49742g;
                if (j12 == Long.MIN_VALUE || ((iE2 != -4 || decoderInputBuffer.f48325f < j12) && !(iE2 == -3 && bufferedPositionUs == Long.MIN_VALUE && !decoderInputBuffer.f48324e))) {
                    return iE2;
                }
                decoderInputBuffer.h();
                decoderInputBuffer.f48328b = 4;
                this.f49745c = true;
                return -4;
            }
            C23108t c23108t = f12.f48506b;
            c23108t.getClass();
            int i13 = c23108t.f47740D;
            int i14 = c23108t.f47739C;
            if (i14 != 0 || i13 != 0) {
                if (c23152c.f49741f != 0) {
                    i14 = 0;
                }
                if (c23152c.f49742g != Long.MIN_VALUE) {
                    i13 = 0;
                }
                C23108t.b bVarA = c23108t.a();
                bVarA.f47771A = i14;
                bVarA.f47772B = i13;
                f12.f48506b = bVarA.a();
            }
            return -5;
        }

        @Override // androidx.media3.exoplayer.source.P
        public final boolean n() {
            return !C23152c.this.a() && this.f49744b.n();
        }
    }

    public C23152c(InterfaceC23174z interfaceC23174z, boolean z12, long j12, long j13) {
        this.f49737b = interfaceC23174z;
        this.f49740e = z12 ? j12 : -9223372036854775807L;
        this.f49741f = j12;
        this.f49742g = j13;
    }

    public final boolean a() {
        return this.f49740e != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final boolean continueLoading(long j12) {
        return this.f49737b.continueLoading(j12);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(androidx.media3.exoplayer.trackselection.k[] r14, boolean[] r15, androidx.media3.exoplayer.source.P[] r16, boolean[] r17, long r18) {
        /*
            r13 = this;
            r0 = r13
            r8 = r14
            r9 = r16
            int r1 = r9.length
            androidx.media3.exoplayer.source.c$a[] r1 = new androidx.media3.exoplayer.source.C23152c.a[r1]
            r0.f49739d = r1
            int r1 = r9.length
            androidx.media3.exoplayer.source.P[] r10 = new androidx.media3.exoplayer.source.P[r1]
            r11 = 0
            r1 = r11
        Le:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L23
            androidx.media3.exoplayer.source.c$a[] r2 = r0.f49739d
            r3 = r9[r1]
            androidx.media3.exoplayer.source.c$a r3 = (androidx.media3.exoplayer.source.C23152c.a) r3
            r2[r1] = r3
            if (r3 == 0) goto L1e
            androidx.media3.exoplayer.source.P r12 = r3.f49744b
        L1e:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Le
        L23:
            androidx.media3.exoplayer.source.z r1 = r0.f49737b
            r2 = r14
            r3 = r15
            r4 = r10
            r5 = r17
            r6 = r18
            long r1 = r1.d(r2, r3, r4, r5, r6)
            boolean r3 = r13.a()
            if (r3 == 0) goto L5d
            long r3 = r0.f49741f
            int r5 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r5 != 0) goto L5d
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L5d
            int r3 = r8.length
            r4 = r11
        L44:
            if (r4 >= r3) goto L5d
            r5 = r8[r4]
            if (r5 == 0) goto L5a
            androidx.media3.common.t r5 = r5.c()
            java.lang.String r6 = r5.f47757m
            java.lang.String r5 = r5.f47754j
            boolean r5 = androidx.media3.common.D.a(r6, r5)
            if (r5 != 0) goto L5a
            r3 = r1
            goto L62
        L5a:
            int r4 = r4 + 1
            goto L44
        L5d:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L62:
            r0.f49740e = r3
            int r3 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r3 == 0) goto L7d
            long r3 = r0.f49741f
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L7b
            long r3 = r0.f49742g
            r5 = -9223372036854775808
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L7d
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L7b
            goto L7d
        L7b:
            r3 = r11
            goto L7e
        L7d:
            r3 = 1
        L7e:
            androidx.media3.common.util.C23110a.g(r3)
        L81:
            int r3 = r9.length
            if (r11 >= r3) goto La7
            r3 = r10[r11]
            if (r3 != 0) goto L8d
            androidx.media3.exoplayer.source.c$a[] r3 = r0.f49739d
            r3[r11] = r12
            goto L9e
        L8d:
            androidx.media3.exoplayer.source.c$a[] r4 = r0.f49739d
            r5 = r4[r11]
            if (r5 == 0) goto L97
            androidx.media3.exoplayer.source.P r5 = r5.f49744b
            if (r5 == r3) goto L9e
        L97:
            androidx.media3.exoplayer.source.c$a r5 = new androidx.media3.exoplayer.source.c$a
            r5.<init>(r3)
            r4[r11] = r5
        L9e:
            androidx.media3.exoplayer.source.c$a[] r3 = r0.f49739d
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L81
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.C23152c.d(androidx.media3.exoplayer.trackselection.k[], boolean[], androidx.media3.exoplayer.source.P[], boolean[], long):long");
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final void discardBuffer(long j12, boolean z12) {
        this.f49737b.discardBuffer(j12, z12);
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z.a
    public final void e(InterfaceC23174z interfaceC23174z) {
        if (this.f49743h != null) {
            return;
        }
        InterfaceC23174z.a aVar = this.f49738c;
        aVar.getClass();
        aVar.e(this);
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final void f(InterfaceC23174z.a aVar, long j12) {
        this.f49738c = aVar;
        this.f49737b.f(this, j12);
    }

    @Override // androidx.media3.exoplayer.source.Q.a
    public final void g(Q q12) {
        InterfaceC23174z.a aVar = this.f49738c;
        aVar.getClass();
        aVar.g(this);
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f49737b.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j12 = this.f49742g;
            if (j12 == Long.MIN_VALUE || bufferedPositionUs < j12) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f49737b.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j12 = this.f49742g;
            if (j12 == Long.MIN_VALUE || nextLoadPositionUs < j12) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final Y getTrackGroups() {
        return this.f49737b.getTrackGroups();
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final long i(long j12, g0 g0Var) {
        long j13 = this.f49741f;
        if (j12 == j13) {
            return j13;
        }
        long jL2 = androidx.media3.common.util.M.l(g0Var.f49168a, 0L, j12 - j13);
        long j14 = this.f49742g;
        long jL3 = androidx.media3.common.util.M.l(g0Var.f49169b, 0L, j14 == Long.MIN_VALUE ? Long.MAX_VALUE : j14 - j12);
        if (jL2 != g0Var.f49168a || jL3 != g0Var.f49169b) {
            g0Var = new g0(jL2, jL3);
        }
        return this.f49737b.i(j12, g0Var);
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final boolean isLoading() {
        return this.f49737b.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final void maybeThrowPrepareError() throws ClippingMediaSource.IllegalClippingException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.f49743h;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.f49737b.maybeThrowPrepareError();
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    public final long readDiscontinuity() {
        if (a()) {
            long j12 = this.f49740e;
            this.f49740e = -9223372036854775807L;
            long discontinuity = readDiscontinuity();
            return discontinuity != -9223372036854775807L ? discontinuity : j12;
        }
        long discontinuity2 = this.f49737b.readDiscontinuity();
        if (discontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        C23110a.g(discontinuity2 >= this.f49741f);
        long j13 = this.f49742g;
        C23110a.g(j13 == Long.MIN_VALUE || discontinuity2 <= j13);
        return discontinuity2;
    }

    @Override // androidx.media3.exoplayer.source.Q
    public final void reevaluateBuffer(long j12) {
        this.f49737b.reevaluateBuffer(j12);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    @Override // androidx.media3.exoplayer.source.InterfaceC23174z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long seekToUs(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f49740e = r0
            androidx.media3.exoplayer.source.c$a[] r0 = r5.f49739d
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f49745c = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            androidx.media3.exoplayer.source.z r0 = r5.f49737b
            long r0 = r0.seekToUs(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.f49741f
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f49742g
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            androidx.media3.common.util.C23110a.g(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.C23152c.seekToUs(long):long");
    }
}
