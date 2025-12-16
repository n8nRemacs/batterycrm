package defpackage;

import android.content.Context;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import androidx.work.WorkRequest;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Objects;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes.dex */
public final class mw8 extends tw8 implements fw8 {
    public final xo8 P1;
    public final ak4 Q1;
    public final sa9 R1;
    public int S1;
    public boolean T1;
    public hf6 U1;
    public hf6 V1;
    public long W1;
    public boolean X1;
    public boolean Y1;
    public boolean Z1;
    public int a2;
    public boolean b2;
    public long c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw8(Context context, iw8 iw8Var, uw8 uw8Var, boolean z, Handler handler, yl5 yl5Var, ak4 ak4Var) {
        super(1, iw8Var, uw8Var, z, 44100.0f);
        sa9 sa9Var = Build.VERSION.SDK_INT >= 35 ? new sa9(10) : null;
        context.getApplicationContext();
        this.Q1 = ak4Var;
        this.R1 = sa9Var;
        this.a2 = -1000;
        this.P1 = new xo8(handler, 5, yl5Var);
        this.c2 = -9223372036854775807L;
        ak4Var.s = new y6i(23, this);
    }

    public final void A0() {
        long j;
        long jMax;
        long j2;
        j();
        ak4 ak4Var = this.Q1;
        sa9 sa9Var = ak4Var.b;
        if (!ak4Var.o() || ak4Var.L) {
            j = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(ak4Var.h.a(), zxg.c0(ak4Var.u.e, ak4Var.k()));
            ArrayDeque arrayDeque = ak4Var.i;
            while (!arrayDeque.isEmpty() && jMin >= ((wj4) arrayDeque.getFirst()).c) {
                ak4Var.C = (wj4) arrayDeque.remove();
            }
            wj4 wj4Var = ak4Var.C;
            long jE0 = jMin - wj4Var.c;
            long jD = zxg.D(wj4Var.a.a, jE0);
            if (arrayDeque.isEmpty()) {
                q6f q6fVar = (q6f) sa9Var.c;
                if (q6fVar.isActive()) {
                    if (q6fVar.p >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                        long j3 = q6fVar.o;
                        q6fVar.k.getClass();
                        long j4 = j3 - ((r10.k * r10.b) * 2);
                        int i = q6fVar.i.a;
                        int i2 = q6fVar.h.a;
                        if (i == i2) {
                            jE0 = zxg.e0(jE0, j4, q6fVar.p, RoundingMode.DOWN);
                            j = Long.MIN_VALUE;
                        } else {
                            j = Long.MIN_VALUE;
                            jE0 = zxg.e0(jE0, j4 * i, q6fVar.p * i2, RoundingMode.DOWN);
                        }
                    } else {
                        j = Long.MIN_VALUE;
                        jE0 = (long) (q6fVar.d * jE0);
                    }
                    wj4 wj4Var2 = ak4Var.C;
                    j2 = wj4Var2.b + jE0;
                    wj4Var2.d = jE0 - jD;
                } else {
                    j = Long.MIN_VALUE;
                    wj4 wj4Var22 = ak4Var.C;
                    j2 = wj4Var22.b + jE0;
                    wj4Var22.d = jE0 - jD;
                }
            } else {
                j = Long.MIN_VALUE;
                wj4 wj4Var3 = ak4Var.C;
                j2 = wj4Var3.b + jD + wj4Var3.d;
            }
            long j5 = ((w0f) sa9Var.b).q;
            jMax = zxg.c0(ak4Var.u.e, j5) + j2;
            long j6 = ak4Var.g0;
            if (j5 > j6) {
                long jC0 = zxg.c0(ak4Var.u.e, j5 - j6);
                ak4Var.g0 = j5;
                ak4Var.h0 += jC0;
                if (ak4Var.i0 == null) {
                    ak4Var.i0 = new Handler(Looper.myLooper());
                }
                ak4Var.i0.removeCallbacksAndMessages(null);
                ak4Var.i0.postDelayed(new qj4(0, ak4Var), 100L);
            }
        }
        if (jMax != j) {
            if (!this.X1) {
                jMax = Math.max(this.W1, jMax);
            }
            this.W1 = jMax;
            this.X1 = false;
        }
    }

    @Override // defpackage.tw8
    public final sh4 C(pw8 pw8Var, hf6 hf6Var, hf6 hf6Var2) {
        sh4 sh4VarB = pw8Var.b(hf6Var, hf6Var2);
        int i = sh4VarB.e;
        if (this.Q0 == null && u0(hf6Var2)) {
            i |= 32768;
        }
        "OMX.google.raw.decoder".equals(pw8Var.a);
        if (hf6Var2.o > this.S1) {
            i |= 64;
        }
        int i2 = i;
        return new sh4(pw8Var.a, hf6Var, hf6Var2, i2 != 0 ? 0 : sh4VarB.d, i2);
    }

    @Override // defpackage.fw8
    public final void J(c3c c3cVar) {
        ak4 ak4Var = this.Q1;
        ak4Var.getClass();
        ak4Var.D = new c3c(zxg.h(c3cVar.a, 0.1f, 8.0f), zxg.h(c3cVar.b, 0.1f, 8.0f));
        uj4 uj4Var = ak4Var.u;
        if (uj4Var != null && uj4Var.j) {
            ak4Var.v();
            return;
        }
        wj4 wj4Var = new wj4(c3cVar, -9223372036854775807L, -9223372036854775807L);
        if (ak4Var.o()) {
            ak4Var.B = wj4Var;
        } else {
            ak4Var.C = wj4Var;
        }
    }

    @Override // defpackage.fw8
    public final boolean M() {
        boolean z = this.Z1;
        this.Z1 = false;
        return z;
    }

    @Override // defpackage.tw8
    public final float N(float f, hf6 hf6Var, hf6[] hf6VarArr) {
        int iMax = -1;
        for (hf6 hf6Var2 : hf6VarArr) {
            int i = hf6Var2.G;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @Override // defpackage.tw8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList O(defpackage.uw8 r4, defpackage.hf6 r5, boolean r6) {
        /*
            r3 = this;
            java.lang.String r0 = r5.n
            if (r0 != 0) goto L7
            zjd r4 = defpackage.zjd.o
            goto L2f
        L7:
            ak4 r0 = r3.Q1
            int r0 = r0.i(r5)
            r1 = 0
            if (r0 == 0) goto L2b
            java.lang.String r0 = "audio/raw"
            java.util.List r0 = defpackage.dx8.d(r0, r1, r1)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L1e
            r0 = 0
            goto L24
        L1e:
            java.lang.Object r0 = r0.get(r1)
            pw8 r0 = (defpackage.pw8) r0
        L24:
            if (r0 == 0) goto L2b
            zjd r4 = defpackage.wg7.m(r0)
            goto L2f
        L2b:
            zjd r4 = defpackage.dx8.f(r4, r5, r6, r1)
        L2f:
            java.util.HashMap r6 = defpackage.dx8.a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            vw8 r4 = new vw8
            r0 = 1
            r4.<init>(r0, r5)
            dj3 r5 = new dj3
            r0 = 8
            r5.<init>(r0, r4)
            java.util.Collections.sort(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw8.O(uw8, hf6, boolean):java.util.ArrayList");
    }

    @Override // defpackage.tw8
    public final long P(long j, long j2) {
        long jE0;
        boolean z = this.c2 != -9223372036854775807L;
        if (this.b2) {
            ak4 ak4Var = this.Q1;
            if (ak4Var.o()) {
                AudioTrack audioTrack = ak4Var.w;
                uj4 uj4Var = ak4Var.u;
                if (uj4Var.c == 0) {
                    jE0 = zxg.c0(uj4Var.e, audioTrack.getBufferSizeInFrames());
                } else {
                    long bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
                    int iC = dbj.c(uj4Var.g);
                    hsi.g(iC != -2147483647);
                    jE0 = zxg.e0(bufferSizeInFrames, 1000000L, iC, RoundingMode.DOWN);
                }
            } else {
                jE0 = -9223372036854775807L;
            }
            if (z && jE0 != -9223372036854775807L) {
                float fMin = Math.min(jE0, this.c2 - j);
                float f = mo25c() != null ? mo25c().a : 1.0f;
                this.Y.getClass();
                return Math.max(WorkRequest.MIN_BACKOFF_MILLIS, ((long) ((fMin / f) / 2.0f)) - (zxg.U(SystemClock.elapsedRealtime()) - j2));
            }
        } else if (z || this.C1) {
            return 1000000L;
        }
        return WorkRequest.MIN_BACKOFF_MILLIS;
    }

    @Override // defpackage.tw8
    public final lz9 Q(pw8 pw8Var, hf6 hf6Var, MediaCrypto mediaCrypto, float f) {
        hf6[] hf6VarArr = this.t0;
        hf6VarArr.getClass();
        String str = pw8Var.a;
        "OMX.google.raw.decoder".equals(str);
        int iMax = hf6Var.o;
        String str2 = hf6Var.n;
        int i = hf6Var.F;
        if (hf6VarArr.length != 1) {
            for (hf6 hf6Var2 : hf6VarArr) {
                if (pw8Var.b(hf6Var, hf6Var2).d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    iMax = Math.max(iMax, hf6Var2.o);
                }
            }
        }
        this.S1 = iMax;
        this.T1 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = pw8Var.c;
        int i2 = this.S1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", i);
        int i3 = hf6Var.G;
        mediaFormat.setInteger("sample-rate", i3);
        vui.i(mediaFormat, hf6Var.q);
        vui.g(mediaFormat, "max-input-size", i2);
        int i4 = Build.VERSION.SDK_INT;
        mediaFormat.setInteger(LogFactory.PRIORITY_KEY, 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if ("audio/ac4".equals(str2)) {
            Pair pairB = ed3.b(hf6Var);
            if (pairB != null) {
                vui.g(mediaFormat, "profile", ((Integer) pairB.first).intValue());
                vui.g(mediaFormat, "level", ((Integer) pairB.second).intValue());
            }
            if (i4 <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        ff6 ff6Var = new ff6();
        ff6Var.m = xz9.n("audio/raw");
        ff6Var.E = i;
        ff6Var.F = i3;
        ff6Var.G = 4;
        if (this.Q1.i(new hf6(ff6Var)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i4 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i4 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.a2));
        }
        this.V1 = (!"audio/raw".equals(pw8Var.b) || "audio/raw".equals(str2)) ? null : hf6Var;
        return new lz9(pw8Var, mediaFormat, hf6Var, null, mediaCrypto, this.R1);
    }

    @Override // defpackage.tw8
    public final void R(ph4 ph4Var) {
        hf6 hf6Var;
        uj4 uj4Var;
        if (Build.VERSION.SDK_INT < 29 || (hf6Var = ph4Var.c) == null || !Objects.equals(hf6Var.n, "audio/opus") || !this.p1) {
            return;
        }
        ByteBuffer byteBuffer = ph4Var.Z;
        byteBuffer.getClass();
        hf6 hf6Var2 = ph4Var.c;
        hf6Var2.getClass();
        int i = hf6Var2.I;
        if (byteBuffer.remaining() == 8) {
            int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            ak4 ak4Var = this.Q1;
            AudioTrack audioTrack = ak4Var.w;
            if (audioTrack == null || !ak4.p(audioTrack) || (uj4Var = ak4Var.u) == null || !uj4Var.k) {
                return;
            }
            ak4Var.w.setOffloadDelayPadding(i, i2);
        }
    }

    @Override // defpackage.tw8
    public final void X(Exception exc) {
        a8i.h("MediaCodecAudioRenderer", "Audio codec error", exc);
        xo8 xo8Var = this.P1;
        Handler handler = (Handler) xo8Var.b;
        if (handler != null) {
            handler.post(new q50(xo8Var, exc, 0));
        }
    }

    @Override // defpackage.tw8
    public final void Y(long j, long j2, String str) {
        xo8 xo8Var = this.P1;
        Handler handler = (Handler) xo8Var.b;
        if (handler != null) {
            handler.post(new s50(xo8Var, str, j, j2, 0));
        }
    }

    @Override // defpackage.tw8
    public final void Z(String str) {
        xo8 xo8Var = this.P1;
        Handler handler = (Handler) xo8Var.b;
        if (handler != null) {
            handler.post(new ud(xo8Var, 8, str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    @Override // defpackage.tk0, defpackage.u4c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r9, java.lang.Object r10) throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw8.a(int, java.lang.Object):void");
    }

    @Override // defpackage.tw8
    public final sh4 a0(xt4 xt4Var) {
        hf6 hf6Var = (hf6) xt4Var.c;
        hf6Var.getClass();
        this.U1 = hf6Var;
        sh4 sh4VarA0 = super.a0(xt4Var);
        xo8 xo8Var = this.P1;
        Handler handler = (Handler) xo8Var.b;
        if (handler != null) {
            handler.post(new cj(xo8Var, hf6Var, sh4VarA0, 2));
        }
        return sh4VarA0;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea A[Catch: AudioSink$ConfigurationException -> 0x00e8, TryCatch #0 {AudioSink$ConfigurationException -> 0x00e8, blocks: (B:36:0x00bf, B:39:0x00c7, B:41:0x00cb, B:43:0x00d4, B:47:0x00e2, B:50:0x00ea, B:54:0x00f1, B:55:0x00f6), top: B:59:0x00bf }] */
    @Override // defpackage.tw8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0(defpackage.hf6 r8, android.media.MediaFormat r9) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw8.b0(hf6, android.media.MediaFormat):void");
    }

    @Override // defpackage.fw8
    /* renamed from: c */
    public final c3c mo25c() {
        return this.Q1.D;
    }

    @Override // defpackage.tw8
    public final void c0() {
        this.Q1.getClass();
    }

    @Override // defpackage.tw8
    public final void e0() {
        this.Q1.K = true;
    }

    @Override // defpackage.tk0
    public final fw8 g() {
        return this;
    }

    @Override // defpackage.tk0
    public final String h() {
        return "MediaCodecAudioRenderer";
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    @Override // defpackage.tw8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h0(long r1, long r3, defpackage.kw8 r5, java.nio.ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, defpackage.hf6 r14) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r0 = this;
            r6.getClass()
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.c2 = r1
            hf6 r1 = r0.V1
            r2 = 1
            if (r1 == 0) goto L1a
            r1 = r8 & 2
            if (r1 == 0) goto L1a
            r5.getClass()
            r5.l(r7)
            return r2
        L1a:
            ak4 r1 = r0.Q1
            if (r12 == 0) goto L2d
            if (r5 == 0) goto L23
            r5.l(r7)
        L23:
            nh4 r3 = r0.G1
            int r4 = r3.g
            int r4 = r4 + r9
            r3.g = r4
            r1.K = r2
            return r2
        L2d:
            boolean r1 = r1.l(r9, r10, r6)     // Catch: androidx.media3.exoplayer.audio.AudioSink$WriteException -> L44 androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L5e
            if (r1 == 0) goto L40
            if (r5 == 0) goto L38
            r5.l(r7)
        L38:
            nh4 r1 = r0.G1
            int r3 = r1.f
            int r3 = r3 + r9
            r1.f = r3
            return r2
        L40:
            r0.c2 = r10
            r1 = 0
            return r1
        L44:
            r1 = move-exception
            boolean r2 = r0.p1
            if (r2 == 0) goto L55
            kld r2 = r0.d
            r2.getClass()
            int r2 = r2.a
            if (r2 == 0) goto L55
            r2 = 5003(0x138b, float:7.01E-42)
            goto L57
        L55:
            r2 = 5002(0x138a, float:7.009E-42)
        L57:
            boolean r3 = r1.b
            androidx.media3.exoplayer.ExoPlaybackException r1 = r0.d(r1, r14, r3, r2)
            throw r1
        L5e:
            r1 = move-exception
            hf6 r2 = r0.U1
            boolean r3 = r0.p1
            if (r3 == 0) goto L71
            kld r3 = r0.d
            r3.getClass()
            int r3 = r3.a
            if (r3 == 0) goto L71
            r3 = 5004(0x138c, float:7.012E-42)
            goto L73
        L71:
            r3 = 5001(0x1389, float:7.008E-42)
        L73:
            boolean r4 = r1.b
            androidx.media3.exoplayer.ExoPlaybackException r1 = r0.d(r1, r2, r4, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw8.h0(long, long, kw8, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, hf6):boolean");
    }

    @Override // defpackage.tk0
    public final boolean j() {
        if (!this.C1) {
            return false;
        }
        ak4 ak4Var = this.Q1;
        if (ak4Var.o()) {
            return ak4Var.R && !ak4Var.m();
        }
        return true;
    }

    @Override // defpackage.tw8
    public final void k0() throws IllegalStateException, ExoPlaybackException {
        try {
            ak4 ak4Var = this.Q1;
            if (!ak4Var.R && ak4Var.o() && ak4Var.f()) {
                ak4Var.s();
                ak4Var.R = true;
            }
            long j = this.A1;
            if (j != -9223372036854775807L) {
                this.c2 = j;
            }
        } catch (AudioSink$WriteException e) {
            throw d(e, e.c, e.b, this.p1 ? 5003 : 5002);
        }
    }

    @Override // defpackage.tw8, defpackage.tk0
    public final boolean l() {
        return this.Q1.m() || super.l();
    }

    @Override // defpackage.tw8, defpackage.tk0
    public final void m() {
        xo8 xo8Var = this.P1;
        this.Y1 = true;
        this.U1 = null;
        this.c2 = -9223372036854775807L;
        try {
            this.Q1.g();
            try {
                super.m();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.m();
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.tk0
    public final void n(boolean z, boolean z2) throws IllegalStateException {
        nh4 nh4Var = new nh4(1);
        this.G1 = nh4Var;
        xo8 xo8Var = this.P1;
        Handler handler = (Handler) xo8Var.b;
        if (handler != null) {
            handler.post(new t50(xo8Var, nh4Var, 0));
        }
        kld kldVar = this.d;
        kldVar.getClass();
        boolean z3 = kldVar.b;
        ak4 ak4Var = this.Q1;
        if (z3) {
            hsi.g(ak4Var.V);
            if (!ak4Var.a0) {
                ak4Var.a0 = true;
                ak4Var.g();
            }
        } else if (ak4Var.a0) {
            ak4Var.a0 = false;
            ak4Var.g();
        }
        n4c n4cVar = this.X;
        n4cVar.getClass();
        ak4Var.r = n4cVar;
        mwf mwfVar = this.Y;
        mwfVar.getClass();
        ak4Var.h.F = mwfVar;
    }

    @Override // defpackage.tw8, defpackage.tk0
    public final void o(long j, boolean z) throws IllegalStateException {
        super.o(j, z);
        this.Q1.g();
        this.W1 = j;
        this.c2 = -9223372036854775807L;
        this.Z1 = false;
        this.X1 = true;
    }

    @Override // defpackage.tk0
    public final void p() {
        sa9 sa9Var;
        x20 x20Var = this.Q1.y;
        if (x20Var != null) {
            Context context = (Context) x20Var.b;
            if (x20Var.a) {
                x20Var.h = null;
                v20 v20Var = (v20) x20Var.e;
                if (v20Var != null) {
                    j40.a(context).unregisterAudioDeviceCallback(v20Var);
                }
                context.unregisterReceiver((eo) x20Var.f);
                w20 w20Var = (w20) x20Var.g;
                if (w20Var != null) {
                    w20Var.a.unregisterContentObserver(w20Var);
                }
                x20Var.a = false;
            }
        }
        if (Build.VERSION.SDK_INT < 35 || (sa9Var = this.R1) == null) {
            return;
        }
        ((HashSet) sa9Var.a).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) sa9Var.c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // defpackage.tk0
    public final void q() throws IllegalStateException {
        ak4 ak4Var = this.Q1;
        this.Z1 = false;
        this.c2 = -9223372036854775807L;
        try {
            try {
                this.p1 = false;
                l0();
                j0();
                z45 z45Var = this.Q0;
                if (z45Var != null) {
                    z45Var.c(null);
                }
                this.Q0 = null;
            } catch (Throwable th) {
                z45 z45Var2 = this.Q0;
                if (z45Var2 != null) {
                    z45Var2.c(null);
                }
                this.Q0 = null;
                throw th;
            }
        } finally {
            if (this.Y1) {
                this.Y1 = false;
                ak4Var.u();
            }
        }
    }

    @Override // defpackage.fw8
    public final long r() {
        if (this.Z == 2) {
            A0();
        }
        return this.W1;
    }

    @Override // defpackage.tk0
    public final void s() throws IllegalStateException {
        this.Q1.r();
        this.b2 = true;
    }

    @Override // defpackage.tk0
    public final void t() throws IllegalStateException {
        A0();
        this.b2 = false;
        ak4 ak4Var = this.Q1;
        ak4Var.U = false;
        if (ak4Var.o()) {
            l60 l60Var = ak4Var.h;
            l60Var.f();
            if (l60Var.w == -9223372036854775807L) {
                i60 i60Var = l60Var.e;
                i60Var.getClass();
                i60Var.a(0);
            }
            l60Var.y = l60Var.b();
            if (!ak4Var.S || ak4.p(ak4Var.w)) {
                ak4Var.w.pause();
            }
        }
    }

    @Override // defpackage.tw8
    public final boolean u0(hf6 hf6Var) {
        kld kldVar = this.d;
        kldVar.getClass();
        if (kldVar.a != 0) {
            int iZ0 = z0(hf6Var);
            if ((iZ0 & 512) != 0) {
                kld kldVar2 = this.d;
                kldVar2.getClass();
                if (kldVar2.a == 2 || (iZ0 & 1024) != 0 || (hf6Var.I == 0 && hf6Var.J == 0)) {
                    return true;
                }
            }
        }
        return this.Q1.i(hf6Var) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    @Override // defpackage.tw8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int v0(defpackage.uw8 r19, defpackage.hf6 r20) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw8.v0(uw8, hf6):int");
    }

    public final int z0(hf6 hf6Var) {
        a50 a50VarH = this.Q1.h(hf6Var);
        if (!a50VarH.a) {
            return 0;
        }
        int i = a50VarH.b ? 1536 : 512;
        return a50VarH.c ? i | 2048 : i;
    }
}
