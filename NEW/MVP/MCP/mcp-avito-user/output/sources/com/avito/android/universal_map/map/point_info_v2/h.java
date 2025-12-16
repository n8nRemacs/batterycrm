package com.avito.android.universal_map.map.point_info_v2;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC25658a;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.error.z;
import com.avito.android.lib.design.shadow_layout.ShadowFrameLayout;
import com.avito.android.progress_overlay.l;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Overlay;
import com.avito.android.universal_map.UniversalMapParams;
import com.avito.android.universal_map.map.UniversalMapFragment;
import com.avito.android.universal_map.map.point_info.g;
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

/* compiled from: UniversalMapPointInfoViewV2Impl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/point_info_v2/h;", "Lcom/avito/android/universal_map/map/point_info/g;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements com.avito.android.universal_map.map.point_info.g {

    /* renamed from: A, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f305913A;

    /* renamed from: B, reason: collision with root package name */
    @k
    public final com.avito.android.map_core.overlay.e f305914B;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f305915a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC25659b f305916b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC39736a f305917c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f305918d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.universal_map.map.tracker.c f305919e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final UniversalMapParams.PointInfoBottomSheetSettings f305920f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ViewGroup f305921g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final FloatingActionButton f305922h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final l f305923i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final ViewGroup f305924j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final Group f305925k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final RecyclerView f305926l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final RecyclerView f305927m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final ShadowFrameLayout f305928n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final RecyclerView f305929o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final AbstractC25658a<? extends RecyclerView.C> f305930p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final AbstractC25658a<? extends RecyclerView.C> f305931q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final AbstractC25658a<? extends RecyclerView.C> f305932r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public String f305933s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public String f305934t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public String f305935u;

    /* renamed from: v, reason: collision with root package name */
    @k
    public final BottomSheetBehavior<ViewGroup> f305936v;

    /* renamed from: w, reason: collision with root package name */
    @k
    public final a f305937w;

    /* renamed from: x, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f305938x;

    /* renamed from: y, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f305939y;

    /* renamed from: z, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f305940z;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@k View view, @k InterfaceC25659b interfaceC25659b, @k InterfaceC39736a interfaceC39736a, @k com.avito.android.util.text.a aVar, @k UniversalMapFragment universalMapFragment, @k com.avito.android.universal_map.map.tracker.c cVar, @k UniversalMapParams.PointInfoBottomSheetSettings pointInfoBottomSheetSettings) {
        this.f305915a = view;
        this.f305916b = interfaceC25659b;
        this.f305917c = interfaceC39736a;
        this.f305918d = aVar;
        this.f305919e = cVar;
        this.f305920f = pointInfoBottomSheetSettings;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bottom_sheet_beduin_point_info_v2);
        this.f305921g = viewGroup;
        this.f305922h = (FloatingActionButton) view.findViewById(R.id.find_me_button);
        View viewFindViewById = view.findViewById(R.id.universal_map_point_info_v2_beduin_overlay_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        l lVar = new l((ViewGroup) viewFindViewById, 0, null, 0, 0, 30, null);
        this.f305923i = lVar;
        this.f305924j = (ViewGroup) view.findViewById(R.id.universal_map_point_info_v2_beduin_overlay_container);
        this.f305925k = (Group) view.findViewById(R.id.universal_map_point_info_v2_beduin_content_container);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.universal_map_point_info_v2_beduin_top_list);
        this.f305926l = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.universal_map_point_info_v2_beduin_main_list);
        this.f305927m = recyclerView2;
        this.f305928n = (ShadowFrameLayout) view.findViewById(R.id.universal_map_point_info_v2_beduin_bottom_list_container);
        RecyclerView recyclerView3 = (RecyclerView) view.findViewById(R.id.universal_map_point_info_v2_beduin_bottom_list);
        this.f305929o = recyclerView3;
        com.avito.android.beduin.common.component.adapter.a aVarI = com.avito.android.bxcontent.mvi.entity.f.i(24, interfaceC25659b);
        this.f305930p = aVarI;
        com.avito.android.beduin.common.component.adapter.a aVarI2 = com.avito.android.bxcontent.mvi.entity.f.i(24, interfaceC25659b);
        this.f305931q = aVarI2;
        com.avito.android.beduin.common.component.adapter.a aVarI3 = com.avito.android.bxcontent.mvi.entity.f.i(24, interfaceC25659b);
        this.f305932r = aVarI3;
        BottomSheetBehavior<ViewGroup> bottomSheetBehaviorB = BottomSheetBehavior.B(viewGroup);
        this.f305936v = bottomSheetBehaviorB;
        this.f305937w = new a(viewGroup, recyclerView, recyclerView2, bottomSheetBehaviorB);
        com.jakewharton.rxrelay3.c cVar2 = new com.jakewharton.rxrelay3.c();
        this.f305938x = cVar2;
        com.jakewharton.rxrelay3.c cVar3 = new com.jakewharton.rxrelay3.c();
        this.f305939y = cVar3;
        this.f305940z = cVar2;
        this.f305913A = cVar3;
        this.f305914B = new com.avito.android.map_core.overlay.e(universalMapFragment, view.findViewById(R.id.vs_overlay_container), C42745f0.U(new com.avito.android.map_core.overlay.b(aVar, false), new com.avito.android.map_core.overlay.a(aVar, false, false)));
        lVar.f231600j = new b(this);
        for (Q q12 : C42745f0.U(new Q(recyclerView, aVarI), new Q(recyclerView2, aVarI2), new Q(recyclerView3, aVarI3))) {
            RecyclerView recyclerView4 = (RecyclerView) q12.f406619b;
            AbstractC25658a abstractC25658a = (AbstractC25658a) q12.f406620c;
            abstractC25658a.o(this.f305917c);
            this.f305915a.getContext();
            recyclerView4.setLayoutManager(new LinearLayoutManager());
            recyclerView4.setAdapter(abstractC25658a);
        }
        this.f305919e.b(recyclerView2);
        c cVar4 = new c(this);
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.f305936v;
        bottomSheetBehavior.I(cVar4);
        com.avito.android.lib.util.b.a(bottomSheetBehavior);
        D6.l(true, this.f305915a, new d(this));
    }

    public static final void g(h hVar, View view, boolean z12) {
        if (!z12) {
            hVar.getClass();
        } else {
            D6.c(hVar.f305928n, null, Integer.valueOf((int) ((hVar.f305915a.getHeight() - view.getY()) - hVar.f305928n.getMeasuredHeight())), null, null, 13);
        }
    }

    @Override // com.avito.android.universal_map.map.point_info.g
    public final int a() {
        return this.f305936v.E();
    }

    @Override // com.avito.android.universal_map.map.point_info.g
    public final void b() {
        D6.G(this.f305921g, true);
    }

    @Override // com.avito.android.universal_map.map.point_info.g
    @k
    public final LinkedHashMap c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.f305933s;
        if (str != null) {
        }
        String str2 = this.f305934t;
        if (str2 != null) {
        }
        String str3 = this.f305935u;
        if (str3 != null) {
            linkedHashMap.put(str3, this.f305929o);
        }
        return linkedHashMap;
    }

    @Override // com.avito.android.universal_map.map.point_info.g
    @k
    /* renamed from: d, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF305913A() {
        return this.f305913A;
    }

    @Override // com.avito.android.universal_map.map.point_info.g
    @k
    /* renamed from: e, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF305940z() {
        return this.f305940z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.universal_map.map.point_info.g
    public final void f(@k g.a aVar) {
        boolean z12 = aVar instanceof g.a.b;
        G0 g02 = null;
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.f305936v;
        if (z12) {
            com.avito.android.lib.util.b.a(bottomSheetBehavior);
            Overlay overlay = ((g.a.b) aVar).f305818a;
            com.avito.android.map_core.overlay.e eVar = this.f305914B;
            if (overlay != null) {
                eVar.a(overlay);
                D6.H(eVar.f185676b);
                g02 = G0.f406611a;
            }
            if (g02 == null) {
                D6.w(eVar.f185676b);
                return;
            }
            return;
        }
        if (aVar instanceof g.a.C9392a) {
            g.a.C9392a c9392a = (g.a.C9392a) aVar;
            P2<G0> p22 = c9392a.f305811b;
            boolean z13 = p22 instanceof P2.c;
            Group group = this.f305925k;
            l lVar = this.f305923i;
            if (z13) {
                lVar.k(null);
                D6.g(group);
                h();
                bottomSheetBehavior.b(4);
                return;
            }
            if (p22 instanceof P2.a) {
                lVar.a(z.k(((P2.a) p22).f318719a));
                D6.g(group);
                bottomSheetBehavior.b(3);
                return;
            }
            if (p22 instanceof P2.b) {
                g.a.C9392a.C9393a c9393a = c9392a.f305810a;
                if (c9393a == null) {
                    lVar.a(z.k(new P2.a(new ApiError.UnknownError("", null, null, 6, null)).f318719a));
                    D6.g(group);
                    bottomSheetBehavior.b(3);
                    return;
                }
                e eVar2 = new e(this);
                this.f305933s = c9393a.f305812a;
                this.f305934t = c9393a.f305814c;
                this.f305935u = c9393a.f305816e;
                io.reactivex.rxjava3.subjects.e eVarA = com.avito.android.universal_map.map.util.d.a(new g(this, eVar2));
                for (C42829l0 c42829l0 : C42745f0.U(new C42829l0(this.f305926l, this.f305930p, c9393a.f305813b), new C42829l0(this.f305927m, this.f305931q, c9393a.f305815d), new C42829l0(this.f305929o, this.f305932r, c9393a.f305817f))) {
                    RecyclerView recyclerView = (RecyclerView) c42829l0.f406871b;
                    AbstractC25658a abstractC25658a = (AbstractC25658a) c42829l0.f406872c;
                    List list = (List) c42829l0.f406873d;
                    RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
                    if (itemAnimator != null) {
                        itemAnimator.m(new com.avito.android.universal_map.map.point_info.h(abstractC25658a, list, eVarA, 1));
                    }
                }
            }
        }
    }

    public final void h() {
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f305930p.m(c42784z0);
        this.f305931q.m(c42784z0);
        this.f305932r.m(c42784z0);
        this.f305933s = null;
        this.f305934t = null;
        this.f305935u = null;
        View view = this.f305915a;
        view.invalidate();
        view.requestLayout();
    }

    @Override // com.avito.android.universal_map.map.point_info.g
    public final boolean isVisible() {
        return this.f305936v.f355975L != 5;
    }
}
