package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.adjust.sdk.network.ErrorCodes;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.mobile.ads.exo.drm.e;
import com.yandex.mobile.ads.impl.bp;
import com.yandex.mobile.ads.impl.ca1;
import com.yandex.mobile.ads.impl.dd0;
import com.yandex.mobile.ads.impl.i91;
import com.yandex.mobile.ads.impl.jd0;
import com.yandex.mobile.ads.impl.kt0;
import com.yandex.mobile.ads.impl.md0;
import com.yandex.mobile.ads.impl.xc0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
final class rt implements Handler.Callback, dd0.a, ca1.a, md0.d, bp.a, kt0.a {

    /* renamed from: A, reason: collision with root package name */
    private boolean f389609A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f389610B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f389611C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f389612D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f389613E;

    /* renamed from: F, reason: collision with root package name */
    private int f389614F;

    /* renamed from: H, reason: collision with root package name */
    private boolean f389616H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f389617I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f389618J;

    /* renamed from: K, reason: collision with root package name */
    private int f389619K;

    /* renamed from: L, reason: collision with root package name */
    @j.P
    private g f389620L;

    /* renamed from: M, reason: collision with root package name */
    private long f389621M;

    /* renamed from: N, reason: collision with root package name */
    private int f389622N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f389623O;

    /* renamed from: P, reason: collision with root package name */
    @j.P
    private lt f389624P;

    /* renamed from: b, reason: collision with root package name */
    private final ux0[] f389626b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<ux0> f389627c;

    /* renamed from: d, reason: collision with root package name */
    private final vx0[] f389628d;

    /* renamed from: e, reason: collision with root package name */
    private final ca1 f389629e;

    /* renamed from: f, reason: collision with root package name */
    private final da1 f389630f;

    /* renamed from: g, reason: collision with root package name */
    private final o90 f389631g;

    /* renamed from: h, reason: collision with root package name */
    private final pd f389632h;

    /* renamed from: i, reason: collision with root package name */
    private final bz f389633i;

    /* renamed from: j, reason: collision with root package name */
    private final HandlerThread f389634j;

    /* renamed from: k, reason: collision with root package name */
    private final Looper f389635k;

    /* renamed from: l, reason: collision with root package name */
    private final i91.d f389636l;

    /* renamed from: m, reason: collision with root package name */
    private final i91.b f389637m;

    /* renamed from: n, reason: collision with root package name */
    private final long f389638n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f389639o;

    /* renamed from: p, reason: collision with root package name */
    private final bp f389640p;

    /* renamed from: q, reason: collision with root package name */
    private final ArrayList<c> f389641q;

    /* renamed from: r, reason: collision with root package name */
    private final hj f389642r;

    /* renamed from: s, reason: collision with root package name */
    private final e f389643s;

    /* renamed from: t, reason: collision with root package name */
    private final hd0 f389644t;

    /* renamed from: u, reason: collision with root package name */
    private final md0 f389645u;

    /* renamed from: v, reason: collision with root package name */
    private final n90 f389646v;

    /* renamed from: w, reason: collision with root package name */
    private final long f389647w;

    /* renamed from: x, reason: collision with root package name */
    private y21 f389648x;

    /* renamed from: y, reason: collision with root package name */
    private at0 f389649y;

    /* renamed from: z, reason: collision with root package name */
    private d f389650z;

    /* renamed from: G, reason: collision with root package name */
    private boolean f389615G = false;

    /* renamed from: Q, reason: collision with root package name */
    private long f389625Q = -9223372036854775807L;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<md0.c> f389651a;

        /* renamed from: b, reason: collision with root package name */
        private final s31 f389652b;

        /* renamed from: c, reason: collision with root package name */
        private final int f389653c;

        /* renamed from: d, reason: collision with root package name */
        private final long f389654d;

        public /* synthetic */ a(ArrayList arrayList, s31 s31Var, int i12, long j12) {
            this(i12, j12, s31Var, arrayList);
        }

        private a(int i12, long j12, s31 s31Var, ArrayList arrayList) {
            this.f389651a = arrayList;
            this.f389652b = s31Var;
            this.f389653c = i12;
            this.f389654d = j12;
        }
    }

    public static class b {
    }

    public static final class c implements Comparable<c> {
        public c() {
            throw null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            cVar.getClass();
            return 0;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private boolean f389655a;

        /* renamed from: b, reason: collision with root package name */
        public at0 f389656b;

        /* renamed from: c, reason: collision with root package name */
        public int f389657c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f389658d;

        /* renamed from: e, reason: collision with root package name */
        public int f389659e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f389660f;

        /* renamed from: g, reason: collision with root package name */
        public int f389661g;

        public d(at0 at0Var) {
            this.f389656b = at0Var;
        }

        public final void b(int i12) {
            this.f389655a = true;
            this.f389660f = true;
            this.f389661g = i12;
        }

        public final void c(int i12) {
            if (this.f389658d && this.f389659e != 5) {
                db.a(i12 == 5);
                return;
            }
            this.f389655a = true;
            this.f389658d = true;
            this.f389659e = i12;
        }

        public final void a(int i12) {
            this.f389655a |= i12 > 0;
            this.f389657c += i12;
        }

        public final void a(at0 at0Var) {
            this.f389655a |= this.f389656b != at0Var;
            this.f389656b = at0Var;
        }
    }

    public interface e {
        void a(d dVar);
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final jd0.b f389662a;

        /* renamed from: b, reason: collision with root package name */
        public final long f389663b;

        /* renamed from: c, reason: collision with root package name */
        public final long f389664c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f389665d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f389666e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f389667f;

        public f(jd0.b bVar, long j12, long j13, boolean z12, boolean z13, boolean z14) {
            this.f389662a = bVar;
            this.f389663b = j12;
            this.f389664c = j13;
            this.f389665d = z12;
            this.f389666e = z13;
            this.f389667f = z14;
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final i91 f389668a;

        /* renamed from: b, reason: collision with root package name */
        public final int f389669b;

        /* renamed from: c, reason: collision with root package name */
        public final long f389670c;

        public g(i91 i91Var, int i12, long j12) {
            this.f389668a = i91Var;
            this.f389669b = i12;
            this.f389670c = j12;
        }
    }

    public rt(ux0[] ux0VarArr, ca1 ca1Var, da1 da1Var, o90 o90Var, pd pdVar, int i12, j9 j9Var, y21 y21Var, yo yoVar, long j12, boolean z12, Looper looper, c81 c81Var, e eVar, jt0 jt0Var) {
        this.f389643s = eVar;
        this.f389626b = ux0VarArr;
        this.f389629e = ca1Var;
        this.f389630f = da1Var;
        this.f389631g = o90Var;
        this.f389632h = pdVar;
        this.f389614F = i12;
        this.f389648x = y21Var;
        this.f389646v = yoVar;
        this.f389647w = j12;
        this.f389610B = z12;
        this.f389642r = c81Var;
        this.f389638n = o90Var.e();
        this.f389639o = o90Var.a();
        at0 at0VarA = at0.a(da1Var);
        this.f389649y = at0VarA;
        this.f389650z = new d(at0VarA);
        this.f389628d = new vx0[ux0VarArr.length];
        for (int i13 = 0; i13 < ux0VarArr.length; i13++) {
            ux0VarArr[i13].a(i13, jt0Var);
            this.f389628d[i13] = ux0VarArr[i13].n();
        }
        this.f389640p = new bp(this, c81Var);
        this.f389641q = new ArrayList<>();
        this.f389627c = com.yandex.mobile.ads.embedded.guava.collect.m0.a();
        this.f389636l = new i91.d();
        this.f389637m = new i91.b();
        ca1Var.a(this, pdVar);
        this.f389623O = true;
        Handler handler = new Handler(looper);
        this.f389644t = new hd0(j9Var, handler);
        this.f389645u = new md0(this, j9Var, handler, jt0Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f389634j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f389635k = looper2;
        this.f389633i = c81Var.a(looper2, this);
    }

    private void c(boolean z12) {
        if (z12 == this.f389618J) {
            return;
        }
        this.f389618J = z12;
        if (z12 || !this.f389649y.f383655o) {
            return;
        }
        this.f389633i.a(2);
    }

    private /* synthetic */ Boolean e() {
        return Boolean.valueOf(this.f389609A);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f() {
        /*
            r8 = this;
            com.yandex.mobile.ads.impl.hd0 r0 = r8.f389644t
            com.yandex.mobile.ads.impl.ed0 r0 = r0.d()
            if (r0 != 0) goto L9
            goto L1d
        L9:
            boolean r1 = r0.f384898d
            r2 = 0
            if (r1 != 0) goto L11
            r0 = r2
            goto L17
        L11:
            com.yandex.mobile.ads.impl.dd0 r0 = r0.f384895a
            long r0 = r0.getNextLoadPositionUs()
        L17:
            r4 = -9223372036854775808
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L1f
        L1d:
            r0 = 0
            goto L60
        L1f:
            com.yandex.mobile.ads.impl.hd0 r0 = r8.f389644t
            com.yandex.mobile.ads.impl.ed0 r0 = r0.d()
            boolean r1 = r0.f384898d
            if (r1 != 0) goto L2b
            r4 = r2
            goto L31
        L2b:
            com.yandex.mobile.ads.impl.dd0 r1 = r0.f384895a
            long r4 = r1.getNextLoadPositionUs()
        L31:
            com.yandex.mobile.ads.impl.hd0 r1 = r8.f389644t
            com.yandex.mobile.ads.impl.ed0 r1 = r1.d()
            if (r1 != 0) goto L3a
            goto L45
        L3a:
            long r6 = r8.f389621M
            long r6 = r1.c(r6)
            long r4 = r4 - r6
            long r2 = java.lang.Math.max(r2, r4)
        L45:
            com.yandex.mobile.ads.impl.hd0 r1 = r8.f389644t
            com.yandex.mobile.ads.impl.ed0 r1 = r1.e()
            if (r0 != r1) goto L4e
            goto L52
        L4e:
            com.yandex.mobile.ads.impl.gd0 r0 = r0.f384900f
            long r0 = r0.f385718b
        L52:
            com.yandex.mobile.ads.impl.o90 r0 = r8.f389631g
            com.yandex.mobile.ads.impl.bp r1 = r8.f389640p
            com.yandex.mobile.ads.impl.ct0 r1 = r1.getPlaybackParameters()
            float r1 = r1.f384453a
            boolean r0 = r0.a(r2, r1)
        L60:
            r8.f389613E = r0
            if (r0 == 0) goto L6f
            com.yandex.mobile.ads.impl.hd0 r0 = r8.f389644t
            com.yandex.mobile.ads.impl.ed0 r0 = r0.d()
            long r1 = r8.f389621M
            r0.a(r1)
        L6f:
            r8.s()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rt.f():void");
    }

    private void g() throws Throwable {
        a(this.f389645u.a(), true);
    }

    private void j() {
        this.f389650z.a(1);
        a(false, false, false, true);
        this.f389631g.f();
        b(this.f389649y.f383641a.c() ? 4 : 2);
        this.f389645u.a(this.f389632h.a());
        this.f389633i.a(2);
    }

    private void l() {
        a(true, false, true, false);
        this.f389631g.b();
        b(1);
        this.f389634j.quit();
        synchronized (this) {
            this.f389609A = true;
            notifyAll();
        }
    }

    private boolean m() {
        ed0 ed0VarF = this.f389644t.f();
        da1 da1VarF = ed0VarF.f();
        int i12 = 0;
        boolean z12 = false;
        while (true) {
            ux0[] ux0VarArr = this.f389626b;
            if (i12 >= ux0VarArr.length) {
                return !z12;
            }
            ux0 ux0Var = ux0VarArr[i12];
            if (b(ux0Var)) {
                boolean z13 = ux0Var.g() != ed0VarF.f384897c[i12];
                if (!da1VarF.a(i12) || z13) {
                    if (!ux0Var.k()) {
                        cu cuVar = da1VarF.f384553c[i12];
                        int length = cuVar != null ? cuVar.length() : 0;
                        vw[] vwVarArr = new vw[length];
                        for (int i13 = 0; i13 < length; i13++) {
                            vwVarArr[i13] = cuVar.a(i13);
                        }
                        ux0Var.a(vwVarArr, ed0VarF.f384897c[i12], ed0VarF.d(), ed0VarF.c());
                    } else if (ux0Var.a()) {
                        a(ux0Var);
                    } else {
                        z12 = true;
                    }
                }
            }
            i12++;
        }
    }

    private void n() {
        float f12 = this.f389640p.getPlaybackParameters().f384453a;
        ed0 ed0VarF = this.f389644t.f();
        boolean z12 = true;
        for (ed0 ed0VarE = this.f389644t.e(); ed0VarE != null && ed0VarE.f384898d; ed0VarE = ed0VarE.b()) {
            da1 da1VarB = ed0VarE.b(f12, this.f389649y.f383641a);
            da1 da1VarF = ed0VarE.f();
            if (da1VarF != null && da1VarF.f384553c.length == da1VarB.f384553c.length) {
                for (int i12 = 0; i12 < da1VarB.f384553c.length; i12++) {
                    if (pc1.a(da1VarB.f384552b[i12], da1VarF.f384552b[i12]) && pc1.a(da1VarB.f384553c[i12], da1VarF.f384553c[i12])) {
                    }
                }
                if (ed0VarE == ed0VarF) {
                    z12 = false;
                }
            }
            if (z12) {
                ed0 ed0VarE2 = this.f389644t.e();
                boolean zA2 = this.f389644t.a(ed0VarE2);
                boolean[] zArr = new boolean[this.f389626b.length];
                long jA2 = ed0VarE2.a(da1VarB, this.f389649y.f383658r, zA2, zArr);
                at0 at0Var = this.f389649y;
                boolean z13 = (at0Var.f383645e == 4 || jA2 == at0Var.f383658r) ? false : true;
                at0 at0Var2 = this.f389649y;
                this.f389649y = a(at0Var2.f383642b, jA2, at0Var2.f383643c, at0Var2.f383644d, z13, 5);
                if (z13) {
                    a(jA2);
                }
                boolean[] zArr2 = new boolean[this.f389626b.length];
                int i13 = 0;
                while (true) {
                    ux0[] ux0VarArr = this.f389626b;
                    if (i13 >= ux0VarArr.length) {
                        break;
                    }
                    ux0 ux0Var = ux0VarArr[i13];
                    boolean zB2 = b(ux0Var);
                    zArr2[i13] = zB2;
                    n11 n11Var = ed0VarE2.f384897c[i13];
                    if (zB2) {
                        if (n11Var != ux0Var.g()) {
                            a(ux0Var);
                        } else if (zArr[i13]) {
                            ux0Var.a(this.f389621M);
                        }
                    }
                    i13++;
                }
                a(zArr2);
            } else {
                this.f389644t.a(ed0VarE);
                if (ed0VarE.f384898d) {
                    ed0VarE.a(da1VarB, Math.max(ed0VarE.f384900f.f385718b, ed0VarE.c(this.f389621M)));
                }
            }
            a(true);
            if (this.f389649y.f383645e != 4) {
                f();
                t();
                this.f389633i.a(2);
                return;
            }
            return;
        }
    }

    private void o() {
        ed0 ed0VarE = this.f389644t.e();
        this.f389611C = ed0VarE != null && ed0VarE.f384900f.f385724h && this.f389610B;
    }

    private boolean p() {
        at0 at0Var = this.f389649y;
        return at0Var.f383652l && at0Var.f383653m == 0;
    }

    private void r() {
        this.f389640p.b();
        for (ux0 ux0Var : this.f389626b) {
            if (b(ux0Var) && ux0Var.c() == 2) {
                ux0Var.stop();
            }
        }
    }

    private void s() {
        ed0 ed0VarD = this.f389644t.d();
        boolean z12 = this.f389613E || (ed0VarD != null && ed0VarD.f384895a.isLoading());
        at0 at0Var = this.f389649y;
        if (z12 != at0Var.f383647g) {
            this.f389649y = new at0(at0Var.f383641a, at0Var.f383642b, at0Var.f383643c, at0Var.f383644d, at0Var.f383645e, at0Var.f383646f, z12, at0Var.f383648h, at0Var.f383649i, at0Var.f383650j, at0Var.f383651k, at0Var.f383652l, at0Var.f383653m, at0Var.f383654n, at0Var.f383656p, at0Var.f383657q, at0Var.f383658r, at0Var.f383655o);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x009c, code lost:
    
        r6 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t() {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rt.t():void");
    }

    public final Looper d() {
        return this.f389635k;
    }

    public final void h() {
        this.f389633i.a(22);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        ed0 ed0VarF;
        try {
            switch (message.what) {
                case 0:
                    j();
                    break;
                case 1:
                    a(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    b();
                    break;
                case 3:
                    a((g) message.obj);
                    break;
                case 4:
                    b((ct0) message.obj);
                    break;
                case 5:
                    this.f389648x = (y21) message.obj;
                    break;
                case 6:
                    a(false, true);
                    break;
                case 7:
                    l();
                    return true;
                case 8:
                    c((dd0) message.obj);
                    break;
                case 9:
                    b((dd0) message.obj);
                    break;
                case 10:
                    n();
                    break;
                case 11:
                    a(message.arg1);
                    break;
                case 12:
                    e(message.arg1 != 0);
                    break;
                case 13:
                    a(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    kt0 kt0Var = (kt0) message.obj;
                    kt0Var.getClass();
                    if (kt0Var.a() != this.f389635k) {
                        this.f389633i.a(15, kt0Var).a();
                        break;
                    } else {
                        synchronized (kt0Var) {
                        }
                        try {
                            kt0Var.c().a(kt0Var.d(), kt0Var.b());
                            kt0Var.a(true);
                            int i12 = this.f389649y.f383645e;
                            if (i12 == 3 || i12 == 2) {
                                this.f389633i.a(2);
                                break;
                            }
                        } catch (Throwable th2) {
                            kt0Var.a(true);
                            throw th2;
                        }
                    }
                case 15:
                    c((kt0) message.obj);
                    break;
                case 16:
                    ct0 ct0Var = (ct0) message.obj;
                    a(ct0Var, ct0Var.f384453a, true, false);
                    break;
                case 17:
                    a((a) message.obj);
                    break;
                case 18:
                    a((a) message.obj, message.arg1);
                    break;
                case 19:
                    a((b) message.obj);
                    break;
                case 20:
                    a(message.arg1, message.arg2, (s31) message.obj);
                    break;
                case 21:
                    a((s31) message.obj);
                    break;
                case 22:
                    g();
                    break;
                case 23:
                    d(message.arg1 != 0);
                    break;
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                    c(message.arg1 == 1);
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    b(true);
                    break;
                default:
                    return false;
            }
        } catch (e.a e12) {
            a(e12, e12.f382910a);
        } catch (hn e13) {
            a(e13, e13.f386176a);
        } catch (lt e14) {
            e = e14;
            if (e.f387702c == 1 && (ed0VarF = this.f389644t.f()) != null) {
                e = e.a(ed0VarF.f384900f.f385717a);
            }
            if (e.f387708i && this.f389624P == null) {
                ka0.b("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f389624P = e;
                bz bzVar = this.f389633i;
                bzVar.a(bzVar.a(25, e));
            } else {
                lt ltVar = this.f389624P;
                if (ltVar != null) {
                    ltVar.addSuppressed(e);
                    e = this.f389624P;
                }
                ka0.a("ExoPlayerImplInternal", "Playback error", e);
                a(true, false);
                this.f389649y = this.f389649y.a(e);
            }
        } catch (tr0 e15) {
            int i13 = e15.f390294b;
            if (i13 == 1) {
                i = e15.f390293a ? 3001 : 3003;
            } else if (i13 == 4) {
                i = e15.f390293a ? 3002 : 3004;
            }
            a(e15, i);
        } catch (IOException e16) {
            a(e16, 2000);
        } catch (RuntimeException e17) {
            lt ltVarA = lt.a(e17, ((e17 instanceof IllegalStateException) || (e17 instanceof IllegalArgumentException)) ? ErrorCodes.PROTOCOL_EXCEPTION : 1000);
            ka0.a("ExoPlayerImplInternal", "Playback error", ltVarA);
            a(true, false);
            this.f389649y = this.f389649y.a(ltVarA);
        }
        this.f389650z.a(this.f389649y);
        if (this.f389650z.f389655a) {
            this.f389643s.a(this.f389650z);
            this.f389650z = new d(this.f389649y);
        }
        return true;
    }

    public final void i() {
        this.f389633i.b(0).a();
    }

    public final synchronized boolean k() {
        boolean z12;
        if (!this.f389609A && this.f389634j.isAlive()) {
            this.f389633i.a(7);
            long jC2 = this.f389647w;
            synchronized (this) {
                long jC3 = this.f389642r.c() + jC2;
                boolean z13 = false;
                while (!e().booleanValue() && jC2 > 0) {
                    try {
                        this.f389642r.b();
                        wait(jC2);
                    } catch (InterruptedException unused) {
                        z13 = true;
                    }
                    jC2 = jC3 - this.f389642r.c();
                }
                if (z13) {
                    Thread.currentThread().interrupt();
                }
                z12 = this.f389609A;
            }
            return z12;
        }
        return true;
    }

    public final void q() {
        this.f389633i.b(6).a();
    }

    private void d(boolean z12) {
        this.f389610B = z12;
        o();
        if (!this.f389611C || this.f389644t.f() == this.f389644t.e()) {
            return;
        }
        b(true);
        a(false);
    }

    private void e(boolean z12) {
        this.f389615G = z12;
        if (!this.f389644t.a(this.f389649y.f383641a, z12)) {
            b(true);
        }
        a(false);
    }

    public final synchronized void b(kt0 kt0Var) {
        if (!this.f389609A && this.f389634j.isAlive()) {
            this.f389633i.a(14, kt0Var).a();
            return;
        }
        ka0.d("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        kt0Var.a(false);
    }

    @Override // com.yandex.mobile.ads.impl.g31.a
    public final void a(g31 g31Var) {
        this.f389633i.a(9, (dd0) g31Var).a();
    }

    private void c(kt0 kt0Var) {
        Looper looperA = kt0Var.a();
        if (!looperA.getThread().isAlive()) {
            ka0.d("TAG", "Trying to send message on a dead thread.");
            kt0Var.a(false);
        } else {
            this.f389642r.a(looperA, null).a(new H(6, this, kt0Var));
        }
    }

    public final void a(boolean z12, int i12) {
        this.f389633i.a(z12 ? 1 : 0, i12).a();
    }

    private void b(int i12) {
        at0 at0Var = this.f389649y;
        if (at0Var.f383645e != i12) {
            if (i12 != 2) {
                this.f389625Q = -9223372036854775807L;
            }
            this.f389649y = at0Var.a(i12);
        }
    }

    public final void a(int i12, long j12, s31 s31Var, ArrayList arrayList) {
        this.f389633i.a(17, new a(arrayList, s31Var, i12, j12)).a();
    }

    private void b(boolean z12) {
        jd0.b bVar = this.f389644t.e().f384900f.f385717a;
        long jA2 = a(bVar, this.f389649y.f383658r, true, false);
        if (jA2 != this.f389649y.f383658r) {
            at0 at0Var = this.f389649y;
            this.f389649y = a(bVar, jA2, at0Var.f383643c, at0Var.f383644d, z12, 5);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dd0.a
    public final void a(dd0 dd0Var) {
        this.f389633i.a(8, dd0Var).a();
    }

    private long c() {
        ed0 ed0VarF = this.f389644t.f();
        if (ed0VarF == null) {
            return 0L;
        }
        long jC2 = ed0VarF.c();
        if (!ed0VarF.f384898d) {
            return jC2;
        }
        int i12 = 0;
        while (true) {
            ux0[] ux0VarArr = this.f389626b;
            if (i12 >= ux0VarArr.length) {
                return jC2;
            }
            if (b(ux0VarArr[i12]) && this.f389626b[i12].g() == ed0VarF.f384897c[i12]) {
                long j12 = this.f389626b[i12].j();
                if (j12 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jC2 = Math.max(j12, jC2);
            }
            i12++;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ca1.a
    public final void a() {
        this.f389633i.a(10);
    }

    public final void a(ct0 ct0Var) {
        this.f389633i.a(16, ct0Var).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:241:0x0403, code lost:
    
        if (p() == false) goto L242;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae A[EDGE_INSN: B:402:0x00ae->B:32:0x00ae BREAK  A[LOOP:6: B:42:0x00d2->B:59:0x010d], EDGE_INSN: B:403:0x00ae->B:32:0x00ae BREAK  A[LOOP:6: B:42:0x00d2->B:59:0x010d], EDGE_INSN: B:404:0x00ae->B:32:0x00ae BREAK  A[LOOP:6: B:42:0x00d2->B:59:0x010d], EDGE_INSN: B:405:0x00ae->B:32:0x00ae BREAK  A[LOOP:6: B:42:0x00d2->B:59:0x010d]] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x058e  */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28, types: [int] */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36, types: [int] */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b() {
        /*
            Method dump skipped, instructions count: 1629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rt.b():void");
    }

    private void a(IOException iOException, int i12) {
        lt ltVarA = lt.a(iOException, i12);
        ed0 ed0VarE = this.f389644t.e();
        if (ed0VarE != null) {
            ltVarA = ltVarA.a(ed0VarE.f384900f.f385717a);
        }
        ka0.a("ExoPlayerImplInternal", "Playback error", ltVarA);
        a(false, false);
        this.f389649y = this.f389649y.a(ltVarA);
    }

    private void c(dd0 dd0Var) {
        if (this.f389644t.a(dd0Var)) {
            ed0 ed0VarD = this.f389644t.d();
            ed0VarD.a(this.f389640p.getPlaybackParameters().f384453a, this.f389649y.f383641a);
            this.f389631g.a(this.f389626b, ed0VarD.f().f384553c);
            if (ed0VarD == this.f389644t.e()) {
                a(ed0VarD.f384900f.f385718b);
                a(new boolean[this.f389626b.length]);
                at0 at0Var = this.f389649y;
                jd0.b bVar = at0Var.f383642b;
                long j12 = ed0VarD.f384900f.f385718b;
                this.f389649y = a(bVar, j12, at0Var.f383643c, j12, false, 5);
            }
            f();
        }
    }

    private void a(a aVar) throws Throwable {
        this.f389650z.a(1);
        if (aVar.f389653c != -1) {
            this.f389620L = new g(new yt0(aVar.f389651a, aVar.f389652b), aVar.f389653c, aVar.f389654d);
        }
        a(this.f389645u.a(aVar.f389651a, aVar.f389652b), false);
    }

    private void a(a aVar, int i12) throws Throwable {
        this.f389650z.a(1);
        md0 md0Var = this.f389645u;
        if (i12 == -1) {
            i12 = md0Var.b();
        }
        a(md0Var.a(i12, aVar.f389651a, aVar.f389652b), false);
    }

    private void a(b bVar) throws Throwable {
        this.f389650z.a(1);
        md0 md0Var = this.f389645u;
        bVar.getClass();
        a(md0Var.d(), false);
    }

    private void a(int i12, int i13, s31 s31Var) throws Throwable {
        this.f389650z.a(1);
        a(this.f389645u.a(i12, i13, s31Var), false);
    }

    private void a(s31 s31Var) throws Throwable {
        this.f389650z.a(1);
        a(this.f389645u.a(s31Var), false);
    }

    private void a(boolean z12, int i12, boolean z13, int i13) {
        this.f389650z.a(z13 ? 1 : 0);
        this.f389650z.b(i13);
        at0 at0Var = this.f389649y;
        this.f389649y = new at0(at0Var.f383641a, at0Var.f383642b, at0Var.f383643c, at0Var.f383644d, at0Var.f383645e, at0Var.f383646f, at0Var.f383647g, at0Var.f383648h, at0Var.f383649i, at0Var.f383650j, at0Var.f383651k, z12, i12, at0Var.f383654n, at0Var.f383656p, at0Var.f383657q, at0Var.f383658r, at0Var.f383655o);
        this.f389612D = false;
        for (ed0 ed0VarE = this.f389644t.e(); ed0VarE != null; ed0VarE = ed0VarE.b()) {
            for (cu cuVar : ed0VarE.f().f384553c) {
                if (cuVar != null) {
                    cuVar.a(z12);
                }
            }
        }
        if (!p()) {
            r();
            t();
            return;
        }
        int i14 = this.f389649y.f383645e;
        if (i14 != 3) {
            if (i14 == 2) {
                this.f389633i.a(2);
                return;
            }
            return;
        }
        this.f389612D = false;
        this.f389640p.a();
        for (ux0 ux0Var : this.f389626b) {
            if (b(ux0Var)) {
                ux0Var.start();
            }
        }
        this.f389633i.a(2);
    }

    private void a(int i12) {
        this.f389614F = i12;
        if (!this.f389644t.a(this.f389649y.f383641a, i12)) {
            b(true);
        }
        a(false);
    }

    private long a(i91 i91Var, Object obj, long j12) {
        long jElapsedRealtime;
        i91Var.a(i91Var.a(obj, this.f389637m).f386391c, this.f389636l, 0L);
        i91.d dVar = this.f389636l;
        if (dVar.f386409f != -9223372036854775807L && dVar.a()) {
            i91.d dVar2 = this.f389636l;
            if (dVar2.f386412i) {
                long j13 = dVar2.f386410g;
                int i12 = pc1.f388768a;
                if (j13 == -9223372036854775807L) {
                    jElapsedRealtime = System.currentTimeMillis();
                } else {
                    jElapsedRealtime = j13 + SystemClock.elapsedRealtime();
                }
                return pc1.a(jElapsedRealtime - this.f389636l.f386409f) - (j12 + this.f389637m.f386393e);
            }
        }
        return -9223372036854775807L;
    }

    private boolean a(i91 i91Var, jd0.b bVar) {
        if (bVar.a() || i91Var.c()) {
            return false;
        }
        i91Var.a(i91Var.a(bVar.f385280a, this.f389637m).f386391c, this.f389636l, 0L);
        if (!this.f389636l.a()) {
            return false;
        }
        i91.d dVar = this.f389636l;
        return dVar.f386412i && dVar.f386409f != -9223372036854775807L;
    }

    private void a(g gVar) throws Throwable {
        long j12;
        long j13;
        jd0.b bVar;
        boolean z12;
        long j14;
        long j15;
        long j16;
        at0 at0Var;
        int i12;
        this.f389650z.a(1);
        Pair pairA = a(this.f389649y.f383641a, gVar, this.f389614F, this.f389615G, this.f389636l, this.f389637m);
        if (pairA == null) {
            Pair<jd0.b, Long> pairA2 = a(this.f389649y.f383641a);
            bVar = (jd0.b) pairA2.first;
            long jLongValue = ((Long) pairA2.second).longValue();
            z12 = !this.f389649y.f383641a.c();
            j12 = jLongValue;
            j13 = -9223372036854775807L;
        } else {
            Object obj = pairA.first;
            long jLongValue2 = ((Long) pairA.second).longValue();
            long j17 = gVar.f389670c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            jd0.b bVarA = this.f389644t.a(this.f389649y.f383641a, obj, jLongValue2);
            if (bVarA.a()) {
                this.f389649y.f383641a.a(bVarA.f385280a, this.f389637m);
                jLongValue2 = this.f389637m.d(bVarA.f385281b) == bVarA.f385282c ? this.f389637m.b() : 0L;
            } else if (gVar.f389670c != -9223372036854775807L) {
                j12 = jLongValue2;
                j13 = j17;
                bVar = bVarA;
                z12 = false;
            }
            j12 = jLongValue2;
            j13 = j17;
            bVar = bVarA;
            z12 = true;
        }
        try {
            if (this.f389649y.f383641a.c()) {
                this.f389620L = gVar;
            } else if (pairA == null) {
                if (this.f389649y.f383645e != 1) {
                    b(4);
                }
                a(false, true, false, true);
            } else {
                if (bVar.equals(this.f389649y.f383642b)) {
                    ed0 ed0VarE = this.f389644t.e();
                    long jA2 = (ed0VarE == null || !ed0VarE.f384898d || j12 == 0) ? j12 : ed0VarE.f384895a.a(j12, this.f389648x);
                    if (pc1.b(jA2) == pc1.b(this.f389649y.f383658r) && ((i12 = (at0Var = this.f389649y).f383645e) == 2 || i12 == 3)) {
                        long j18 = at0Var.f383658r;
                        this.f389649y = a(bVar, j18, j13, j18, z12, 2);
                        return;
                    }
                    j15 = jA2;
                } else {
                    j15 = j12;
                }
                long jA3 = a(bVar, j15, this.f389644t.e() != this.f389644t.f(), this.f389649y.f383645e == 4);
                boolean z13 = z12 | (j12 != jA3);
                try {
                    at0 at0Var2 = this.f389649y;
                    i91 i91Var = at0Var2.f383641a;
                    a(i91Var, bVar, i91Var, at0Var2.f383642b, j13);
                    z12 = z13;
                    j16 = jA3;
                    this.f389649y = a(bVar, j16, j13, j16, z12, 2);
                } catch (Throwable th2) {
                    th = th2;
                    z12 = z13;
                    j14 = jA3;
                    this.f389649y = a(bVar, j14, j13, j14, z12, 2);
                    throw th;
                }
            }
            j16 = j12;
            this.f389649y = a(bVar, j16, j13, j16, z12, 2);
        } catch (Throwable th3) {
            th = th3;
            j14 = j12;
        }
    }

    private long a(jd0.b bVar, long j12, boolean z12, boolean z13) {
        long jSeekToUs;
        ed0 ed0Var;
        r();
        this.f389612D = false;
        if (z13 || this.f389649y.f383645e == 3) {
            b(2);
        }
        ed0 ed0VarE = this.f389644t.e();
        ed0 ed0VarB = ed0VarE;
        while (ed0VarB != null && !bVar.equals(ed0VarB.f384900f.f385717a)) {
            ed0VarB = ed0VarB.b();
        }
        if (z12 || ed0VarE != ed0VarB || (ed0VarB != null && ed0VarB.d(j12) < 0)) {
            for (ux0 ux0Var : this.f389626b) {
                a(ux0Var);
            }
            if (ed0VarB != null) {
                while (this.f389644t.e() != ed0VarB) {
                    this.f389644t.a();
                }
                this.f389644t.a(ed0VarB);
                ed0VarB.h();
                a(new boolean[this.f389626b.length]);
            }
        }
        if (ed0VarB != null) {
            this.f389644t.a(ed0VarB);
            if (!ed0VarB.f384898d) {
                gd0 gd0Var = ed0VarB.f384900f;
                if (j12 == gd0Var.f385718b) {
                    ed0Var = ed0VarB;
                } else {
                    ed0Var = ed0VarB;
                    gd0Var = new gd0(gd0Var.f385717a, j12, gd0Var.f385719c, gd0Var.f385720d, gd0Var.f385721e, gd0Var.f385722f, gd0Var.f385723g, gd0Var.f385724h, gd0Var.f385725i);
                }
                ed0Var.f384900f = gd0Var;
            } else {
                ed0 ed0Var2 = ed0VarB;
                if (ed0Var2.f384899e) {
                    jSeekToUs = ed0Var2.f384895a.seekToUs(j12);
                    ed0Var2.f384895a.discardBuffer(jSeekToUs - this.f389638n, this.f389639o);
                }
                a(jSeekToUs);
                f();
            }
            jSeekToUs = j12;
            a(jSeekToUs);
            f();
        } else {
            this.f389644t.c();
            a(j12);
            jSeekToUs = j12;
        }
        a(false);
        this.f389633i.a(2);
        return jSeekToUs;
    }

    private void a(long j12) {
        ed0 ed0VarE = this.f389644t.e();
        long jD2 = ed0VarE == null ? j12 + 1000000000000L : ed0VarE.d(j12);
        this.f389621M = jD2;
        this.f389640p.a(jD2);
        for (ux0 ux0Var : this.f389626b) {
            if (b(ux0Var)) {
                ux0Var.a(this.f389621M);
            }
        }
        for (ed0 ed0VarE2 = this.f389644t.e(); ed0VarE2 != null; ed0VarE2 = ed0VarE2.b()) {
            for (cu cuVar : ed0VarE2.f().f384553c) {
                if (cuVar != null) {
                    cuVar.f();
                }
            }
        }
    }

    private void a(boolean z12, @j.P AtomicBoolean atomicBoolean) {
        if (this.f389616H != z12) {
            this.f389616H = z12;
            if (!z12) {
                for (ux0 ux0Var : this.f389626b) {
                    if (!b(ux0Var) && this.f389627c.remove(ux0Var)) {
                        ux0Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void a(boolean z12, boolean z13) {
        a(z12 || !this.f389616H, false, true, false);
        this.f389650z.a(z13 ? 1 : 0);
        this.f389631g.d();
        b(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3 A[PHI: r4 r5 r7
  0x00b3: PHI (r4v3 com.yandex.mobile.ads.impl.jd0$b) = (r4v2 com.yandex.mobile.ads.impl.jd0$b), (r4v9 com.yandex.mobile.ads.impl.jd0$b) binds: [B:32:0x0086, B:34:0x00ab] A[DONT_GENERATE, DONT_INLINE]
  0x00b3: PHI (r5v2 long) = (r5v1 long), (r5v5 long) binds: [B:32:0x0086, B:34:0x00ab] A[DONT_GENERATE, DONT_INLINE]
  0x00b3: PHI (r7v3 long) = (r7v2 long), (r7v5 long) binds: [B:32:0x0086, B:34:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rt.a(boolean, boolean, boolean, boolean):void");
    }

    private void b(ct0 ct0Var) {
        this.f389640p.a(ct0Var);
        ct0 playbackParameters = this.f389640p.getPlaybackParameters();
        a(playbackParameters, playbackParameters.f384453a, true, true);
    }

    private void b(dd0 dd0Var) {
        if (this.f389644t.a(dd0Var)) {
            this.f389644t.a(this.f389621M);
            f();
        }
    }

    private static boolean b(ux0 ux0Var) {
        return ux0Var.c() != 0;
    }

    private Pair<jd0.b, Long> a(i91 i91Var) {
        long jB2 = 0;
        if (i91Var.c()) {
            return Pair.create(at0.a(), 0L);
        }
        Pair<Object, Long> pairA = i91Var.a(this.f389636l, this.f389637m, i91Var.a(this.f389615G), -9223372036854775807L);
        jd0.b bVarA = this.f389644t.a(i91Var, pairA.first, 0L);
        long jLongValue = ((Long) pairA.second).longValue();
        if (bVarA.a()) {
            i91Var.a(bVarA.f385280a, this.f389637m);
            if (bVarA.f385282c == this.f389637m.d(bVarA.f385281b)) {
                jB2 = this.f389637m.b();
            }
        } else {
            jB2 = jLongValue;
        }
        return Pair.create(bVarA, Long.valueOf(jB2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(kt0 kt0Var) {
        try {
            synchronized (kt0Var) {
            }
            try {
                kt0Var.c().a(kt0Var.d(), kt0Var.b());
            } finally {
                kt0Var.a(true);
            }
        } catch (lt e12) {
            ka0.a("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e12);
            throw new RuntimeException(e12);
        }
    }

    private void a(i91 i91Var, i91 i91Var2) {
        if (i91Var.c() && i91Var2.c()) {
            return;
        }
        int size = this.f389641q.size() - 1;
        if (size < 0) {
            Collections.sort(this.f389641q);
        } else {
            this.f389641q.get(size).getClass();
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023d A[PHI: r4
  0x023d: PHI (r4v10 long) = (r4v9 long), (r4v11 long), (r4v12 long) binds: [B:103:0x0233, B:110:0x024f, B:106:0x023b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0229  */
    /* JADX WARN: Type inference failed for: r18v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v18, types: [com.yandex.mobile.ads.impl.jd0$b] */
    /* JADX WARN: Type inference failed for: r22v12 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v14 */
    /* JADX WARN: Type inference failed for: r22v15 */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v20 */
    /* JADX WARN: Type inference failed for: r22v22 */
    /* JADX WARN: Type inference failed for: r22v24 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v31 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.yandex.mobile.ads.impl.i91 r38, boolean r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1131
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rt.a(com.yandex.mobile.ads.impl.i91, boolean):void");
    }

    private void a(i91 i91Var, jd0.b bVar, i91 i91Var2, jd0.b bVar2, long j12) {
        if (!a(i91Var, bVar)) {
            ct0 ct0Var = bVar.a() ? ct0.f384452d : this.f389649y.f383654n;
            if (this.f389640p.getPlaybackParameters().equals(ct0Var)) {
                return;
            }
            this.f389640p.a(ct0Var);
            return;
        }
        i91Var.a(i91Var.a(bVar.f385280a, this.f389637m).f386391c, this.f389636l, 0L);
        n90 n90Var = this.f389646v;
        xc0.e eVar = this.f389636l.f386414k;
        int i12 = pc1.f388768a;
        ((yo) n90Var).a(eVar);
        if (j12 != -9223372036854775807L) {
            ((yo) this.f389646v).a(a(i91Var, bVar.f385280a, j12));
            return;
        }
        if (pc1.a(!i91Var2.c() ? i91Var2.a(i91Var2.a(bVar2.f385280a, this.f389637m).f386391c, this.f389636l, 0L).f386404a : null, this.f389636l.f386404a)) {
            return;
        }
        ((yo) this.f389646v).a(-9223372036854775807L);
    }

    private void a(ct0 ct0Var, float f12, boolean z12, boolean z13) {
        int i12;
        rt rtVar = this;
        if (z12) {
            if (z13) {
                rtVar.f389650z.a(1);
            }
            at0 at0Var = rtVar.f389649y;
            rtVar = this;
            rtVar.f389649y = new at0(at0Var.f383641a, at0Var.f383642b, at0Var.f383643c, at0Var.f383644d, at0Var.f383645e, at0Var.f383646f, at0Var.f383647g, at0Var.f383648h, at0Var.f383649i, at0Var.f383650j, at0Var.f383651k, at0Var.f383652l, at0Var.f383653m, ct0Var, at0Var.f383656p, at0Var.f383657q, at0Var.f383658r, at0Var.f383655o);
        }
        float f13 = ct0Var.f384453a;
        ed0 ed0VarE = rtVar.f389644t.e();
        while (true) {
            i12 = 0;
            if (ed0VarE == null) {
                break;
            }
            cu[] cuVarArr = ed0VarE.f().f384553c;
            int length = cuVarArr.length;
            while (i12 < length) {
                cu cuVar = cuVarArr[i12];
                if (cuVar != null) {
                    cuVar.a(f13);
                }
                i12++;
            }
            ed0VarE = ed0VarE.b();
        }
        ux0[] ux0VarArr = rtVar.f389626b;
        int length2 = ux0VarArr.length;
        while (i12 < length2) {
            ux0 ux0Var = ux0VarArr[i12];
            if (ux0Var != null) {
                ux0Var.a(f12, ct0Var.f384453a);
            }
            i12++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    @j.InterfaceC42154j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.yandex.mobile.ads.impl.at0 a(com.yandex.mobile.ads.impl.jd0.b r25, long r26, long r28, long r30, boolean r32, int r33) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.rt.a(com.yandex.mobile.ads.impl.jd0$b, long, long, long, boolean, int):com.yandex.mobile.ads.impl.at0");
    }

    private void a(boolean[] zArr) {
        ed0 ed0VarF = this.f389644t.f();
        da1 da1VarF = ed0VarF.f();
        for (int i12 = 0; i12 < this.f389626b.length; i12++) {
            if (!da1VarF.a(i12) && this.f389627c.remove(this.f389626b[i12])) {
                this.f389626b[i12].reset();
            }
        }
        for (int i13 = 0; i13 < this.f389626b.length; i13++) {
            if (da1VarF.a(i13)) {
                boolean z12 = zArr[i13];
                ux0 ux0Var = this.f389626b[i13];
                if (!b(ux0Var)) {
                    ed0 ed0VarF2 = this.f389644t.f();
                    boolean z13 = ed0VarF2 == this.f389644t.e();
                    da1 da1VarF2 = ed0VarF2.f();
                    wx0 wx0Var = da1VarF2.f384552b[i13];
                    cu cuVar = da1VarF2.f384553c[i13];
                    int length = cuVar != null ? cuVar.length() : 0;
                    vw[] vwVarArr = new vw[length];
                    for (int i14 = 0; i14 < length; i14++) {
                        vwVarArr[i14] = cuVar.a(i14);
                    }
                    boolean z14 = p() && this.f389649y.f383645e == 3;
                    boolean z15 = !z12 && z14;
                    this.f389619K++;
                    this.f389627c.add(ux0Var);
                    ux0Var.a(wx0Var, vwVarArr, ed0VarF2.f384897c[i13], this.f389621M, z15, z13, ed0VarF2.d(), ed0VarF2.c());
                    ux0Var.a(11, new qt(this));
                    this.f389640p.b(ux0Var);
                    if (z14) {
                        ux0Var.start();
                    }
                }
            }
        }
        ed0VarF.f384901g = true;
    }

    private void a(boolean z12) {
        long j12;
        ed0 ed0VarD = this.f389644t.d();
        jd0.b bVar = ed0VarD == null ? this.f389649y.f383642b : ed0VarD.f384900f.f385717a;
        boolean zEquals = this.f389649y.f383651k.equals(bVar);
        if (!zEquals) {
            this.f389649y = this.f389649y.a(bVar);
        }
        at0 at0Var = this.f389649y;
        if (ed0VarD == null) {
            j12 = at0Var.f383658r;
        } else if (!ed0VarD.f384898d) {
            j12 = ed0VarD.f384900f.f385718b;
        } else {
            long bufferedPositionUs = ed0VarD.f384899e ? ed0VarD.f384895a.getBufferedPositionUs() : Long.MIN_VALUE;
            j12 = bufferedPositionUs == Long.MIN_VALUE ? ed0VarD.f384900f.f385721e : bufferedPositionUs;
        }
        at0Var.f383656p = j12;
        at0 at0Var2 = this.f389649y;
        long j13 = at0Var2.f383656p;
        ed0 ed0VarD2 = this.f389644t.d();
        at0Var2.f383657q = ed0VarD2 != null ? Math.max(0L, j13 - ed0VarD2.c(this.f389621M)) : 0L;
        if ((!zEquals || z12) && ed0VarD != null && ed0VarD.f384898d) {
            this.f389631g.a(this.f389626b, ed0VarD.f().f384553c);
        }
    }

    @j.P
    private static Pair a(i91 i91Var, g gVar, int i12, boolean z12, i91.d dVar, i91.b bVar) {
        Pair<Object, Long> pairA;
        i91 i91Var2 = gVar.f389668a;
        if (i91Var.c()) {
            return null;
        }
        if (i91Var2.c()) {
            i91Var2 = i91Var;
        }
        try {
            pairA = i91Var2.a(dVar, bVar, gVar.f389669b, gVar.f389670c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (i91Var.equals(i91Var2)) {
            return pairA;
        }
        if (i91Var.a(pairA.first) != -1) {
            return (i91Var2.a(pairA.first, bVar).f386394f && i91Var2.a(bVar.f386391c, dVar, 0L).f386418o == i91Var2.a(pairA.first)) ? i91Var.a(dVar, bVar, i91Var.a(pairA.first, bVar).f386391c, gVar.f389670c) : pairA;
        }
        Object objA = a(dVar, bVar, i12, z12, pairA.first, i91Var2, i91Var);
        if (objA != null) {
            return i91Var.a(dVar, bVar, i91Var.a(objA, bVar).f386391c, -9223372036854775807L);
        }
        return null;
    }

    @j.P
    public static Object a(i91.d dVar, i91.b bVar, int i12, boolean z12, Object obj, i91 i91Var, i91 i91Var2) {
        int iA2 = i91Var.a(obj);
        int iA3 = i91Var.a();
        int iA4 = iA2;
        int iA5 = -1;
        for (int i13 = 0; i13 < iA3 && iA5 == -1; i13++) {
            iA4 = i91Var.a(iA4, bVar, dVar, i12, z12);
            if (iA4 == -1) {
                break;
            }
            iA5 = i91Var2.a(i91Var.a(iA4));
        }
        if (iA5 == -1) {
            return null;
        }
        return i91Var2.a(iA5);
    }

    private void a(ux0 ux0Var) {
        if (ux0Var.c() != 0) {
            this.f389640p.a(ux0Var);
            if (ux0Var.c() == 2) {
                ux0Var.stop();
            }
            ux0Var.b();
            this.f389619K--;
        }
    }
}
