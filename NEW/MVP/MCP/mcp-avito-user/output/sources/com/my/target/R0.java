package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.my.target.B0;
import com.my.target.mediation.i;
import com.my.target.nativeads.h;
import com.my.target.nativeads.views.IconAdView;
import com.my.target.p1;
import e11.AbstractC39858c1;
import e11.C39862e;
import e11.C39864e1;
import e11.C39901r0;
import e11.C39922y0;
import e11.o2;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class R0 extends B0<com.my.target.mediation.i> implements o2, h.b {

    /* renamed from: k, reason: collision with root package name */
    @j.N
    public final com.my.target.nativeads.h f364535k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public final h11.d f364536l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    public k11.b f364537m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    public WeakReference<IconAdView> f364538n;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    public WeakReference<View> f364539o;

    public class a implements i.a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final C39864e1 f364540a;

        public a(C39864e1 c39864e1) {
            this.f364540a = c39864e1;
        }

        public final void a(@j.N com.my.target.mediation.i iVar) {
            R0 r02 = R0.this;
            if (r02.f364337d != iVar) {
                return;
            }
            r02.h(this.f364540a, false);
        }
    }

    public static class b extends B0.a implements com.my.target.mediation.j {

        /* renamed from: g, reason: collision with root package name */
        public final int f364542g;

        /* renamed from: h, reason: collision with root package name */
        @j.P
        public final h11.d f364543h;

        public b(@j.N String str, @j.P String str2, @j.N HashMap map, int i12, int i13, int i14, @j.P com.my.target.mediation.b bVar, @j.P h11.d dVar) {
            super(str, str2, map, i12, i13, bVar);
            this.f364542g = i14;
            this.f364543h = dVar;
        }
    }

    public R0(@j.N com.my.target.nativeads.h hVar, @j.N e11.X0 x02, @j.N C39901r0 c39901r0, @j.N p1.a aVar, @j.P h11.d dVar) {
        super(x02, c39901r0, aVar);
        this.f364535k = hVar;
        this.f364536l = dVar;
    }

    @Override // com.my.target.B0
    public final void e(@j.N com.my.target.mediation.e eVar, @j.N C39864e1 c39864e1, @j.N Context context) {
        com.my.target.mediation.i iVar = (com.my.target.mediation.i) eVar;
        String str = c39864e1.f394581f;
        HashMap mapA = c39864e1.a();
        C39901r0 c39901r0 = this.f364334a;
        int iG2 = c39901r0.f394764a.g();
        int iH2 = c39901r0.f394764a.h();
        int i12 = c39901r0.f394771h;
        this.f364535k.getClass();
        b bVar = new b(c39864e1.f394577b, str, mapA, iG2, iH2, i12, TextUtils.isEmpty(this.f364341h) ? null : c39901r0.a(this.f364341h), this.f364536l);
        if (iVar instanceof com.my.target.mediation.o) {
            AbstractC39858c1 abstractC39858c1 = c39864e1.f394582g;
            if (abstractC39858c1 instanceof C39862e) {
                ((com.my.target.mediation.o) iVar).f364977a = (C39862e) abstractC39858c1;
            }
        }
        try {
            iVar.b(bVar, new a(c39864e1), context);
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    @Override // com.my.target.nativeads.h.b
    public final void f(@j.N com.my.target.nativeads.h hVar) {
        com.my.target.nativeads.h hVar2 = this.f364535k;
        h.b bVar = hVar2.f365013i;
        if (bVar == null) {
            return;
        }
        bVar.f(hVar2);
    }

    @Override // com.my.target.nativeads.h.b
    public final void g(@j.N com.my.target.nativeads.h hVar) {
        com.my.target.nativeads.h hVar2 = this.f364535k;
        h.b bVar = hVar2.f365013i;
        if (bVar == null) {
            return;
        }
        bVar.g(hVar2);
    }

    @Override // e11.o2
    @j.P
    public final k11.b h() {
        return this.f364537m;
    }

    @Override // com.my.target.B0
    public final boolean i(@j.N com.my.target.mediation.e eVar) {
        return eVar instanceof com.my.target.mediation.i;
    }

    @Override // e11.o2
    public final void j() {
        if (this.f364337d == 0) {
            return;
        }
        WeakReference<View> weakReference = this.f364539o;
        View view = weakReference != null ? weakReference.get() : null;
        if (view != null) {
            this.f364539o.clear();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        WeakReference<IconAdView> weakReference2 = this.f364538n;
        IconAdView iconAdView = weakReference2 != null ? weakReference2.get() : null;
        if (iconAdView != null) {
            this.f364538n.clear();
            k11.b bVar = this.f364537m;
            com.my.target.common.models.b bVar2 = bVar != null ? bVar.f406014k : null;
            C39922y0 c39922y0 = (C39922y0) iconAdView.getImageView();
            if (bVar2 != null) {
                C37802o.b(bVar2, c39922y0);
            }
            c39922y0.setImageData(null);
        }
        this.f364539o = null;
        this.f364538n = null;
        try {
            ((com.my.target.mediation.i) this.f364337d).j();
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    @Override // com.my.target.nativeads.h.b
    public final boolean k() {
        h.b bVar = this.f364535k.f365013i;
        if (bVar == null) {
            return true;
        }
        return bVar.k();
    }

    @Override // com.my.target.B0
    public final void o() {
        h.c cVar = this.f364535k.f365011g;
        if (cVar != null) {
            cVar.a("No data for available ad networks");
        }
    }

    @Override // com.my.target.B0
    @j.N
    public final com.my.target.mediation.e p() {
        return new com.my.target.mediation.o();
    }
}
