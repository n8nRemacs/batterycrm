package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class tw8 extends tk0 {
    public static final byte[] O1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public long A1;
    public boolean B1;
    public final iw8 C0;
    public boolean C1;
    public final uw8 D0;
    public boolean D1;
    public final boolean E0;
    public boolean E1;
    public final float F0;
    public ExoPlaybackException F1;
    public final ph4 G0;
    public nh4 G1;
    public final ph4 H0;
    public rw8 H1;
    public final ph4 I0;
    public long I1;
    public final fm0 J0;
    public boolean J1;
    public final MediaCodec.BufferInfo K0;
    public boolean K1;
    public final ArrayDeque L0;
    public boolean L1;
    public final fua M0;
    public long M1;
    public hf6 N0;
    public long N1;
    public hf6 O0;
    public z45 P0;
    public z45 Q0;
    public im5 R0;
    public MediaCrypto S0;
    public final long T0;
    public float U0;
    public float V0;
    public kw8 W0;
    public hf6 X0;
    public MediaFormat Y0;
    public boolean Z0;
    public float a1;
    public ArrayDeque b1;
    public MediaCodecRenderer$DecoderInitializationException c1;
    public pw8 d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public long i1;
    public long j1;
    public int k1;
    public int l1;
    public ByteBuffer m1;
    public boolean n1;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public boolean r1;
    public boolean s1;
    public int t1;
    public int u1;
    public int v1;
    public boolean w1;
    public boolean x1;
    public boolean y1;
    public long z1;

    public tw8(int i, iw8 iw8Var, uw8 uw8Var, boolean z, float f) {
        super(i);
        this.C0 = iw8Var;
        this.D0 = uw8Var;
        this.E0 = z;
        this.F0 = f;
        this.G0 = new ph4(0);
        this.H0 = new ph4(0);
        this.I0 = new ph4(2);
        fm0 fm0Var = new fm0(2);
        fm0Var.v0 = 32;
        this.J0 = fm0Var;
        this.K0 = new MediaCodec.BufferInfo();
        this.U0 = 1.0f;
        this.V0 = 1.0f;
        this.T0 = -9223372036854775807L;
        this.L0 = new ArrayDeque();
        this.H1 = rw8.e;
        fm0Var.y(0);
        fm0Var.o.order(ByteOrder.nativeOrder());
        fua fuaVar = new fua(0);
        fuaVar.d = l50.a;
        fuaVar.c = 0;
        fuaVar.b = 2;
        this.M0 = fuaVar;
        this.a1 = -1.0f;
        this.t1 = 0;
        this.k1 = -1;
        this.l1 = -1;
        this.j1 = -9223372036854775807L;
        this.z1 = -9223372036854775807L;
        this.A1 = -9223372036854775807L;
        this.I1 = -9223372036854775807L;
        this.i1 = -9223372036854775807L;
        this.u1 = 0;
        this.v1 = 0;
        this.G1 = new nh4(1);
        this.M1 = -9223372036854775807L;
        this.N1 = -9223372036854775807L;
    }

    @Override // defpackage.tk0
    public final int A() {
        return 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(long r25, long r27) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw8.B(long, long):boolean");
    }

    public abstract sh4 C(pw8 pw8Var, hf6 hf6Var, hf6 hf6Var2);

    public MediaCodecDecoderException D(IllegalStateException illegalStateException, pw8 pw8Var) {
        return new MediaCodecDecoderException(illegalStateException, pw8Var);
    }

    public final boolean E() throws MediaCryptoException, ExoPlaybackException {
        if (!this.w1) {
            x0();
            return true;
        }
        this.u1 = 1;
        this.v1 = 2;
        return true;
    }

    public final boolean F(long j, long j2) throws MediaCryptoException, ExoPlaybackException {
        kw8 kw8Var = this.W0;
        kw8Var.getClass();
        int i = this.l1;
        MediaCodec.BufferInfo bufferInfo = this.K0;
        if (i < 0) {
            int i2 = kw8Var.i(bufferInfo);
            if (i2 < 0) {
                if (i2 == -2) {
                    this.y1 = true;
                    kw8 kw8Var2 = this.W0;
                    kw8Var2.getClass();
                    this.Y0 = kw8Var2.getOutputFormat();
                    this.Z0 = true;
                    return true;
                }
                if (this.h1 && (this.B1 || this.u1 == 2)) {
                    g0();
                }
                long j3 = this.i1;
                if (j3 != -9223372036854775807L) {
                    long j4 = j3 + 100;
                    this.Y.getClass();
                    if (j4 < System.currentTimeMillis()) {
                        g0();
                        return false;
                    }
                }
                return false;
            }
            if (this.g1) {
                this.g1 = false;
                kw8Var.l(i2);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                g0();
                return false;
            }
            this.l1 = i2;
            ByteBuffer outputBuffer = kw8Var.getOutputBuffer(i2);
            this.m1 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo.offset);
                this.m1.limit(bufferInfo.offset + bufferInfo.size);
            }
            y0(bufferInfo.presentationTimeUs);
        }
        long j5 = bufferInfo.presentationTimeUs;
        this.n1 = j5 < this.v0;
        long j6 = this.A1;
        this.o1 = j6 != -9223372036854775807L && j6 <= j5;
        if (this.L1) {
            long j7 = this.M1;
            if (j7 == -9223372036854775807L || j5 > j7) {
                this.M1 = j5;
                this.n1 = true;
                this.o1 = false;
            } else {
                this.L1 = false;
                this.M1 = -9223372036854775807L;
            }
        }
        ByteBuffer byteBuffer = this.m1;
        int i3 = this.l1;
        int i4 = bufferInfo.flags;
        boolean z = this.n1;
        boolean z2 = this.o1;
        hf6 hf6Var = this.O0;
        hf6Var.getClass();
        if (!h0(j, j2, kw8Var, byteBuffer, i3, i4, 1, j5, z, z2, hf6Var)) {
            return false;
        }
        d0(bufferInfo.presentationTimeUs);
        boolean z3 = (bufferInfo.flags & 4) != 0;
        if (!z3 && this.x1 && this.o1) {
            this.Y.getClass();
            this.i1 = System.currentTimeMillis();
        }
        this.l1 = -1;
        this.m1 = null;
        if (!z3) {
            return true;
        }
        g0();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G() throws android.media.MediaCryptoException, androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw8.G():boolean");
    }

    public final void H() {
        try {
            kw8 kw8Var = this.W0;
            hsi.h(kw8Var);
            kw8Var.flush();
        } finally {
            m0();
        }
    }

    public final boolean I() {
        if (this.W0 != null) {
            if (t0()) {
                j0();
                return true;
            }
            if (r0()) {
                H();
                return false;
            }
            long j = this.N1;
            if (j != -9223372036854775807L && this.v0 <= j && this.I1 < j) {
                this.L1 = true;
                this.N1 = -9223372036854775807L;
            }
        }
        return false;
    }

    public final List K(boolean z) {
        hf6 hf6Var = this.N0;
        hf6Var.getClass();
        uw8 uw8Var = this.D0;
        ArrayList arrayListO = O(uw8Var, hf6Var, z);
        if (!arrayListO.isEmpty() || !z) {
            return arrayListO;
        }
        ArrayList arrayListO2 = O(uw8Var, hf6Var, false);
        if (!arrayListO2.isEmpty()) {
            a8i.l("MediaCodecRenderer", "Drm session requires secure decoder for " + hf6Var.n + ", but no secure decoder available. Trying to proceed with " + arrayListO2 + ".");
        }
        return arrayListO2;
    }

    public int L(ph4 ph4Var) {
        return 0;
    }

    public abstract float N(float f, hf6 hf6Var, hf6[] hf6VarArr);

    public abstract ArrayList O(uw8 uw8Var, hf6 hf6Var, boolean z);

    public long P(long j, long j2) {
        return super.f(j, j2);
    }

    public abstract lz9 Q(pw8 pw8Var, hf6 hf6Var, MediaCrypto mediaCrypto, float f);

    public abstract void R(ph4 ph4Var);

    public final void S(pw8 pw8Var, MediaCrypto mediaCrypto) {
        this.d1 = pw8Var;
        hf6 hf6Var = this.N0;
        hf6Var.getClass();
        String str = pw8Var.a;
        int i = Build.VERSION.SDK_INT;
        float f = this.V0;
        hf6[] hf6VarArr = this.t0;
        hf6VarArr.getClass();
        float fN = N(f, hf6Var, hf6VarArr);
        if (fN <= this.F0) {
            fN = -1.0f;
        }
        this.Y.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        lz9 lz9VarQ = Q(pw8Var, hf6Var, mediaCrypto, fN);
        if (i >= 31) {
            n4c n4cVar = this.X;
            n4cVar.getClass();
            LogSessionId logSessionIdA = n4cVar.a();
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
            if (!logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                ((MediaFormat) lz9VarQ.b).setString("log-session-id", logSessionIdA.getStringId());
            }
        }
        try {
            Trace.beginSection("createCodec:" + str);
            kw8 kw8VarE = this.C0.e(lz9VarQ);
            this.W0 = kw8VarE;
            kw8VarE.m(new r5j(26, this));
            Trace.endSection();
            this.Y.getClass();
            float f2 = fN;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!pw8Var.e(hf6Var)) {
                String strD = hf6.d(hf6Var);
                Locale locale = Locale.US;
                a8i.l("MediaCodecRenderer", wy1.j("Format exceeds selected codec's capabilities [", strD, ", ", str, "]"));
            }
            this.a1 = f2;
            this.X0 = hf6Var;
            boolean z = false;
            this.e1 = i == 29 && "c2.android.aac.decoder".equals(str);
            String str2 = pw8Var.a;
            if ((i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2) || "OMX.bcm.vdec.avc.tunnel".equals(str2) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str2) || "OMX.bcm.vdec.hevc.tunnel".equals(str2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && pw8Var.g)) {
                z = true;
            }
            this.h1 = z;
            this.W0.getClass();
            if (this.Z == 2) {
                this.Y.getClass();
                this.j1 = SystemClock.elapsedRealtime() + 1000;
            }
            this.G1.b++;
            Y(jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime, str);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean T(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        hf6 hf6Var = this.O0;
        return hf6Var == null || !Objects.equals(hf6Var.n, "audio/opus") || j - j2 > 80000;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U() {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw8.U():void");
    }

    public final void V(MediaCrypto mediaCrypto, boolean z) throws MediaCodecRenderer$DecoderInitializationException {
        hf6 hf6Var = this.N0;
        hf6Var.getClass();
        if (this.b1 == null) {
            try {
                List listK = K(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.b1 = arrayDeque;
                if (this.E0) {
                    arrayDeque.addAll(listK);
                } else {
                    ArrayList arrayList = (ArrayList) listK;
                    if (!arrayList.isEmpty()) {
                        this.b1.add((pw8) arrayList.get(0));
                    }
                }
                this.c1 = null;
            } catch (MediaCodecUtil$DecoderQueryException e) {
                throw new MediaCodecRenderer$DecoderInitializationException(hf6Var, e, z, -49998);
            }
        }
        if (this.b1.isEmpty()) {
            throw new MediaCodecRenderer$DecoderInitializationException(hf6Var, null, z, -49999);
        }
        ArrayDeque arrayDeque2 = this.b1;
        arrayDeque2.getClass();
        while (this.W0 == null) {
            pw8 pw8Var = (pw8) arrayDeque2.peekFirst();
            pw8Var.getClass();
            if (!W(hf6Var) || !s0(pw8Var)) {
                return;
            }
            try {
                S(pw8Var, mediaCrypto);
            } catch (Exception e2) {
                a8i.m("MediaCodecRenderer", "Failed to initialize decoder: " + pw8Var, e2);
                arrayDeque2.removeFirst();
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException = new MediaCodecRenderer$DecoderInitializationException("Decoder init failed: " + pw8Var.a + ", " + hf6Var, e2, hf6Var.n, z, pw8Var, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null);
                X(mediaCodecRenderer$DecoderInitializationException);
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException2 = this.c1;
                if (mediaCodecRenderer$DecoderInitializationException2 == null) {
                    this.c1 = mediaCodecRenderer$DecoderInitializationException;
                } else {
                    this.c1 = new MediaCodecRenderer$DecoderInitializationException(mediaCodecRenderer$DecoderInitializationException2.getMessage(), mediaCodecRenderer$DecoderInitializationException2.getCause(), mediaCodecRenderer$DecoderInitializationException2.a, mediaCodecRenderer$DecoderInitializationException2.b, mediaCodecRenderer$DecoderInitializationException2.c, mediaCodecRenderer$DecoderInitializationException2.d);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.c1;
                }
            }
        }
        this.b1 = null;
    }

    public boolean W(hf6 hf6Var) {
        return true;
    }

    public abstract void X(Exception exc);

    public abstract void Y(long j, long j2, String str);

    public abstract void Z(String str);

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e3, code lost:
    
        if (r4.e(r2) != false) goto L109;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.sh4 a0(defpackage.xt4 r13) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw8.a0(xt4):sh4");
    }

    public abstract void b0(hf6 hf6Var, MediaFormat mediaFormat);

    public void c0() {
    }

    public void d0(long j) {
        this.I1 = j;
        while (true) {
            ArrayDeque arrayDeque = this.L0;
            if (arrayDeque.isEmpty() || j < ((rw8) arrayDeque.peek()).a) {
                return;
            }
            rw8 rw8Var = (rw8) arrayDeque.poll();
            rw8Var.getClass();
            p0(rw8Var);
            e0();
        }
    }

    public abstract void e0();

    @Override // defpackage.tk0
    public final long f(long j, long j2) {
        return P(j, j2);
    }

    public void f0(ph4 ph4Var) {
    }

    public final void g0() throws MediaCryptoException, ExoPlaybackException {
        int i = this.v1;
        if (i == 1) {
            H();
            return;
        }
        if (i == 2) {
            H();
            x0();
        } else if (i != 3) {
            this.C1 = true;
            k0();
        } else {
            j0();
            U();
        }
    }

    public abstract boolean h0(long j, long j2, kw8 kw8Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, hf6 hf6Var);

    public final boolean i0(int i) throws MediaCryptoException, ExoPlaybackException {
        xt4 xt4Var = this.c;
        xt4Var.clear();
        ph4 ph4Var = this.G0;
        ph4Var.w();
        int iV = v(xt4Var, ph4Var, i | 4);
        if (iV == -5) {
            a0(xt4Var);
            return true;
        }
        if (iV != -4 || !ph4Var.j(4)) {
            return false;
        }
        this.B1 = true;
        g0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j0() {
        try {
            kw8 kw8Var = this.W0;
            if (kw8Var != null) {
                kw8Var.release();
                this.G1.c++;
                pw8 pw8Var = this.d1;
                pw8Var.getClass();
                Z(pw8Var.a);
            }
            this.W0 = null;
            try {
                MediaCrypto mediaCrypto = this.S0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.W0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.S0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public abstract void k0();

    @Override // defpackage.tk0
    public boolean l() {
        boolean zE;
        if (this.N0 != null) {
            if (i()) {
                zE = this.x0;
            } else {
                jxd jxdVar = this.s0;
                jxdVar.getClass();
                zE = jxdVar.e();
            }
            if (!zE) {
                if (!(this.l1 >= 0)) {
                    if (this.j1 != -9223372036854775807L) {
                        this.Y.getClass();
                        if (SystemClock.elapsedRealtime() < this.j1) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void l0() {
        this.z1 = -9223372036854775807L;
        this.A1 = -9223372036854775807L;
        this.I1 = -9223372036854775807L;
        this.r1 = false;
        this.J0.w();
        this.I0.w();
        this.q1 = false;
        fua fuaVar = this.M0;
        fuaVar.getClass();
        fuaVar.d = l50.a;
        fuaVar.c = 0;
        fuaVar.b = 2;
    }

    @Override // defpackage.tk0
    public void m() {
        this.N0 = null;
        p0(rw8.e);
        this.L0.clear();
        if (!this.p1) {
            I();
        } else {
            this.p1 = false;
            l0();
        }
    }

    public void m0() {
        this.k1 = -1;
        this.H0.o = null;
        this.l1 = -1;
        this.m1 = null;
        this.z1 = -9223372036854775807L;
        this.A1 = -9223372036854775807L;
        this.I1 = -9223372036854775807L;
        this.j1 = -9223372036854775807L;
        this.x1 = false;
        this.i1 = -9223372036854775807L;
        this.w1 = false;
        this.f1 = false;
        this.g1 = false;
        this.n1 = false;
        this.o1 = false;
        this.u1 = 0;
        this.v1 = 0;
        this.t1 = this.s1 ? 1 : 0;
        this.L1 = false;
        this.M1 = -9223372036854775807L;
        this.N1 = -9223372036854775807L;
    }

    public final void n0() {
        m0();
        this.F1 = null;
        this.b1 = null;
        this.d1 = null;
        this.X0 = null;
        this.Y0 = null;
        this.Z0 = false;
        this.y1 = false;
        this.a1 = -1.0f;
        this.e1 = false;
        this.h1 = false;
        this.s1 = false;
        this.t1 = 0;
    }

    @Override // defpackage.tk0
    public void o(long j, boolean z) {
        this.B1 = false;
        this.C1 = false;
        this.E1 = false;
        if (this.p1) {
            l0();
        } else if (I()) {
            U();
        }
        if (this.H1.d.h() > 0) {
            this.D1 = true;
        }
        i9g i9gVar = this.H1.d;
        synchronized (i9gVar) {
            i9gVar.d = 0;
            i9gVar.e = 0;
            Arrays.fill(i9gVar.c, (Object) null);
        }
        this.L0.clear();
    }

    public final void o0(z45 z45Var) {
        z45 z45Var2 = this.P0;
        if (z45Var2 != z45Var) {
            if (z45Var != null) {
                z45Var.d(null);
            }
            if (z45Var2 != null) {
                z45Var2.c(null);
            }
        }
        this.P0 = z45Var;
    }

    public final void p0(rw8 rw8Var) {
        this.H1 = rw8Var;
        if (rw8Var.c != -9223372036854775807L) {
            this.J1 = true;
            c0();
        }
    }

    public boolean q0(ph4 ph4Var) {
        return false;
    }

    public boolean r0() {
        return true;
    }

    public boolean s0(pw8 pw8Var) {
        return true;
    }

    public boolean t0() throws MediaCryptoException {
        int i = this.v1;
        if (i == 3 || (this.e1 && !this.y1)) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            x0();
            return false;
        } catch (ExoPlaybackException e) {
            a8i.m("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // defpackage.tk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(defpackage.hf6[] r12, long r13, long r15, defpackage.d99 r17) {
        /*
            r11 = this;
            rw8 r12 = r11.H1
            long r0 = r12.c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            rw8 r4 = new rw8
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.p0(r4)
            boolean r12 = r11.K1
            if (r12 == 0) goto L56
            r11.e0()
            return
        L24:
            java.util.ArrayDeque r12 = r11.L0
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.z1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.I1
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            rw8 r4 = new rw8
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.p0(r4)
            rw8 r12 = r11.H1
            long r12 = r12.c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.e0()
        L56:
            return
        L57:
            rw8 r0 = new rw8
            long r1 = r11.z1
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw8.u(hf6[], long, long, d99):void");
    }

    public boolean u0(hf6 hf6Var) {
        return false;
    }

    public abstract int v0(uw8 uw8Var, hf6 hf6Var);

    /* JADX WARN: Removed duplicated region for block: B:41:0x0078 A[LOOP:1: B:31:0x0053->B:41:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099 A[LOOP:2: B:42:0x0079->B:52:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0079 A[EDGE_INSN: B:87:0x0079->B:90:? BREAK  A[LOOP:1: B:31:0x0053->B:41:0x0078], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009a A[EDGE_INSN: B:88:0x009a->B:53:0x009a BREAK  A[LOOP:2: B:42:0x0079->B:52:0x0099], SYNTHETIC] */
    @Override // defpackage.tk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(long r12, long r14) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw8.w(long, long):void");
    }

    public final boolean w0(hf6 hf6Var) {
        if (this.W0 != null && this.v1 != 3 && this.Z != 0) {
            float f = this.V0;
            hf6Var.getClass();
            hf6[] hf6VarArr = this.t0;
            hf6VarArr.getClass();
            float fN = N(f, hf6Var, hf6VarArr);
            float f2 = this.a1;
            if (f2 != fN) {
                if (fN == -1.0f) {
                    if (this.w1) {
                        this.u1 = 1;
                        this.v1 = 3;
                        return false;
                    }
                    j0();
                    U();
                    return false;
                }
                if (f2 != -1.0f || fN > this.F0) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fN);
                    kw8 kw8Var = this.W0;
                    kw8Var.getClass();
                    kw8Var.setParameters(bundle);
                    this.a1 = fN;
                }
            }
        }
        return true;
    }

    public final void x0() throws MediaCryptoException, ExoPlaybackException {
        z45 z45Var = this.Q0;
        z45Var.getClass();
        xa4 xa4VarG = z45Var.g();
        if (xa4VarG instanceof jk6) {
            try {
                MediaCrypto mediaCrypto = this.S0;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((jk6) xa4VarG).b);
            } catch (MediaCryptoException e) {
                throw d(e, this.N0, false, 6006);
            }
        }
        o0(this.Q0);
        this.u1 = 0;
        this.v1 = 0;
    }

    @Override // defpackage.tk0
    public void y(float f, float f2) {
        this.U0 = f;
        this.V0 = f2;
        w0(this.X0);
    }

    public final void y0(long j) {
        hf6 hf6Var = (hf6) this.H1.d.f(j);
        if (hf6Var == null && this.J1 && this.Y0 != null) {
            hf6Var = (hf6) this.H1.d.e();
        }
        if (hf6Var != null) {
            this.O0 = hf6Var;
        } else if (!this.Z0 || this.O0 == null) {
            return;
        }
        hf6 hf6Var2 = this.O0;
        hf6Var2.getClass();
        b0(hf6Var2, this.Y0);
        this.Z0 = false;
        this.J1 = false;
    }

    @Override // defpackage.tk0
    public final int z(hf6 hf6Var) throws ExoPlaybackException {
        try {
            return v0(this.D0, hf6Var);
        } catch (MediaCodecUtil$DecoderQueryException e) {
            throw d(e, hf6Var, false, 4002);
        }
    }
}
