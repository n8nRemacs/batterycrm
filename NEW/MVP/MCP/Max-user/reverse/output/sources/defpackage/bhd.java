package defpackage;

import android.media.MediaMuxer;
import android.net.Uri;
import android.util.Size;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class bhd implements uah {
    public static final Set g0 = Collections.unmodifiableSet(EnumSet.of(ahd.b, ahd.c));
    public static final Set h0 = Collections.unmodifiableSet(EnumSet.of(ahd.a, ahd.d, ahd.Z, ahd.Y, ahd.s0));
    public static final wib i0;
    public static final fc0 j0;
    public static final sa0 k0;
    public static final RuntimeException l0;
    public static final ycd m0;
    public static final qee n0;
    public static final int o0;
    public static final long p0;
    public Surface A;
    public MediaMuxer B;
    public final dy C;
    public a60 D;
    public bf5 E;
    public wo4 F;
    public bf5 G;
    public wo4 H;
    public Uri I;
    public long J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public long P;
    public long Q;
    public int R;
    public Throwable S;
    public zd5 T;
    public final pea U;
    public Throwable V;
    public boolean W;
    public ScheduledFuture X;
    public boolean Y;
    public tz4 Z;
    public final dy a;
    public tz4 a0;
    public final dy b;
    public double b0;
    public final Executor c;
    public boolean c0;
    public final Executor d;
    public mw4 d0;
    public final qee e;
    public int e0;
    public final ycd f;
    public int f0;
    public final ycd g;
    public final Object h = new Object();
    public final boolean i;
    public ahd j;
    public ahd k;
    public int l;
    public gb0 m;
    public gb0 n;
    public long o;
    public gb0 p;
    public boolean q;
    public vb0 r;
    public vb0 s;
    public gc0 t;
    public final ArrayList u;
    public Integer v;
    public Integer w;
    public msf x;
    public f9g y;
    public Surface z;

    static {
        fb0 fb0Var = fb0.f;
        wib wibVarX = wib.x(Arrays.asList(fb0Var, fb0.e, fb0.d), new da0(fb0Var, 1));
        i0 = wibVarX;
        ec0 ec0VarA = fc0.a();
        ec0VarA.a = wibVarX;
        ec0VarA.d = -1;
        fc0 fc0VarA = ec0VarA.a();
        j0 = fc0VarA;
        hc8 hc8VarA = sa0.a();
        hc8VarA.d = -1;
        hc8VarA.b = fc0VarA;
        k0 = hc8VarA.t();
        l0 = new RuntimeException("The video frame producer became inactive before any data was received.");
        m0 = new ycd(1);
        n0 = new qee(ayi.c());
        o0 = 3;
        p0 = 1000L;
    }

    public bhd(ExecutorService executorService, sa0 sa0Var, ycd ycdVar, ycd ycdVar2) {
        this.i = pv4.a.e(EncoderNotUsePersistentInputSurfaceQuirk.class) != null;
        this.j = ahd.a;
        this.k = null;
        this.l = 0;
        this.m = null;
        this.n = null;
        this.o = 0L;
        this.p = null;
        this.q = false;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = new ArrayList();
        this.v = null;
        this.w = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.e0 = 1;
        this.I = Uri.EMPTY;
        this.J = 0L;
        this.K = 0L;
        this.L = BuildConfig.MAX_TIME_TO_UPLOAD;
        this.M = BuildConfig.MAX_TIME_TO_UPLOAD;
        this.N = BuildConfig.MAX_TIME_TO_UPLOAD;
        this.O = BuildConfig.MAX_TIME_TO_UPLOAD;
        this.P = 0L;
        this.Q = 0L;
        this.R = 1;
        this.S = null;
        this.T = null;
        this.U = new pea(60, (fwg) null);
        this.V = null;
        this.W = false;
        this.f0 = 3;
        this.X = null;
        this.Y = false;
        this.a0 = null;
        this.b0 = 0.0d;
        this.c0 = false;
        this.d0 = null;
        this.c = executorService;
        Executor executorC = executorService == null ? ayi.c() : executorService;
        this.d = executorC;
        qee qeeVar = new qee(executorC);
        this.e = qeeVar;
        fc0 fc0VarA = sa0Var.a;
        g90 g90Var = sa0Var.b;
        int i = sa0Var.c;
        if (sa0Var.a.d == -1) {
            bba bbaVar = new bba(14);
            if (fc0VarA == null) {
                throw new IllegalStateException("Property \"videoSpec\" has not been set");
            }
            ec0 ec0Var = new ec0();
            ec0Var.a = fc0VarA.a;
            ec0Var.b = fc0VarA.b;
            ec0Var.c = fc0VarA.c;
            ec0Var.d = Integer.valueOf(fc0VarA.d);
            bbaVar.accept(ec0Var);
            fc0VarA = ec0Var.a();
        }
        String strConcat = fc0VarA == null ? " videoSpec" : "";
        strConcat = g90Var == null ? strConcat.concat(" audioSpec") : strConcat;
        if (!strConcat.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }
        this.C = new dy(new sa0(fc0VarA, g90Var, i));
        this.a = new dy(new nb0(this.l, m(this.j), null));
        this.b = new dy(Boolean.FALSE);
        this.f = ycdVar;
        this.g = ycdVar2;
        this.Z = new tz4(ycdVar, qeeVar, executorC);
    }

    public static Object l(dy dyVar) {
        try {
            return dyVar.p().get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public static int m(ahd ahdVar) {
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = (DeactivateEncoderSurfaceBeforeStopEncoderQuirk) pv4.a.e(DeactivateEncoderSurfaceBeforeStopEncoderQuirk.class);
        if (ahdVar != ahd.o) {
            return (ahdVar == ahd.Y && deactivateEncoderSurfaceBeforeStopEncoderQuirk == null) ? 1 : 2;
        }
        return 1;
    }

    public static boolean p(dhd dhdVar, gb0 gb0Var) {
        return gb0Var != null && dhdVar.c == gb0Var.w0;
    }

    public static void r(je5 je5Var) {
        if (je5Var instanceof bf5) {
            bf5 bf5Var = (bf5) je5Var;
            bf5Var.h.execute(new ne5(bf5Var, 5));
        }
    }

    public final void A(int i) {
        gri.a("Recorder", "Transitioning audio state: " + utb.t(this.e0) + " --> " + utb.t(i));
        this.e0 = i;
    }

    public final void B(vb0 vb0Var) {
        gri.a("Recorder", "Update stream transformation info: " + vb0Var);
        this.r = vb0Var;
        synchronized (this.h) {
            this.a.D(new nb0(this.l, m(this.j), vb0Var));
        }
    }

    public final void C(Surface surface) {
        int iHashCode;
        if (this.z == surface) {
            return;
        }
        this.z = surface;
        synchronized (this.h) {
            if (surface != null) {
                try {
                    iHashCode = surface.hashCode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                iHashCode = 0;
            }
            E(iHashCode);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(defpackage.ahd r4) {
        /*
            r3 = this;
            ahd r0 = r3.j
            if (r0 == r4) goto L79
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Transitioning Recorder internal state: "
            r0.<init>(r1)
            ahd r1 = r3.j
            r0.append(r1)
            java.lang.String r1 = " --> "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Recorder"
            defpackage.gri.a(r1, r0)
            java.util.Set r0 = defpackage.bhd.g0
            boolean r1 = r0.contains(r4)
            if (r1 == 0) goto L5a
            ahd r1 = r3.j
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L61
            java.util.Set r0 = defpackage.bhd.h0
            ahd r1 = r3.j
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L44
            ahd r0 = r3.j
            r3.k = r0
            int r0 = m(r0)
            goto L62
        L44:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid state transition. Should not be transitioning to a PENDING state from state "
            r0.<init>(r1)
            ahd r1 = r3.j
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L5a:
            ahd r0 = r3.k
            if (r0 == 0) goto L61
            r0 = 0
            r3.k = r0
        L61:
            r0 = 0
        L62:
            r3.j = r4
            if (r0 != 0) goto L6a
            int r0 = m(r4)
        L6a:
            int r4 = r3.l
            vb0 r1 = r3.r
            nb0 r2 = new nb0
            r2.<init>(r4, r0, r1)
            dy r4 = r3.a
            r4.D(r2)
            return
        L79:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Attempted to transition to state "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = ", but Recorder is already in state "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhd.D(ahd):void");
    }

    public final void E(int i) {
        if (this.l == i) {
            return;
        }
        gri.a("Recorder", "Transitioning streamId: " + this.l + " --> " + i);
        this.l = i;
        this.a.D(new nb0(i, m(this.j), this.r));
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd A[Catch: all -> 0x005d, TryCatch #2 {all -> 0x005d, blocks: (B:14:0x0020, B:15:0x002b, B:17:0x0031, B:19:0x003f, B:20:0x0043, B:21:0x004b, B:23:0x0051, B:26:0x0060, B:30:0x006d, B:33:0x008d, B:35:0x009c, B:40:0x00a9, B:54:0x00bf, B:55:0x00c9, B:57:0x00cd, B:58:0x00d5, B:60:0x00ef, B:61:0x00ff, B:62:0x010b, B:64:0x0111, B:69:0x0120), top: B:85:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ef A[Catch: all -> 0x005d, TryCatch #2 {all -> 0x005d, blocks: (B:14:0x0020, B:15:0x002b, B:17:0x0031, B:19:0x003f, B:20:0x0043, B:21:0x004b, B:23:0x0051, B:26:0x0060, B:30:0x006d, B:33:0x008d, B:35:0x009c, B:40:0x00a9, B:54:0x00bf, B:55:0x00c9, B:57:0x00cd, B:58:0x00d5, B:60:0x00ef, B:61:0x00ff, B:62:0x010b, B:64:0x0111, B:69:0x0120), top: B:85:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111 A[Catch: all -> 0x005d, LOOP:2: B:62:0x010b->B:64:0x0111, LOOP_END, TRY_LEAVE, TryCatch #2 {all -> 0x005d, blocks: (B:14:0x0020, B:15:0x002b, B:17:0x0031, B:19:0x003f, B:20:0x0043, B:21:0x004b, B:23:0x0051, B:26:0x0060, B:30:0x006d, B:33:0x008d, B:35:0x009c, B:40:0x00a9, B:54:0x00bf, B:55:0x00c9, B:57:0x00cd, B:58:0x00d5, B:60:0x00ef, B:61:0x00ff, B:62:0x010b, B:64:0x0111, B:69:0x0120), top: B:85:0x0020, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(defpackage.gb0 r11) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhd.F(gb0):void");
    }

    public final void G(gb0 gb0Var) {
        int i;
        x90 x90Var;
        String str;
        grf gggVar;
        sa0 sa0Var = (sa0) l(this.C);
        gc0 gc0Var = this.t;
        int i2 = sa0Var.c;
        String str2 = i2 != 1 ? "audio/mp4a-latm" : "audio/vorbis";
        int i3 = (i2 != 1 ? "audio/mp4a-latm" : "audio/vorbis").equals("audio/mp4a-latm") ? 2 : -1;
        if (gc0Var == null || (x90Var = gc0Var.e) == null) {
            i = i3;
            x90Var = null;
            str = str2;
        } else {
            str = x90Var.b;
            i = x90Var.f;
            if (Objects.equals(str, "audio/none")) {
                gri.a("AudioConfigUtil", "EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: " + str2 + "(profile: " + i3 + ")]");
            } else if (i2 == -1) {
                gri.a("AudioConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using EncoderProfiles to derive AUDIO settings [mime type: " + str + "(profile: " + i + ")]");
            } else if (str2.equals(str) && i3 == i) {
                gri.a("AudioConfigUtil", "MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: " + str + "(profile: " + i3 + ")]");
                i = i3;
            } else {
                StringBuilder sbM = utb.m(i, "MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: ", str, "(profile: ", "), chosen mime type: ");
                sbM.append(str2);
                sbM.append("(profile: ");
                sbM.append(i3);
                sbM.append(")]");
                gri.a("AudioConfigUtil", sbM.toString());
            }
            i = i3;
            x90Var = null;
            str = str2;
        }
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        x90 x90Var2 = x90Var != null ? x90Var : null;
        g90 g90Var = sa0Var.b;
        f90 f90Var = (f90) (x90Var2 != null ? new py0(g90Var, 3, x90Var2) : new y6i(4, g90Var)).get();
        if (this.D != null) {
            u();
        }
        if (!gb0Var.u0) {
            throw new AssertionError("Recording does not have audio enabled. Unable to create audio source for recording " + gb0Var);
        }
        zgd zgdVar = (zgd) gb0Var.d.getAndSet(null);
        if (zgdVar == null) {
            throw new AssertionError("One-time audio source creation has already occurred for recording " + gb0Var);
        }
        a60 a60VarA = zgdVar.a(f90Var, n0);
        this.D = a60VarA;
        gri.a("Recorder", String.format("Set up new audio source: 0x%x", Integer.valueOf(a60VarA.hashCode())));
        g90 g90Var2 = sa0Var.b;
        if (x90Var2 != null) {
            gggVar = new ggg(str, i, g90Var2, f90Var, x90Var2);
        } else {
            pea peaVar = new pea();
            peaVar.c = str;
            peaVar.a = i;
            peaVar.d = g90Var2;
            peaVar.b = f90Var;
            gggVar = peaVar;
        }
        e90 e90Var = (e90) gggVar.get();
        this.g.getClass();
        bf5 bf5Var = new bf5(this.d, e90Var);
        this.G = bf5Var;
        ge5 ge5Var = bf5Var.f;
        if (!(ge5Var instanceof we5)) {
            throw new AssertionError("The EncoderInput of audio isn't a ByteBufferInput.");
        }
        a60 a60Var = this.D;
        a60Var.a.execute(new ud(a60Var, 11, (we5) ge5Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(defpackage.gb0 r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhd.H(gb0, boolean):void");
    }

    public final void I(gb0 gb0Var, long j, int i, Throwable th) throws Exception {
        if (this.p != gb0Var || this.q) {
            return;
        }
        this.q = true;
        this.R = i;
        this.S = th;
        if (n()) {
            while (true) {
                pea peaVar = this.U;
                if (peaVar.e()) {
                    break;
                } else {
                    peaVar.c();
                }
            }
            bf5 bf5Var = this.G;
            bf5Var.q.getClass();
            bf5Var.h.execute(new re5(0, j, xxf.b(), bf5Var));
        }
        zd5 zd5Var = this.T;
        if (zd5Var != null) {
            zd5Var.close();
            this.T = null;
        }
        if (this.f0 != 2) {
            awa awaVar = new awa(19, this.E);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.X = ayi.d().schedule(new d8c(this.e, 14, awaVar), 1000L, timeUnit);
        } else {
            r(this.E);
        }
        bf5 bf5Var2 = this.E;
        bf5Var2.q.getClass();
        bf5Var2.h.execute(new re5(0, j, xxf.b(), bf5Var2));
    }

    public final void J(final gb0 gb0Var, boolean z) {
        ArrayList arrayList = this.u;
        if (!arrayList.isEmpty()) {
            s98 s98VarC = wsf.c(arrayList);
            if (!s98VarC.isDone()) {
                s98VarC.cancel(true);
            }
            arrayList.clear();
        }
        final int i = 0;
        arrayList.add(ixi.a(new uu1(this) { // from class: qgd
            public final /* synthetic */ bhd b;

            {
                this.b = this;
            }

            @Override // defpackage.uu1
            public final String m(tu1 tu1Var) {
                switch (i) {
                    case 0:
                        bhd bhdVar = this.b;
                        gb0 gb0Var2 = gb0Var;
                        bf5 bf5Var = bhdVar.E;
                        u5i u5iVar = new u5i();
                        u5iVar.c = bhdVar;
                        u5iVar.a = tu1Var;
                        u5iVar.b = gb0Var2;
                        qee qeeVar = bhdVar.e;
                        synchronized (bf5Var.b) {
                            bf5Var.r = u5iVar;
                            bf5Var.s = qeeVar;
                        }
                        return "videoEncodingFuture";
                    default:
                        bhd bhdVar2 = this.b;
                        gb0 gb0Var3 = gb0Var;
                        l32 l32Var = new l32(bhdVar2, 4, tu1Var);
                        a60 a60Var = bhdVar2.D;
                        qee qeeVar2 = bhdVar2.e;
                        a60Var.a.execute(new cj(a60Var, qeeVar2, new enb(bhdVar2, l32Var, false, 4), 3));
                        bf5 bf5Var2 = bhdVar2.G;
                        k5i k5iVar = new k5i(bhdVar2, tu1Var, l32Var, gb0Var3);
                        synchronized (bf5Var2.b) {
                            bf5Var2.r = k5iVar;
                            bf5Var2.s = qeeVar2;
                        }
                        return "audioEncodingFuture";
                }
            }
        }));
        if (n() && !z) {
            final int i2 = 1;
            arrayList.add(ixi.a(new uu1(this) { // from class: qgd
                public final /* synthetic */ bhd b;

                {
                    this.b = this;
                }

                @Override // defpackage.uu1
                public final String m(tu1 tu1Var) {
                    switch (i2) {
                        case 0:
                            bhd bhdVar = this.b;
                            gb0 gb0Var2 = gb0Var;
                            bf5 bf5Var = bhdVar.E;
                            u5i u5iVar = new u5i();
                            u5iVar.c = bhdVar;
                            u5iVar.a = tu1Var;
                            u5iVar.b = gb0Var2;
                            qee qeeVar = bhdVar.e;
                            synchronized (bf5Var.b) {
                                bf5Var.r = u5iVar;
                                bf5Var.s = qeeVar;
                            }
                            return "videoEncodingFuture";
                        default:
                            bhd bhdVar2 = this.b;
                            gb0 gb0Var3 = gb0Var;
                            l32 l32Var = new l32(bhdVar2, 4, tu1Var);
                            a60 a60Var = bhdVar2.D;
                            qee qeeVar2 = bhdVar2.e;
                            a60Var.a.execute(new cj(a60Var, qeeVar2, new enb(bhdVar2, l32Var, false, 4), 3));
                            bf5 bf5Var2 = bhdVar2.G;
                            k5i k5iVar = new k5i(bhdVar2, tu1Var, l32Var, gb0Var3);
                            synchronized (bf5Var2.b) {
                                bf5Var2.r = k5iVar;
                                bf5Var2.s = qeeVar2;
                            }
                            return "audioEncodingFuture";
                    }
                }
            }));
        }
        wsf.b(wsf.c(arrayList), new zkb(3, this), ayi.a());
    }

    public final void K() {
        gb0 gb0Var = this.p;
        if (gb0Var != null) {
            gb0Var.w(new zbh(gb0Var.Z, k()));
        }
    }

    public final void L(ahd ahdVar) {
        if (!g0.contains(this.j)) {
            throw new AssertionError("Can only updated non-pending state from a pending state, but state is " + this.j);
        }
        if (!h0.contains(ahdVar)) {
            throw new AssertionError("Invalid state transition. State is not a valid non-pending state while in a pending state: " + ahdVar);
        }
        if (this.k != ahdVar) {
            this.k = ahdVar;
            this.a.D(new nb0(this.l, m(ahdVar), this.r));
        }
    }

    public final void M(zd5 zd5Var, gb0 gb0Var) {
        long size = zd5Var.size() + this.J;
        long j = this.P;
        if (j != 0 && size > j) {
            gri.a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.P)));
            s(gb0Var, 2, null);
            return;
        }
        long jU = zd5Var.U();
        long j2 = this.M;
        if (j2 == BuildConfig.MAX_TIME_TO_UPLOAD) {
            this.M = jU;
            gri.a("Recorder", String.format("First audio time: %d (%s)", Long.valueOf(jU), k8j.c(this.M)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long nanos = timeUnit.toNanos(jU - Math.min(this.L, j2));
            z5j.f("There should be a previous data for adjusting the duration.", this.O != BuildConfig.MAX_TIME_TO_UPLOAD);
            long nanos2 = timeUnit.toNanos(jU - this.O) + nanos;
            long j3 = this.Q;
            if (j3 != 0 && nanos2 > j3) {
                gri.a("Recorder", String.format("Audio data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.Q)));
                s(gb0Var, 9, null);
                return;
            }
        }
        this.B.writeSampleData(this.v.intValue(), zd5Var.o(), zd5Var.z());
        this.J = size;
        this.O = jU;
    }

    public final void N(zd5 zd5Var, gb0 gb0Var) {
        if (this.w == null) {
            throw new AssertionError("Video data comes before the track is added to MediaMuxer.");
        }
        long size = zd5Var.size() + this.J;
        long j = this.P;
        long nanos = 0;
        if (j != 0 && size > j) {
            gri.a("Recorder", String.format("Reach file size limit %d > %d", Long.valueOf(size), Long.valueOf(this.P)));
            s(gb0Var, 2, null);
            return;
        }
        long jU = zd5Var.U();
        long j2 = this.L;
        if (j2 == BuildConfig.MAX_TIME_TO_UPLOAD) {
            this.L = jU;
            gri.a("Recorder", String.format("First video time: %d (%s)", Long.valueOf(jU), k8j.c(this.L)));
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            nanos = timeUnit.toNanos(jU - Math.min(j2, this.M));
            z5j.f("There should be a previous data for adjusting the duration.", this.N != BuildConfig.MAX_TIME_TO_UPLOAD);
            long nanos2 = timeUnit.toNanos(jU - this.N) + nanos;
            long j3 = this.Q;
            if (j3 != 0 && nanos2 > j3) {
                gri.a("Recorder", String.format("Video data reaches duration limit %d > %d", Long.valueOf(nanos2), Long.valueOf(this.Q)));
                s(gb0Var, 9, null);
                return;
            }
        }
        this.B.writeSampleData(this.w.intValue(), zd5Var.o(), zd5Var.z());
        this.J = size;
        this.K = nanos;
        this.N = jU;
        K();
    }

    @Override // defpackage.uah
    public final wqa a() {
        return this.C;
    }

    @Override // defpackage.uah
    public final void b(msf msfVar) {
        f(msfVar, f9g.a);
    }

    @Override // defpackage.uah
    public final void c(int i) {
        this.e.execute(new l30(this, i, 14));
    }

    @Override // defpackage.uah
    public final wqa d() {
        return this.a;
    }

    @Override // defpackage.uah
    public final wqa e() {
        return this.b;
    }

    @Override // defpackage.uah
    public final void f(msf msfVar, f9g f9gVar) {
        synchronized (this.h) {
            try {
                gri.a("Recorder", "Surface is requested in state: " + this.j + ", Current surface: " + this.l);
                if (this.j == ahd.s0) {
                    D(ahd.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e.execute(new zcd(this, msfVar, f9gVar, 1));
    }

    @Override // defpackage.uah
    public final j1h g(l22 l22Var) {
        return new chd(l22Var);
    }

    public final void h(msf msfVar, f9g f9gVar, boolean z) {
        Object value;
        fb0 fb0Var;
        if (msfVar.a()) {
            gri.i("Recorder", "Ignore the SurfaceRequest since it is already served.");
            return;
        }
        sgd sgdVar = new sgd(this);
        qee qeeVar = this.e;
        msfVar.c(qeeVar, sgdVar);
        Size size = msfVar.b;
        u75 u75Var = msfVar.c;
        chd chdVar = new chd(msfVar.e.n());
        y42 y42VarD = chdVar.d(u75Var);
        if (y42VarD == null) {
            fb0Var = fb0.j;
        } else {
            TreeMap treeMap = y42VarD.b;
            Size size2 = d4f.a;
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(size);
            if (entryCeilingEntry != null) {
                value = entryCeilingEntry.getValue();
            } else {
                Map.Entry entryFloorEntry = treeMap.floorEntry(size);
                value = entryFloorEntry != null ? entryFloorEntry.getValue() : null;
            }
            fb0Var = (fb0) value;
            if (fb0Var == null) {
                fb0Var = fb0.j;
            }
        }
        gri.a("Recorder", "Using supported quality of " + fb0Var + " for surface size " + size);
        if (fb0Var != fb0.j) {
            y42 y42VarD2 = chdVar.d(u75Var);
            gc0 gc0VarA = y42VarD2 == null ? null : y42VarD2.a(fb0Var);
            this.t = gc0VarA;
            if (gc0VarA == null) {
                throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles  for advertised quality.");
            }
        }
        mw4 mw4Var = this.d0;
        if (mw4Var != null && !mw4Var.b) {
            mw4Var.b = true;
            ScheduledFuture scheduledFuture = (ScheduledFuture) mw4Var.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                mw4Var.f = null;
            }
        }
        mw4 mw4Var2 = new mw4(this, msfVar, f9gVar, z ? o0 : 0);
        this.d0 = mw4Var2;
        z().d(new zcd(mw4Var2, msfVar, f9gVar, 2), qeeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6 A[LOOP:0: B:26:0x00b0->B:28:0x00b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0178 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:42:0x00ec, B:44:0x00f0, B:45:0x00f4, B:53:0x011a, B:54:0x0122, B:93:0x01b8, B:57:0x012f, B:59:0x0133, B:61:0x0139, B:67:0x0144, B:69:0x0151, B:72:0x015d, B:73:0x0170, B:76:0x0174, B:78:0x0178, B:79:0x018a, B:81:0x018e, B:83:0x0194, B:87:0x019c, B:88:0x01a6, B:90:0x01aa, B:108:0x01e2, B:109:0x01e3, B:110:0x01ea, B:46:0x00f5, B:47:0x0106, B:49:0x010c, B:52:0x0119), top: B:117:0x00ec, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018a A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:42:0x00ec, B:44:0x00f0, B:45:0x00f4, B:53:0x011a, B:54:0x0122, B:93:0x01b8, B:57:0x012f, B:59:0x0133, B:61:0x0139, B:67:0x0144, B:69:0x0151, B:72:0x015d, B:73:0x0170, B:76:0x0174, B:78:0x0178, B:79:0x018a, B:81:0x018e, B:83:0x0194, B:87:0x019c, B:88:0x01a6, B:90:0x01aa, B:108:0x01e2, B:109:0x01e3, B:110:0x01ea, B:46:0x00f5, B:47:0x0106, B:49:0x010c, B:52:0x0119), top: B:117:0x00ec, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r17, java.lang.Throwable r18) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhd.i(int, java.lang.Throwable):void");
    }

    public final void j(gb0 gb0Var, int i, Throwable th) {
        Uri uri = Uri.EMPTY;
        gb0Var.c(uri);
        xw5 xw5Var = gb0Var.Z;
        hb0 hb0VarA = hb0.a(0L, 0L, new h90(1, 0.0d, this.V));
        z5j.e(uri, "OutputUri cannot be null.");
        va0 va0Var = new va0(uri);
        z5j.a("An error type is required.", i != 0);
        gb0Var.w(new vbh(xw5Var, hb0VarA, va0Var, i, th));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hb0 k() {
        /*
            r9 = this;
            long r0 = r9.K
            long r2 = r9.J
            int r4 = r9.e0
            int r5 = defpackage.az1.v(r4)
            if (r5 == 0) goto L40
            r6 = 2
            if (r5 == r6) goto L40
            r7 = 5
            r8 = 3
            if (r5 == r8) goto L2b
            r6 = 4
            if (r5 == r6) goto L29
            if (r5 != r7) goto L19
            goto L41
        L19:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = defpackage.utb.t(r4)
            java.lang.String r2 = "Invalid internal audio state: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L29:
            r6 = r8
            goto L41
        L2b:
            gb0 r4 = r9.p
            if (r4 == 0) goto L39
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.X
            boolean r4 = r4.get()
            if (r4 == 0) goto L39
            r6 = r7
            goto L41
        L39:
            boolean r4 = r9.W
            if (r4 == 0) goto L3e
            goto L41
        L3e:
            r6 = 0
            goto L41
        L40:
            r6 = 1
        L41:
            java.lang.Throwable r4 = r9.V
            double r7 = r9.b0
            h90 r5 = new h90
            r5.<init>(r6, r7, r4)
            hb0 r0 = defpackage.hb0.a(r0, r2, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhd.k():hb0");
    }

    public final boolean n() {
        return this.e0 == 4;
    }

    public final boolean o() {
        gb0 gb0Var = this.p;
        return gb0Var != null && gb0Var.v0;
    }

    public final gb0 q(ahd ahdVar) {
        boolean z;
        if (ahdVar == ahd.c) {
            z = true;
        } else {
            if (ahdVar != ahd.b) {
                throw new AssertionError("makePendingRecordingActiveLocked() can only be called from a pending state.");
            }
            z = false;
        }
        if (this.m != null) {
            throw new AssertionError("Cannot make pending recording active because another recording is already active.");
        }
        gb0 gb0Var = this.n;
        if (gb0Var == null) {
            throw new AssertionError("Pending recording should exist when in a PENDING state.");
        }
        this.m = gb0Var;
        gb0Var.Y.f(ayi.a(), new euc(1, this));
        this.n = null;
        if (z) {
            D(ahd.X);
            return gb0Var;
        }
        D(ahd.o);
        return gb0Var;
    }

    public final void s(gb0 gb0Var, int i, IOException iOException) {
        Throwable th;
        if (gb0Var != this.p) {
            throw new AssertionError("Internal error occurred on recording that is not the current in-progress recording.");
        }
        synchronized (this.h) {
            try {
                try {
                    boolean z = false;
                    switch (this.j.ordinal()) {
                        case 0:
                        case 3:
                        case 8:
                            throw new AssertionError("In-progress recording error occurred while in unexpected state: " + this.j);
                        case 4:
                        case 5:
                            try {
                                D(ahd.Y);
                                z = true;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        case 1:
                        case 2:
                        case 6:
                        case 7:
                            if (gb0Var != this.m) {
                                throw new AssertionError("Internal error occurred for recording but it is not the active recording.");
                            }
                        default:
                            if (z) {
                                I(gb0Var, -1L, i, iOException);
                                return;
                            }
                            return;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void t(gb0 gb0Var) {
        if (this.p != gb0Var || this.q) {
            return;
        }
        if (n()) {
            this.G.e();
        }
        this.E.e();
        gb0 gb0Var2 = this.p;
        gb0Var2.w(new wbh(gb0Var2.Z, k()));
    }

    public final void u() {
        a60 a60Var = this.D;
        if (a60Var == null) {
            throw new AssertionError("Cannot release null audio source.");
        }
        this.D = null;
        gri.a("Recorder", String.format("Releasing audio source: 0x%x", Integer.valueOf(a60Var.hashCode())));
        wsf.b(ixi.a(new xtd(7, a60Var)), new vgd(0, a60Var), ayi.a());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void v(boolean z) {
        boolean z2;
        boolean z3;
        synchronized (this.h) {
            try {
                z2 = true;
                z3 = false;
                switch (this.j.ordinal()) {
                    case 0:
                    case 3:
                    case 8:
                        break;
                    case 1:
                    case 2:
                        L(ahd.Z);
                        break;
                    case 4:
                    case 5:
                        z5j.f("In-progress recording shouldn't be null when in state " + this.j, this.p != null);
                        if (this.m != this.p) {
                            throw new AssertionError("In-progress recording does not match the active recording. Unable to reset encoder.");
                        }
                        if (!o()) {
                            D(ahd.Z);
                            z3 = true;
                            z2 = false;
                        }
                        break;
                    case 6:
                        D(ahd.Z);
                        z2 = false;
                        break;
                    case 7:
                    default:
                        z2 = false;
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            if (z3) {
                I(this.p, -1L, 4, null);
            }
        } else if (z) {
            x();
        } else {
            w();
        }
    }

    public final void w() {
        if (this.G != null) {
            gri.a("Recorder", "Releasing audio encoder.");
            bf5 bf5Var = this.G;
            bf5Var.h.execute(new ne5(bf5Var, 4));
            this.G = null;
            this.H = null;
        }
        if (this.D != null) {
            u();
        }
        A(1);
        x();
    }

    public final void x() {
        msf msfVar;
        boolean z = true;
        if (this.E != null) {
            gri.a("Recorder", "Releasing video encoder.");
            tz4 tz4Var = this.a0;
            if (tz4Var != null) {
                z5j.f(null, ((bf5) tz4Var.f) == this.E);
                gri.a("Recorder", "Releasing video encoder: " + this.E);
                this.a0.u();
                this.a0 = null;
                this.E = null;
                this.F = null;
                C(null);
            } else {
                z();
            }
        }
        synchronized (this.h) {
            try {
                switch (this.j.ordinal()) {
                    case 1:
                    case 2:
                        L(ahd.a);
                        break;
                    case 4:
                    case 5:
                    case 8:
                        if (o()) {
                            z = false;
                            break;
                        }
                    case 3:
                    case 6:
                    case 7:
                        D(ahd.a);
                        break;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.Y = false;
        if (!z || (msfVar = this.x) == null || msfVar.a()) {
            return;
        }
        h(this.x, this.y, false);
    }

    public final void y() {
        if (g0.contains(this.j)) {
            D(this.k);
        } else {
            throw new AssertionError("Cannot restore non-pending state when in state " + this.j);
        }
    }

    public final ha8 z() {
        gri.a("Recorder", "Try to safely release video encoder: " + this.E);
        tz4 tz4Var = this.Z;
        tz4Var.e();
        return wsf.g((ha8) tz4Var.k);
    }
}
