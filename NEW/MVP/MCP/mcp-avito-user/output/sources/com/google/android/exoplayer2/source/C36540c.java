package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.source.ClippingMediaSource;
import com.google.android.exoplayer2.source.InterfaceC36559w;
import com.google.android.exoplayer2.util.C36585a;

/* compiled from: ClippingMediaPeriod.java */
/* renamed from: com.google.android.exoplayer2.source.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36540c implements InterfaceC36559w, InterfaceC36559w.a {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC36559w f346204b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public InterfaceC36559w.a f346205c;

    /* renamed from: d, reason: collision with root package name */
    public a[] f346206d = new a[0];

    /* renamed from: e, reason: collision with root package name */
    public long f346207e;

    /* renamed from: f, reason: collision with root package name */
    public long f346208f;

    /* renamed from: g, reason: collision with root package name */
    public long f346209g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public ClippingMediaSource.IllegalClippingException f346210h;

    /* compiled from: ClippingMediaPeriod.java */
    /* renamed from: com.google.android.exoplayer2.source.c$a */
    public final class a implements M {

        /* renamed from: b, reason: collision with root package name */
        public final M f346211b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f346212c;

        public a(M m12) {
            this.f346211b = m12;
        }

        @Override // com.google.android.exoplayer2.source.M
        public final int b(long j12) {
            if (C36540c.this.a()) {
                return -3;
            }
            return this.f346211b.b(j12);
        }

        @Override // com.google.android.exoplayer2.source.M
        public final void c() {
            this.f346211b.c();
        }

        @Override // com.google.android.exoplayer2.source.M
        public final int g(com.google.android.exoplayer2.J j12, DecoderInputBuffer decoderInputBuffer, int i12) {
            C36540c c36540c = C36540c.this;
            if (c36540c.a()) {
                return -3;
            }
            if (this.f346212c) {
                decoderInputBuffer.f344210b = 4;
                return -4;
            }
            int iG2 = this.f346211b.g(j12, decoderInputBuffer, i12);
            if (iG2 != -5) {
                long j13 = c36540c.f346209g;
                if (j13 == Long.MIN_VALUE || ((iG2 != -4 || decoderInputBuffer.f344207f < j13) && !(iG2 == -3 && c36540c.getBufferedPositionUs() == Long.MIN_VALUE && !decoderInputBuffer.f344206e))) {
                    return iG2;
                }
                decoderInputBuffer.h();
                decoderInputBuffer.f344210b = 4;
                this.f346212c = true;
                return -4;
            }
            com.google.android.exoplayer2.I i13 = j12.f343521b;
            i13.getClass();
            int i14 = i13.f343461D;
            int i15 = i13.f343460C;
            if (i15 != 0 || i14 != 0) {
                if (c36540c.f346208f != 0) {
                    i15 = 0;
                }
                if (c36540c.f346209g != Long.MIN_VALUE) {
                    i14 = 0;
                }
                I.b bVarA = i13.a();
                bVarA.f343490A = i15;
                bVarA.f343491B = i14;
                j12.f343521b = bVarA.a();
            }
            return -5;
        }

        @Override // com.google.android.exoplayer2.source.M
        public final boolean n() {
            return !C36540c.this.a() && this.f346211b.n();
        }
    }

    public C36540c(InterfaceC36559w interfaceC36559w, boolean z12, long j12, long j13) {
        this.f346204b = interfaceC36559w;
        this.f346207e = z12 ? j12 : -9223372036854775807L;
        this.f346208f = j12;
        this.f346209g = j13;
    }

    public final boolean a() {
        return this.f346207e != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w.a
    public final void c(InterfaceC36559w interfaceC36559w) {
        if (this.f346210h != null) {
            return;
        }
        InterfaceC36559w.a aVar = this.f346205c;
        aVar.getClass();
        aVar.c(this);
    }

    @Override // com.google.android.exoplayer2.source.N
    public final boolean continueLoading(long j12) {
        return this.f346204b.continueLoading(j12);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final long d(long j12, l0 l0Var) {
        long j13 = this.f346208f;
        if (j12 == j13) {
            return j13;
        }
        long jL2 = com.google.android.exoplayer2.util.U.l(l0Var.f345462a, 0L, j12 - j13);
        long j14 = this.f346209g;
        long jL3 = com.google.android.exoplayer2.util.U.l(l0Var.f345463b, 0L, j14 == Long.MIN_VALUE ? Long.MAX_VALUE : j14 - j12);
        if (jL2 != l0Var.f345462a || jL3 != l0Var.f345463b) {
            l0Var = new l0(jL2, jL3);
        }
        return this.f346204b.d(j12, l0Var);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final void discardBuffer(long j12, boolean z12) {
        this.f346204b.discardBuffer(j12, z12);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final void e(InterfaceC36559w.a aVar, long j12) {
        this.f346205c = aVar;
        this.f346204b.e(this, j12);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f(com.google.android.exoplayer2.trackselection.k[] r14, boolean[] r15, com.google.android.exoplayer2.source.M[] r16, boolean[] r17, long r18) {
        /*
            r13 = this;
            r0 = r13
            r8 = r14
            r9 = r16
            int r1 = r9.length
            com.google.android.exoplayer2.source.c$a[] r1 = new com.google.android.exoplayer2.source.C36540c.a[r1]
            r0.f346206d = r1
            int r1 = r9.length
            com.google.android.exoplayer2.source.M[] r10 = new com.google.android.exoplayer2.source.M[r1]
            r11 = 0
            r1 = r11
        Le:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L23
            com.google.android.exoplayer2.source.c$a[] r2 = r0.f346206d
            r3 = r9[r1]
            com.google.android.exoplayer2.source.c$a r3 = (com.google.android.exoplayer2.source.C36540c.a) r3
            r2[r1] = r3
            if (r3 == 0) goto L1e
            com.google.android.exoplayer2.source.M r12 = r3.f346211b
        L1e:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Le
        L23:
            com.google.android.exoplayer2.source.w r1 = r0.f346204b
            r2 = r14
            r3 = r15
            r4 = r10
            r5 = r17
            r6 = r18
            long r1 = r1.f(r2, r3, r4, r5, r6)
            boolean r3 = r13.a()
            if (r3 == 0) goto L5d
            long r3 = r0.f346208f
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
            com.google.android.exoplayer2.I r5 = r5.c()
            java.lang.String r6 = r5.f343476m
            java.lang.String r5 = r5.f343473j
            boolean r5 = com.google.android.exoplayer2.util.z.a(r6, r5)
            if (r5 != 0) goto L5a
            r3 = r1
            goto L62
        L5a:
            int r4 = r4 + 1
            goto L44
        L5d:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L62:
            r0.f346207e = r3
            int r3 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r3 == 0) goto L7d
            long r3 = r0.f346208f
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L7b
            long r3 = r0.f346209g
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
            com.google.android.exoplayer2.util.C36585a.d(r3)
        L81:
            int r3 = r9.length
            if (r11 >= r3) goto La7
            r3 = r10[r11]
            if (r3 != 0) goto L8d
            com.google.android.exoplayer2.source.c$a[] r3 = r0.f346206d
            r3[r11] = r12
            goto L9e
        L8d:
            com.google.android.exoplayer2.source.c$a[] r4 = r0.f346206d
            r5 = r4[r11]
            if (r5 == 0) goto L97
            com.google.android.exoplayer2.source.M r5 = r5.f346211b
            if (r5 == r3) goto L9e
        L97:
            com.google.android.exoplayer2.source.c$a r5 = new com.google.android.exoplayer2.source.c$a
            r5.<init>(r3)
            r4[r11] = r5
        L9e:
            com.google.android.exoplayer2.source.c$a[] r3 = r0.f346206d
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L81
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C36540c.f(com.google.android.exoplayer2.trackselection.k[], boolean[], com.google.android.exoplayer2.source.M[], boolean[], long):long");
    }

    @Override // com.google.android.exoplayer2.source.N.a
    public final void g(N n12) {
        InterfaceC36559w.a aVar = this.f346205c;
        aVar.getClass();
        aVar.g(this);
    }

    @Override // com.google.android.exoplayer2.source.N
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f346204b.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j12 = this.f346209g;
            if (j12 == Long.MIN_VALUE || bufferedPositionUs < j12) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.N
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f346204b.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j12 = this.f346209g;
            if (j12 == Long.MIN_VALUE || nextLoadPositionUs < j12) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final W getTrackGroups() {
        return this.f346204b.getTrackGroups();
    }

    @Override // com.google.android.exoplayer2.source.N
    public final boolean isLoading() {
        return this.f346204b.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final void maybeThrowPrepareError() throws ClippingMediaSource.IllegalClippingException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.f346210h;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.f346204b.maybeThrowPrepareError();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final long readDiscontinuity() {
        if (a()) {
            long j12 = this.f346207e;
            this.f346207e = -9223372036854775807L;
            long discontinuity = readDiscontinuity();
            return discontinuity != -9223372036854775807L ? discontinuity : j12;
        }
        long discontinuity2 = this.f346204b.readDiscontinuity();
        if (discontinuity2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        C36585a.d(discontinuity2 >= this.f346208f);
        long j13 = this.f346209g;
        C36585a.d(j13 == Long.MIN_VALUE || discontinuity2 <= j13);
        return discontinuity2;
    }

    @Override // com.google.android.exoplayer2.source.N
    public final void reevaluateBuffer(long j12) {
        this.f346204b.reevaluateBuffer(j12);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long seekToUs(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f346207e = r0
            com.google.android.exoplayer2.source.c$a[] r0 = r5.f346206d
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f346212c = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            com.google.android.exoplayer2.source.w r0 = r5.f346204b
            long r0 = r0.seekToUs(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.f346208f
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f346209g
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            com.google.android.exoplayer2.util.C36585a.d(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C36540c.seekToUs(long):long");
    }
}
