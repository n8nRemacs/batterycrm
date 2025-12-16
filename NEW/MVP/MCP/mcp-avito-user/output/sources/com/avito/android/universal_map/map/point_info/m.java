package com.avito.android.universal_map.map.point_info;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC25658a;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.error.z;
import com.avito.android.remote.model.Overlay;
import com.avito.android.universal_map.map.UniversalMapFragment;
import com.avito.android.universal_map.map.point_info.g;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.P2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import dj.InterfaceC39736a;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C42829l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalMapPointInfoView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/point_info/m;", "Lcom/avito/android/universal_map/map/point_info/g;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f305828a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25659b f305829b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39736a f305830c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f305831d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.map.tracker.c f305832e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f305833f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final FloatingActionButton f305834g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f305835h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f305836i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Group f305837j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f305838k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f305839l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f305840m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final AbstractC25658a<? extends RecyclerView.C> f305841n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final AbstractC25658a<? extends RecyclerView.C> f305842o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final AbstractC25658a<? extends RecyclerView.C> f305843p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public String f305844q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public String f305845r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public String f305846s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final BottomSheetBehavior<ViewGroup> f305847t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f305848u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f305849v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f305850w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f305851x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.overlay.e f305852y;

    /* JADX WARN: Multi-variable type inference failed */
    public m(@Y61.k View view, @Y61.k InterfaceC25659b interfaceC25659b, @Y61.k InterfaceC39736a interfaceC39736a, @Y61.k com.avito.android.util.text.a aVar, @Y61.k UniversalMapFragment universalMapFragment, @Y61.k com.avito.android.universal_map.map.tracker.c cVar) throws Resources.NotFoundException {
        this.f305828a = view;
        this.f305829b = interfaceC25659b;
        this.f305830c = interfaceC39736a;
        this.f305831d = aVar;
        this.f305832e = cVar;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bottom_sheet_beduin_point_info);
        this.f305833f = viewGroup;
        this.f305834g = (FloatingActionButton) view.findViewById(R.id.find_me_button);
        View viewFindViewById = view.findViewById(R.id.universal_map_point_info_beduin_overlay_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById, 0, null, 0, 0, 30, null);
        this.f305835h = lVar;
        this.f305836i = (ViewGroup) view.findViewById(R.id.universal_map_point_info_beduin_overlay_container);
        this.f305837j = (Group) view.findViewById(R.id.universal_map_point_info_beduin_content_container);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.universal_map_point_info_beduin_top_list);
        this.f305838k = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.universal_map_point_info_beduin_main_list);
        this.f305839l = recyclerView2;
        RecyclerView recyclerView3 = (RecyclerView) view.findViewById(R.id.universal_map_point_info_beduin_bottom_list);
        this.f305840m = recyclerView3;
        com.avito.android.beduin.common.component.adapter.a aVarI = com.avito.android.bxcontent.mvi.entity.f.i(24, interfaceC25659b);
        this.f305841n = aVarI;
        com.avito.android.beduin.common.component.adapter.a aVarI2 = com.avito.android.bxcontent.mvi.entity.f.i(24, interfaceC25659b);
        this.f305842o = aVarI2;
        com.avito.android.beduin.common.component.adapter.a aVarI3 = com.avito.android.bxcontent.mvi.entity.f.i(24, interfaceC25659b);
        this.f305843p = aVarI3;
        this.f305847t = BottomSheetBehavior.B(viewGroup);
        com.jakewharton.rxrelay3.c cVar2 = new com.jakewharton.rxrelay3.c();
        this.f305848u = cVar2;
        com.jakewharton.rxrelay3.c cVar3 = new com.jakewharton.rxrelay3.c();
        this.f305849v = cVar3;
        this.f305850w = cVar2;
        this.f305851x = cVar3;
        this.f305852y = new com.avito.android.map_core.overlay.e(universalMapFragment, view.findViewById(R.id.vs_overlay_container), C42745f0.U(new com.avito.android.map_core.overlay.b(aVar, false), new com.avito.android.map_core.overlay.a(aVar, false, false)));
        lVar.f231600j = new j(this);
        lVar.i();
        lVar.g();
        for (Q q12 : C42745f0.U(new Q(recyclerView, aVarI), new Q(recyclerView2, aVarI2), new Q(recyclerView3, aVarI3))) {
            RecyclerView recyclerView4 = (RecyclerView) q12.f406619b;
            AbstractC25658a abstractC25658a = (AbstractC25658a) q12.f406620c;
            abstractC25658a.o(this.f305830c);
            this.f305828a.getContext();
            recyclerView4.setLayoutManager(new LinearLayoutManager());
            recyclerView4.setAdapter(abstractC25658a);
        }
        this.f305832e.b(recyclerView2);
        k kVar = new k(this);
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.f305847t;
        bottomSheetBehavior.I(kVar);
        int i12 = (int) (C35835l0.g(this.f305828a.getContext()).y * 0.5d);
        com.avito.android.lib.util.b.a(bottomSheetBehavior);
        bottomSheetBehavior.N(i12, false);
        bottomSheetBehavior.f356006l = i12;
    }

    @Override // com.avito.android.universal_map.map.point_info.g
    public final int a() {
        return this.f305847t.E();
    }

    @Override // com.avito.android.universal_map.map.point_info.g
    public final void b() {
        D6.G(this.f305833f, true);
    }

    @Override // com.avito.android.universal_map.map.point_info.g
    @Y61.k
    public final LinkedHashMap c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.f305844q;
        if (str != null) {
        }
        String str2 = this.f305845r;
        if (str2 != null) {
        }
        String str3 = this.f305846s;
        if (str3 != null) {
            linkedHashMap.put(str3, this.f305840m);
        }
        return linkedHashMap;
    }

    @Override // com.avito.android.universal_map.map.point_info.g
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF305851x() {
        return this.f305851x;
    }

    @Override // com.avito.android.universal_map.map.point_info.g
    @Y61.k
    /* renamed from: e, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF305850w() {
        return this.f305850w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.universal_map.map.point_info.g
    public final void f(@Y61.k g.a aVar) {
        G0 g02;
        if (aVar instanceof g.a.b) {
            com.avito.android.lib.util.b.a(this.f305847t);
            Overlay overlay = ((g.a.b) aVar).f305818a;
            com.avito.android.map_core.overlay.e eVar = this.f305852y;
            if (overlay != null) {
                eVar.a(overlay);
                D6.H(eVar.f185676b);
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 == null) {
                D6.w(eVar.f185676b);
                return;
            }
            return;
        }
        if (aVar instanceof g.a.C9392a) {
            g.a.C9392a c9392a = (g.a.C9392a) aVar;
            g.a.C9392a.C9393a c9393a = c9392a.f305810a;
            if (c9393a == null) {
                g(c9392a);
                return;
            }
            io.reactivex.rxjava3.subjects.e eVarA = com.avito.android.universal_map.map.util.d.a(new l(this));
            for (C42829l0 c42829l0 : C42745f0.U(new C42829l0(this.f305838k, this.f305841n, c9393a.f305813b), new C42829l0(this.f305839l, this.f305842o, c9393a.f305815d), new C42829l0(this.f305840m, this.f305843p, c9393a.f305817f))) {
                RecyclerView recyclerView = (RecyclerView) c42829l0.f406871b;
                AbstractC25658a abstractC25658a = (AbstractC25658a) c42829l0.f406872c;
                List list = (List) c42829l0.f406873d;
                RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.m(new h(abstractC25658a, list, eVarA, 0));
                }
            }
            this.f305844q = c9393a.f305812a;
            this.f305845r = c9393a.f305814c;
            this.f305846s = c9393a.f305816e;
        }
    }

    public final void g(g.a.C9392a c9392a) {
        D6.w(this.f305852y.f185676b);
        P2<G0> p22 = c9392a.f305811b;
        boolean z12 = p22 instanceof P2.b;
        com.avito.android.progress_overlay.l lVar = this.f305835h;
        Group group = this.f305837j;
        ViewGroup viewGroup = this.f305836i;
        if (z12) {
            viewGroup.setMinimumHeight(0);
            lVar.j();
            D6.H(group);
        } else if (p22 instanceof P2.c) {
            viewGroup.setMinimumHeight(this.f305833f.getMeasuredHeight());
            lVar.k(null);
            D6.g(group);
            h();
        } else if (p22 instanceof P2.a) {
            viewGroup.setMinimumHeight(0);
            lVar.a(z.k(((P2.a) p22).f318719a));
            D6.g(group);
        }
        this.f305847t.b(4);
    }

    public final void h() {
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f305841n.m(c42784z0);
        this.f305842o.m(c42784z0);
        this.f305843p.m(c42784z0);
        this.f305844q = null;
        this.f305845r = null;
        this.f305846s = null;
        View view = this.f305828a;
        view.invalidate();
        view.requestLayout();
    }

    @Override // com.avito.android.universal_map.map.point_info.g
    public final boolean isVisible() {
        return this.f305847t.f355975L != 5;
    }
}
