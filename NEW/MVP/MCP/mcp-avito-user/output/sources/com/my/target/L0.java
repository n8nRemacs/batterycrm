package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.my.target.B0;
import com.my.target.mediation.g;
import com.my.target.nativeads.d;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.nativeads.views.MediaAdView;
import com.my.target.p1;
import e11.AbstractC39858c1;
import e11.C39862e;
import e11.C39864e1;
import e11.C39876i1;
import e11.C39901r0;
import e11.C39922y0;
import e11.h2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class L0 extends B0<com.my.target.mediation.g> implements h2, d.b {

    /* renamed from: k, reason: collision with root package name */
    @j.N
    public final com.my.target.nativeads.d f364453k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public final h11.d f364454l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    public k11.c f364455m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    public WeakReference<MediaAdView> f364456n;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    public WeakReference<View> f364457o;

    /* renamed from: p, reason: collision with root package name */
    @j.P
    public WeakReference<IconAdView> f364458p;

    public class a implements g.a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final C39864e1 f364459a;

        public a(C39864e1 c39864e1) {
            this.f364459a = c39864e1;
        }

        public final void a(@j.N com.my.target.mediation.g gVar) {
            L0 l02 = L0.this;
            if (l02.f364337d != gVar) {
                return;
            }
            l02.h(this.f364459a, false);
        }
    }

    public static class b extends B0.a implements com.my.target.mediation.h {

        /* renamed from: g, reason: collision with root package name */
        public final int f364461g;

        /* renamed from: h, reason: collision with root package name */
        @j.P
        public final h11.d f364462h;

        public b(@j.N String str, @j.P String str2, @j.N HashMap map, int i12, int i13, int i14, @j.P com.my.target.mediation.b bVar, @j.P h11.d dVar) {
            super(str, str2, map, i12, i13, bVar);
            this.f364461g = i14;
            this.f364462h = dVar;
        }
    }

    public L0(@j.N com.my.target.nativeads.d dVar, @j.N e11.X0 x02, @j.N C39901r0 c39901r0, @j.N p1.a aVar, @j.P h11.d dVar2) {
        super(x02, c39901r0, aVar);
        this.f364453k = dVar;
        this.f364454l = dVar2;
    }

    @Override // e11.h2
    public final void a(@j.N View view, @j.P ArrayList arrayList) {
        ArrayList arrayList2;
        int i12;
        int i13;
        if (this.f364337d == 0 || this.f364455m == null) {
            return;
        }
        j();
        if (arrayList != null) {
            arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View view2 = (View) it.next();
                if (view2 != null) {
                    arrayList2.add(view2);
                }
            }
        } else {
            arrayList2 = null;
        }
        if (!(this.f364337d instanceof com.my.target.mediation.n) && (view instanceof ViewGroup)) {
            C39876i1 c39876i1 = new C39876i1((ViewGroup) view);
            MediaAdView mediaAdViewF = c39876i1.f();
            if (mediaAdViewF != null) {
                this.f364456n = new WeakReference<>(mediaAdViewF);
                try {
                    com.my.target.mediation.g gVar = (com.my.target.mediation.g) this.f364337d;
                    view.getContext();
                    gVar.getClass();
                } catch (Throwable th2) {
                    th2.toString();
                }
                k11.c cVar = this.f364455m;
                com.my.target.common.models.b bVar = cVar.f406017n;
                if (bVar != null || cVar.f406016m) {
                    if (bVar == null || (i12 = bVar.f394305b) <= 0 || (i13 = bVar.f394306c) <= 0) {
                        i12 = 16;
                        i13 = 10;
                    }
                    mediaAdViewF.b(i12, i13);
                } else {
                    mediaAdViewF.b(0, 0);
                }
                C39922y0 c39922y0 = (C39922y0) mediaAdViewF.getImageView();
                c39922y0.setImageData(bVar);
                if (bVar != null && bVar.a() == null) {
                    C37802o.c(bVar, c39922y0, null);
                }
            }
            IconAdView iconAdViewE = c39876i1.e();
            com.my.target.common.models.b bVar2 = this.f364455m.f406014k;
            if (iconAdViewE != null && bVar2 != null) {
                this.f364458p = new WeakReference<>(iconAdViewE);
                C39922y0 c39922y02 = (C39922y0) iconAdViewE.getImageView();
                c39922y02.setImageData(bVar2);
                if (bVar2.a() == null) {
                    C37802o.c(bVar2, c39922y02, null);
                }
            }
        }
        try {
            ((com.my.target.mediation.g) this.f364337d).l(view, arrayList2);
        } catch (Throwable th3) {
            th3.toString();
        }
    }

    @Override // com.my.target.B0
    public final void e(@j.N com.my.target.mediation.e eVar, @j.N C39864e1 c39864e1, @j.N Context context) {
        com.my.target.mediation.g gVar = (com.my.target.mediation.g) eVar;
        String str = c39864e1.f394581f;
        HashMap mapA = c39864e1.a();
        C39901r0 c39901r0 = this.f364334a;
        int iG2 = c39901r0.f394764a.g();
        int iH2 = c39901r0.f394764a.h();
        int i12 = c39901r0.f394771h;
        this.f364453k.getClass();
        b bVar = new b(c39864e1.f394577b, str, mapA, iG2, iH2, i12, TextUtils.isEmpty(this.f364341h) ? null : c39901r0.a(this.f364341h), this.f364454l);
        if (gVar instanceof com.my.target.mediation.n) {
            AbstractC39858c1 abstractC39858c1 = c39864e1.f394582g;
            if (abstractC39858c1 instanceof C39862e) {
                ((com.my.target.mediation.n) gVar).f364973a = (C39862e) abstractC39858c1;
            }
        }
        try {
            gVar.k(bVar, new a(c39864e1), context);
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    @Override // e11.h2
    @j.P
    public final k11.c g() {
        return this.f364455m;
    }

    @Override // com.my.target.B0
    public final boolean i(@j.N com.my.target.mediation.e eVar) {
        return eVar instanceof com.my.target.mediation.g;
    }

    @Override // e11.h2
    public final void j() {
        if (this.f364337d == 0) {
            return;
        }
        WeakReference<View> weakReference = this.f364457o;
        View view = weakReference != null ? weakReference.get() : null;
        if (view != null) {
            this.f364457o.clear();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        WeakReference<MediaAdView> weakReference2 = this.f364456n;
        MediaAdView mediaAdView = weakReference2 != null ? weakReference2.get() : null;
        if (mediaAdView != null) {
            this.f364456n.clear();
            k11.c cVar = this.f364455m;
            com.my.target.common.models.b bVar = cVar != null ? cVar.f406017n : null;
            C39922y0 c39922y0 = (C39922y0) mediaAdView.getImageView();
            if (bVar != null) {
                C37802o.b(bVar, c39922y0);
            }
            c39922y0.setImageData(null);
            mediaAdView.b(0, 0);
        }
        WeakReference<IconAdView> weakReference3 = this.f364458p;
        IconAdView iconAdView = weakReference3 != null ? weakReference3.get() : null;
        if (iconAdView != null) {
            this.f364458p.clear();
            k11.c cVar2 = this.f364455m;
            com.my.target.common.models.b bVar2 = cVar2 != null ? cVar2.f406014k : null;
            C39922y0 c39922y02 = (C39922y0) iconAdView.getImageView();
            if (bVar2 != null) {
                C37802o.b(bVar2, c39922y02);
            }
            c39922y02.setImageData(null);
        }
        this.f364457o = null;
        this.f364456n = null;
        try {
            ((com.my.target.mediation.g) this.f364337d).j();
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    @Override // com.my.target.nativeads.d.b
    public final boolean k() {
        d.b bVar = this.f364453k.f365006j;
        if (bVar == null) {
            return true;
        }
        return bVar.k();
    }

    @Override // com.my.target.nativeads.d.b
    public final void l(@j.N com.my.target.nativeads.d dVar) {
        com.my.target.nativeads.d dVar2 = this.f364453k;
        d.b bVar = dVar2.f365006j;
        if (bVar == null) {
            return;
        }
        bVar.l(dVar2);
    }

    @Override // com.my.target.nativeads.d.b
    public final void m(@j.N com.my.target.nativeads.d dVar) {
        com.my.target.nativeads.d dVar2 = this.f364453k;
        d.b bVar = dVar2.f365006j;
        if (bVar == null) {
            return;
        }
        bVar.m(dVar2);
    }

    @Override // com.my.target.B0
    public final void o() {
        com.my.target.nativeads.d dVar = this.f364453k;
        d.c cVar = dVar.f365003g;
        if (cVar != null) {
            cVar.g("No data for available ad networks", dVar);
        }
    }

    @Override // com.my.target.B0
    @j.N
    public final com.my.target.mediation.e p() {
        return new com.my.target.mediation.n();
    }

    @Override // e11.h2
    public final void d(@j.P com.avito.android.advertising.loaders.my_target.i iVar) {
    }
}
