package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.video.MediaCodecVideoDecoderException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import org.apache.http.util.LangUtils;

/* loaded from: classes.dex */
public final class jx8 extends tw8 {
    public static final int[] F2 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean G2;
    public static boolean H2;
    public x3h A2;
    public long B2;
    public long C2;
    public boolean D2;
    public int E2;
    public final Context P1;
    public final boolean Q1;
    public final vhb R1;
    public final int S1;
    public final boolean T1;
    public final f4h U1;
    public final dq0 V1;
    public final long W1;
    public final PriorityQueue X1;
    public u70 Y1;
    public boolean Z1;
    public boolean a2;
    public qch b2;
    public boolean c2;
    public int d2;
    public List e2;
    public Surface f2;
    public l2c g2;
    public c4f h2;
    public boolean i2;
    public int j2;
    public int k2;
    public long l2;
    public int m2;
    public int n2;
    public int o2;
    public x3e p2;
    public boolean q2;
    public long r2;
    public int s2;
    public long t2;
    public sch u2;
    public sch v2;
    public int w2;
    public boolean x2;
    public int y2;
    public hx8 z2;

    public jx8(gx8 gx8Var) {
        super(2, gx8Var.d, gx8Var.c, gx8Var.f, 30.0f);
        Context applicationContext = gx8Var.a.getApplicationContext();
        this.P1 = applicationContext;
        this.S1 = gx8Var.i;
        this.b2 = null;
        this.R1 = new vhb(gx8Var.g, gx8Var.h);
        this.Q1 = this.b2 == null;
        this.U1 = new f4h(applicationContext, this, gx8Var.e);
        this.V1 = new dq0();
        this.T1 = "NVIDIA".equals(Build.MANUFACTURER);
        this.h2 = c4f.c;
        this.j2 = 1;
        this.k2 = 0;
        this.u2 = sch.d;
        this.y2 = 0;
        this.v2 = null;
        this.w2 = -1000;
        this.B2 = -9223372036854775807L;
        this.C2 = -9223372036854775807L;
        this.X1 = new PriorityQueue();
        this.W1 = -9223372036854775807L;
        this.p2 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A0(defpackage.pw8 r11, defpackage.hf6 r12) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jx8.A0(pw8, hf6):int");
    }

    public static List B0(Context context, uw8 uw8Var, hf6 hf6Var, boolean z, boolean z2) {
        String str = hf6Var.n;
        if (str == null) {
            return zjd.o;
        }
        if ("video/dolby-vision".equals(str) && !pui.b(context)) {
            String strB = dx8.b(hf6Var);
            List listD = strB == null ? zjd.o : uw8Var.d(strB, z, z2);
            if (!listD.isEmpty()) {
                return listD;
            }
        }
        return dx8.f(uw8Var, hf6Var, z, z2);
    }

    public static int C0(pw8 pw8Var, hf6 hf6Var) {
        int i = hf6Var.o;
        List list = hf6Var.q;
        if (i == -1) {
            return A0(pw8Var, hf6Var);
        }
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return hf6Var.o + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean z0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 3206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jx8.z0(java.lang.String):boolean");
    }

    @Override // defpackage.tw8
    public final sh4 C(pw8 pw8Var, hf6 hf6Var, hf6 hf6Var2) {
        sh4 sh4VarB = pw8Var.b(hf6Var, hf6Var2);
        int i = sh4VarB.e;
        u70 u70Var = this.Y1;
        u70Var.getClass();
        if (hf6Var2.u > u70Var.b || hf6Var2.v > u70Var.c) {
            i |= 256;
        }
        if (C0(pw8Var, hf6Var2) > u70Var.d) {
            i |= 64;
        }
        int i2 = i;
        return new sh4(pw8Var.a, hf6Var, hf6Var2, i2 != 0 ? 0 : sh4VarB.d, i2);
    }

    @Override // defpackage.tw8
    public final MediaCodecDecoderException D(IllegalStateException illegalStateException, pw8 pw8Var) {
        Surface surface = this.f2;
        MediaCodecVideoDecoderException mediaCodecVideoDecoderException = new MediaCodecVideoDecoderException(illegalStateException, pw8Var);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecVideoDecoderException;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.Surface D0(defpackage.pw8 r6) {
        /*
            r5 = this;
            qch r0 = r5.b2
            if (r0 == 0) goto L9
            android.view.Surface r6 = r0.b()
            return r6
        L9:
            android.view.Surface r0 = r5.f2
            if (r0 == 0) goto Le
            return r0
        Le:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            r2 = 0
            if (r0 < r1) goto L1a
            boolean r0 = r6.k
            if (r0 == 0) goto L1a
            return r2
        L1a:
            boolean r0 = r5.M0(r6)
            defpackage.hsi.g(r0)
            l2c r0 = r5.g2
            if (r0 == 0) goto L32
            boolean r1 = r0.a
            boolean r3 = r6.g
            if (r1 == r3) goto L32
            if (r0 == 0) goto L32
            r0.release()
            r5.g2 = r2
        L32:
            l2c r0 = r5.g2
            if (r0 != 0) goto Lad
            boolean r6 = r6.g
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L45
            boolean r2 = defpackage.l2c.a()
            if (r2 == 0) goto L43
            goto L47
        L43:
            r2 = r1
            goto L48
        L45:
            int r2 = defpackage.l2c.d
        L47:
            r2 = r0
        L48:
            defpackage.hsi.g(r2)
            o65 r2 = new o65
            java.lang.String r3 = "ExoPlayer:PlaceholderSurface"
            r2.<init>(r3, r0)
            if (r6 == 0) goto L57
            int r6 = defpackage.l2c.d
            goto L58
        L57:
            r6 = r1
        L58:
            r2.start()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = r2.getLooper()
            r3.<init>(r4, r2)
            r2.b = r3
            f85 r4 = new f85
            r4.<init>(r3, r0)
            r2.o = r4
            monitor-enter(r2)
            android.os.Handler r3 = r2.b     // Catch: java.lang.Throwable -> L89
            android.os.Message r6 = r3.obtainMessage(r0, r6, r1)     // Catch: java.lang.Throwable -> L89
            r6.sendToTarget()     // Catch: java.lang.Throwable -> L89
        L77:
            android.view.Surface r6 = r2.X     // Catch: java.lang.Throwable -> L89
            l2c r6 = (defpackage.l2c) r6     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L8d
            java.lang.RuntimeException r6 = r2.d     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L8d
            java.lang.Error r6 = r2.c     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L8d
            r2.wait()     // Catch: java.lang.Throwable -> L89 java.lang.InterruptedException -> L8b
            goto L77
        L89:
            r6 = move-exception
            goto Lab
        L8b:
            r1 = r0
            goto L77
        L8d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto L97
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
        L97:
            java.lang.RuntimeException r6 = r2.d
            if (r6 != 0) goto Laa
            java.lang.Error r6 = r2.c
            if (r6 != 0) goto La9
            android.view.Surface r6 = r2.X
            l2c r6 = (defpackage.l2c) r6
            r6.getClass()
            r5.g2 = r6
            goto Lad
        La9:
            throw r6
        Laa:
            throw r6
        Lab:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L89
            throw r6
        Lad:
            l2c r6 = r5.g2
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jx8.D0(pw8):android.view.Surface");
    }

    public final boolean E0(pw8 pw8Var) {
        if (this.b2 != null) {
            return true;
        }
        Surface surface = this.f2;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && pw8Var.k) || M0(pw8Var);
        }
        return true;
    }

    public final boolean F0(ph4 ph4Var) {
        if (i() || ph4Var.j(536870912)) {
            return true;
        }
        long j = this.C2;
        return j == -9223372036854775807L || j - (ph4Var.Y - this.H1.c) <= 100000;
    }

    public final void G0() {
        if (this.m2 > 0) {
            this.Y.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.l2;
            int i = this.m2;
            vhb vhbVar = this.R1;
            Handler handler = (Handler) vhbVar.b;
            if (handler != null) {
                handler.post(new bch(vhbVar, i, j, 1));
            }
            this.m2 = 0;
            this.l2 = jElapsedRealtime;
        }
    }

    public final void H0() {
        if (this.x2) {
            int i = Build.VERSION.SDK_INT;
            kw8 kw8Var = this.W0;
            if (kw8Var == null) {
                return;
            }
            this.z2 = new hx8(this, kw8Var);
            if (i >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                kw8Var.setParameters(bundle);
            }
        }
    }

    public final void I0(long j) {
        Surface surface;
        y0(j);
        sch schVar = this.u2;
        boolean zEquals = schVar.equals(sch.d);
        vhb vhbVar = this.R1;
        if (!zEquals && !schVar.equals(this.v2)) {
            this.v2 = schVar;
            vhbVar.y(schVar);
        }
        this.G1.f++;
        f4h f4hVar = this.U1;
        boolean z = f4hVar.e != 3;
        f4hVar.e = 3;
        f4hVar.l.getClass();
        f4hVar.g = zxg.U(SystemClock.elapsedRealtime());
        if (z && (surface = this.f2) != null) {
            Handler handler = (Handler) vhbVar.b;
            if (handler != null) {
                handler.post(new nh2(vhbVar, surface, SystemClock.elapsedRealtime(), 7));
            }
            this.i2 = true;
        }
        d0(j);
    }

    public final void J0(kw8 kw8Var, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        kw8Var.g(i, j);
        Trace.endSection();
        this.G1.f++;
        this.n2 = 0;
        if (this.b2 == null) {
            sch schVar = this.u2;
            boolean zEquals = schVar.equals(sch.d);
            vhb vhbVar = this.R1;
            if (!zEquals && !schVar.equals(this.v2)) {
                this.v2 = schVar;
                vhbVar.y(schVar);
            }
            f4h f4hVar = this.U1;
            boolean z = f4hVar.e != 3;
            f4hVar.e = 3;
            f4hVar.l.getClass();
            f4hVar.g = zxg.U(SystemClock.elapsedRealtime());
            if (!z || (surface = this.f2) == null) {
                return;
            }
            Handler handler = (Handler) vhbVar.b;
            if (handler != null) {
                handler.post(new nh2(vhbVar, surface, SystemClock.elapsedRealtime(), 7));
            }
            this.i2 = true;
        }
    }

    public final void K0(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f2;
        vhb vhbVar = this.R1;
        if (surface2 == surface) {
            if (surface != null) {
                sch schVar = this.v2;
                if (schVar != null) {
                    vhbVar.y(schVar);
                }
                Surface surface3 = this.f2;
                if (surface3 == null || !this.i2 || (handler = (Handler) vhbVar.b) == null) {
                    return;
                }
                handler.post(new nh2(vhbVar, surface3, SystemClock.elapsedRealtime(), 7));
                return;
            }
            return;
        }
        this.f2 = surface;
        qch qchVar = this.b2;
        f4h f4hVar = this.U1;
        if (qchVar == null) {
            f4hVar.h(surface);
        }
        this.i2 = false;
        int i = this.Z;
        kw8 kw8Var = this.W0;
        if (kw8Var != null && this.b2 == null) {
            pw8 pw8Var = this.d1;
            pw8Var.getClass();
            boolean zE0 = E0(pw8Var);
            int i2 = Build.VERSION.SDK_INT;
            if (!zE0 || this.Z1) {
                j0();
                U();
            } else {
                Surface surfaceD0 = D0(pw8Var);
                if (surfaceD0 != null) {
                    kw8Var.k(surfaceD0);
                } else {
                    if (i2 < 35) {
                        throw new IllegalStateException();
                    }
                    kw8Var.n();
                }
            }
        }
        if (surface != null) {
            sch schVar2 = this.v2;
            if (schVar2 != null) {
                vhbVar.y(schVar2);
            }
        } else {
            this.v2 = null;
            qch qchVar2 = this.b2;
            if (qchVar2 != null) {
                qchVar2.l();
            }
        }
        if (i == 2) {
            qch qchVar3 = this.b2;
            if (qchVar3 != null) {
                qchVar3.r(true);
            } else {
                f4hVar.c(true);
            }
        }
        H0();
    }

    @Override // defpackage.tw8
    public final int L(ph4 ph4Var) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.p2 == null && !this.x2) || ph4Var.Y >= this.v0 || F0(ph4Var)) ? 0 : 32;
        }
        return 0;
    }

    public final boolean L0(long j, long j2, boolean z, boolean z2) {
        if (this.b2 != null && this.Q1) {
            j2 -= -this.B2;
        }
        if (j < -500000 && !z) {
            jxd jxdVar = this.s0;
            jxdVar.getClass();
            int iG = jxdVar.g(j2 - this.u0);
            if (iG != 0) {
                PriorityQueue priorityQueue = this.X1;
                if (z2) {
                    nh4 nh4Var = this.G1;
                    int i = nh4Var.e + iG;
                    nh4Var.e = i;
                    nh4Var.g += this.o2;
                    nh4Var.e = priorityQueue.size() + i;
                } else {
                    this.G1.k++;
                    O0(priorityQueue.size() + iG, this.o2);
                }
                if (I()) {
                    U();
                }
                qch qchVar = this.b2;
                if (qchVar != null) {
                    qchVar.o(false);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean M0(pw8 pw8Var) {
        if (this.x2 || z0(pw8Var.a)) {
            return false;
        }
        return !pw8Var.g || l2c.a();
    }

    @Override // defpackage.tw8
    public final float N(float f, hf6 hf6Var, hf6[] hf6VarArr) {
        pw8 pw8Var;
        float fMax = -1.0f;
        for (hf6 hf6Var2 : hf6VarArr) {
            float f2 = hf6Var2.y;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        float f3 = fMax == -1.0f ? -1.0f : fMax * f;
        if (this.p2 == null || (pw8Var = this.d1) == null) {
            return f3;
        }
        int i = hf6Var.u;
        int i2 = hf6Var.v;
        float f4 = -3.4028235E38f;
        if (pw8Var.l) {
            float f5 = pw8Var.o;
            if (f5 != -3.4028235E38f && pw8Var.m == i && pw8Var.n == i2) {
                f4 = f5;
            } else {
                float f6 = 1024.0f;
                if (!pw8Var.h(i, i2, 1024.0f)) {
                    f4 = 0.0f;
                    while (true) {
                        float f7 = f6 - f4;
                        if (Math.abs(f7) <= 5.0f) {
                            break;
                        }
                        float f8 = (f7 / 2.0f) + f4;
                        if (pw8Var.h(i, i2, f8)) {
                            f4 = f8;
                        } else {
                            f6 = f8;
                        }
                    }
                } else {
                    f4 = 1024.0f;
                }
                pw8Var.o = f4;
                pw8Var.m = i;
                pw8Var.n = i2;
            }
        }
        return f3 != -1.0f ? Math.max(f3, f4) : f4;
    }

    public final void N0(kw8 kw8Var, int i) {
        Trace.beginSection("skipVideoBuffer");
        kw8Var.l(i);
        Trace.endSection();
        this.G1.g++;
    }

    @Override // defpackage.tw8
    public final ArrayList O(uw8 uw8Var, hf6 hf6Var, boolean z) {
        List listB0 = B0(this.P1, uw8Var, hf6Var, z, this.x2);
        HashMap map = dx8.a;
        ArrayList arrayList = new ArrayList(listB0);
        Collections.sort(arrayList, new dj3(8, new vw8(1, hf6Var)));
        return arrayList;
    }

    public final void O0(int i, int i2) {
        nh4 nh4Var = this.G1;
        nh4Var.i += i;
        int i3 = i + i2;
        nh4Var.h += i3;
        this.m2 += i3;
        int i4 = this.n2 + i3;
        this.n2 = i4;
        nh4Var.j = Math.max(i4, nh4Var.j);
        int i5 = this.S1;
        if (i5 <= 0 || this.m2 < i5) {
            return;
        }
        G0();
    }

    public final void P0(long j) {
        nh4 nh4Var = this.G1;
        nh4Var.l += j;
        nh4Var.m++;
        this.r2 += j;
        this.s2++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0136, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0139, code lost:
    
        r15 = r9;
     */
    @Override // defpackage.tw8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.lz9 Q(defpackage.pw8 r25, defpackage.hf6 r26, android.media.MediaCrypto r27, float r28) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jx8.Q(pw8, hf6, android.media.MediaCrypto, float):lz9");
    }

    @Override // defpackage.tw8
    public final void R(ph4 ph4Var) {
        if (this.a2) {
            ByteBuffer byteBuffer = ph4Var.Z;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        kw8 kw8Var = this.W0;
                        kw8Var.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        kw8Var.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override // defpackage.tw8
    public final boolean W(hf6 hf6Var) throws ExoPlaybackException {
        qch qchVar = this.b2;
        if (qchVar == null || qchVar.e()) {
            return true;
        }
        try {
            return this.b2.n(hf6Var);
        } catch (VideoSink$VideoSinkException e) {
            throw d(e, hf6Var, false, 7000);
        }
    }

    @Override // defpackage.tw8
    public final void X(Exception exc) {
        a8i.h("MediaCodecVideoRenderer", "Video codec error", exc);
        vhb vhbVar = this.R1;
        Handler handler = (Handler) vhbVar.b;
        if (handler != null) {
            handler.post(new dch(vhbVar, exc));
        }
    }

    @Override // defpackage.tw8
    public final void Y(long j, long j2, String str) {
        String str2;
        vhb vhbVar = this.R1;
        Handler handler = (Handler) vhbVar.b;
        if (handler != null) {
            str2 = str;
            handler.post(new s50(vhbVar, str2, j, j2, 2));
        } else {
            str2 = str;
        }
        this.Z1 = z0(str2);
        pw8 pw8Var = this.d1;
        pw8Var.getClass();
        this.a2 = pw8Var.f();
        H0();
    }

    @Override // defpackage.tw8
    public final void Z(String str) {
        vhb vhbVar = this.R1;
        Handler handler = (Handler) vhbVar.b;
        if (handler != null) {
            handler.post(new n1h(vhbVar, 9, str));
        }
    }

    @Override // defpackage.tk0, defpackage.u4c
    public final void a(int i, Object obj) {
        if (i == 1) {
            K0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            x3h x3hVar = (x3h) obj;
            this.A2 = x3hVar;
            qch qchVar = this.b2;
            if (qchVar != null) {
                qchVar.t(x3hVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.y2 != iIntValue) {
                this.y2 = iIntValue;
                if (this.x2) {
                    j0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.j2 = iIntValue2;
            kw8 kw8Var = this.W0;
            if (kw8Var != null) {
                kw8Var.j(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.k2 = iIntValue3;
            qch qchVar2 = this.b2;
            if (qchVar2 != null) {
                qchVar2.k(iIntValue3);
                return;
            }
            m4h m4hVar = this.U1.b;
            if (m4hVar.h == iIntValue3) {
                return;
            }
            m4hVar.h = iIntValue3;
            m4hVar.d(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(e4h.a)) {
                qch qchVar3 = this.b2;
                if (qchVar3 == null || !qchVar3.e()) {
                    return;
                }
                this.b2.d();
                return;
            }
            this.e2 = list;
            qch qchVar4 = this.b2;
            if (qchVar4 != null) {
                qchVar4.p(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            c4f c4fVar = (c4f) obj;
            if (c4fVar.a == 0 || c4fVar.b == 0) {
                return;
            }
            this.h2 = c4fVar;
            qch qchVar5 = this.b2;
            if (qchVar5 != null) {
                Surface surface = this.f2;
                hsi.h(surface);
                qchVar5.f(surface, c4fVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.w2 = ((Integer) obj).intValue();
                kw8 kw8Var2 = this.W0;
                if (kw8Var2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.w2));
                    kw8Var2.setParameters(bundle);
                    break;
                }
                break;
            case LangUtils.HASH_SEED /* 17 */:
                Surface surface2 = this.f2;
                K0(null);
                obj.getClass();
                ((jx8) obj).a(1, surface2);
                break;
            case 18:
                boolean z = this.p2 != null;
                x3e x3eVar = (x3e) obj;
                this.p2 = x3eVar;
                if (z != (x3eVar != null)) {
                    w0(this.X0);
                    break;
                }
                break;
            default:
                if (i == 11) {
                    im5 im5Var = (im5) obj;
                    im5Var.getClass();
                    this.R0 = im5Var;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.tw8
    public final sh4 a0(xt4 xt4Var) {
        sh4 sh4VarA0 = super.a0(xt4Var);
        hf6 hf6Var = (hf6) xt4Var.c;
        hf6Var.getClass();
        vhb vhbVar = this.R1;
        Handler handler = (Handler) vhbVar.b;
        if (handler != null) {
            handler.post(new zcd(vhbVar, hf6Var, sh4VarA0, 19));
        }
        return sh4VarA0;
    }

    @Override // defpackage.tw8
    public final void b0(hf6 hf6Var, MediaFormat mediaFormat) {
        int integer;
        int i;
        kw8 kw8Var = this.W0;
        if (kw8Var != null) {
            kw8Var.j(this.j2);
        }
        if (this.x2) {
            i = hf6Var.u;
            integer = hf6Var.v;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = hf6Var.A;
        int i2 = hf6Var.z;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.u2 = new sch(i, f, integer);
        qch qchVar = this.b2;
        if (qchVar == null || !this.D2) {
            this.U1.g(hf6Var.y);
        } else {
            ff6 ff6VarA = hf6Var.a();
            ff6VarA.t = i;
            ff6VarA.u = integer;
            ff6VarA.z = f;
            hf6 hf6Var2 = new hf6(ff6VarA);
            int i4 = this.d2;
            List list = this.e2;
            if (list == null) {
                t76 t76Var = wg7.b;
                list = zjd.o;
            }
            qchVar.u(i4, this.H1.b, hf6Var2, list);
            this.d2 = 2;
        }
        this.D2 = false;
    }

    @Override // defpackage.tw8
    public final void d0(long j) {
        super.d0(j);
        if (this.x2) {
            return;
        }
        this.o2--;
    }

    @Override // defpackage.tk0
    public final void e() {
        qch qchVar = this.b2;
        if (qchVar == null) {
            f4h f4hVar = this.U1;
            if (f4hVar.e == 0) {
                f4hVar.e = 1;
                return;
            }
            return;
        }
        int i = this.d2;
        if (i == 0 || i == 1) {
            this.d2 = 0;
        } else {
            qchVar.v();
        }
    }

    @Override // defpackage.tw8
    public final void e0() {
        qch qchVar = this.b2;
        if (qchVar != null) {
            qchVar.c();
            if (this.B2 == -9223372036854775807L) {
                this.B2 = this.H1.b;
            }
            this.b2.j(-this.B2);
        } else {
            this.U1.f(2);
        }
        this.D2 = true;
        H0();
    }

    @Override // defpackage.tw8
    public final void f0(ph4 ph4Var) {
        this.E2 = 0;
        int iL = L(ph4Var);
        if ((Build.VERSION.SDK_INT < 34 || (iL & 32) == 0) && !this.x2) {
            this.o2++;
        }
    }

    @Override // defpackage.tk0
    public final String h() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.tw8
    public final boolean h0(long j, long j2, kw8 kw8Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, hf6 hf6Var) {
        int i4;
        kw8Var.getClass();
        long j4 = j3 - this.H1.c;
        int i5 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.X1;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            i5++;
            priorityQueue.poll();
        }
        O0(i5, 0);
        qch qchVar = this.b2;
        if (qchVar != null) {
            if (!z || z2) {
                return qchVar.g(j3, new fx8(this, kw8Var, i, j4));
            }
            N0(kw8Var, i);
            return true;
        }
        int iA = this.U1.a(j3, j, j2, this.H1.b, z, z2, this.V1);
        dq0 dq0Var = this.V1;
        if (iA == 0) {
            this.Y.getClass();
            long jNanoTime = System.nanoTime();
            x3h x3hVar = this.A2;
            if (x3hVar != null) {
                x3hVar.b(j4, jNanoTime, hf6Var, this.Y0);
            }
            J0(kw8Var, i, jNanoTime);
            P0(dq0Var.b);
            return true;
        }
        if (iA == 1) {
            long j5 = dq0Var.c;
            long j6 = dq0Var.b;
            if (j5 == this.t2) {
                N0(kw8Var, i);
            } else {
                x3h x3hVar2 = this.A2;
                if (x3hVar2 != null) {
                    i4 = i;
                    x3hVar2.b(j4, j5, hf6Var, this.Y0);
                } else {
                    i4 = i;
                }
                J0(kw8Var, i4, j5);
            }
            P0(j6);
            this.t2 = j5;
            return true;
        }
        if (iA == 2) {
            Trace.beginSection("dropVideoBuffer");
            kw8Var.l(i);
            Trace.endSection();
            O0(0, 1);
            P0(dq0Var.b);
            return true;
        }
        if (iA == 3) {
            N0(kw8Var, i);
            P0(dq0Var.b);
            return true;
        }
        if (iA == 4 || iA == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(iA));
    }

    @Override // defpackage.tk0
    public final boolean j() {
        if (!this.C1) {
            return false;
        }
        qch qchVar = this.b2;
        return qchVar == null || qchVar.a();
    }

    @Override // defpackage.tw8
    public final void k0() {
        qch qchVar = this.b2;
        if (qchVar != null) {
            qchVar.c();
        }
    }

    @Override // defpackage.tw8, defpackage.tk0
    public final boolean l() {
        boolean zL = super.l();
        qch qchVar = this.b2;
        if (qchVar != null) {
            return qchVar.s(zL);
        }
        if (zL && (this.W0 == null || this.x2)) {
            return true;
        }
        return this.U1.b(zL);
    }

    @Override // defpackage.tw8, defpackage.tk0
    public final void m() {
        vhb vhbVar = this.R1;
        this.v2 = null;
        this.C2 = -9223372036854775807L;
        H0();
        this.i2 = false;
        this.z2 = null;
        this.q2 = true;
        try {
            super.m();
            nh4 nh4Var = this.G1;
            vhbVar.getClass();
            synchronized (nh4Var) {
            }
            Handler handler = (Handler) vhbVar.b;
            if (handler != null) {
                handler.post(new ech(vhbVar, nh4Var, 1));
            }
            vhbVar.y(sch.d);
        } catch (Throwable th) {
            nh4 nh4Var2 = this.G1;
            vhbVar.getClass();
            synchronized (nh4Var2) {
                Handler handler2 = (Handler) vhbVar.b;
                if (handler2 != null) {
                    handler2.post(new ech(vhbVar, nh4Var2, 1));
                }
                vhbVar.y(sch.d);
                throw th;
            }
        }
    }

    @Override // defpackage.tw8
    public final void m0() {
        super.m0();
        this.X1.clear();
        this.o2 = 0;
        this.E2 = 0;
        this.q2 = false;
    }

    @Override // defpackage.tk0
    public final void n(boolean z, boolean z2) {
        qch qchVar;
        this.G1 = new nh4(1);
        kld kldVar = this.d;
        kldVar.getClass();
        boolean z3 = kldVar.b;
        hsi.g((z3 && this.y2 == 0) ? false : true);
        if (this.x2 != z3) {
            this.x2 = z3;
            j0();
        }
        nh4 nh4Var = this.G1;
        vhb vhbVar = this.R1;
        Handler handler = (Handler) vhbVar.b;
        if (handler != null) {
            handler.post(new ech(vhbVar, nh4Var, 0));
        }
        boolean z4 = this.c2;
        f4h f4hVar = this.U1;
        if (!z4) {
            if (this.e2 != null && this.b2 == null) {
                sk skVar = new sk(this.P1, f4hVar);
                skVar.b = true;
                mwf mwfVar = this.Y;
                mwfVar.getClass();
                skVar.Y = mwfVar;
                hsi.g(!skVar.c);
                if (((e7a) skVar.X) == null) {
                    skVar.X = new e7a();
                }
                m3c m3cVar = new m3c(skVar);
                skVar.c = true;
                m3cVar.x = 1;
                SparseArray sparseArray = m3cVar.c;
                if (zxg.k(sparseArray, 0)) {
                    qchVar = (qch) sparseArray.get(0);
                } else {
                    j3c j3cVar = new j3c(m3cVar, m3cVar.a);
                    m3cVar.h.add(j3cVar);
                    sparseArray.put(0, j3cVar);
                    qchVar = j3cVar;
                }
                this.b2 = qchVar;
            }
            this.c2 = true;
        }
        qch qchVar2 = this.b2;
        if (qchVar2 == null) {
            mwf mwfVar2 = this.Y;
            mwfVar2.getClass();
            f4hVar.l = mwfVar2;
            f4hVar.f(!z2 ? 1 : 0);
            return;
        }
        qchVar2.m(new ex8(this));
        x3h x3hVar = this.A2;
        if (x3hVar != null) {
            this.b2.t(x3hVar);
        }
        if (this.f2 != null && !this.h2.equals(c4f.c)) {
            this.b2.f(this.f2, this.h2);
        }
        this.b2.k(this.k2);
        this.b2.setPlaybackSpeed(this.U0);
        List list = this.e2;
        if (list != null) {
            this.b2.p(list);
        }
        this.d2 = !z2 ? 1 : 0;
        this.K1 = true;
    }

    @Override // defpackage.tw8, defpackage.tk0
    public final void o(long j, boolean z) {
        qch qchVar = this.b2;
        if (qchVar != null && !z) {
            qchVar.o(true);
        }
        super.o(j, z);
        qch qchVar2 = this.b2;
        f4h f4hVar = this.U1;
        if (qchVar2 == null) {
            m4h m4hVar = f4hVar.b;
            m4hVar.k = 0L;
            m4hVar.n = -1L;
            m4hVar.l = -1L;
            f4hVar.h = -9223372036854775807L;
            f4hVar.f = -9223372036854775807L;
            f4hVar.e = Math.min(f4hVar.e, 1);
            f4hVar.i = -9223372036854775807L;
        }
        if (z) {
            qch qchVar3 = this.b2;
            if (qchVar3 != null) {
                qchVar3.r(false);
            } else {
                f4hVar.c(false);
            }
        }
        H0();
        this.n2 = 0;
    }

    @Override // defpackage.tk0
    public final void p() {
        qch qchVar = this.b2;
        if (qchVar == null || !this.Q1) {
            return;
        }
        qchVar.release();
    }

    @Override // defpackage.tk0
    public final void q() {
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
            this.c2 = false;
            this.B2 = -9223372036854775807L;
            l2c l2cVar = this.g2;
            if (l2cVar != null) {
                l2cVar.release();
                this.g2 = null;
            }
        }
    }

    @Override // defpackage.tw8
    public final boolean q0(ph4 ph4Var) {
        boolean z = false;
        if (!F0(ph4Var)) {
            boolean z2 = ph4Var.Y < this.v0;
            if (z2 && !ph4Var.j(268435456)) {
                if (ph4Var.j(67108864)) {
                    ph4Var.w();
                    z = true;
                }
                if (z) {
                    if (z2) {
                        this.G1.e++;
                    } else {
                        this.X1.add(Long.valueOf(ph4Var.Y));
                        this.E2++;
                    }
                }
                return z;
            }
        }
        return false;
    }

    @Override // defpackage.tw8
    public final boolean r0() {
        hf6 hf6Var = this.X0;
        if (this.p2 == null || this.q2 || this.x2) {
            return true;
        }
        return (hf6Var != null && hf6Var.p > 0) || this.L1 || this.A1 != -9223372036854775807L;
    }

    @Override // defpackage.tk0
    public final void s() {
        this.m2 = 0;
        this.Y.getClass();
        this.l2 = SystemClock.elapsedRealtime();
        this.r2 = 0L;
        this.s2 = 0;
        qch qchVar = this.b2;
        if (qchVar != null) {
            qchVar.i();
        } else {
            this.U1.d();
        }
    }

    @Override // defpackage.tw8
    public final boolean s0(pw8 pw8Var) {
        return E0(pw8Var);
    }

    @Override // defpackage.tk0
    public final void t() {
        G0();
        int i = this.s2;
        if (i != 0) {
            long j = this.r2;
            vhb vhbVar = this.R1;
            Handler handler = (Handler) vhbVar.b;
            if (handler != null) {
                handler.post(new dch(vhbVar, j, i));
            }
            this.r2 = 0L;
            this.s2 = 0;
        }
        qch qchVar = this.b2;
        if (qchVar != null) {
            qchVar.h();
        } else {
            this.U1.e();
        }
    }

    @Override // defpackage.tw8
    public final boolean t0() {
        pw8 pw8Var = this.d1;
        if (this.b2 != null && pw8Var != null) {
            String str = pw8Var.a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.t0();
    }

    @Override // defpackage.tw8, defpackage.tk0
    public final void u(hf6[] hf6VarArr, long j, long j2, d99 d99Var) {
        super.u(hf6VarArr, j, j2, d99Var);
        s9g s9gVar = this.z0;
        if (s9gVar.p()) {
            this.C2 = -9223372036854775807L;
        } else {
            d99Var.getClass();
            this.C2 = s9gVar.g(d99Var.a, new m9g()).d;
        }
    }

    @Override // defpackage.tw8
    public final int v0(uw8 uw8Var, hf6 hf6Var) {
        boolean z;
        int i = 0;
        if (!xz9.m(hf6Var.n)) {
            return tk0.b(0, 0, 0, 0);
        }
        int i2 = 1;
        boolean z2 = hf6Var.r != null;
        Context context = this.P1;
        List listB0 = B0(context, uw8Var, hf6Var, z2, false);
        if (z2 && listB0.isEmpty()) {
            listB0 = B0(context, uw8Var, hf6Var, false, false);
        }
        if (listB0.isEmpty()) {
            return tk0.b(1, 0, 0, 0);
        }
        int i3 = hf6Var.O;
        if (i3 != 0 && i3 != 2) {
            return tk0.b(2, 0, 0, 0);
        }
        pw8 pw8Var = (pw8) listB0.get(0);
        boolean zE = pw8Var.e(hf6Var);
        if (zE) {
            z = true;
        } else {
            for (int i4 = 1; i4 < listB0.size(); i4++) {
                pw8 pw8Var2 = (pw8) listB0.get(i4);
                if (pw8Var2.e(hf6Var)) {
                    z = false;
                    zE = true;
                    pw8Var = pw8Var2;
                    break;
                }
            }
            z = true;
        }
        int i5 = zE ? 4 : 3;
        int i6 = 8;
        int i7 = pw8Var.g(hf6Var) ? 16 : 8;
        int i8 = pw8Var.h ? 64 : 0;
        int i9 = z ? 128 : 0;
        if ("video/dolby-vision".equals(hf6Var.n) && !pui.b(context)) {
            i9 = 256;
        }
        if (zE) {
            List listB02 = B0(context, uw8Var, hf6Var, z2, true);
            if (!listB02.isEmpty()) {
                HashMap map = dx8.a;
                ArrayList arrayList = new ArrayList(listB02);
                Collections.sort(arrayList, new dj3(i6, new vw8(i2, hf6Var)));
                pw8 pw8Var3 = (pw8) arrayList.get(0);
                if (pw8Var3.e(hf6Var) && pw8Var3.g(hf6Var)) {
                    i = 32;
                }
            }
        }
        return i5 | i7 | i | i8 | i9;
    }

    @Override // defpackage.tw8, defpackage.tk0
    public final void w(long j, long j2) throws ExoPlaybackException {
        qch qchVar = this.b2;
        if (qchVar != null) {
            try {
                qchVar.q(j, j2);
            } catch (VideoSink$VideoSinkException e) {
                throw d(e, e.a, false, 7001);
            }
        }
        super.w(j, j2);
    }

    @Override // defpackage.tw8, defpackage.tk0
    public final void y(float f, float f2) {
        super.y(f, f2);
        qch qchVar = this.b2;
        if (qchVar != null) {
            qchVar.setPlaybackSpeed(f);
        } else {
            this.U1.i(f);
        }
    }
}
