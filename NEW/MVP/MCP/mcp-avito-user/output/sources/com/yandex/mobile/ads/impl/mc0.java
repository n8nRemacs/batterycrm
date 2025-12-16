package com.yandex.mobile.ads.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.mobile.ads.embedded.guava.collect.p;
import com.yandex.mobile.ads.exo.video.PlaceholderSurface;
import com.yandex.mobile.ads.impl.ac0;
import com.yandex.mobile.ads.impl.fi1;
import com.yandex.mobile.ads.impl.jc0;
import j.InterfaceC42153i;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes8.dex */
public final class mc0 extends gc0 {

    /* renamed from: q1, reason: collision with root package name */
    private static final nc0 f387908q1 = tv0.h();

    /* renamed from: r1, reason: collision with root package name */
    private static final int[] f387909r1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: s1, reason: collision with root package name */
    private static boolean f387910s1;

    /* renamed from: t1, reason: collision with root package name */
    private static boolean f387911t1;

    /* renamed from: H0, reason: collision with root package name */
    private final Context f387912H0;

    /* renamed from: I0, reason: collision with root package name */
    private final lh1 f387913I0;

    /* renamed from: J0, reason: collision with root package name */
    private final fi1.a f387914J0;

    /* renamed from: K0, reason: collision with root package name */
    private final long f387915K0;

    /* renamed from: L0, reason: collision with root package name */
    private final int f387916L0;

    /* renamed from: M0, reason: collision with root package name */
    private final boolean f387917M0;

    /* renamed from: N0, reason: collision with root package name */
    private a f387918N0;

    /* renamed from: O0, reason: collision with root package name */
    private boolean f387919O0;

    /* renamed from: P0, reason: collision with root package name */
    private boolean f387920P0;

    /* renamed from: Q0, reason: collision with root package name */
    @j.P
    private Surface f387921Q0;

    /* renamed from: R0, reason: collision with root package name */
    @j.P
    private PlaceholderSurface f387922R0;

    /* renamed from: S0, reason: collision with root package name */
    private boolean f387923S0;

    /* renamed from: T0, reason: collision with root package name */
    private int f387924T0;

    /* renamed from: U0, reason: collision with root package name */
    private boolean f387925U0;

    /* renamed from: V0, reason: collision with root package name */
    private boolean f387926V0;

    /* renamed from: W0, reason: collision with root package name */
    private boolean f387927W0;

    /* renamed from: X0, reason: collision with root package name */
    private long f387928X0;

    /* renamed from: Y0, reason: collision with root package name */
    private long f387929Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private long f387930Z0;

    /* renamed from: a1, reason: collision with root package name */
    private int f387931a1;

    /* renamed from: b1, reason: collision with root package name */
    private int f387932b1;

    /* renamed from: c1, reason: collision with root package name */
    private int f387933c1;

    /* renamed from: d1, reason: collision with root package name */
    private long f387934d1;

    /* renamed from: e1, reason: collision with root package name */
    private long f387935e1;

    /* renamed from: f1, reason: collision with root package name */
    private long f387936f1;

    /* renamed from: g1, reason: collision with root package name */
    private int f387937g1;

    /* renamed from: h1, reason: collision with root package name */
    private int f387938h1;

    /* renamed from: i1, reason: collision with root package name */
    private int f387939i1;

    /* renamed from: j1, reason: collision with root package name */
    private int f387940j1;

    /* renamed from: k1, reason: collision with root package name */
    private float f387941k1;

    /* renamed from: l1, reason: collision with root package name */
    @j.P
    private ji1 f387942l1;

    /* renamed from: m1, reason: collision with root package name */
    private boolean f387943m1;

    /* renamed from: n1, reason: collision with root package name */
    private int f387944n1;

    /* renamed from: o1, reason: collision with root package name */
    @j.P
    b f387945o1;

    /* renamed from: p1, reason: collision with root package name */
    @j.P
    private kh1 f387946p1;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f387947a;

        /* renamed from: b, reason: collision with root package name */
        public final int f387948b;

        /* renamed from: c, reason: collision with root package name */
        public final int f387949c;

        public a(int i12, int i13, int i14) {
            this.f387947a = i12;
            this.f387948b = i13;
            this.f387949c = i14;
        }
    }

    @j.X
    public final class b implements ac0.c, Handler.Callback {

        /* renamed from: b, reason: collision with root package name */
        private final Handler f387950b;

        public b(ac0 ac0Var) {
            Handler handlerA = pc1.a((Handler.Callback) this);
            this.f387950b = handlerA;
            ac0Var.a(this, handlerA);
        }

        @Override // com.yandex.mobile.ads.impl.ac0.c
        public final void a(long j12) {
            if (pc1.f388768a < 30) {
                this.f387950b.sendMessageAtFrontOfQueue(Message.obtain(this.f387950b, 0, (int) (j12 >> 32), (int) j12));
                return;
            }
            mc0 mc0Var = mc0.this;
            if (this != mc0Var.f387945o1) {
                return;
            }
            if (j12 == Long.MAX_VALUE) {
                mc0.a(mc0Var);
                return;
            }
            try {
                mc0Var.e(j12);
            } catch (lt e12) {
                mc0.this.a(e12);
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i12 = message.arg1;
            int i13 = message.arg2;
            int i14 = pc1.f388768a;
            long j12 = ((i12 & 4294967295L) << 32) | (4294967295L & i13);
            mc0 mc0Var = mc0.this;
            if (this != mc0Var.f387945o1) {
                return true;
            }
            if (j12 == Long.MAX_VALUE) {
                mc0.a(mc0Var);
                return true;
            }
            try {
                mc0Var.e(j12);
                return true;
            } catch (lt e12) {
                mc0.this.a(e12);
                return true;
            }
        }
    }

    public mc0(Context context, cp cpVar, ic0 ic0Var, @j.P Handler handler, @j.P fi1 fi1Var) {
        super(2, cpVar, ic0Var, 30.0f);
        this.f387915K0 = 5000L;
        this.f387916L0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.f387912H0 = applicationContext;
        this.f387913I0 = new lh1(applicationContext);
        this.f387914J0 = new fi1.a(handler, fi1Var);
        this.f387917M0 = T();
        this.f387929Y0 = -9223372036854775807L;
        this.f387938h1 = -1;
        this.f387939i1 = -1;
        this.f387941k1 = -1.0f;
        this.f387924T0 = 1;
        this.f387944n1 = 0;
        S();
    }

    private void R() {
        ac0 ac0VarC;
        this.f387925U0 = false;
        if (pc1.f388768a < 23 || !this.f387943m1 || (ac0VarC = C()) == null) {
            return;
        }
        this.f387945o1 = new b(ac0VarC);
    }

    private void S() {
        this.f387942l1 = null;
    }

    private static boolean T() {
        return f387908q1.Z0().equals(pc1.f388770c);
    }

    private static boolean U() {
        int i12 = pc1.f388768a;
        if (i12 <= 28) {
            nc0 nc0Var = f387908q1;
            String strR = nc0Var.r();
            String str = pc1.f388769b;
            if (strR.equals(str) || nc0Var.I().equals(str) || nc0Var.K().equals(str) || nc0Var.J().equals(str) || nc0Var.Q0().equals(str) || nc0Var.P0().equals(str) || nc0Var.d1().equals(str) || nc0Var.e1().equals(str)) {
                return true;
            }
        }
        if (i12 <= 27 && f387908q1.w0().equals(pc1.f388769b)) {
            return true;
        }
        if (i12 > 26) {
            return false;
        }
        nc0 nc0Var2 = f387908q1;
        String strA = nc0Var2.a();
        String str2 = pc1.f388769b;
        if (!strA.equals(str2) && !nc0Var2.b().equals(str2) && !nc0Var2.c().equals(str2) && !nc0Var2.d().equals(str2) && !nc0Var2.e().equals(str2) && !nc0Var2.f().equals(str2) && !nc0Var2.g().equals(str2) && !nc0Var2.h().equals(str2) && !nc0Var2.i().equals(str2) && !nc0Var2.j().equals(str2) && !nc0Var2.k().equals(str2) && !nc0Var2.l().equals(str2) && !nc0Var2.m().equals(str2) && !nc0Var2.s().equals(str2) && !nc0Var2.t().equals(str2) && !nc0Var2.u().equals(str2) && !nc0Var2.v().equals(str2) && !nc0Var2.w().equals(str2) && !nc0Var2.y().equals(str2) && !nc0Var2.z().equals(str2) && !nc0Var2.A().equals(str2) && !nc0Var2.B().equals(str2) && !nc0Var2.C().equals(str2) && !nc0Var2.D().equals(str2) && !nc0Var2.E().equals(str2) && !nc0Var2.F().equals(str2) && !nc0Var2.G().equals(str2) && !nc0Var2.H().equals(str2) && !nc0Var2.L().equals(str2) && !nc0Var2.M().equals(str2) && !nc0Var2.N().equals(str2) && !nc0Var2.O().equals(str2) && !nc0Var2.P().equals(str2) && !nc0Var2.Q().equals(str2) && !nc0Var2.R().equals(str2) && !nc0Var2.S().equals(str2) && !nc0Var2.T().equals(str2) && !nc0Var2.U().equals(str2) && !nc0Var2.V().equals(str2) && !nc0Var2.W().equals(str2) && !nc0Var2.X().equals(str2) && !nc0Var2.Y().equals(str2) && !nc0Var2.Z().equals(str2) && !nc0Var2.a0().equals(str2) && !nc0Var2.b0().equals(str2) && !nc0Var2.c0().equals(str2) && !nc0Var2.d0().equals(str2) && !nc0Var2.e0().equals(str2) && !nc0Var2.f0().equals(str2) && !nc0Var2.g0().equals(str2) && !nc0Var2.h0().equals(str2) && !nc0Var2.i0().equals(str2) && !nc0Var2.j0().equals(str2) && !nc0Var2.k0().equals(str2) && !nc0Var2.l0().equals(str2) && !nc0Var2.m0().equals(str2) && !nc0Var2.n0().equals(str2) && !nc0Var2.o0().equals(str2) && !nc0Var2.p0().equals(str2) && !nc0Var2.q0().equals(str2) && !nc0Var2.r0().equals(str2) && !nc0Var2.s0().equals(str2) && !nc0Var2.t0().equals(str2) && !nc0Var2.u0().equals(str2) && !nc0Var2.v0().equals(str2) && !nc0Var2.x0().equals(str2) && !nc0Var2.y0().equals(str2) && !nc0Var2.z0().equals(str2) && !nc0Var2.A0().equals(str2) && !nc0Var2.B0().equals(str2) && !nc0Var2.C0().equals(str2) && !nc0Var2.D0().equals(str2) && !nc0Var2.E0().equals(str2) && !nc0Var2.F0().equals(str2) && !nc0Var2.H0().equals(str2) && !nc0Var2.I0().equals(str2) && !nc0Var2.K0().equals(str2) && !nc0Var2.L0().equals(str2) && !nc0Var2.M0().equals(str2) && !nc0Var2.N0().equals(str2) && !nc0Var2.O0().equals(str2) && !nc0Var2.R0().equals(str2) && !nc0Var2.S0().equals(str2) && !nc0Var2.T0().equals(str2) && !nc0Var2.U0().equals(str2) && !nc0Var2.V0().equals(str2) && !nc0Var2.W0().equals(str2) && !nc0Var2.X0().equals(str2) && !nc0Var2.Y0().equals(str2) && !nc0Var2.a1().equals(str2) && !nc0Var2.b1().equals(str2) && !nc0Var2.f1().equals(str2) && !nc0Var2.g1().equals(str2) && !nc0Var2.h1().equals(str2) && !nc0Var2.i1().equals(str2) && !nc0Var2.j1().equals(str2) && !nc0Var2.k1().equals(str2) && !nc0Var2.l1().equals(str2) && !nc0Var2.m1().equals(str2) && !nc0Var2.n1().equals(str2) && !nc0Var2.o1().equals(str2) && !nc0Var2.p1().equals(str2) && !nc0Var2.q1().equals(str2) && !nc0Var2.r1().equals(str2) && !nc0Var2.s1().equals(str2) && !nc0Var2.t1().equals(str2) && !nc0Var2.u1().equals(str2) && !nc0Var2.v1().equals(str2) && !nc0Var2.w1().equals(str2) && !nc0Var2.x1().equals(str2) && !nc0Var2.y1().equals(str2) && !nc0Var2.z1().equals(str2) && !nc0Var2.A1().equals(str2) && !nc0Var2.B1().equals(str2) && !nc0Var2.C1().equals(str2) && !nc0Var2.D1().equals(str2) && !nc0Var2.E1().equals(str2) && !nc0Var2.G1().equals(str2) && !nc0Var2.H1().equals(str2) && !nc0Var2.I1().equals(str2) && !nc0Var2.F1().equals(str2) && !nc0Var2.J1().equals(str2) && !nc0Var2.K1().equals(str2) && !nc0Var2.L1().equals(str2) && !nc0Var2.M1().equals(str2) && !nc0Var2.N1().equals(str2) && !nc0Var2.O1().equals(str2) && !nc0Var2.P1().equals(str2) && !nc0Var2.Q1().equals(str2) && !nc0Var2.R1().equals(str2) && !nc0Var2.S1().equals(str2) && !nc0Var2.T1().equals(str2) && !nc0Var2.U1().equals(str2) && !nc0Var2.V1().equals(str2) && !nc0Var2.W1().equals(str2) && !nc0Var2.X1().equals(str2) && !nc0Var2.Y1().equals(str2) && !nc0Var2.Z1().equals(str2) && !nc0Var2.a2().equals(str2) && !nc0Var2.b2().equals(str2)) {
            String strN = nc0Var2.n();
            String str3 = pc1.f388771d;
            if (!strN.equals(str3) && !nc0Var2.o().equals(str3) && !nc0Var2.G0().equals(str3)) {
                return false;
            }
        }
        return true;
    }

    private void V() {
        int i12 = this.f387938h1;
        if (i12 == -1 && this.f387939i1 == -1) {
            return;
        }
        ji1 ji1Var = this.f387942l1;
        if (ji1Var != null && ji1Var.f386883a == i12 && ji1Var.f386884b == this.f387939i1 && ji1Var.f386885c == this.f387940j1 && ji1Var.f386886d == this.f387941k1) {
            return;
        }
        ji1 ji1Var2 = new ji1(i12, this.f387939i1, this.f387940j1, this.f387941k1);
        this.f387942l1 = ji1Var2;
        this.f387914J0.b(ji1Var2);
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    public final boolean E() {
        return this.f387943m1 && pc1.f388768a < 23;
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    public final void J() {
        R();
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    @InterfaceC42153i
    public final void N() {
        super.N();
        this.f387933c1 = 0;
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    @InterfaceC42153i
    public final void b(vn vnVar) {
        boolean z12 = this.f387943m1;
        if (!z12) {
            this.f387933c1++;
        }
        if (pc1.f388768a >= 23 || !z12) {
            return;
        }
        e(vnVar.f390953e);
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    @InterfaceC42153i
    public final void c(long j12) {
        super.c(j12);
        if (this.f387943m1) {
            return;
        }
        this.f387933c1--;
    }

    @Override // com.yandex.mobile.ads.impl.gc0, com.yandex.mobile.ads.impl.ux0
    public final boolean d() {
        PlaceholderSurface placeholderSurface;
        if (super.d() && (this.f387925U0 || (((placeholderSurface = this.f387922R0) != null && this.f387921Q0 == placeholderSurface) || C() == null || this.f387943m1))) {
            this.f387929Y0 = -9223372036854775807L;
            return true;
        }
        if (this.f387929Y0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f387929Y0) {
            return true;
        }
        this.f387929Y0 = -9223372036854775807L;
        return false;
    }

    public final void e(long j12) {
        d(j12);
        V();
        this.f385640B0.f390233e++;
        this.f387927W0 = true;
        if (!this.f387925U0) {
            this.f387925U0 = true;
            this.f387914J0.a(this.f387921Q0);
            this.f387923S0 = true;
        }
        c(j12);
    }

    public final void f(long j12) {
        tn tnVar = this.f385640B0;
        tnVar.f390239k += j12;
        tnVar.f390240l++;
        this.f387936f1 += j12;
        this.f387937g1++;
    }

    @Override // com.yandex.mobile.ads.impl.ux0, com.yandex.mobile.ads.impl.vx0
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.yandex.mobile.ads.impl.gc0, com.yandex.mobile.ads.impl.ff
    public final void u() {
        this.f387942l1 = null;
        R();
        this.f387923S0 = false;
        this.f387945o1 = null;
        try {
            super.u();
        } finally {
            this.f387914J0.a(this.f385640B0);
        }
    }

    @Override // com.yandex.mobile.ads.impl.gc0, com.yandex.mobile.ads.impl.ff
    @TargetApi(17)
    public final void v() {
        try {
            super.v();
            PlaceholderSurface placeholderSurface = this.f387922R0;
            if (placeholderSurface != null) {
                if (this.f387921Q0 == placeholderSurface) {
                    this.f387921Q0 = null;
                }
                placeholderSurface.release();
                this.f387922R0 = null;
            }
        } catch (Throwable th2) {
            if (this.f387922R0 != null) {
                Surface surface = this.f387921Q0;
                PlaceholderSurface placeholderSurface2 = this.f387922R0;
                if (surface == placeholderSurface2) {
                    this.f387921Q0 = null;
                }
                placeholderSurface2.release();
                this.f387922R0 = null;
            }
            throw th2;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ff
    public final void w() {
        this.f387931a1 = 0;
        this.f387930Z0 = SystemClock.elapsedRealtime();
        this.f387935e1 = SystemClock.elapsedRealtime() * 1000;
        this.f387936f1 = 0L;
        this.f387937g1 = 0;
        this.f387913I0.b();
    }

    @Override // com.yandex.mobile.ads.impl.ff
    public final void x() {
        this.f387929Y0 = -9223372036854775807L;
        if (this.f387931a1 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f387914J0.a(this.f387931a1, jElapsedRealtime - this.f387930Z0);
            this.f387931a1 = 0;
            this.f387930Z0 = jElapsedRealtime;
        }
        int i12 = this.f387937g1;
        if (i12 != 0) {
            this.f387914J0.c(i12, this.f387936f1);
            this.f387936f1 = 0L;
            this.f387937g1 = 0;
        }
        this.f387913I0.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v12 */
    @Override // com.yandex.mobile.ads.impl.gc0
    public final boolean a(long j12, long j13, @j.P ac0 ac0Var, @j.P ByteBuffer byteBuffer, int i12, int i13, int i14, long j14, boolean z12, boolean z13, vw vwVar) throws Exception {
        String str;
        boolean z14;
        long j15;
        int i15;
        int iB2;
        int i16;
        boolean z15;
        int i17;
        int i18;
        ?? r92;
        ac0Var.getClass();
        if (this.f387928X0 == -9223372036854775807L) {
            this.f387928X0 = j12;
        }
        if (j14 != this.f387934d1) {
            this.f387913I0.b(j14);
            this.f387934d1 = j14;
        }
        long jG2 = G();
        long j16 = j14 - jG2;
        if (z12 && !z13) {
            r91.a("skipVideoBuffer");
            ac0Var.a(false, i12);
            r91.a();
            this.f385640B0.f390234f++;
            return true;
        }
        double dH2 = H();
        boolean z16 = c() == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j17 = (long) ((j14 - j12) / dH2);
        if (z16) {
            j17 -= jElapsedRealtime - j13;
        }
        if (this.f387921Q0 == this.f387922R0) {
            if (j17 >= -30000) {
                return false;
            }
            r91.a("skipVideoBuffer");
            ac0Var.a(false, i12);
            r91.a();
            this.f385640B0.f390234f++;
            f(j17);
            return true;
        }
        long j18 = jElapsedRealtime - this.f387935e1;
        if (this.f387927W0 ? this.f387925U0 : !(z16 || this.f387926V0)) {
            str = "skipVideoBuffer";
            z14 = false;
        } else {
            str = "skipVideoBuffer";
            z14 = true;
        }
        if (this.f387929Y0 == -9223372036854775807L && j12 >= jG2 && (z14 || (z16 && j17 < -30000 && j18 > 100000))) {
            long jNanoTime = System.nanoTime();
            kh1 kh1Var = this.f387946p1;
            if (kh1Var != null) {
                i17 = 21;
                i18 = 0;
                r92 = 1;
                kh1Var.a(j16, jNanoTime, vwVar, F());
            } else {
                i17 = 21;
                i18 = 0;
                r92 = 1;
            }
            if (pc1.f388768a >= i17) {
                V();
                r91.a("releaseOutputBuffer");
                ac0Var.a(i12, jNanoTime);
                r91.a();
                this.f387935e1 = SystemClock.elapsedRealtime() * 1000;
                this.f385640B0.f390233e += r92;
                this.f387932b1 = i18;
                this.f387927W0 = r92;
                if (!this.f387925U0) {
                    this.f387925U0 = r92;
                    this.f387914J0.a(this.f387921Q0);
                    this.f387923S0 = r92;
                }
            } else {
                V();
                r91.a("releaseOutputBuffer");
                ac0Var.a((boolean) r92, i12);
                r91.a();
                this.f387935e1 = SystemClock.elapsedRealtime() * 1000;
                this.f385640B0.f390233e += r92;
                this.f387932b1 = i18;
                this.f387927W0 = r92;
                if (!this.f387925U0) {
                    this.f387925U0 = r92;
                    this.f387914J0.a(this.f387921Q0);
                    this.f387923S0 = r92;
                }
            }
            f(j17);
            return r92;
        }
        if (!z16 || j12 == this.f387928X0) {
            return false;
        }
        long jNanoTime2 = System.nanoTime();
        long jA2 = this.f387913I0.a((j17 * 1000) + jNanoTime2);
        long j19 = (jA2 - jNanoTime2) / 1000;
        boolean z17 = this.f387929Y0 != -9223372036854775807L;
        if (j19 < -500000 && !z13 && (iB2 = b(j12)) != 0) {
            if (!z17) {
                tn tnVar = this.f385640B0;
                tnVar.f390238j++;
                int i19 = this.f387933c1;
                tnVar.f390236h += iB2;
                int i22 = iB2 + i19;
                tnVar.f390235g += i22;
                this.f387931a1 += i22;
                int i23 = this.f387932b1 + i22;
                this.f387932b1 = i23;
                tnVar.f390237i = Math.max(i23, tnVar.f390237i);
                int i24 = this.f387916L0;
                if (i24 > 0 && (i16 = this.f387931a1) >= i24 && i16 > 0) {
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    this.f387914J0.a(this.f387931a1, jElapsedRealtime2 - this.f387930Z0);
                    z15 = false;
                    this.f387931a1 = 0;
                    this.f387930Z0 = jElapsedRealtime2;
                }
                A();
                return z15;
            }
            tn tnVar2 = this.f385640B0;
            tnVar2.f390232d += iB2;
            tnVar2.f390234f += this.f387933c1;
            z15 = false;
            A();
            return z15;
        }
        if (j19 < -30000 && !z13) {
            if (z17) {
                r91.a(str);
                ac0Var.a(false, i12);
                r91.a();
                this.f385640B0.f390234f++;
            } else {
                r91.a("dropVideoBuffer");
                ac0Var.a(false, i12);
                r91.a();
                tn tnVar3 = this.f385640B0;
                tnVar3.f390236h = tnVar3.f390236h;
                tnVar3.f390235g++;
                this.f387931a1++;
                int i25 = this.f387932b1 + 1;
                this.f387932b1 = i25;
                tnVar3.f390237i = Math.max(i25, tnVar3.f390237i);
                int i26 = this.f387916L0;
                if (i26 > 0 && (i15 = this.f387931a1) >= i26 && i15 > 0) {
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    this.f387914J0.a(this.f387931a1, jElapsedRealtime3 - this.f387930Z0);
                    this.f387931a1 = 0;
                    this.f387930Z0 = jElapsedRealtime3;
                }
            }
            f(j19);
            return true;
        }
        if (pc1.f388768a >= 21) {
            if (j19 < 50000) {
                kh1 kh1Var2 = this.f387946p1;
                if (kh1Var2 != null) {
                    j15 = j19;
                    kh1Var2.a(j16, jA2, vwVar, F());
                } else {
                    j15 = j19;
                }
                V();
                r91.a("releaseOutputBuffer");
                ac0Var.a(i12, jA2);
                r91.a();
                this.f387935e1 = SystemClock.elapsedRealtime() * 1000;
                this.f385640B0.f390233e++;
                this.f387932b1 = 0;
                this.f387927W0 = true;
                if (!this.f387925U0) {
                    this.f387925U0 = true;
                    this.f387914J0.a(this.f387921Q0);
                    this.f387923S0 = true;
                }
                f(j15);
                return true;
            }
        } else if (j19 < 30000) {
            if (j19 > 11000) {
                try {
                    Thread.sleep((j19 - 10000) / 1000);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            kh1 kh1Var3 = this.f387946p1;
            if (kh1Var3 != null) {
                kh1Var3.a(j16, jA2, vwVar, F());
            }
            V();
            r91.a("releaseOutputBuffer");
            ac0Var.a(true, i12);
            r91.a();
            this.f387935e1 = SystemClock.elapsedRealtime() * 1000;
            this.f385640B0.f390233e++;
            this.f387932b1 = 0;
            this.f387927W0 = true;
            if (!this.f387925U0) {
                this.f387925U0 = true;
                this.f387914J0.a(this.f387921Q0);
                this.f387923S0 = true;
            }
            f(j19);
            return true;
        }
        return false;
    }

    private boolean b(ec0 ec0Var) {
        boolean z12;
        if (pc1.f388768a < 23 || this.f387943m1) {
            return false;
        }
        if (ec0Var.f384886a.startsWith(f387908q1.c1())) {
            z12 = false;
        } else {
            synchronized (mc0.class) {
                try {
                    if (!f387910s1) {
                        f387911t1 = U();
                        f387910s1 = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            z12 = f387911t1;
        }
        if (z12) {
            return false;
        }
        return !ec0Var.f384891f || PlaceholderSurface.a(this.f387912H0);
    }

    public static int b(vw vwVar, ec0 ec0Var) {
        if (vwVar.f391182m != -1) {
            int size = vwVar.f391183n.size();
            int length = 0;
            for (int i12 = 0; i12 < size; i12++) {
                length += vwVar.f391183n.get(i12).length;
            }
            return vwVar.f391182m + length;
        }
        return a(vwVar, ec0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.gc0
    public final int a(ic0 ic0Var, vw vwVar) {
        boolean z12;
        int i12 = 0;
        if (!qg0.d(vwVar.f391181l)) {
            return vx0.a(0);
        }
        boolean z13 = vwVar.f391184o != null;
        com.yandex.mobile.ads.embedded.guava.collect.p pVarA = a(ic0Var, vwVar, z13, false);
        if (z13 && pVarA.isEmpty()) {
            pVarA = a(ic0Var, vwVar, false, false);
        }
        if (pVarA.isEmpty()) {
            return vx0.a(1);
        }
        int i13 = vwVar.f391168E;
        if (i13 != 0 && i13 != 2) {
            return vx0.a(2);
        }
        ec0 ec0Var = (ec0) pVarA.get(0);
        boolean zA2 = ec0Var.a(vwVar);
        if (zA2) {
            z12 = true;
        } else {
            for (int i14 = 1; i14 < pVarA.size(); i14++) {
                ec0 ec0Var2 = (ec0) pVarA.get(i14);
                if (ec0Var2.a(vwVar)) {
                    z12 = false;
                    zA2 = true;
                    ec0Var = ec0Var2;
                    break;
                }
            }
            z12 = true;
        }
        int i15 = zA2 ? 4 : 3;
        int i16 = ec0Var.b(vwVar) ? 16 : 8;
        int i17 = ec0Var.f384892g ? 64 : 0;
        int i18 = z12 ? 128 : 0;
        if (zA2) {
            com.yandex.mobile.ads.embedded.guava.collect.p pVarA2 = a(ic0Var, vwVar, z13, true);
            if (!pVarA2.isEmpty()) {
                ec0 ec0Var3 = (ec0) jc0.a(pVarA2, vwVar).get(0);
                if (ec0Var3.a(vwVar) && ec0Var3.b(vwVar)) {
                    i12 = 32;
                }
            }
        }
        return i15 | i16 | i12 | i17 | i18;
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    public final ArrayList a(ic0 ic0Var, vw vwVar, boolean z12) {
        return jc0.a(a(ic0Var, vwVar, z12, this.f387943m1), vwVar);
    }

    private static com.yandex.mobile.ads.embedded.guava.collect.p a(ic0 ic0Var, vw vwVar, boolean z12, boolean z13) {
        String str = vwVar.f391181l;
        if (str == null) {
            return com.yandex.mobile.ads.embedded.guava.collect.p.i();
        }
        List<ec0> listA = ic0Var.a(str, z12, z13);
        String strA = jc0.a(vwVar);
        if (strA == null) {
            return com.yandex.mobile.ads.embedded.guava.collect.p.a((Collection) listA);
        }
        List<ec0> listA2 = ic0Var.a(strA, z12, z13);
        int i12 = com.yandex.mobile.ads.embedded.guava.collect.p.f382791c;
        return new p.a().b((List) listA).b((List) listA2).a();
    }

    @Override // com.yandex.mobile.ads.impl.gc0, com.yandex.mobile.ads.impl.ff
    public final void a(boolean z12, boolean z13) {
        super.a(z12, z13);
        boolean z14 = p().f391510a;
        db.b((z14 && this.f387944n1 == 0) ? false : true);
        if (this.f387943m1 != z14) {
            this.f387943m1 = z14;
            L();
        }
        this.f387914J0.b(this.f385640B0);
        this.f387926V0 = z13;
        this.f387927W0 = false;
    }

    @Override // com.yandex.mobile.ads.impl.gc0, com.yandex.mobile.ads.impl.ff
    public final void a(long j12, boolean z12) {
        super.a(j12, z12);
        R();
        this.f387913I0.a();
        this.f387934d1 = -9223372036854775807L;
        this.f387928X0 = -9223372036854775807L;
        this.f387932b1 = 0;
        if (z12) {
            this.f387929Y0 = this.f387915K0 > 0 ? SystemClock.elapsedRealtime() + this.f387915K0 : -9223372036854775807L;
        } else {
            this.f387929Y0 = -9223372036854775807L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [android.view.Surface] */
    @Override // com.yandex.mobile.ads.impl.ff, com.yandex.mobile.ads.impl.kt0.b
    public final void a(int i12, @j.P Object obj) throws Exception {
        if (i12 != 1) {
            if (i12 == 7) {
                this.f387946p1 = (kh1) obj;
                return;
            }
            if (i12 == 10) {
                int iIntValue = ((Integer) obj).intValue();
                if (this.f387944n1 != iIntValue) {
                    this.f387944n1 = iIntValue;
                    if (this.f387943m1) {
                        L();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i12 != 4) {
                if (i12 != 5) {
                    return;
                }
                this.f387913I0.a(((Integer) obj).intValue());
                return;
            } else {
                this.f387924T0 = ((Integer) obj).intValue();
                ac0 ac0VarC = C();
                if (ac0VarC != null) {
                    ac0VarC.a(this.f387924T0);
                    return;
                }
                return;
            }
        }
        PlaceholderSurface placeholderSurfaceA = obj instanceof Surface ? (Surface) obj : null;
        if (placeholderSurfaceA == null) {
            PlaceholderSurface placeholderSurface = this.f387922R0;
            if (placeholderSurface != null) {
                placeholderSurfaceA = placeholderSurface;
            } else {
                ec0 ec0VarD = D();
                if (ec0VarD != null && b(ec0VarD)) {
                    placeholderSurfaceA = PlaceholderSurface.a(this.f387912H0, ec0VarD.f384891f);
                    this.f387922R0 = placeholderSurfaceA;
                }
            }
        }
        if (this.f387921Q0 != placeholderSurfaceA) {
            this.f387921Q0 = placeholderSurfaceA;
            this.f387913I0.a(placeholderSurfaceA);
            this.f387923S0 = false;
            int iC2 = c();
            ac0 ac0VarC2 = C();
            if (ac0VarC2 != null) {
                if (pc1.f388768a >= 23 && placeholderSurfaceA != null && !this.f387919O0) {
                    ac0VarC2.a(placeholderSurfaceA);
                } else {
                    L();
                    I();
                }
            }
            if (placeholderSurfaceA != null && placeholderSurfaceA != this.f387922R0) {
                ji1 ji1Var = this.f387942l1;
                if (ji1Var != null) {
                    this.f387914J0.b(ji1Var);
                }
                R();
                if (iC2 == 2) {
                    this.f387929Y0 = this.f387915K0 > 0 ? SystemClock.elapsedRealtime() + this.f387915K0 : -9223372036854775807L;
                    return;
                }
                return;
            }
            this.f387942l1 = null;
            R();
            return;
        }
        if (placeholderSurfaceA == null || placeholderSurfaceA == this.f387922R0) {
            return;
        }
        ji1 ji1Var2 = this.f387942l1;
        if (ji1Var2 != null) {
            this.f387914J0.b(ji1Var2);
        }
        if (this.f387923S0) {
            this.f387914J0.a(this.f387921Q0);
        }
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    public final boolean a(ec0 ec0Var) {
        return this.f387921Q0 != null || b(ec0Var);
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    @TargetApi(17)
    public final ac0.a a(ec0 ec0Var, vw vwVar, @j.P MediaCrypto mediaCrypto, float f12) {
        String str;
        a aVar;
        Point point;
        boolean z12;
        Pair<Integer, Integer> pairB;
        int iA2;
        PlaceholderSurface placeholderSurface = this.f387922R0;
        if (placeholderSurface != null && placeholderSurface.f383147a != ec0Var.f384891f) {
            if (this.f387921Q0 == placeholderSurface) {
                this.f387921Q0 = null;
            }
            placeholderSurface.release();
            this.f387922R0 = null;
        }
        String str2 = ec0Var.f384888c;
        vw[] vwVarArrS = s();
        int iMax = vwVar.f391186q;
        int iMax2 = vwVar.f391187r;
        int iB2 = b(vwVar, ec0Var);
        if (vwVarArrS.length == 1) {
            if (iB2 != -1 && (iA2 = a(vwVar, ec0Var)) != -1) {
                iB2 = Math.min((int) (iB2 * 1.5f), iA2);
            }
            aVar = new a(iMax, iMax2, iB2);
            str = str2;
        } else {
            int length = vwVarArrS.length;
            boolean z13 = false;
            for (int i12 = 0; i12 < length; i12++) {
                vw vwVarA = vwVarArrS[i12];
                if (vwVar.f391193x != null && vwVarA.f391193x == null) {
                    vwVarA = vwVarA.a().a(vwVar.f391193x).a();
                }
                if (ec0Var.a(vwVar, vwVarA).f391783d != 0) {
                    int i13 = vwVarA.f391186q;
                    z13 |= i13 == -1 || vwVarA.f391187r == -1;
                    iMax = Math.max(iMax, i13);
                    iMax2 = Math.max(iMax2, vwVarA.f391187r);
                    iB2 = Math.max(iB2, b(vwVarA, ec0Var));
                }
            }
            if (z13) {
                ka0.d("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                int i14 = vwVar.f391187r;
                int i15 = vwVar.f391186q;
                boolean z14 = i14 > i15;
                int i16 = z14 ? i14 : i15;
                if (z14) {
                    i14 = i15;
                }
                float f13 = i14 / i16;
                int[] iArr = f387909r1;
                int length2 = iArr.length;
                int i17 = 0;
                while (i17 < length2) {
                    int i18 = length2;
                    int i19 = iArr[i17];
                    int[] iArr2 = iArr;
                    int i22 = (int) (i19 * f13);
                    if (i19 <= i16 || i22 <= i14) {
                        break;
                    }
                    int i23 = i14;
                    float f14 = f13;
                    if (pc1.f388768a >= 21) {
                        int i24 = z14 ? i22 : i19;
                        if (!z14) {
                            i19 = i22;
                        }
                        Point pointA = ec0Var.a(i24, i19);
                        str = str2;
                        if (ec0Var.a(pointA.x, pointA.y, vwVar.f391188s)) {
                            point = pointA;
                            break;
                        }
                        i17++;
                        length2 = i18;
                        iArr = iArr2;
                        i14 = i23;
                        f13 = f14;
                        str2 = str;
                    } else {
                        str = str2;
                        try {
                            int iA3 = pc1.a(i19, 16) * 16;
                            int iA4 = pc1.a(i22, 16) * 16;
                            if (iA3 * iA4 <= jc0.a()) {
                                int i25 = z14 ? iA4 : iA3;
                                if (!z14) {
                                    iA3 = iA4;
                                }
                                point = new Point(i25, iA3);
                            } else {
                                i17++;
                                length2 = i18;
                                iArr = iArr2;
                                i14 = i23;
                                f13 = f14;
                                str2 = str;
                            }
                        } catch (jc0.b unused) {
                        }
                    }
                }
                str = str2;
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    iB2 = Math.max(iB2, a(vwVar.a().q(iMax).g(iMax2).a(), ec0Var));
                    ka0.d("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            } else {
                str = str2;
            }
            aVar = new a(iMax, iMax2, iB2);
        }
        this.f387918N0 = aVar;
        boolean z15 = this.f387917M0;
        int i26 = this.f387943m1 ? this.f387944n1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", vwVar.f391186q);
        mediaFormat.setInteger("height", vwVar.f391187r);
        List<byte[]> list = vwVar.f391183n;
        for (int i27 = 0; i27 < list.size(); i27++) {
            mediaFormat.setByteBuffer(ba.a("csd-", i27), ByteBuffer.wrap(list.get(i27)));
        }
        float f15 = vwVar.f391188s;
        if (f15 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f15);
        }
        wc0.a(mediaFormat, "rotation-degrees", vwVar.f391189t);
        kk kkVar = vwVar.f391193x;
        if (kkVar != null) {
            wc0.a(mediaFormat, "color-transfer", kkVar.f387179c);
            wc0.a(mediaFormat, "color-standard", kkVar.f387177a);
            wc0.a(mediaFormat, "color-range", kkVar.f387178b);
            byte[] bArr = kkVar.f387180d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(vwVar.f391181l) && (pairB = jc0.b(vwVar)) != null) {
            wc0.a(mediaFormat, "profile", ((Integer) pairB.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f387947a);
        mediaFormat.setInteger("max-height", aVar.f387948b);
        wc0.a(mediaFormat, "max-input-size", aVar.f387949c);
        if (pc1.f388768a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f12 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f12);
            }
        }
        if (z15) {
            z12 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z12 = true;
        }
        if (i26 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z12);
            mediaFormat.setInteger("audio-session-id", i26);
        }
        if (this.f387921Q0 == null) {
            if (b(ec0Var)) {
                if (this.f387922R0 == null) {
                    this.f387922R0 = PlaceholderSurface.a(this.f387912H0, ec0Var.f384891f);
                }
                this.f387921Q0 = this.f387922R0;
            } else {
                throw new IllegalStateException();
            }
        }
        return ac0.a.a(ec0Var, mediaFormat, vwVar, this.f387921Q0, mediaCrypto);
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    public final xn a(ec0 ec0Var, vw vwVar, vw vwVar2) {
        xn xnVarA = ec0Var.a(vwVar, vwVar2);
        int i12 = xnVarA.f391784e;
        int i13 = vwVar2.f391186q;
        a aVar = this.f387918N0;
        if (i13 > aVar.f387947a || vwVar2.f391187r > aVar.f387948b) {
            i12 |= 256;
        }
        if (b(vwVar2, ec0Var) > this.f387918N0.f387949c) {
            i12 |= 64;
        }
        int i14 = i12;
        return new xn(ec0Var.f384886a, vwVar, vwVar2, i14 != 0 ? 0 : xnVarA.f391783d, i14);
    }

    @Override // com.yandex.mobile.ads.impl.gc0, com.yandex.mobile.ads.impl.ux0
    public final void a(float f12, float f13) throws Exception {
        super.a(f12, f13);
        this.f387913I0.b(f12);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(com.yandex.mobile.ads.impl.vw r11, com.yandex.mobile.ads.impl.ec0 r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.mc0.a(com.yandex.mobile.ads.impl.vw, com.yandex.mobile.ads.impl.ec0):int");
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    public final float a(float f12, vw[] vwVarArr) {
        float fMax = -1.0f;
        for (vw vwVar : vwVarArr) {
            float f13 = vwVar.f391188s;
            if (f13 != -1.0f) {
                fMax = Math.max(fMax, f13);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f12;
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    public final void a(String str, long j12, long j13) {
        boolean z12;
        this.f387914J0.a(str, j12, j13);
        if (str.startsWith(f387908q1.c1())) {
            z12 = false;
        } else {
            synchronized (mc0.class) {
                try {
                    if (!f387910s1) {
                        f387911t1 = U();
                        f387910s1 = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            z12 = f387911t1;
        }
        this.f387919O0 = z12;
        ec0 ec0VarD = D();
        ec0VarD.getClass();
        this.f387920P0 = ec0VarD.a();
        if (pc1.f388768a < 23 || !this.f387943m1) {
            return;
        }
        ac0 ac0VarC = C();
        ac0VarC.getClass();
        this.f387945o1 = new b(ac0VarC);
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    public final void a(String str) {
        this.f387914J0.a(str);
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    public final void a(Exception exc) {
        ka0.a("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f387914J0.b(exc);
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    @j.P
    public final xn a(ww wwVar) {
        xn xnVarA = super.a(wwVar);
        this.f387914J0.a(wwVar.f391506b, xnVarA);
        return xnVarA;
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    public final void a(vw vwVar, @j.P MediaFormat mediaFormat) {
        int integer;
        int integer2;
        ac0 ac0VarC = C();
        if (ac0VarC != null) {
            ac0VarC.a(this.f387924T0);
        }
        if (this.f387943m1) {
            this.f387938h1 = vwVar.f391186q;
            this.f387939i1 = vwVar.f391187r;
        } else {
            mediaFormat.getClass();
            boolean z12 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z12) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.f387938h1 = integer;
            if (z12) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.f387939i1 = integer2;
        }
        float f12 = vwVar.f391190u;
        this.f387941k1 = f12;
        if (pc1.f388768a >= 21) {
            int i12 = vwVar.f391189t;
            if (i12 == 90 || i12 == 270) {
                int i13 = this.f387938h1;
                this.f387938h1 = this.f387939i1;
                this.f387939i1 = i13;
                this.f387941k1 = 1.0f / f12;
            }
        } else {
            this.f387940j1 = vwVar.f391189t;
        }
        this.f387913I0.a(vwVar.f391188s);
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    @TargetApi(AvailableCode.HMS_IS_SPOOF)
    public final void a(vn vnVar) {
        if (this.f387920P0) {
            ByteBuffer byteBuffer = vnVar.f390954f;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b12 = byteBuffer.get();
                short s5 = byteBuffer.getShort();
                short s12 = byteBuffer.getShort();
                byte b13 = byteBuffer.get();
                byte b14 = byteBuffer.get();
                byteBuffer.position(0);
                if (b12 == -75 && s5 == 60 && s12 == 1 && b13 == 4 && b14 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    ac0 ac0VarC = C();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    ac0VarC.a(bundle);
                }
            }
        }
    }

    public static void a(mc0 mc0Var) {
        mc0Var.P();
    }

    @Override // com.yandex.mobile.ads.impl.gc0
    public final dc0 a(IllegalStateException illegalStateException, @j.P ec0 ec0Var) {
        return new lc0(illegalStateException, ec0Var, this.f387921Q0);
    }
}
