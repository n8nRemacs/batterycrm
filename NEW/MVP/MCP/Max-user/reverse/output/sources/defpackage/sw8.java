package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class sw8 extends sk0 {
    public static final byte[] N1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final oh4 A0;
    public boolean A1;
    public final oh4 B0;
    public boolean B1;
    public final em0 C0;
    public long C1;
    public final i9g D0;
    public long D1;
    public final ArrayList E0;
    public boolean E1;
    public final MediaCodec.BufferInfo F0;
    public boolean F1;
    public final long[] G0;
    public boolean G1;
    public final long[] H0;
    public boolean H1;
    public final long[] I0;
    public ExoPlaybackException I1;
    public gf6 J0;
    public nh4 J1;
    public gf6 K0;
    public long K1;
    public mc5 L0;
    public long L1;
    public mc5 M0;
    public int M1;
    public MediaCrypto N0;
    public boolean O0;
    public final long P0;
    public float Q0;
    public float R0;
    public jw8 S0;
    public gf6 T0;
    public MediaFormat U0;
    public boolean V0;
    public float W0;
    public ArrayDeque X0;
    public MediaCodecRenderer$DecoderInitializationException Y0;
    public ow8 Z0;
    public int a1;
    public boolean b1;
    public boolean c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public by0 l1;
    public long m1;
    public int n1;
    public int o1;
    public ByteBuffer p1;
    public boolean q1;
    public boolean r1;
    public boolean s1;
    public boolean t1;
    public boolean u1;
    public boolean v1;
    public final hw8 w0;
    public int w1;
    public final uy0 x0;
    public int x1;
    public final float y0;
    public int y1;
    public final oh4 z0;
    public boolean z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw8(int i, hw8 hw8Var, float f) {
        super(i);
        uy0 uy0Var = uy0.Z;
        this.w0 = hw8Var;
        this.x0 = uy0Var;
        this.y0 = f;
        this.z0 = new oh4(0);
        this.A0 = new oh4(0);
        this.B0 = new oh4(2);
        em0 em0Var = new em0(2);
        em0Var.u0 = 32;
        this.C0 = em0Var;
        this.D0 = new i9g(0);
        this.E0 = new ArrayList();
        this.F0 = new MediaCodec.BufferInfo();
        this.Q0 = 1.0f;
        this.R0 = 1.0f;
        this.P0 = -9223372036854775807L;
        this.G0 = new long[10];
        this.H0 = new long[10];
        this.I0 = new long[10];
        this.K1 = -9223372036854775807L;
        this.L1 = -9223372036854775807L;
        em0Var.y(0);
        em0Var.d.order(ByteOrder.nativeOrder());
        this.W0 = -1.0f;
        this.a1 = 0;
        this.w1 = 0;
        this.n1 = -1;
        this.o1 = -1;
        this.m1 = -9223372036854775807L;
        this.C1 = -9223372036854775807L;
        this.D1 = -9223372036854775807L;
        this.x1 = 0;
        this.y1 = 0;
    }

    public abstract rh4 A(ow8 ow8Var, gf6 gf6Var, gf6 gf6Var2);

    public MediaCodecDecoderException B(IllegalStateException illegalStateException, ow8 ow8Var) {
        return new MediaCodecDecoderException(illegalStateException, ow8Var);
    }

    public final void C() {
        this.u1 = false;
        this.C0.w();
        this.B0.w();
        this.t1 = false;
        this.s1 = false;
    }

    public final boolean D() throws ExoPlaybackException, MediaCryptoException {
        if (!this.z1) {
            m0();
            return true;
        }
        this.x1 = 1;
        if (this.c1 || this.e1) {
            this.y1 = 3;
            return false;
        }
        this.y1 = 2;
        return true;
    }

    public final boolean E(long j, long j2) throws ExoPlaybackException, MediaCryptoException {
        boolean z;
        boolean z2;
        MediaCodec.BufferInfo bufferInfo;
        boolean zB0;
        int i;
        boolean z3;
        int i2 = this.o1;
        MediaCodec.BufferInfo bufferInfo2 = this.F0;
        if (i2 < 0) {
            if (this.f1 && this.A1) {
                try {
                    i = this.S0.i(bufferInfo2);
                } catch (IllegalStateException unused) {
                    a0();
                    if (this.F1) {
                        d0();
                    }
                }
            } else {
                i = this.S0.i(bufferInfo2);
            }
            if (i < 0) {
                if (i != -2) {
                    if (this.k1 && (this.E1 || this.x1 == 2)) {
                        a0();
                        return false;
                    }
                    return false;
                }
                this.B1 = true;
                MediaFormat outputFormat = this.S0.getOutputFormat();
                if (this.a1 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.j1 = true;
                    return true;
                }
                if (this.h1) {
                    outputFormat.setInteger("channel-count", 1);
                }
                this.U0 = outputFormat;
                this.V0 = true;
                return true;
            }
            if (this.j1) {
                this.j1 = false;
                this.S0.releaseOutputBuffer(i, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                a0();
                return false;
            }
            this.o1 = i;
            ByteBuffer outputBuffer = this.S0.getOutputBuffer(i);
            this.p1 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo2.offset);
                this.p1.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.g1 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j3 = this.C1;
                if (j3 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = j3;
                }
            }
            long j4 = bufferInfo2.presentationTimeUs;
            ArrayList arrayList = this.E0;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z3 = false;
                    break;
                }
                if (((Long) arrayList.get(i3)).longValue() == j4) {
                    arrayList.remove(i3);
                    z3 = true;
                    break;
                }
                i3++;
            }
            this.q1 = z3;
            long j5 = this.D1;
            long j6 = bufferInfo2.presentationTimeUs;
            this.r1 = j5 == j6;
            n0(j6);
        }
        if (this.f1 && this.A1) {
            try {
                z = false;
                z2 = true;
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused2) {
                z = false;
            }
            try {
                zB0 = b0(j, j2, this.S0, this.p1, this.o1, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.q1, this.r1, this.K0);
            } catch (IllegalStateException unused3) {
                a0();
                if (!this.F1) {
                    return z;
                }
                d0();
                return z;
            }
        } else {
            z = false;
            z2 = true;
            bufferInfo = bufferInfo2;
            zB0 = b0(j, j2, this.S0, this.p1, this.o1, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.q1, this.r1, this.K0);
        }
        if (!zB0) {
            return z;
        }
        X(bufferInfo.presentationTimeUs);
        boolean z4 = (bufferInfo.flags & 4) != 0 ? z2 : z;
        this.o1 = -1;
        this.p1 = null;
        if (!z4) {
            return z2;
        }
        a0();
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F() throws com.google.android.exoplayer2.ExoPlaybackException, android.media.MediaCryptoException {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw8.F():boolean");
    }

    public final void G() {
        try {
            this.S0.flush();
        } finally {
            f0();
        }
    }

    public final boolean H() {
        if (this.S0 == null) {
            return false;
        }
        if (this.y1 == 3 || this.c1 || ((this.d1 && !this.B1) || (this.e1 && this.A1))) {
            d0();
            return true;
        }
        G();
        return false;
    }

    public final List I(boolean z) {
        gf6 gf6Var = this.J0;
        uy0 uy0Var = this.x0;
        ArrayList arrayListL = L(uy0Var, gf6Var, z);
        if (!arrayListL.isEmpty() || !z) {
            return arrayListL;
        }
        ArrayList arrayListL2 = L(uy0Var, this.J0, false);
        if (!arrayListL2.isEmpty()) {
            String str = this.J0.v0;
            String strValueOf = String.valueOf(arrayListL2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + u45.f(99, str));
            sb.append("Drm session requires secure decoder for ");
            sb.append(str);
            sb.append(", but no secure decoder available. Trying to proceed with ");
            sb.append(strValueOf);
            sb.append(".");
            Log.w("MediaCodecRenderer", sb.toString());
        }
        return arrayListL2;
    }

    public boolean J() {
        return false;
    }

    public abstract float K(float f, gf6[] gf6VarArr);

    public abstract ArrayList L(uy0 uy0Var, gf6 gf6Var, boolean z);

    public final ik6 M(mc5 mc5Var) {
        mc5Var.getClass();
        return null;
    }

    public abstract gw8 N(ow8 ow8Var, gf6 gf6Var, MediaCrypto mediaCrypto, float f);

    public void O(oh4 oh4Var) {
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(defpackage.ow8 r17, android.media.MediaCrypto r18) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw8.P(ow8, android.media.MediaCrypto):void");
    }

    public final void Q() {
        gf6 gf6Var;
        if (this.S0 != null || this.s1 || (gf6Var = this.J0) == null) {
            return;
        }
        if (this.M0 == null && j0(gf6Var)) {
            gf6 gf6Var2 = this.J0;
            C();
            String str = gf6Var2.v0;
            boolean zEquals = "audio/mp4a-latm".equals(str);
            em0 em0Var = this.C0;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                em0Var.getClass();
                em0Var.u0 = 32;
            } else {
                em0Var.getClass();
                em0Var.u0 = 1;
            }
            this.s1 = true;
            return;
        }
        h0(this.M0);
        String str2 = this.J0.v0;
        mc5 mc5Var = this.L0;
        if (mc5Var != null) {
            if (this.N0 == null) {
                M(mc5Var);
                if (this.L0.m() == null) {
                    return;
                }
            }
            if (ik6.a) {
                int iT = this.L0.t();
                if (iT == 1) {
                    DrmSession$DrmSessionException drmSession$DrmSessionExceptionM = this.L0.m();
                    drmSession$DrmSessionExceptionM.getClass();
                    throw d(drmSession$DrmSessionExceptionM, this.J0, false, drmSession$DrmSessionExceptionM.a);
                }
                if (iT != 4) {
                    return;
                }
            }
        }
        try {
            R(this.N0, this.O0);
        } catch (MediaCodecRenderer$DecoderInitializationException e) {
            throw d(e, this.J0, false, 4001);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(android.media.MediaCrypto r20, boolean r21) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw8.R(android.media.MediaCrypto, boolean):void");
    }

    public abstract void S(Exception exc);

    public abstract void T(long j, long j2, String str);

    public abstract void U(String str);

    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.rh4 V(defpackage.i5i r13) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw8.V(i5i):rh4");
    }

    public abstract void W(gf6 gf6Var, MediaFormat mediaFormat);

    public void X(long j) {
        while (true) {
            int i = this.M1;
            if (i == 0) {
                return;
            }
            long[] jArr = this.I0;
            if (j < jArr[0]) {
                return;
            }
            long[] jArr2 = this.G0;
            this.K1 = jArr2[0];
            long[] jArr3 = this.H0;
            this.L1 = jArr3[0];
            int i2 = i - 1;
            this.M1 = i2;
            System.arraycopy(jArr2, 1, jArr2, 0, i2);
            System.arraycopy(jArr3, 1, jArr3, 0, this.M1);
            System.arraycopy(jArr, 1, jArr, 0, this.M1);
            Y();
        }
    }

    public abstract void Y();

    public abstract void Z(oh4 oh4Var);

    public final void a0() throws ExoPlaybackException, MediaCryptoException {
        int i = this.y1;
        if (i == 1) {
            G();
            return;
        }
        if (i == 2) {
            G();
            m0();
        } else if (i != 3) {
            this.F1 = true;
            e0();
        } else {
            d0();
            Q();
        }
    }

    public abstract boolean b0(long j, long j2, jw8 jw8Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, gf6 gf6Var);

    public final boolean c0(int i) throws ExoPlaybackException, MediaCryptoException {
        i5i i5iVar = this.b;
        i5iVar.f();
        oh4 oh4Var = this.z0;
        oh4Var.w();
        int iQ = q(i5iVar, oh4Var, i | 4);
        if (iQ == -5) {
            V(i5iVar);
            return true;
        }
        if (iQ != -4 || !oh4Var.j(4)) {
            return false;
        }
        this.E1 = true;
        a0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d0() {
        try {
            jw8 jw8Var = this.S0;
            if (jw8Var != null) {
                jw8Var.release();
                this.J1.c++;
                U(this.Z0.a);
            }
            this.S0 = null;
            try {
                MediaCrypto mediaCrypto = this.N0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.S0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.N0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void e0() {
    }

    public void f0() {
        this.n1 = -1;
        this.A0.d = null;
        this.o1 = -1;
        this.p1 = null;
        this.m1 = -9223372036854775807L;
        this.A1 = false;
        this.z1 = false;
        this.i1 = false;
        this.j1 = false;
        this.q1 = false;
        this.r1 = false;
        this.E0.clear();
        this.C1 = -9223372036854775807L;
        this.D1 = -9223372036854775807L;
        by0 by0Var = this.l1;
        if (by0Var != null) {
            by0Var.b = 0L;
            by0Var.c = 0L;
            by0Var.a = false;
        }
        this.x1 = 0;
        this.y1 = 0;
        this.w1 = this.v1 ? 1 : 0;
    }

    public final void g0() {
        f0();
        this.I1 = null;
        this.l1 = null;
        this.X0 = null;
        this.Z0 = null;
        this.T0 = null;
        this.U0 = null;
        this.V0 = false;
        this.B1 = false;
        this.W0 = -1.0f;
        this.a1 = 0;
        this.b1 = false;
        this.c1 = false;
        this.d1 = false;
        this.e1 = false;
        this.f1 = false;
        this.g1 = false;
        this.h1 = false;
        this.k1 = false;
        this.v1 = false;
        this.w1 = 0;
        this.O0 = false;
    }

    @Override // defpackage.sk0
    public boolean h() {
        return this.F1;
    }

    public final void h0(mc5 mc5Var) {
        mc5 mc5Var2 = this.L0;
        if (mc5Var2 != mc5Var) {
            if (mc5Var != null) {
                mc5Var.f(null);
            }
            if (mc5Var2 != null) {
                mc5Var2.E(null);
            }
        }
        this.L0 = mc5Var;
    }

    @Override // defpackage.sk0
    public boolean i() {
        boolean zE;
        if (this.J0 != null) {
            if (g()) {
                zE = this.u0;
            } else {
                ixd ixdVar = this.Y;
                ixdVar.getClass();
                zE = ixdVar.e();
            }
            if (!zE) {
                if ((this.o1 >= 0) || (this.m1 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.m1)) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean i0(ow8 ow8Var) {
        return true;
    }

    public boolean j0(gf6 gf6Var) {
        return false;
    }

    public abstract int k0(uy0 uy0Var, gf6 gf6Var);

    @Override // defpackage.sk0
    public void l(long j, boolean z) {
        int i;
        this.E1 = false;
        this.F1 = false;
        this.H1 = false;
        if (this.s1) {
            this.C0.w();
            this.B0.w();
            this.t1 = false;
        } else if (H()) {
            Q();
        }
        i9g i9gVar = this.D0;
        synchronized (i9gVar) {
            i = i9gVar.e;
        }
        if (i > 0) {
            this.G1 = true;
        }
        this.D0.b();
        int i2 = this.M1;
        if (i2 != 0) {
            int i3 = i2 - 1;
            this.L1 = this.H0[i3];
            this.K1 = this.G0[i3];
            this.M1 = 0;
        }
    }

    public final boolean l0(gf6 gf6Var) {
        if (xxg.a >= 23 && this.S0 != null && this.y1 != 3 && this.X != 0) {
            float f = this.R0;
            gf6[] gf6VarArr = this.Z;
            gf6VarArr.getClass();
            float fK = K(f, gf6VarArr);
            float f2 = this.W0;
            if (f2 != fK) {
                if (fK == -1.0f) {
                    if (this.z1) {
                        this.x1 = 1;
                        this.y1 = 3;
                        return false;
                    }
                    d0();
                    Q();
                    return false;
                }
                if (f2 != -1.0f || fK > this.y0) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fK);
                    this.S0.setParameters(bundle);
                    this.W0 = fK;
                }
            }
        }
        return true;
    }

    public final void m0() throws ExoPlaybackException, MediaCryptoException {
        try {
            MediaCrypto mediaCrypto = this.N0;
            M(this.M0).getClass();
            mediaCrypto.setMediaDrmSession(null);
            h0(this.M0);
            this.x1 = 0;
            this.y1 = 0;
        } catch (MediaCryptoException e) {
            throw d(e, this.J0, false, 6006);
        }
    }

    public final void n0(long j) {
        Object objD;
        Object objG;
        i9g i9gVar = this.D0;
        synchronized (i9gVar) {
            objD = i9gVar.d(j, true);
        }
        gf6 gf6Var = (gf6) objD;
        if (gf6Var == null && this.V0) {
            i9g i9gVar2 = this.D0;
            synchronized (i9gVar2) {
                objG = i9gVar2.e == 0 ? null : i9gVar2.g();
            }
            gf6Var = (gf6) objG;
        }
        if (gf6Var != null) {
            this.K0 = gf6Var;
        } else if (!this.V0 || this.K0 == null) {
            return;
        }
        W(this.K0, this.U0);
        this.V0 = false;
    }

    @Override // defpackage.sk0
    public final void p(gf6[] gf6VarArr, long j, long j2) {
        if (this.L1 == -9223372036854775807L) {
            fsi.d(this.K1 == -9223372036854775807L);
            this.K1 = j;
            this.L1 = j2;
            return;
        }
        int i = this.M1;
        long[] jArr = this.H0;
        if (i == jArr.length) {
            long j3 = jArr[i - 1];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j3);
            Log.w("MediaCodecRenderer", sb.toString());
        } else {
            this.M1 = i + 1;
        }
        int i2 = this.M1 - 1;
        this.G0[i2] = j;
        jArr[i2] = j2;
        this.I0[i2] = this.C1;
    }

    @Override // defpackage.sk0
    public final void t(long j, long j2) throws ExoPlaybackException, MediaCryptoException {
        boolean z = false;
        if (this.H1) {
            this.H1 = false;
            a0();
        }
        ExoPlaybackException exoPlaybackException = this.I1;
        if (exoPlaybackException != null) {
            this.I1 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.F1) {
                e0();
                return;
            }
            if (this.J0 != null || c0(2)) {
                Q();
                if (this.s1) {
                    lfi.a("bypassRender");
                    while (z(j, j2)) {
                    }
                    lfi.c();
                } else if (this.S0 != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    lfi.a("drainAndFeed");
                    while (E(j, j2)) {
                        long j3 = this.P0;
                        if (!(j3 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j3)) {
                            break;
                        }
                    }
                    while (F()) {
                        long j4 = this.P0;
                        if (!(j4 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j4)) {
                            break;
                        }
                    }
                    lfi.c();
                } else {
                    nh4 nh4Var = this.J1;
                    int i = nh4Var.e;
                    ixd ixdVar = this.Y;
                    ixdVar.getClass();
                    nh4Var.e = i + ixdVar.g(j - this.s0);
                    c0(1);
                }
                synchronized (this.J1) {
                }
            }
        } catch (IllegalStateException e) {
            int i2 = xxg.a;
            if (i2 < 21 || !(e instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e;
                }
            }
            S(e);
            if (i2 >= 21) {
                if (e instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e).isRecoverable() : false) {
                    z = true;
                }
            }
            if (z) {
                d0();
            }
            throw d(B(e, this.Z0), this.J0, z, 4003);
        }
    }

    @Override // defpackage.sk0
    public void w(float f, float f2) {
        this.Q0 = f;
        this.R0 = f2;
        l0(this.T0);
    }

    @Override // defpackage.sk0
    public final int x(gf6 gf6Var) throws ExoPlaybackException {
        try {
            return k0(this.x0, gf6Var);
        } catch (MediaCodecUtil$DecoderQueryException e) {
            throw d(e, gf6Var, false, 4002);
        }
    }

    @Override // defpackage.sk0
    public final int y() {
        return 8;
    }

    public final boolean z(long j, long j2) {
        em0 em0Var;
        fsi.d(!this.F1);
        em0 em0Var2 = this.C0;
        int i = em0Var2.t0;
        if (i > 0) {
            em0Var = em0Var2;
            if (!b0(j, j2, null, em0Var2.d, this.o1, 0, i, em0Var2.X, em0Var2.j(Integer.MIN_VALUE), em0Var2.j(4), this.K0)) {
                return false;
            }
            X(em0Var.s0);
            em0Var.w();
        } else {
            em0Var = em0Var2;
        }
        if (this.E1) {
            this.F1 = true;
            return false;
        }
        boolean z = this.t1;
        oh4 oh4Var = this.B0;
        if (z) {
            fsi.d(em0Var.A(oh4Var));
            this.t1 = false;
        }
        if (this.u1) {
            if (em0Var.t0 > 0) {
                return true;
            }
            C();
            this.u1 = false;
            Q();
            if (!this.s1) {
                return false;
            }
        }
        fsi.d(!this.E1);
        i5i i5iVar = this.b;
        i5iVar.f();
        oh4Var.w();
        while (true) {
            oh4Var.w();
            int iQ = q(i5iVar, oh4Var, 0);
            if (iQ == -5) {
                V(i5iVar);
                break;
            }
            if (iQ != -4) {
                if (iQ != -3) {
                    throw new IllegalStateException();
                }
            } else {
                if (oh4Var.j(4)) {
                    this.E1 = true;
                    break;
                }
                if (this.G1) {
                    gf6 gf6Var = this.J0;
                    gf6Var.getClass();
                    this.K0 = gf6Var;
                    W(gf6Var, null);
                    this.G1 = false;
                }
                oh4Var.z();
                if (!em0Var.A(oh4Var)) {
                    this.t1 = true;
                    break;
                }
            }
        }
        if (em0Var.t0 > 0) {
            em0Var.z();
        }
        return em0Var.t0 > 0 || this.E1 || this.u1;
    }
}
