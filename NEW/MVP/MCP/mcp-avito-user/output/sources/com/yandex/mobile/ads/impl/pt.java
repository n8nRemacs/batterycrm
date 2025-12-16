package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.adjust.sdk.network.ErrorCodes;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.ad0;
import com.yandex.mobile.ads.impl.g71;
import com.yandex.mobile.ads.impl.gt0;
import com.yandex.mobile.ads.impl.i61;
import com.yandex.mobile.ads.impl.i91;
import com.yandex.mobile.ads.impl.jd0;
import com.yandex.mobile.ads.impl.kc;
import com.yandex.mobile.ads.impl.kt0;
import com.yandex.mobile.ads.impl.m90;
import com.yandex.mobile.ads.impl.md0;
import com.yandex.mobile.ads.impl.mt;
import com.yandex.mobile.ads.impl.nc;
import com.yandex.mobile.ads.impl.rt;
import com.yandex.mobile.ads.impl.s31;
import j.InterfaceC42164u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes8.dex */
final class pt extends ef implements mt {

    /* renamed from: A, reason: collision with root package name */
    private int f388942A;

    /* renamed from: B, reason: collision with root package name */
    private int f388943B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f388944C;

    /* renamed from: D, reason: collision with root package name */
    private int f388945D;

    /* renamed from: E, reason: collision with root package name */
    private y21 f388946E;

    /* renamed from: F, reason: collision with root package name */
    private s31 f388947F;

    /* renamed from: G, reason: collision with root package name */
    private gt0.a f388948G;

    /* renamed from: H, reason: collision with root package name */
    private ad0 f388949H;

    /* renamed from: I, reason: collision with root package name */
    @j.P
    private AudioTrack f388950I;

    /* renamed from: J, reason: collision with root package name */
    @j.P
    private Object f388951J;

    /* renamed from: K, reason: collision with root package name */
    @j.P
    private Surface f388952K;

    /* renamed from: L, reason: collision with root package name */
    @j.P
    private TextureView f388953L;

    /* renamed from: M, reason: collision with root package name */
    private int f388954M;

    /* renamed from: N, reason: collision with root package name */
    private int f388955N;

    /* renamed from: O, reason: collision with root package name */
    private int f388956O;

    /* renamed from: P, reason: collision with root package name */
    private int f388957P;

    /* renamed from: Q, reason: collision with root package name */
    private jc f388958Q;

    /* renamed from: R, reason: collision with root package name */
    private float f388959R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f388960S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f388961T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f388962U;

    /* renamed from: V, reason: collision with root package name */
    private zp f388963V;

    /* renamed from: W, reason: collision with root package name */
    private ad0 f388964W;

    /* renamed from: X, reason: collision with root package name */
    private at0 f388965X;

    /* renamed from: Y, reason: collision with root package name */
    private int f388966Y;

    /* renamed from: Z, reason: collision with root package name */
    private long f388967Z;

    /* renamed from: b, reason: collision with root package name */
    final da1 f388968b;

    /* renamed from: c, reason: collision with root package name */
    final gt0.a f388969c;

    /* renamed from: d, reason: collision with root package name */
    private final bl f388970d;

    /* renamed from: e, reason: collision with root package name */
    private final gt0 f388971e;

    /* renamed from: f, reason: collision with root package name */
    private final ux0[] f388972f;

    /* renamed from: g, reason: collision with root package name */
    private final ca1 f388973g;

    /* renamed from: h, reason: collision with root package name */
    private final bz f388974h;

    /* renamed from: i, reason: collision with root package name */
    private final rt f388975i;

    /* renamed from: j, reason: collision with root package name */
    private final m90<gt0.b> f388976j;

    /* renamed from: k, reason: collision with root package name */
    private final CopyOnWriteArraySet<mt.a> f388977k;

    /* renamed from: l, reason: collision with root package name */
    private final i91.b f388978l;

    /* renamed from: m, reason: collision with root package name */
    private final ArrayList f388979m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f388980n;

    /* renamed from: o, reason: collision with root package name */
    private final jd0.a f388981o;

    /* renamed from: p, reason: collision with root package name */
    private final j9 f388982p;

    /* renamed from: q, reason: collision with root package name */
    private final Looper f388983q;

    /* renamed from: r, reason: collision with root package name */
    private final pd f388984r;

    /* renamed from: s, reason: collision with root package name */
    private final c81 f388985s;

    /* renamed from: t, reason: collision with root package name */
    private final b f388986t;

    /* renamed from: u, reason: collision with root package name */
    private final kc f388987u;

    /* renamed from: v, reason: collision with root package name */
    private final nc f388988v;

    /* renamed from: w, reason: collision with root package name */
    private final g71 f388989w;

    /* renamed from: x, reason: collision with root package name */
    private final bl1 f388990x;

    /* renamed from: y, reason: collision with root package name */
    private final xl1 f388991y;

    /* renamed from: z, reason: collision with root package name */
    private final long f388992z;

    @j.X
    public static final class a {
        @InterfaceC42164u
        public static jt0 a(Context context, pt ptVar, boolean z12) {
            bd0 bd0VarA = bd0.a(context);
            if (bd0VarA == null) {
                ka0.d("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new jt0(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z12) {
                ptVar.a(bd0VarA);
            }
            return new jt0(bd0VarA.b());
        }
    }

    public final class b implements fi1, pc, v81, ig0, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, i61.b, nc.b, kc.b, g71.a, mt.a {
        private b() {
        }

        @Override // com.yandex.mobile.ads.impl.fi1
        public final void a(String str, long j12, long j13) {
            pt.this.f388982p.a(str, j12, j13);
        }

        @Override // com.yandex.mobile.ads.impl.v81
        public final void onCues(List<vm> list) {
            m90 m90Var = pt.this.f388976j;
            m90Var.a(27, new G0(list, 7));
            m90Var.a();
        }

        @Override // com.yandex.mobile.ads.impl.pc
        public final void onSkipSilenceEnabledChanged(final boolean z12) {
            if (pt.this.f388960S == z12) {
                return;
            }
            pt.this.f388960S = z12;
            m90 m90Var = pt.this.f388976j;
            m90Var.a(23, new m90.a() { // from class: com.yandex.mobile.ads.impl.S1
                @Override // com.yandex.mobile.ads.impl.m90.a
                public final void invoke(Object obj) {
                    ((gt0.b) obj).onSkipSilenceEnabledChanged(z12);
                }
            });
            m90Var.a();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i12, int i13) {
            pt.a(pt.this, surfaceTexture);
            pt.this.a(i12, i13);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            pt.this.a((Surface) null);
            pt.this.a(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i12, int i13) {
            pt.this.a(i12, i13);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i12, int i13, int i14) {
            pt.this.a(i13, i14);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            pt.this.getClass();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            pt.this.getClass();
            pt.this.a(0, 0);
        }

        public /* synthetic */ b(pt ptVar, int i12) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.fi1
        public final void a(ji1 ji1Var) {
            pt.this.getClass();
            m90 m90Var = pt.this.f388976j;
            m90Var.a(25, new G0(ji1Var, 6));
            m90Var.a();
        }

        @Override // com.yandex.mobile.ads.impl.fi1
        public final void b(vw vwVar, @j.P xn xnVar) {
            pt.this.getClass();
            pt.this.f388982p.b(vwVar, xnVar);
        }

        @Override // com.yandex.mobile.ads.impl.fi1
        public final void c(tn tnVar) {
            pt.this.f388982p.c(tnVar);
            pt.this.getClass();
            pt.this.getClass();
        }

        @Override // com.yandex.mobile.ads.impl.fi1
        public final void d(tn tnVar) {
            pt.this.getClass();
            pt.this.f388982p.d(tnVar);
        }

        @Override // com.yandex.mobile.ads.impl.fi1
        public final void b(int i12, long j12) {
            pt.this.f388982p.b(i12, j12);
        }

        @Override // com.yandex.mobile.ads.impl.pc
        public final void b(tn tnVar) {
            pt.this.getClass();
            pt.this.f388982p.b(tnVar);
        }

        @Override // com.yandex.mobile.ads.impl.fi1
        public final void c(Exception exc) {
            pt.this.f388982p.c(exc);
        }

        @Override // com.yandex.mobile.ads.impl.fi1
        public final void a(Object obj, long j12) {
            pt.this.f388982p.a(obj, j12);
            if (pt.this.f388951J == obj) {
                m90 m90Var = pt.this.f388976j;
                m90Var.a(26, new Q0(3));
                m90Var.a();
            }
        }

        public final void c() {
            zp zpVarB = pt.b(pt.this.f388989w);
            if (zpVarB.equals(pt.this.f388963V)) {
                return;
            }
            pt.this.f388963V = zpVarB;
            m90 m90Var = pt.this.f388976j;
            m90Var.a(29, new G0(zpVarB, 8));
            m90Var.a();
        }

        @Override // com.yandex.mobile.ads.impl.pc
        public final void b(String str, long j12, long j13) {
            pt.this.f388982p.b(str, j12, j13);
        }

        @Override // com.yandex.mobile.ads.impl.pc
        public final void b(String str) {
            pt.this.f388982p.b(str);
        }

        @Override // com.yandex.mobile.ads.impl.pc
        public final void b(Exception exc) {
            pt.this.f388982p.b(exc);
        }

        @Override // com.yandex.mobile.ads.impl.i61.b
        public final void b() {
            pt.this.a((Surface) null);
        }

        @Override // com.yandex.mobile.ads.impl.fi1
        public final void a(String str) {
            pt.this.f388982p.a(str);
        }

        @Override // com.yandex.mobile.ads.impl.fi1
        public final void a(int i12, long j12) {
            pt.this.f388982p.a(i12, j12);
        }

        @Override // com.yandex.mobile.ads.impl.pc
        public final void a(vw vwVar, @j.P xn xnVar) {
            pt.this.getClass();
            pt.this.f388982p.a(vwVar, xnVar);
        }

        @Override // com.yandex.mobile.ads.impl.pc
        public final void a(long j12) {
            pt.this.f388982p.a(j12);
        }

        @Override // com.yandex.mobile.ads.impl.pc
        public final void a(int i12, long j12, long j13) {
            pt.this.f388982p.a(i12, j12, j13);
        }

        @Override // com.yandex.mobile.ads.impl.pc
        public final void a(tn tnVar) {
            pt.this.f388982p.a(tnVar);
            pt.this.getClass();
            pt.this.getClass();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // com.yandex.mobile.ads.impl.pc
        public final void a(Exception exc) {
            pt.this.f388982p.a(exc);
        }

        @Override // com.yandex.mobile.ads.impl.v81
        public final void a(xm xmVar) {
            pt.this.getClass();
            m90 m90Var = pt.this.f388976j;
            m90Var.a(27, new G0(xmVar, 3));
            m90Var.a();
        }

        @Override // com.yandex.mobile.ads.impl.ig0
        public final void a(Metadata metadata) {
            pt ptVar = pt.this;
            ad0 ad0Var = ptVar.f388964W;
            ad0Var.getClass();
            int i12 = 0;
            ad0.a aVar = new ad0.a(ad0Var, i12);
            for (int i13 = 0; i13 < metadata.c(); i13++) {
                metadata.a(i13).a(aVar);
            }
            ptVar.f388964W = new ad0(aVar, i12);
            ad0 ad0VarC = pt.c(pt.this);
            if (!ad0VarC.equals(pt.this.f388949H)) {
                pt.this.f388949H = ad0VarC;
                pt.this.f388976j.a(14, new G0(this, 4));
            }
            pt.this.f388976j.a(28, new G0(metadata, 5));
            pt.this.f388976j.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(gt0.b bVar) {
            bVar.a(pt.this.f388949H);
        }

        @Override // com.yandex.mobile.ads.impl.i61.b
        public final void a(Surface surface) {
            pt.this.a(surface);
        }

        public final void a(final boolean z12, final int i12) {
            m90 m90Var = pt.this.f388976j;
            m90Var.a(30, new m90.a() { // from class: com.yandex.mobile.ads.impl.R1
                @Override // com.yandex.mobile.ads.impl.m90.a
                public final void invoke(Object obj) {
                    ((gt0.b) obj).a(z12, i12);
                }
            });
            m90Var.a();
        }

        @Override // com.yandex.mobile.ads.impl.mt.a
        public final void a() {
            pt.h(pt.this);
        }
    }

    public static final class c implements kh1, ci, kt0.b {

        /* renamed from: b, reason: collision with root package name */
        @j.P
        private kh1 f388994b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        private ci f388995c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        private kh1 f388996d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        private ci f388997e;

        private c() {
        }

        @Override // com.yandex.mobile.ads.impl.kt0.b
        public final void a(int i12, @j.P Object obj) {
            if (i12 == 7) {
                this.f388994b = (kh1) obj;
                return;
            }
            if (i12 == 8) {
                this.f388995c = (ci) obj;
                return;
            }
            if (i12 != 10000) {
                return;
            }
            i61 i61Var = (i61) obj;
            if (i61Var == null) {
                this.f388996d = null;
                this.f388997e = null;
            } else {
                this.f388996d = i61Var.b();
                this.f388997e = i61Var.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.ci
        public final void f() {
            ci ciVar = this.f388997e;
            if (ciVar != null) {
                ciVar.f();
            }
            ci ciVar2 = this.f388995c;
            if (ciVar2 != null) {
                ciVar2.f();
            }
        }

        public /* synthetic */ c(int i12) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.kh1
        public final void a(long j12, long j13, vw vwVar, @j.P MediaFormat mediaFormat) {
            kh1 kh1Var = this.f388996d;
            if (kh1Var != null) {
                kh1Var.a(j12, j13, vwVar, mediaFormat);
            }
            kh1 kh1Var2 = this.f388994b;
            if (kh1Var2 != null) {
                kh1Var2.a(j12, j13, vwVar, mediaFormat);
            }
        }

        @Override // com.yandex.mobile.ads.impl.ci
        public final void a(long j12, float[] fArr) {
            ci ciVar = this.f388997e;
            if (ciVar != null) {
                ciVar.a(j12, fArr);
            }
            ci ciVar2 = this.f388995c;
            if (ciVar2 != null) {
                ciVar2.a(j12, fArr);
            }
        }
    }

    public static final class d implements ld0 {

        /* renamed from: a, reason: collision with root package name */
        private final Object f388998a;

        /* renamed from: b, reason: collision with root package name */
        private i91 f388999b;

        public d(i91 i91Var, Object obj) {
            this.f388998a = obj;
            this.f388999b = i91Var;
        }

        @Override // com.yandex.mobile.ads.impl.ld0
        public final i91 b() {
            return this.f388999b;
        }

        @Override // com.yandex.mobile.ads.impl.ld0
        public final Object a() {
            return this.f388998a;
        }
    }

    static {
        st.a("goog.exo.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public pt(mt.b bVar) {
        bl blVar = new bl();
        this.f388970d = blVar;
        try {
            ka0.c("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.1] [" + pc1.f388772e + "]");
            Context applicationContext = bVar.f388065a.getApplicationContext();
            j9 j9VarApply = bVar.f388072h.apply(bVar.f388066b);
            this.f388982p = j9VarApply;
            this.f388958Q = bVar.f388074j;
            this.f388954M = bVar.f388075k;
            int i12 = 0;
            this.f388960S = false;
            this.f388992z = bVar.f388080p;
            b bVar2 = new b(this, i12);
            this.f388986t = bVar2;
            Object cVar = new c(i12);
            Handler handler = new Handler(bVar.f388073i);
            ux0[] ux0VarArrA = bVar.f388067c.get().a(handler, bVar2, bVar2, bVar2, bVar2);
            this.f388972f = ux0VarArrA;
            db.b(ux0VarArrA.length > 0);
            ca1 ca1Var = bVar.f388069e.get();
            this.f388973g = ca1Var;
            this.f388981o = bVar.f388068d.get();
            pd pdVar = bVar.f388071g.get();
            this.f388984r = pdVar;
            this.f388980n = bVar.f388076l;
            this.f388946E = bVar.f388077m;
            Looper looper = bVar.f388073i;
            this.f388983q = looper;
            c81 c81Var = bVar.f388066b;
            this.f388985s = c81Var;
            this.f388971e = this;
            this.f388976j = new m90<>(looper, c81Var, new O1(this));
            this.f388977k = new CopyOnWriteArraySet<>();
            this.f388979m = new ArrayList();
            this.f388947F = new s31.a();
            da1 da1Var = new da1(new wx0[ux0VarArrA.length], new cu[ux0VarArrA.length], sa1.f389846b, null);
            this.f388968b = da1Var;
            this.f388978l = new i91.b();
            gt0.a aVarA = new gt0.a.C10978a().a(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).a(ca1Var.c(), 29).a();
            this.f388969c = aVarA;
            this.f388948G = new gt0.a.C10978a().a(aVarA).a(4).a(10).a();
            this.f388974h = c81Var.a(looper, null);
            O1 o12 = new O1(this);
            this.f388965X = at0.a(da1Var);
            j9VarApply.a(this, looper);
            int i13 = pc1.f388768a;
            this.f388975i = new rt(ux0VarArrA, ca1Var, da1Var, bVar.f388070f.get(), pdVar, 0, j9VarApply, this.f388946E, bVar.f388078n, bVar.f388079o, false, looper, c81Var, o12, i13 < 31 ? new jt0() : a.a(applicationContext, this, bVar.f388081q));
            this.f388959R = 1.0f;
            ad0 ad0Var = ad0.f383464G;
            this.f388949H = ad0Var;
            this.f388964W = ad0Var;
            this.f388966Y = -1;
            if (i13 < 21) {
                this.f388957P = f();
            } else {
                this.f388957P = pc1.a(applicationContext);
            }
            int i14 = xm.f391770a;
            this.f388961T = true;
            b(j9VarApply);
            pdVar.a(new Handler(looper), j9VarApply);
            a(bVar2);
            kc kcVar = new kc(bVar.f388065a, handler, bVar2);
            this.f388987u = kcVar;
            kcVar.a();
            nc ncVar = new nc(bVar.f388065a, handler, bVar2);
            this.f388988v = ncVar;
            ncVar.d();
            g71 g71Var = new g71(bVar.f388065a, handler, bVar2);
            this.f388989w = g71Var;
            g71Var.a(pc1.c(this.f388958Q.f386814c));
            bl1 bl1Var = new bl1(bVar.f388065a);
            this.f388990x = bl1Var;
            bl1Var.a();
            xl1 xl1Var = new xl1(bVar.f388065a);
            this.f388991y = xl1Var;
            xl1Var.a();
            this.f388963V = b(g71Var);
            ca1Var.a(this.f388958Q);
            a(1, 10, Integer.valueOf(this.f388957P));
            a(2, 10, Integer.valueOf(this.f388957P));
            a(1, 3, this.f388958Q);
            a(2, 4, Integer.valueOf(this.f388954M));
            a(2, 5, (Object) 0);
            a(1, 9, Boolean.valueOf(this.f388960S));
            a(2, 7, cVar);
            a(6, 8, cVar);
            blVar.e();
        } catch (Throwable th2) {
            this.f388970d.e();
            throw th2;
        }
    }

    public static int a(boolean z12, int i12) {
        return (!z12 || i12 == 1) ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(gt0.b bVar) {
        bVar.b(lt.a(new bu(1), ErrorCodes.MALFORMED_URL_EXCEPTION));
    }

    private void h() {
        gt0.a aVar = this.f388948G;
        gt0 gt0Var = this.f388971e;
        gt0.a aVar2 = this.f388969c;
        int i12 = pc1.f388768a;
        boolean zIsPlayingAd = gt0Var.isPlayingAd();
        boolean zIsCurrentMediaItemSeekable = gt0Var.isCurrentMediaItemSeekable();
        boolean zHasPreviousMediaItem = gt0Var.hasPreviousMediaItem();
        boolean zHasNextMediaItem = gt0Var.hasNextMediaItem();
        boolean zIsCurrentMediaItemLive = gt0Var.isCurrentMediaItemLive();
        boolean zIsCurrentMediaItemDynamic = gt0Var.isCurrentMediaItemDynamic();
        boolean zC2 = gt0Var.getCurrentTimeline().c();
        boolean z12 = !zIsPlayingAd;
        gt0.a aVarA = new gt0.a.C10978a().a(aVar2).a(z12, 4).a(zIsCurrentMediaItemSeekable && !zIsPlayingAd, 5).a(zHasPreviousMediaItem && !zIsPlayingAd, 6).a(!zC2 && (zHasPreviousMediaItem || !zIsCurrentMediaItemLive || zIsCurrentMediaItemSeekable) && !zIsPlayingAd, 7).a(zHasNextMediaItem && !zIsPlayingAd, 8).a(!zC2 && (zHasNextMediaItem || (zIsCurrentMediaItemLive && zIsCurrentMediaItemDynamic)) && !zIsPlayingAd, 9).a(z12, 10).a(zIsCurrentMediaItemSeekable && !zIsPlayingAd, 11).a(zIsCurrentMediaItemSeekable && !zIsPlayingAd, 12).a();
        this.f388948G = aVarA;
        if (aVarA.equals(aVar)) {
            return;
        }
        this.f388976j.a(13, new O1(this));
    }

    public final void e() {
        i();
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final long getContentPosition() {
        i();
        if (!isPlayingAd()) {
            return getCurrentPosition();
        }
        at0 at0Var = this.f388965X;
        at0Var.f383641a.a(at0Var.f383642b.f385280a, this.f388978l);
        at0 at0Var2 = this.f388965X;
        return at0Var2.f383643c == -9223372036854775807L ? pc1.b(at0Var2.f383641a.a(getCurrentMediaItemIndex(), this.f384922a, 0L).f386416m) : pc1.b(this.f388978l.f386393e) + pc1.b(this.f388965X.f383643c);
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final int getCurrentAdGroupIndex() {
        i();
        if (isPlayingAd()) {
            return this.f388965X.f383642b.f385281b;
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final int getCurrentAdIndexInAdGroup() {
        i();
        if (isPlayingAd()) {
            return this.f388965X.f383642b.f385282c;
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final int getCurrentMediaItemIndex() {
        i();
        int iC2 = c();
        if (iC2 == -1) {
            return 0;
        }
        return iC2;
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final int getCurrentPeriodIndex() {
        i();
        if (this.f388965X.f383641a.c()) {
            return 0;
        }
        at0 at0Var = this.f388965X;
        return at0Var.f383641a.a(at0Var.f383642b.f385280a);
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final long getCurrentPosition() {
        long jA2;
        i();
        at0 at0Var = this.f388965X;
        if (at0Var.f383641a.c()) {
            jA2 = pc1.a(this.f388967Z);
        } else if (at0Var.f383642b.a()) {
            jA2 = at0Var.f383658r;
        } else {
            i91 i91Var = at0Var.f383641a;
            jd0.b bVar = at0Var.f383642b;
            long j12 = at0Var.f383658r;
            i91Var.a(bVar.f385280a, this.f388978l);
            jA2 = this.f388978l.f386393e + j12;
        }
        return pc1.b(jA2);
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final i91 getCurrentTimeline() {
        i();
        return this.f388965X.f383641a;
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final sa1 getCurrentTracks() {
        i();
        return this.f388965X.f383649i.f384554d;
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final long getDuration() {
        i();
        if (isPlayingAd()) {
            at0 at0Var = this.f388965X;
            jd0.b bVar = at0Var.f383642b;
            at0Var.f383641a.a(bVar.f385280a, this.f388978l);
            return pc1.b(this.f388978l.a(bVar.f385281b, bVar.f385282c));
        }
        i91 currentTimeline = getCurrentTimeline();
        if (currentTimeline.c()) {
            return -9223372036854775807L;
        }
        return pc1.b(currentTimeline.a(getCurrentMediaItemIndex(), this.f384922a, 0L).f386417n);
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final boolean getPlayWhenReady() {
        i();
        return this.f388965X.f383652l;
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final int getPlaybackState() {
        i();
        return this.f388965X.f383645e;
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final int getPlaybackSuppressionReason() {
        i();
        return this.f388965X.f383653m;
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final long getTotalBufferedDuration() {
        i();
        return pc1.b(this.f388965X.f383657q);
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final float getVolume() {
        i();
        return this.f388959R;
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final boolean isPlayingAd() {
        i();
        return this.f388965X.f383642b.a();
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final void prepare() {
        i();
        boolean playWhenReady = getPlayWhenReady();
        int iA2 = this.f388988v.a(playWhenReady, 2);
        a(iA2, (!playWhenReady || iA2 == 1) ? 1 : 2, playWhenReady);
        at0 at0Var = this.f388965X;
        if (at0Var.f383645e != 1) {
            return;
        }
        at0 at0VarA = at0Var.a((lt) null);
        at0 at0VarA2 = at0VarA.a(at0VarA.f383641a.c() ? 4 : 2);
        this.f388942A++;
        this.f388975i.i();
        a(at0VarA2, 1, 1, false, 5, -9223372036854775807L);
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final void release() {
        AudioTrack audioTrack;
        StringBuilder sbA = Cif.a("Release ");
        sbA.append(Integer.toHexString(System.identityHashCode(this)));
        sbA.append(" [");
        sbA.append("ExoPlayerLib/2.18.1");
        sbA.append("] [");
        sbA.append(pc1.f388772e);
        sbA.append("] [");
        sbA.append(st.a());
        sbA.append("]");
        ka0.c("ExoPlayerImpl", sbA.toString());
        i();
        if (pc1.f388768a < 21 && (audioTrack = this.f388950I) != null) {
            audioTrack.release();
            this.f388950I = null;
        }
        this.f388987u.a();
        this.f388989w.c();
        this.f388990x.a(false);
        this.f388991y.a(false);
        this.f388988v.c();
        if (!this.f388975i.k()) {
            m90<gt0.b> m90Var = this.f388976j;
            m90Var.a(10, new L0(3));
            m90Var.a();
        }
        this.f388976j.b();
        this.f388974h.a();
        this.f388984r.a(this.f388982p);
        at0 at0VarA = this.f388965X.a(1);
        this.f388965X = at0VarA;
        at0 at0VarA2 = at0VarA.a(at0VarA.f383642b);
        this.f388965X = at0VarA2;
        at0VarA2.f383656p = at0VarA2.f383658r;
        this.f388965X.f383657q = 0L;
        this.f388982p.release();
        this.f388973g.d();
        g();
        Surface surface = this.f388952K;
        if (surface != null) {
            surface.release();
            this.f388952K = null;
        }
        int i12 = xm.f391770a;
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final void setPlayWhenReady(boolean z12) {
        i();
        int iA2 = this.f388988v.a(z12, getPlaybackState());
        int i12 = 1;
        if (z12 && iA2 != 1) {
            i12 = 2;
        }
        a(iA2, i12, z12);
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final void setVideoTextureView(@j.P TextureView textureView) {
        i();
        if (textureView == null) {
            i();
            g();
            a((Surface) null);
            a(0, 0);
            return;
        }
        g();
        this.f388953L = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            ka0.d("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f388986t);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            a((Surface) null);
            a(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            a(surface);
            this.f388952K = surface;
            a(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final void setVolume(float f12) {
        i();
        int i12 = pc1.f388768a;
        final float fMax = Math.max(0.0f, Math.min(f12, 1.0f));
        if (this.f388959R == fMax) {
            return;
        }
        this.f388959R = fMax;
        a(1, 2, Float.valueOf(this.f388988v.b() * fMax));
        m90<gt0.b> m90Var = this.f388976j;
        m90Var.a(22, new m90.a() { // from class: com.yandex.mobile.ads.impl.L1
            @Override // com.yandex.mobile.ads.impl.m90.a
            public final void invoke(Object obj) {
                ((gt0.b) obj).onVolumeChanged(fMax);
            }
        });
        m90Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final void stop() {
        i();
        i();
        this.f388988v.a(getPlayWhenReady(), 1);
        a((lt) null);
        int i12 = xm.f391770a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(at0 at0Var, gt0.b bVar) {
        bVar.onPlayerStateChanged(at0Var.f383652l, at0Var.f383645e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(at0 at0Var, gt0.b bVar) {
        bVar.onPlaybackStateChanged(at0Var.f383645e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(at0 at0Var, gt0.b bVar) {
        bVar.onPlaybackSuppressionReasonChanged(at0Var.f383653m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(at0 at0Var, gt0.b bVar) {
        bVar.a(at0Var.f383654n);
    }

    public final void d() {
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(at0 at0Var, gt0.b bVar) {
        boolean z12 = at0Var.f383647g;
        bVar.b();
        bVar.onIsLoadingChanged(at0Var.f383647g);
    }

    public static void e(pt ptVar) {
        ptVar.a(1, 2, Float.valueOf(ptVar.f388959R * ptVar.f388988v.b()));
    }

    private int f() {
        AudioTrack audioTrack = this.f388950I;
        if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
            this.f388950I.release();
            this.f388950I = null;
        }
        if (this.f388950I == null) {
            this.f388950I = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
        }
        return this.f388950I.getAudioSessionId();
    }

    private void g() {
        TextureView textureView = this.f388953L;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f388986t) {
                ka0.d("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f388953L.setSurfaceTextureListener(null);
            }
            this.f388953L = null;
        }
    }

    private void i() {
        this.f388970d.b();
        if (Thread.currentThread() != this.f388983q.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f388983q.getThread().getName();
            int i12 = pc1.f388768a;
            Locale locale = Locale.US;
            String strA = androidx.camera.core.Q.a("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            if (!this.f388961T) {
                ka0.b("ExoPlayerImpl", strA, this.f388962U ? null : new IllegalStateException());
                this.f388962U = true;
                return;
            }
            throw new IllegalStateException(strA);
        }
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final void b(gt0.b bVar) {
        bVar.getClass();
        this.f388976j.a((m90<gt0.b>) bVar);
    }

    private int c() {
        if (this.f388965X.f383641a.c()) {
            return this.f388966Y;
        }
        at0 at0Var = this.f388965X;
        return at0Var.f383641a.a(at0Var.f383642b.f385280a, this.f388978l).f386391c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(rt.d dVar) {
        this.f388974h.a(new H(5, this, dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(gt0.b bVar) {
        bVar.a(this.f388948G);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(at0 at0Var, gt0.b bVar) {
        bVar.b(at0Var.f383646f);
    }

    public static void a(pt ptVar, SurfaceTexture surfaceTexture) {
        ptVar.getClass();
        Surface surface = new Surface(surfaceTexture);
        ptVar.a(surface);
        ptVar.f388952K = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(at0 at0Var, int i12, gt0.b bVar) {
        bVar.onPlayWhenReadyChanged(at0Var.f383652l, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(at0 at0Var, gt0.b bVar) {
        bVar.a(at0Var.f383649i.f384554d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zp b(g71 g71Var) {
        return new zp(0, g71Var.b(), g71Var.a());
    }

    public static ad0 c(pt ptVar) {
        i91 currentTimeline = ptVar.getCurrentTimeline();
        if (currentTimeline.c()) {
            return ptVar.f388964W;
        }
        xc0 xc0Var = currentTimeline.a(ptVar.getCurrentMediaItemIndex(), ptVar.f384922a, 0L).f386406c;
        ad0 ad0Var = ptVar.f388964W;
        ad0Var.getClass();
        int i12 = 0;
        return new ad0(new ad0.a(ad0Var, i12).a(xc0Var.f391608d), i12);
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    public final void a(gt0.b bVar) {
        bVar.getClass();
        this.f388976j.b(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(gt0.b bVar, nw nwVar) {
        bVar.a();
    }

    public final void a(mt.a aVar) {
        this.f388977k.add(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.gt0
    @j.P
    public final lt a() {
        i();
        return this.f388965X.f383646f;
    }

    @Override // com.yandex.mobile.ads.impl.mt
    public final void a(nv0 nv0Var) {
        long j12;
        long jA2;
        i();
        List listSingletonList = Collections.singletonList(nv0Var);
        i();
        i();
        c();
        getCurrentPosition();
        this.f388942A++;
        if (!this.f388979m.isEmpty()) {
            int size = this.f388979m.size();
            for (int i12 = size - 1; i12 >= 0; i12--) {
                this.f388979m.remove(i12);
            }
            this.f388947F = this.f388947F.c(size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < listSingletonList.size(); i13++) {
            md0.c cVar = new md0.c((jd0) listSingletonList.get(i13), this.f388980n);
            arrayList.add(cVar);
            this.f388979m.add(i13, new d(cVar.f387972a.f(), cVar.f387973b));
        }
        this.f388947F = this.f388947F.b(arrayList.size());
        yt0 yt0Var = new yt0(this.f388979m, this.f388947F);
        if (!yt0Var.c() && -1 >= yt0Var.b()) {
            throw new l20();
        }
        int iA2 = yt0Var.a(false);
        at0 at0VarA = a(this.f388965X, yt0Var, a(yt0Var, iA2, -9223372036854775807L));
        int i14 = at0VarA.f383645e;
        if (iA2 != -1 && i14 != 1) {
            i14 = (yt0Var.c() || iA2 >= yt0Var.b()) ? 4 : 2;
        }
        at0 at0VarA2 = at0VarA.a(i14);
        this.f388975i.a(iA2, pc1.a(-9223372036854775807L), this.f388947F, arrayList);
        boolean z12 = (this.f388965X.f383642b.f385280a.equals(at0VarA2.f383642b.f385280a) || this.f388965X.f383641a.c()) ? false : true;
        if (at0VarA2.f383641a.c()) {
            jA2 = pc1.a(this.f388967Z);
        } else if (at0VarA2.f383642b.a()) {
            jA2 = at0VarA2.f383658r;
        } else {
            i91 i91Var = at0VarA2.f383641a;
            jd0.b bVar = at0VarA2.f383642b;
            long j13 = at0VarA2.f383658r;
            i91Var.a(bVar.f385280a, this.f388978l);
            j12 = j13 + this.f388978l.f386393e;
            a(at0VarA2, 0, 1, z12, 4, j12);
        }
        j12 = jA2;
        a(at0VarA2, 0, 1, z12, 4, j12);
    }

    public static void h(pt ptVar) {
        int playbackState = ptVar.getPlaybackState();
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                ptVar.i();
                ptVar.f388990x.a(ptVar.getPlayWhenReady() && !ptVar.f388965X.f383655o);
                ptVar.f388991y.a(ptVar.getPlayWhenReady());
                return;
            }
            if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        ptVar.f388990x.a(false);
        ptVar.f388991y.a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(at0 at0Var, gt0.b bVar) {
        bVar.onIsPlayingChanged(at0Var.f383645e == 3 && at0Var.f383652l && at0Var.f383653m == 0);
    }

    public final void a(bd0 bd0Var) {
        this.f388982p.a(bd0Var);
    }

    private void a(@j.P lt ltVar) {
        long j12;
        long jA2;
        at0 at0Var = this.f388965X;
        at0 at0VarA = at0Var.a(at0Var.f383642b);
        at0VarA.f383656p = at0VarA.f383658r;
        at0VarA.f383657q = 0L;
        at0 at0VarA2 = at0VarA.a(1);
        if (ltVar != null) {
            at0VarA2 = at0VarA2.a(ltVar);
        }
        at0 at0Var2 = at0VarA2;
        this.f388942A++;
        this.f388975i.q();
        boolean z12 = at0Var2.f383641a.c() && !this.f388965X.f383641a.c();
        if (at0Var2.f383641a.c()) {
            jA2 = pc1.a(this.f388967Z);
        } else if (at0Var2.f383642b.a()) {
            jA2 = at0Var2.f383658r;
        } else {
            i91 i91Var = at0Var2.f383641a;
            jd0.b bVar = at0Var2.f383642b;
            long j13 = at0Var2.f383658r;
            i91Var.a(bVar.f385280a, this.f388978l);
            j12 = j13 + this.f388978l.f386393e;
            a(at0Var2, 0, 1, z12, 4, j12);
        }
        j12 = jA2;
        a(at0Var2, 0, 1, z12, 4, j12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(rt.d dVar) {
        boolean z12;
        int i12 = this.f388942A - dVar.f389657c;
        this.f388942A = i12;
        boolean z13 = true;
        if (dVar.f389658d) {
            this.f388943B = dVar.f389659e;
            this.f388944C = true;
        }
        if (dVar.f389660f) {
            this.f388945D = dVar.f389661g;
        }
        if (i12 == 0) {
            i91 i91Var = dVar.f389656b.f383641a;
            if (!this.f388965X.f383641a.c() && i91Var.c()) {
                this.f388966Y = -1;
                this.f388967Z = 0L;
            }
            if (!i91Var.c()) {
                List<i91> listD = ((yt0) i91Var).d();
                db.b(listD.size() == this.f388979m.size());
                for (int i13 = 0; i13 < listD.size(); i13++) {
                    ((d) this.f388979m.get(i13)).f388999b = listD.get(i13);
                }
            }
            long j12 = -9223372036854775807L;
            if (this.f388944C) {
                if (dVar.f389656b.f383642b.equals(this.f388965X.f383642b) && dVar.f389656b.f383644d == this.f388965X.f383658r) {
                    z13 = false;
                }
                if (z13) {
                    if (!i91Var.c() && !dVar.f389656b.f383642b.a()) {
                        at0 at0Var = dVar.f389656b;
                        jd0.b bVar = at0Var.f383642b;
                        long j13 = at0Var.f383644d;
                        i91Var.a(bVar.f385280a, this.f388978l);
                        j12 = j13 + this.f388978l.f386393e;
                    } else {
                        j12 = dVar.f389656b.f383644d;
                    }
                }
                z12 = z13;
            } else {
                z12 = false;
            }
            long j14 = j12;
            this.f388944C = false;
            a(dVar.f389656b, 1, this.f388945D, z12, this.f388943B, j14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(final com.yandex.mobile.ads.impl.at0 r42, final int r43, final int r44, boolean r45, int r46, long r47) {
        /*
            Method dump skipped, instructions count: 1073
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.pt.a(com.yandex.mobile.ads.impl.at0, int, int, boolean, int, long):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(at0 at0Var, int i12, gt0.b bVar) {
        i91 i91Var = at0Var.f383641a;
        bVar.a(i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(int i12, gt0.c cVar, gt0.c cVar2, gt0.b bVar) {
        bVar.c();
        bVar.a(cVar, cVar2, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(at0 at0Var, gt0.b bVar) {
        bVar.a(at0Var.f383646f);
    }

    private static long a(at0 at0Var) {
        i91.d dVar = new i91.d();
        i91.b bVar = new i91.b();
        at0Var.f383641a.a(at0Var.f383642b.f385280a, bVar);
        long j12 = at0Var.f383643c;
        if (j12 == -9223372036854775807L) {
            return at0Var.f383641a.a(bVar.f386391c, dVar, 0L).f386416m;
        }
        return bVar.f386393e + j12;
    }

    private at0 a(at0 at0Var, i91 i91Var, @j.P Pair<Object, Long> pair) {
        jd0.b bVar;
        da1 da1Var;
        at0 at0VarA;
        long jA2;
        db.a(i91Var.c() || pair != null);
        i91 i91Var2 = at0Var.f383641a;
        at0 at0VarA2 = at0Var.a(i91Var);
        if (i91Var.c()) {
            jd0.b bVarA = at0.a();
            long jA3 = pc1.a(this.f388967Z);
            at0 at0VarA3 = at0VarA2.a(bVarA, jA3, jA3, jA3, 0L, w91.f391352d, this.f388968b, com.yandex.mobile.ads.embedded.guava.collect.p.i()).a(bVarA);
            at0VarA3.f383656p = at0VarA3.f383658r;
            return at0VarA3;
        }
        Object obj = at0VarA2.f383642b.f385280a;
        int i12 = pc1.f388768a;
        boolean zEquals = obj.equals(pair.first);
        jd0.b bVar2 = !zEquals ? new jd0.b(pair.first) : at0VarA2.f383642b;
        long jLongValue = ((Long) pair.second).longValue();
        long jA4 = pc1.a(getContentPosition());
        if (!i91Var2.c()) {
            jA4 -= i91Var2.a(obj, this.f388978l).f386393e;
        }
        if (!zEquals || jLongValue < jA4) {
            db.b(!bVar2.a());
            w91 w91Var = !zEquals ? w91.f391352d : at0VarA2.f383648h;
            if (zEquals) {
                bVar = bVar2;
                da1Var = at0VarA2.f383649i;
            } else {
                bVar = bVar2;
                da1Var = this.f388968b;
            }
            at0 at0VarA4 = at0VarA2.a(bVar, jLongValue, jLongValue, jLongValue, 0L, w91Var, da1Var, !zEquals ? com.yandex.mobile.ads.embedded.guava.collect.p.i() : at0VarA2.f383650j).a(bVar);
            at0VarA4.f383656p = jLongValue;
            return at0VarA4;
        }
        if (jLongValue == jA4) {
            int iA2 = i91Var.a(at0VarA2.f383651k.f385280a);
            if (iA2 != -1 && i91Var.a(iA2, this.f388978l, false).f386391c == i91Var.a(bVar2.f385280a, this.f388978l).f386391c) {
                return at0VarA2;
            }
            i91Var.a(bVar2.f385280a, this.f388978l);
            if (bVar2.a()) {
                jA2 = this.f388978l.a(bVar2.f385281b, bVar2.f385282c);
            } else {
                jA2 = this.f388978l.f386392d;
            }
            at0VarA = at0VarA2.a(bVar2, at0VarA2.f383658r, at0VarA2.f383658r, at0VarA2.f383644d, jA2 - at0VarA2.f383658r, at0VarA2.f383648h, at0VarA2.f383649i, at0VarA2.f383650j).a(bVar2);
            at0VarA.f383656p = jA2;
        } else {
            db.b(!bVar2.a());
            long jMax = Math.max(0L, at0VarA2.f383657q - (jLongValue - jA4));
            long j12 = at0VarA2.f383656p;
            if (at0VarA2.f383651k.equals(at0VarA2.f383642b)) {
                j12 = jLongValue + jMax;
            }
            at0VarA = at0VarA2.a(bVar2, jLongValue, jLongValue, jLongValue, jMax, at0VarA2.f383648h, at0VarA2.f383649i, at0VarA2.f383650j);
            at0VarA.f383656p = j12;
        }
        return at0VarA;
    }

    @j.P
    private Pair<Object, Long> a(i91 i91Var, int i12, long j12) {
        if (i91Var.c()) {
            this.f388966Y = i12;
            if (j12 == -9223372036854775807L) {
                j12 = 0;
            }
            this.f388967Z = j12;
            return null;
        }
        if (i12 == -1 || i12 >= i91Var.b()) {
            i12 = i91Var.a(false);
            j12 = pc1.b(i91Var.a(i12, this.f384922a, 0L).f386416m);
        }
        return i91Var.a(this.f384922a, this.f388978l, i12, pc1.a(j12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@j.P Surface surface) {
        ArrayList arrayList = new ArrayList();
        boolean z12 = false;
        for (ux0 ux0Var : this.f388972f) {
            if (ux0Var.m() == 2) {
                int iC2 = c();
                rt rtVar = this.f388975i;
                arrayList.add(new kt0(rtVar, ux0Var, this.f388965X.f383641a, iC2 == -1 ? 0 : iC2, this.f388985s, rtVar.d()).a(1).a(surface).e());
            }
        }
        Object obj = this.f388951J;
        if (obj != null && obj != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((kt0) it.next()).a(this.f388992z);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z12 = true;
            }
            Object obj2 = this.f388951J;
            Surface surface2 = this.f388952K;
            if (obj2 == surface2) {
                surface2.release();
                this.f388952K = null;
            }
        }
        this.f388951J = surface;
        if (z12) {
            a(lt.a(new bu(3), ErrorCodes.MALFORMED_URL_EXCEPTION));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i12, final int i13) {
        if (i12 == this.f388955N && i13 == this.f388956O) {
            return;
        }
        this.f388955N = i12;
        this.f388956O = i13;
        m90<gt0.b> m90Var = this.f388976j;
        m90Var.a(24, new m90.a() { // from class: com.yandex.mobile.ads.impl.P1
            @Override // com.yandex.mobile.ads.impl.m90.a
            public final void invoke(Object obj) {
                ((gt0.b) obj).onSurfaceSizeChanged(i12, i13);
            }
        });
        m90Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i12, int i13, boolean z12) {
        int i14 = 0;
        boolean z13 = z12 && i12 != -1;
        if (z13 && i12 != 1) {
            i14 = 1;
        }
        at0 at0Var = this.f388965X;
        if (at0Var.f383652l == z13 && at0Var.f383653m == i14) {
            return;
        }
        this.f388942A++;
        at0 at0Var2 = new at0(at0Var.f383641a, at0Var.f383642b, at0Var.f383643c, at0Var.f383644d, at0Var.f383645e, at0Var.f383646f, at0Var.f383647g, at0Var.f383648h, at0Var.f383649i, at0Var.f383650j, at0Var.f383651k, z13, i14, at0Var.f383654n, at0Var.f383656p, at0Var.f383657q, at0Var.f383658r, at0Var.f383655o);
        this.f388975i.a(z13, i14);
        a(at0Var2, 0, i13, false, 5, -9223372036854775807L);
    }

    private void a(int i12, int i13, @j.P Object obj) {
        for (ux0 ux0Var : this.f388972f) {
            if (ux0Var.m() == i12) {
                int iC2 = c();
                rt rtVar = this.f388975i;
                new kt0(rtVar, ux0Var, this.f388965X.f383641a, iC2 == -1 ? 0 : iC2, this.f388985s, rtVar.d()).a(i13).a(obj).e();
            }
        }
    }
}
