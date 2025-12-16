package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ak4 {
    public static final Object l0 = new Object();
    public static ScheduledExecutorService m0;
    public static int n0;
    public k20 A;
    public wj4 B;
    public wj4 C;
    public c3c D;
    public boolean E;
    public long F;
    public long G;
    public long H;
    public long I;
    public int J;
    public boolean K;
    public boolean L;
    public long M;
    public float N;
    public ByteBuffer O;
    public int P;
    public ByteBuffer Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public boolean X;
    public jc0 Y;
    public ao6 Z;
    public final Context a;
    public boolean a0;
    public final sa9 b;
    public long b0;
    public final ia2 c;
    public long c0;
    public final bjg d;
    public boolean d0;
    public final sbg e;
    public boolean e0;
    public final rbg f;
    public Looper f0;
    public final zjd g;
    public long g0;
    public final l60 h;
    public long h0;
    public final ArrayDeque i;
    public Handler i0;
    public int j;
    public Context j0;
    public u5i k;
    public final boolean k0;
    public final bz1 l;
    public final bz1 m;
    public final lcj n;
    public final xt4 o;
    public final kc3 p;
    public final int q;
    public n4c r;
    public y6i s;
    public uj4 t;
    public uj4 u;
    public g50 v;
    public AudioTrack w;
    public u20 x;
    public x20 y;
    public jdc z;

    public ak4(i40 i40Var) {
        int deviceId;
        Context context = (Context) i40Var.c;
        Context applicationContext = context == null ? null : context.getApplicationContext();
        this.a = applicationContext;
        this.A = k20.h;
        this.x = applicationContext == null ? (u20) i40Var.d : null;
        this.b = (sa9) i40Var.e;
        int i = Build.VERSION.SDK_INT;
        this.j = 0;
        this.n = (lcj) i40Var.f;
        xt4 xt4Var = (xt4) i40Var.h;
        xt4Var.getClass();
        this.o = xt4Var;
        this.h = new l60(new ao6(13, this));
        ia2 ia2Var = new ia2(0);
        this.c = ia2Var;
        bjg bjgVar = new bjg();
        bjgVar.m = zxg.b;
        this.d = bjgVar;
        this.e = new sbg();
        this.f = new rbg();
        this.g = wg7.n(bjgVar, ia2Var);
        this.N = 1.0f;
        this.W = 0;
        this.Y = new jc0();
        c3c c3cVar = c3c.d;
        this.C = new wj4(c3cVar, 0L, 0L);
        this.D = c3cVar;
        this.E = false;
        this.i = new ArrayDeque();
        this.l = new bz1();
        this.m = new bz1();
        this.p = (kc3) i40Var.g;
        int i2 = -1;
        if (i >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i2 = deviceId;
        }
        this.q = i2;
        this.k0 = true;
    }

    public static boolean p(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void a(long j) {
        c3c c3cVar;
        uj4 uj4Var = this.u;
        boolean z = false;
        sa9 sa9Var = this.b;
        if (uj4Var == null || !uj4Var.j) {
            if (this.a0 || uj4Var.c != 0) {
                c3cVar = c3c.d;
            } else {
                int i = uj4Var.a.H;
                c3cVar = this.D;
                q6f q6fVar = (q6f) sa9Var.c;
                float f = c3cVar.a;
                q6fVar.getClass();
                hsi.b(f > 0.0f);
                if (q6fVar.d != f) {
                    q6fVar.d = f;
                    q6fVar.j = true;
                }
                float f2 = c3cVar.b;
                hsi.b(f2 > 0.0f);
                if (q6fVar.e != f2) {
                    q6fVar.e = f2;
                    q6fVar.j = true;
                }
            }
            this.D = c3cVar;
        } else {
            c3cVar = c3c.d;
        }
        c3c c3cVar2 = c3cVar;
        if (!this.a0) {
            uj4 uj4Var2 = this.u;
            if (uj4Var2.c == 0) {
                int i2 = uj4Var2.a.H;
                z = this.E;
                ((w0f) sa9Var.b).o = z;
            }
        }
        this.E = z;
        this.i.add(new wj4(c3cVar2, Math.max(0L, j), zxg.c0(this.u.e, k())));
        g50 g50Var = this.u.i;
        this.v = g50Var;
        g50Var.b();
        y6i y6iVar = this.s;
        if (y6iVar != null) {
            boolean z2 = this.E;
            xo8 xo8Var = ((mw8) y6iVar.b).P1;
            Handler handler = (Handler) xo8Var.b;
            if (handler != null) {
                handler.post(new ui(1, xo8Var, z2));
            }
        }
    }

    public final AudioTrack b(x50 x50Var, k20 k20Var, int i, hf6 hf6Var, Context context) throws AudioSink$InitializationException {
        try {
            AudioTrack audioTrackT = this.p.t(x50Var, k20Var, i, context);
            int state = audioTrackT.getState();
            if (state == 1) {
                return audioTrackT;
            }
            try {
                audioTrackT.release();
            } catch (Exception unused) {
            }
            throw new AudioSink$InitializationException(state, x50Var.b, x50Var.c, x50Var.a, x50Var.f, hf6Var, x50Var.e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new AudioSink$InitializationException(0, x50Var.b, x50Var.c, x50Var.a, x50Var.f, hf6Var, x50Var.e, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.media.AudioTrack c(defpackage.uj4 r9) throws androidx.media3.exoplayer.audio.AudioSink$InitializationException {
        /*
            r8 = this;
            int r0 = r8.W     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L3a
            int r1 = r8.q     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L3a
            r2 = -1
            if (r1 == r2) goto L26
            android.content.Context r2 = r8.a     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L1c
            if (r2 == 0) goto L26
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L1c
            r4 = 34
            if (r3 < r4) goto L26
            android.content.Context r0 = r8.j0     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L1c
            if (r0 != 0) goto L20
            android.content.Context r0 = defpackage.qp0.c(r2, r1)     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L1c
            r8.j0 = r0     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L1c
            goto L20
        L1c:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L3d
        L20:
            android.content.Context r0 = r8.j0     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L1c
            r1 = 0
            r7 = r0
            r5 = r1
            goto L29
        L26:
            r1 = 0
            r5 = r0
            r7 = r1
        L29:
            x50 r3 = r9.a()     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L3a
            k20 r4 = r8.A     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L3a
            hf6 r6 = r9.a     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L3a
            r2 = r8
            android.media.AudioTrack r9 = r2.b(r3, r4, r5, r6, r7)     // Catch: androidx.media3.exoplayer.audio.AudioSink$InitializationException -> L37
            return r9
        L37:
            r0 = move-exception
        L38:
            r9 = r0
            goto L3d
        L3a:
            r0 = move-exception
            r2 = r8
            goto L38
        L3d:
            y6i r0 = r2.s
            if (r0 == 0) goto L44
            r0.y(r9)
        L44:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak4.c(uj4):android.media.AudioTrack");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.hf6 r26, int[] r27) throws androidx.media3.exoplayer.audio.AudioSink$ConfigurationException {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak4.d(hf6, int[]):void");
    }

    public final void e(long j) throws AudioSink$WriteException {
        int iWrite;
        y6i y6iVar;
        im5 im5Var;
        boolean z;
        bz1 bz1Var = this.m;
        if (this.Q == null) {
            return;
        }
        if (((Exception) bz1Var.c) != null) {
            synchronized (l0) {
                z = n0 > 0;
            }
            if (z || SystemClock.elapsedRealtime() < bz1Var.b) {
                return;
            }
        }
        int iRemaining = this.Q.remaining();
        if (this.a0) {
            hsi.g(j != -9223372036854775807L);
            if (j == Long.MIN_VALUE) {
                j = this.b0;
            } else {
                this.b0 = j;
            }
            iWrite = this.w.write(this.Q, iRemaining, 1, j * 1000);
        } else {
            iWrite = this.w.write(this.Q, iRemaining, 1);
        }
        this.c0 = SystemClock.elapsedRealtime();
        if (iWrite < 0) {
            if (iWrite == -6 || iWrite == -32) {
                if (k() > 0) {
                    z = true;
                } else if (p(this.w)) {
                    if (this.u.c == 1) {
                        this.d0 = true;
                    }
                    z = true;
                }
            }
            AudioSink$WriteException audioSink$WriteException = new AudioSink$WriteException(iWrite, this.u.a, z);
            y6i y6iVar2 = this.s;
            if (y6iVar2 != null) {
                y6iVar2.y(audioSink$WriteException);
            }
            if (!audioSink$WriteException.b || this.a == null) {
                bz1Var.c(audioSink$WriteException);
                return;
            }
            u20 u20Var = u20.c;
            this.x = u20Var;
            this.y.a(u20Var);
            throw audioSink$WriteException;
        }
        bz1Var.c = null;
        bz1Var.a = -9223372036854775807L;
        bz1Var.b = -9223372036854775807L;
        if (p(this.w)) {
            if (this.I > 0) {
                this.e0 = false;
            }
            if (this.U && (y6iVar = this.s) != null && iWrite < iRemaining && !this.e0 && (im5Var = ((mw8) y6iVar.b).R0) != null) {
                im5Var.a.b1 = true;
            }
        }
        int i = this.u.c;
        if (i == 0) {
            this.H += iWrite;
        }
        if (iWrite == iRemaining) {
            if (i != 0) {
                hsi.g(this.Q == this.O);
                this.I = (this.J * this.P) + this.I;
            }
            this.Q = null;
        }
    }

    public final boolean f() throws AudioSink$WriteException {
        ByteBuffer byteBuffer;
        if (!this.v.f()) {
            e(Long.MIN_VALUE);
            return this.Q == null;
        }
        this.v.h();
        t(Long.MIN_VALUE);
        return this.v.e() && ((byteBuffer = this.Q) == null || !byteBuffer.hasRemaining());
    }

    public final void g() throws IllegalStateException {
        if (o()) {
            this.F = 0L;
            this.G = 0L;
            this.H = 0L;
            this.I = 0L;
            this.e0 = false;
            this.J = 0;
            this.C = new wj4(this.D, 0L, 0L);
            this.M = 0L;
            this.B = null;
            this.i.clear();
            this.O = null;
            this.P = 0;
            this.Q = null;
            this.S = false;
            this.R = false;
            this.T = false;
            this.d.o = 0L;
            g50 g50Var = this.u.i;
            this.v = g50Var;
            g50Var.b();
            AudioTrack audioTrack = this.h.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.w.pause();
            }
            if (p(this.w)) {
                u5i u5iVar = this.k;
                u5iVar.getClass();
                this.w.unregisterStreamEventCallback((yj4) u5iVar.b);
                ((Handler) u5iVar.a).removeCallbacksAndMessages(null);
            }
            x50 x50VarA = this.u.a();
            uj4 uj4Var = this.t;
            if (uj4Var != null) {
                this.u = uj4Var;
                this.t = null;
            }
            l60 l60Var = this.h;
            l60Var.f();
            l60Var.c = null;
            l60Var.e = null;
            jdc jdcVar = this.z;
            if (jdcVar != null) {
                AudioTrack audioTrack2 = (AudioTrack) jdcVar.b;
                xj4 xj4Var = (xj4) jdcVar.d;
                xj4Var.getClass();
                audioTrack2.removeOnRoutingChangedListener(xj4Var);
                jdcVar.d = null;
                this.z = null;
            }
            AudioTrack audioTrack3 = this.w;
            y6i y6iVar = this.s;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (l0) {
                try {
                    if (m0 == null) {
                        String str = zxg.a;
                        m0 = Executors.newSingleThreadScheduledExecutor(new nn3(3, "ExoPlayer:AudioTrackReleaseThread"));
                    }
                    n0++;
                    m0.schedule(new u02(audioTrack3, y6iVar, handler, x50VarA, 4), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.w = null;
        }
        bz1 bz1Var = this.m;
        bz1Var.c = null;
        bz1Var.a = -9223372036854775807L;
        bz1Var.b = -9223372036854775807L;
        bz1 bz1Var2 = this.l;
        bz1Var2.c = null;
        bz1Var2.a = -9223372036854775807L;
        bz1Var2.b = -9223372036854775807L;
        this.g0 = 0L;
        this.h0 = 0L;
        Handler handler2 = this.i0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final a50 h(hf6 hf6Var) {
        boolean zBooleanValue;
        if (this.d0) {
            return a50.d;
        }
        k20 k20Var = this.A;
        xt4 xt4Var = this.o;
        xt4Var.getClass();
        hf6Var.getClass();
        int i = hf6Var.G;
        k20Var.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i == -1) {
            return a50.d;
        }
        Context context = (Context) xt4Var.b;
        Boolean bool = (Boolean) xt4Var.c;
        boolean z = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = j40.a(context).getParameters("offloadVariableRateSupported");
                xt4Var.c = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                xt4Var.c = Boolean.FALSE;
            }
            zBooleanValue = ((Boolean) xt4Var.c).booleanValue();
        }
        String str = hf6Var.n;
        str.getClass();
        int iC = xz9.c(str, hf6Var.k);
        if (iC == 0 || i2 < zxg.r(iC)) {
            return a50.d;
        }
        int iS = zxg.s(hf6Var.F);
        if (iS == 0) {
            return a50.d;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i).setChannelMask(iS).setEncoding(iC).build();
            if (i2 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, (AudioAttributes) k20Var.b().b)) {
                    return a50.d;
                }
                z40 z40Var = new z40();
                z40Var.a = true;
                z40Var.c = zBooleanValue;
                return z40Var.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, (AudioAttributes) k20Var.b().b);
            if (playbackOffloadSupport == 0) {
                return a50.d;
            }
            z40 z40Var2 = new z40();
            if (i2 > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            z40Var2.a = true;
            z40Var2.b = z;
            z40Var2.c = zBooleanValue;
            return z40Var2.a();
        } catch (IllegalArgumentException unused) {
            return a50.d;
        }
    }

    public final int i(hf6 hf6Var) {
        q();
        String str = hf6Var.n;
        int i = hf6Var.H;
        if ("audio/raw".equals(str)) {
            if (!zxg.M(i)) {
                wy1.p(i, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i != 2) {
                return 1;
            }
        } else if (this.x.d(hf6Var, this.A) == null) {
            return 0;
        }
        return 2;
    }

    public final long j() {
        return this.u.c == 0 ? this.F / r0.b : this.G;
    }

    public final long k() {
        uj4 uj4Var = this.u;
        if (uj4Var.c != 0) {
            return this.I;
        }
        long j = this.H;
        long j2 = uj4Var.d;
        String str = zxg.a;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0396, code lost:
    
        if (r15 == 0) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b3, code lost:
    
        if (n() == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(int r29, long r30, java.nio.ByteBuffer r32) throws java.lang.IllegalStateException, androidx.media3.exoplayer.audio.AudioSink$WriteException, androidx.media3.exoplayer.audio.AudioSink$InitializationException {
        /*
            Method dump skipped, instructions count: 1174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak4.l(int, long, java.nio.ByteBuffer):boolean");
    }

    public final boolean m() {
        if (!o()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.w.isOffloadedPlayback() && this.T) {
            return false;
        }
        long jK = k();
        l60 l60Var = this.h;
        return jK > zxg.p(l60Var.f, l60Var.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n() throws androidx.media3.exoplayer.audio.AudioSink$InitializationException {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak4.n():boolean");
    }

    public final boolean o() {
        return this.w != null;
    }

    public final void q() {
        Context context;
        u20 u20Var;
        Looper looperMyLooper = Looper.myLooper();
        boolean z = this.y == null || this.f0 == looperMyLooper;
        StringBuilder sb = new StringBuilder("DefaultAudioSink accessed on multiple threads: ");
        Looper looper = this.f0;
        sb.append(looper == null ? "null" : looper.getThread().getName());
        sb.append(" and ");
        sb.append(looperMyLooper != null ? looperMyLooper.getThread().getName() : "null");
        hsi.f(sb.toString(), z);
        if (this.y == null && (context = this.a) != null) {
            this.f0 = looperMyLooper;
            x20 x20Var = new x20(context, new i62(29, this), this.A, this.Z);
            this.y = x20Var;
            Handler handler = (Handler) x20Var.d;
            Context context2 = (Context) x20Var.b;
            if (x20Var.a) {
                u20Var = (u20) x20Var.h;
                u20Var.getClass();
            } else {
                x20Var.a = true;
                w20 w20Var = (w20) x20Var.g;
                if (w20Var != null) {
                    w20Var.a.registerContentObserver(w20Var.b, false, w20Var);
                }
                v20 v20Var = (v20) x20Var.e;
                if (v20Var != null) {
                    j40.a(context2).registerAudioDeviceCallback(v20Var, handler);
                }
                u20 u20VarC = u20.c(context2, context2.registerReceiver((eo) x20Var.f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (k20) x20Var.j, (ao6) x20Var.i);
                x20Var.h = u20VarC;
                u20Var = u20VarC;
            }
            this.x = u20Var;
        }
        this.x.getClass();
    }

    public final void r() throws IllegalStateException {
        this.U = true;
        if (o()) {
            l60 l60Var = this.h;
            if (l60Var.w != -9223372036854775807L) {
                l60Var.F.getClass();
                l60Var.w = zxg.U(SystemClock.elapsedRealtime());
            }
            l60Var.j = zxg.c0(l60Var.f, l60Var.b());
            i60 i60Var = l60Var.e;
            i60Var.getClass();
            i60Var.a(0);
            if (!this.S || p(this.w)) {
                this.w.play();
            }
        }
    }

    public final void s() throws IllegalStateException {
        if (this.S) {
            return;
        }
        this.S = true;
        long jK = k();
        l60 l60Var = this.h;
        l60Var.y = l60Var.b();
        l60Var.F.getClass();
        l60Var.w = zxg.U(SystemClock.elapsedRealtime());
        l60Var.z = jK;
        if (p(this.w)) {
            this.T = false;
        }
        this.w.stop();
    }

    public final void t(long j) throws AudioSink$WriteException {
        e(j);
        if (this.Q != null) {
            return;
        }
        if (!this.v.f()) {
            ByteBuffer byteBuffer = this.O;
            if (byteBuffer != null) {
                w(byteBuffer);
                e(j);
                return;
            }
            return;
        }
        while (!this.v.e()) {
            do {
                ByteBuffer byteBufferD = this.v.d();
                if (byteBufferD.hasRemaining()) {
                    w(byteBufferD);
                    e(j);
                } else {
                    ByteBuffer byteBuffer2 = this.O;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.v.i(this.O);
                    }
                }
            } while (this.Q == null);
            return;
        }
    }

    public final void u() throws IllegalStateException {
        g();
        t76 t76VarListIterator = this.g.listIterator(0);
        while (t76VarListIterator.hasNext()) {
            ((l50) t76VarListIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        g50 g50Var = this.v;
        if (g50Var != null) {
            g50Var.j();
        }
        this.U = false;
        this.d0 = false;
    }

    public final void v() {
        if (o()) {
            try {
                this.w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.D.a).setPitch(this.D.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                a8i.m("DefaultAudioSink", "Failed to set playback params", e);
            }
            c3c c3cVar = new c3c(this.w.getPlaybackParams().getSpeed(), this.w.getPlaybackParams().getPitch());
            this.D = c3cVar;
            float f = c3cVar.a;
            l60 l60Var = this.h;
            l60Var.h = f;
            i60 i60Var = l60Var.e;
            if (i60Var != null) {
                i60Var.a(0);
            }
            l60Var.f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0051 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak4.w(java.nio.ByteBuffer):void");
    }
}
