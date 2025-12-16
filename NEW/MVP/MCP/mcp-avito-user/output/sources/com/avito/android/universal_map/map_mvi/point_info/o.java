package com.avito.android.universal_map.map_mvi.point_info;

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
import com.avito.android.remote.model.Overlay;
import com.avito.android.universal_map.UniversalMapParams;
import com.avito.android.universal_map.map.mvi.entity.c;
import com.avito.android.universal_map.map_mvi.UniversalMapFragmentMvi;
import com.avito.android.util.D6;
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
import rG0.AbstractC47541a;

/* compiled from: UniversalMapPointInfoViewMviV2Impl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map_mvi/point_info/o;", "Lcom/avito/android/universal_map/map_mvi/point_info/b;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f306325a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25659b f306326b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39736a f306327c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f306328d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.map.tracker.c f306329e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final UniversalMapParams.PointInfoBottomSheetSettings f306330f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.l<AbstractC47541a, G0> f306331g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f306332h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final FloatingActionButton f306333i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f306334j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f306335k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Group f306336l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f306337m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f306338n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final ShadowFrameLayout f306339o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f306340p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final AbstractC25658a<? extends RecyclerView.C> f306341q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final AbstractC25658a<? extends RecyclerView.C> f306342r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final AbstractC25658a<? extends RecyclerView.C> f306343s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public String f306344t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public String f306345u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public String f306346v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final BottomSheetBehavior<ViewGroup> f306347w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final h f306348x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.overlay.e f306349y;

    /* JADX WARN: Multi-variable type inference failed */
    public o(@Y61.k View view, @Y61.k InterfaceC25659b interfaceC25659b, @Y61.k InterfaceC39736a interfaceC39736a, @Y61.k com.avito.android.util.text.a aVar, @Y61.k UniversalMapFragmentMvi universalMapFragmentMvi, @Y61.k com.avito.android.universal_map.map.tracker.c cVar, @Y61.k UniversalMapParams.PointInfoBottomSheetSettings pointInfoBottomSheetSettings, @Y61.k Y41.l lVar) {
        this.f306325a = view;
        this.f306326b = interfaceC25659b;
        this.f306327c = interfaceC39736a;
        this.f306328d = aVar;
        this.f306329e = cVar;
        this.f306330f = pointInfoBottomSheetSettings;
        this.f306331g = lVar;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bottom_sheet_beduin_point_info_v2);
        this.f306332h = viewGroup;
        this.f306333i = (FloatingActionButton) view.findViewById(R.id.find_me_button);
        View viewFindViewById = view.findViewById(R.id.universal_map_point_info_v2_beduin_overlay_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.progress_overlay.l lVar2 = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById, 0, null, 0, 0, 30, null);
        this.f306334j = lVar2;
        this.f306335k = (ViewGroup) view.findViewById(R.id.universal_map_point_info_v2_beduin_overlay_container);
        this.f306336l = (Group) view.findViewById(R.id.universal_map_point_info_v2_beduin_content_container);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.universal_map_point_info_v2_beduin_top_list);
        this.f306337m = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.universal_map_point_info_v2_beduin_main_list);
        this.f306338n = recyclerView2;
        this.f306339o = (ShadowFrameLayout) view.findViewById(R.id.universal_map_point_info_v2_beduin_bottom_list_container);
        RecyclerView recyclerView3 = (RecyclerView) view.findViewById(R.id.universal_map_point_info_v2_beduin_bottom_list);
        this.f306340p = recyclerView3;
        com.avito.android.beduin.common.component.adapter.a aVarI = com.avito.android.bxcontent.mvi.entity.f.i(24, interfaceC25659b);
        this.f306341q = aVarI;
        com.avito.android.beduin.common.component.adapter.a aVarI2 = com.avito.android.bxcontent.mvi.entity.f.i(24, interfaceC25659b);
        this.f306342r = aVarI2;
        com.avito.android.beduin.common.component.adapter.a aVarI3 = com.avito.android.bxcontent.mvi.entity.f.i(24, interfaceC25659b);
        this.f306343s = aVarI3;
        BottomSheetBehavior<ViewGroup> bottomSheetBehaviorB = BottomSheetBehavior.B(viewGroup);
        this.f306347w = bottomSheetBehaviorB;
        this.f306348x = new h(viewGroup, recyclerView, recyclerView2, bottomSheetBehaviorB);
        this.f306349y = new com.avito.android.map_core.overlay.e(universalMapFragmentMvi, view.findViewById(R.id.vs_overlay_container), C42745f0.U(new com.avito.android.map_core.overlay.b(aVar, false), new com.avito.android.map_core.overlay.a(aVar, false, false)));
        lVar2.f231600j = new i(this);
        for (Q q12 : C42745f0.U(new Q(recyclerView, aVarI), new Q(recyclerView2, aVarI2), new Q(recyclerView3, aVarI3))) {
            RecyclerView recyclerView4 = (RecyclerView) q12.f406619b;
            AbstractC25658a abstractC25658a = (AbstractC25658a) q12.f406620c;
            abstractC25658a.o(this.f306327c);
            this.f306325a.getContext();
            recyclerView4.setLayoutManager(new LinearLayoutManager());
            recyclerView4.setAdapter(abstractC25658a);
        }
        this.f306329e.b(recyclerView2);
        j jVar = new j(this);
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.f306347w;
        bottomSheetBehavior.I(jVar);
        com.avito.android.lib.util.b.a(bottomSheetBehavior);
        D6.l(true, this.f306325a, new k(this));
    }

    public static final void e(o oVar, View view, boolean z12) {
        if (!z12) {
            oVar.getClass();
        } else {
            D6.c(oVar.f306339o, null, Integer.valueOf((int) ((oVar.f306325a.getHeight() - view.getY()) - oVar.f306339o.getMeasuredHeight())), null, null, 13);
        }
    }

    @Override // com.avito.android.universal_map.map_mvi.point_info.b
    public final int a() {
        return this.f306347w.E();
    }

    @Override // com.avito.android.universal_map.map_mvi.point_info.b
    public final void b() {
        D6.G(this.f306332h, true);
    }

    @Override // com.avito.android.universal_map.map_mvi.point_info.b
    @Y61.k
    public final LinkedHashMap c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.f306344t;
        if (str != null) {
        }
        String str2 = this.f306345u;
        if (str2 != null) {
        }
        String str3 = this.f306346v;
        if (str3 != null) {
            linkedHashMap.put(str3, this.f306340p);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.universal_map.map_mvi.point_info.b
    public final void d(@Y61.k c.a aVar) {
        boolean z12 = aVar instanceof c.a.C9382c;
        G0 g02 = null;
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.f306347w;
        if (z12) {
            com.avito.android.lib.util.b.a(bottomSheetBehavior);
            Overlay overlay = ((c.a.C9382c) aVar).f305583a;
            com.avito.android.map_core.overlay.e eVar = this.f306349y;
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
        boolean z13 = aVar instanceof c.a.d;
        com.avito.android.progress_overlay.l lVar = this.f306334j;
        Group group = this.f306336l;
        if (z13) {
            lVar.k(null);
            D6.g(group);
            f();
            bottomSheetBehavior.b(4);
            return;
        }
        if (aVar instanceof c.a.b) {
            lVar.a(z.k(((c.a.b) aVar).f305582a));
            D6.g(group);
            bottomSheetBehavior.b(3);
            return;
        }
        if (aVar instanceof c.a.C9381a) {
            c.a.C9381a c9381a = (c.a.C9381a) aVar;
            l lVar2 = new l(this);
            this.f306344t = c9381a.f305576a;
            this.f306345u = c9381a.f305577b;
            this.f306346v = c9381a.f305578c;
            io.reactivex.rxjava3.subjects.e eVarA = com.avito.android.universal_map.map.util.d.a(new n(this, lVar2));
            for (C42829l0 c42829l0 : C42745f0.U(new C42829l0(this.f306337m, this.f306341q, c9381a.f305579d), new C42829l0(this.f306338n, this.f306342r, c9381a.f305580e), new C42829l0(this.f306340p, this.f306343s, c9381a.f305581f))) {
                RecyclerView recyclerView = (RecyclerView) c42829l0.f406871b;
                AbstractC25658a abstractC25658a = (AbstractC25658a) c42829l0.f406872c;
                List list = (List) c42829l0.f406873d;
                RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.m(new com.avito.android.universal_map.map.point_info.h(abstractC25658a, list, eVarA, 2));
                }
            }
        }
    }

    public final void f() {
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f306341q.m(c42784z0);
        this.f306342r.m(c42784z0);
        this.f306343s.m(c42784z0);
        this.f306344t = null;
        this.f306345u = null;
        this.f306346v = null;
        View view = this.f306325a;
        view.invalidate();
        view.requestLayout();
    }

    @Override // com.avito.android.universal_map.map_mvi.point_info.b
    public final boolean isVisible() {
        return this.f306347w.f355975L != 5;
    }

    @Override // com.avito.android.universal_map.map_mvi.point_info.b
    public final void k2() {
        this.f306347w.b(4);
    }
}
