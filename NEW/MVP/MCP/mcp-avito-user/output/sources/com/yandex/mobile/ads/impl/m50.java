package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.source.ads.b;
import com.google.android.exoplayer2.ui.C36563a;
import com.google.android.exoplayer2.ui.InterfaceC36564b;
import com.yandex.mobile.ads.impl.u90;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class m50 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final u6 f387845a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final h4 f387846b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final i4 f387847c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final wf f387848d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final xf f387849e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final u90 f387850f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final wt f387851g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final nt f387852h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final hu0 f387853i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final ot0 f387854j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private final d0.g f387855k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    private final vf1 f387856l = new vf1();

    /* renamed from: m, reason: collision with root package name */
    @j.P
    private InstreamAd f387857m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    private com.google.android.exoplayer2.d0 f387858n;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    private Object f387859o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f387860p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f387861q;

    public class a implements u90.b {
        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.u90.b
        public final void a(@j.N ViewGroup viewGroup, @j.N List<df1> list, @j.N InstreamAd instreamAd) {
            m50.this.f387861q = false;
            m50.this.f387857m = instreamAd;
            if (instreamAd instanceof o60) {
                o60 o60Var = (o60) m50.this.f387857m;
                m50.this.getClass();
                o60Var.a();
            }
            vf vfVarA = m50.this.f387848d.a(viewGroup, list, instreamAd);
            m50.this.f387849e.a(vfVarA);
            vfVarA.a(m50.this.f387856l);
            vfVarA.a(m50.h(m50.this));
            vfVarA.a(m50.i(m50.this));
            if (m50.this.f387851g.b()) {
                m50.this.f387860p = true;
                m50.a(m50.this, instreamAd);
            }
        }

        public /* synthetic */ a(m50 m50Var, int i12) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.u90.b
        public final void a() {
            m50.this.f387861q = false;
            m50.this.f387846b.a(com.google.android.exoplayer2.source.ads.a.f346179h);
        }
    }

    public m50(@j.N t6 t6Var, @j.N i4 i4Var, @j.N wf wfVar, @j.N xf xfVar, @j.N u90 u90Var, @j.N nt0 nt0Var, @j.N nt ntVar, @j.N hu0 hu0Var, @j.N tt ttVar) {
        this.f387845a = t6Var.b();
        this.f387846b = t6Var.c();
        this.f387847c = i4Var;
        this.f387848d = wfVar;
        this.f387849e = xfVar;
        this.f387850f = u90Var;
        this.f387852h = ntVar;
        this.f387853i = hu0Var;
        this.f387851g = nt0Var.c();
        this.f387854j = nt0Var.d();
        this.f387855k = ttVar;
    }

    public static /* synthetic */ oe1 h(m50 m50Var) {
        m50Var.getClass();
        return null;
    }

    public static /* synthetic */ pe1 i(m50 m50Var) {
        m50Var.getClass();
        return null;
    }

    public final void a(@j.P com.google.android.exoplayer2.d0 d0Var) {
        this.f387858n = d0Var;
    }

    public final void a(@j.N b.a aVar, @j.P InterfaceC36564b interfaceC36564b, @j.P Object obj) {
        com.google.android.exoplayer2.d0 d0Var = this.f387858n;
        this.f387851g.a(d0Var);
        this.f387859o = obj;
        if (d0Var != null) {
            d0Var.N(this.f387855k);
            this.f387846b.a(aVar);
            this.f387853i.a(new lt0(d0Var, this.f387854j));
            if (this.f387860p) {
                this.f387846b.a(this.f387846b.a());
                vf vfVarA = this.f387849e.a();
                if (vfVarA != null) {
                    vfVarA.a();
                    return;
                }
                return;
            }
            InstreamAd instreamAd = this.f387857m;
            if (instreamAd != null) {
                this.f387846b.a(this.f387847c.a(instreamAd, this.f387859o));
            } else if (interfaceC36564b != null) {
                ViewGroup adViewGroup = interfaceC36564b.getAdViewGroup();
                ArrayList arrayList = new ArrayList();
                Iterator<C36563a> it = interfaceC36564b.getAdOverlayInfos().iterator();
                while (it.hasNext()) {
                    arrayList.add(ht.a(it.next()));
                }
                a(adViewGroup, arrayList);
            }
        }
    }

    public final void b() {
        com.google.android.exoplayer2.d0 d0VarA = this.f387851g.a();
        if (d0VarA != null) {
            if (this.f387857m != null) {
                long jH2 = com.google.android.exoplayer2.util.U.H(d0VarA.getCurrentPosition());
                if (!this.f387854j.c()) {
                    jH2 = 0;
                }
                this.f387846b.a(this.f387846b.a().f(jH2));
            }
            d0VarA.s(this.f387855k);
            this.f387846b.a((b.a) null);
            this.f387851g.a((com.google.android.exoplayer2.d0) null);
            this.f387860p = true;
        }
    }

    public final void a(@j.P VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f387856l.a(videoAdPlaybackListener);
    }

    public final void a(@j.P ViewGroup viewGroup, @j.P List<df1> list) {
        if (this.f387861q || this.f387857m != null || viewGroup == null) {
            return;
        }
        this.f387861q = true;
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f387850f.a(viewGroup, list, new a(this, 0));
    }

    public final void a() {
        this.f387861q = false;
        this.f387860p = false;
        this.f387857m = null;
        this.f387853i.a((lt0) null);
        this.f387845a.a();
        this.f387845a.a((st0) null);
        this.f387849e.c();
        this.f387846b.b();
        this.f387850f.a();
        this.f387856l.a(null);
        vf vfVarA = this.f387849e.a();
        if (vfVarA != null) {
            vfVarA.a((oe1) null);
        }
        vf vfVarA2 = this.f387849e.a();
        if (vfVarA2 != null) {
            vfVarA2.a((pe1) null);
        }
    }

    public final void a(int i12, int i13) {
        this.f387852h.a(i12, i13);
    }

    public final void a(int i12, int i13, @j.N IOException iOException) {
        this.f387852h.b(i12, i13, iOException);
    }

    public static void a(m50 m50Var, InstreamAd instreamAd) {
        m50Var.f387846b.a(m50Var.f387847c.a(instreamAd, m50Var.f387859o));
    }
}
