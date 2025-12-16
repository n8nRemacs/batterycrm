package com.avito.android.universal_map.map_mvi.point_info;

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
import com.avito.android.universal_map.map.mvi.entity.c;
import com.avito.android.universal_map.map_mvi.UniversalMapFragmentMvi;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import dj.InterfaceC39736a;
import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import rG0.AbstractC47541a;

/* compiled from: UniversalMapPointInfoMviView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map_mvi/point_info/g;", "Lcom/avito/android/universal_map/map_mvi/point_info/b;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f306287a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25659b f306288b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39736a f306289c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f306290d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.map.tracker.c f306291e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.l<AbstractC47541a, G0> f306292f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f306293g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final FloatingActionButton f306294h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f306295i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f306296j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Group f306297k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f306298l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f306299m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f306300n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final AbstractC25658a<? extends RecyclerView.C> f306301o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final AbstractC25658a<? extends RecyclerView.C> f306302p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final AbstractC25658a<? extends RecyclerView.C> f306303q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public String f306304r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public String f306305s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public String f306306t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final BottomSheetBehavior<ViewGroup> f306307u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.overlay.e f306308v;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@Y61.k View view, @Y61.k InterfaceC25659b interfaceC25659b, @Y61.k InterfaceC39736a interfaceC39736a, @Y61.k com.avito.android.util.text.a aVar, @Y61.k UniversalMapFragmentMvi universalMapFragmentMvi, @Y61.k com.avito.android.universal_map.map.tracker.c cVar, @Y61.k Y41.l lVar) throws Resources.NotFoundException {
        this.f306287a = view;
        this.f306288b = interfaceC25659b;
        this.f306289c = interfaceC39736a;
        this.f306290d = aVar;
        this.f306291e = cVar;
        this.f306292f = lVar;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bottom_sheet_beduin_point_info);
        this.f306293g = viewGroup;
        this.f306294h = (FloatingActionButton) view.findViewById(R.id.find_me_button);
        View viewFindViewById = view.findViewById(R.id.universal_map_point_info_beduin_overlay_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.progress_overlay.l lVar2 = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById, 0, null, 0, 0, 30, null);
        this.f306295i = lVar2;
        this.f306296j = (ViewGroup) view.findViewById(R.id.universal_map_point_info_beduin_overlay_container);
        this.f306297k = (Group) view.findViewById(R.id.universal_map_point_info_beduin_content_container);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.universal_map_point_info_beduin_top_list);
        this.f306298l = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.universal_map_point_info_beduin_main_list);
        this.f306299m = recyclerView2;
        RecyclerView recyclerView3 = (RecyclerView) view.findViewById(R.id.universal_map_point_info_beduin_bottom_list);
        this.f306300n = recyclerView3;
        com.avito.android.beduin.common.component.adapter.a aVarI = com.avito.android.bxcontent.mvi.entity.f.i(24, interfaceC25659b);
        this.f306301o = aVarI;
        com.avito.android.beduin.common.component.adapter.a aVarI2 = com.avito.android.bxcontent.mvi.entity.f.i(24, interfaceC25659b);
        this.f306302p = aVarI2;
        com.avito.android.beduin.common.component.adapter.a aVarI3 = com.avito.android.bxcontent.mvi.entity.f.i(24, interfaceC25659b);
        this.f306303q = aVarI3;
        this.f306307u = BottomSheetBehavior.B(viewGroup);
        this.f306308v = new com.avito.android.map_core.overlay.e(universalMapFragmentMvi, view.findViewById(R.id.vs_overlay_container), C42745f0.U(new com.avito.android.map_core.overlay.b(aVar, false), new com.avito.android.map_core.overlay.a(aVar, false, false)));
        lVar2.f231600j = new d(this);
        lVar2.i();
        lVar2.g();
        for (Q q12 : C42745f0.U(new Q(recyclerView, aVarI), new Q(recyclerView2, aVarI2), new Q(recyclerView3, aVarI3))) {
            RecyclerView recyclerView4 = (RecyclerView) q12.f406619b;
            AbstractC25658a abstractC25658a = (AbstractC25658a) q12.f406620c;
            abstractC25658a.o(this.f306289c);
            this.f306287a.getContext();
            recyclerView4.setLayoutManager(new LinearLayoutManager());
            recyclerView4.setAdapter(abstractC25658a);
        }
        this.f306291e.b(recyclerView2);
        e eVar = new e(this);
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.f306307u;
        bottomSheetBehavior.I(eVar);
        int i12 = (int) (C35835l0.g(this.f306287a.getContext()).y * 0.5d);
        com.avito.android.lib.util.b.a(bottomSheetBehavior);
        bottomSheetBehavior.N(i12, false);
        bottomSheetBehavior.f356006l = i12;
        D6.G(this.f306293g, true);
    }

    @Override // com.avito.android.universal_map.map_mvi.point_info.b
    public final int a() {
        return this.f306307u.E();
    }

    @Override // com.avito.android.universal_map.map_mvi.point_info.b
    public final void b() {
        D6.G(this.f306293g, true);
    }

    @Override // com.avito.android.universal_map.map_mvi.point_info.b
    @Y61.k
    public final LinkedHashMap c() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.f306304r;
        if (str != null) {
        }
        String str2 = this.f306305s;
        if (str2 != null) {
        }
        String str3 = this.f306306t;
        if (str3 != null) {
            linkedHashMap.put(str3, this.f306300n);
        }
        return linkedHashMap;
    }

    @Override // com.avito.android.universal_map.map_mvi.point_info.b
    public final void d(@Y61.k c.a aVar) {
        if (aVar instanceof c.a.C9381a) {
            final c.a.C9381a c9381a = (c.a.C9381a) aVar;
            final io.reactivex.rxjava3.subjects.e eVarA = com.avito.android.universal_map.map.util.d.a(new f(this));
            RecyclerView.j itemAnimator = this.f306298l.getItemAnimator();
            if (itemAnimator != null) {
                final int i12 = 0;
                itemAnimator.m(new RecyclerView.j.b(this) { // from class: com.avito.android.universal_map.map_mvi.point_info.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f306281b;

                    {
                        this.f306281b = this;
                    }

                    @Override // androidx.recyclerview.widget.RecyclerView.j.b
                    public final void a() {
                        switch (i12) {
                            case 0:
                                this.f306281b.f306301o.l(c9381a.f305579d, new com.avito.android.universal_map.map.point_info.i(eVarA, 5));
                                break;
                            case 1:
                                this.f306281b.f306302p.l(c9381a.f305580e, new com.avito.android.universal_map.map.point_info.i(eVarA, 7));
                                break;
                            default:
                                this.f306281b.f306303q.l(c9381a.f305581f, new com.avito.android.universal_map.map.point_info.i(eVarA, 6));
                                break;
                        }
                    }
                });
            }
            RecyclerView.j itemAnimator2 = this.f306299m.getItemAnimator();
            if (itemAnimator2 != null) {
                final int i13 = 1;
                itemAnimator2.m(new RecyclerView.j.b(this) { // from class: com.avito.android.universal_map.map_mvi.point_info.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f306281b;

                    {
                        this.f306281b = this;
                    }

                    @Override // androidx.recyclerview.widget.RecyclerView.j.b
                    public final void a() {
                        switch (i13) {
                            case 0:
                                this.f306281b.f306301o.l(c9381a.f305579d, new com.avito.android.universal_map.map.point_info.i(eVarA, 5));
                                break;
                            case 1:
                                this.f306281b.f306302p.l(c9381a.f305580e, new com.avito.android.universal_map.map.point_info.i(eVarA, 7));
                                break;
                            default:
                                this.f306281b.f306303q.l(c9381a.f305581f, new com.avito.android.universal_map.map.point_info.i(eVarA, 6));
                                break;
                        }
                    }
                });
            }
            RecyclerView.j itemAnimator3 = this.f306300n.getItemAnimator();
            if (itemAnimator3 != null) {
                final int i14 = 2;
                itemAnimator3.m(new RecyclerView.j.b(this) { // from class: com.avito.android.universal_map.map_mvi.point_info.c

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ g f306281b;

                    {
                        this.f306281b = this;
                    }

                    @Override // androidx.recyclerview.widget.RecyclerView.j.b
                    public final void a() {
                        switch (i14) {
                            case 0:
                                this.f306281b.f306301o.l(c9381a.f305579d, new com.avito.android.universal_map.map.point_info.i(eVarA, 5));
                                break;
                            case 1:
                                this.f306281b.f306302p.l(c9381a.f305580e, new com.avito.android.universal_map.map.point_info.i(eVarA, 7));
                                break;
                            default:
                                this.f306281b.f306303q.l(c9381a.f305581f, new com.avito.android.universal_map.map.point_info.i(eVarA, 6));
                                break;
                        }
                    }
                });
            }
            this.f306304r = c9381a.f305576a;
            this.f306305s = c9381a.f305577b;
            this.f306306t = c9381a.f305578c;
            return;
        }
        boolean z12 = aVar instanceof c.a.b;
        com.avito.android.progress_overlay.l lVar = this.f306295i;
        Group group = this.f306297k;
        ViewGroup viewGroup = this.f306296j;
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.f306307u;
        if (z12) {
            viewGroup.setMinimumHeight(0);
            lVar.a(z.k(((c.a.b) aVar).f305582a));
            D6.g(group);
            bottomSheetBehavior.b(4);
            return;
        }
        boolean z13 = aVar instanceof c.a.C9382c;
        G0 g02 = null;
        com.avito.android.map_core.overlay.e eVar = this.f306308v;
        if (!z13) {
            if (aVar.equals(c.a.d.f305584a)) {
                D6.w(eVar.f185676b);
                viewGroup.setMinimumHeight(this.f306293g.getMeasuredHeight());
                lVar.k(null);
                D6.g(group);
                e();
                bottomSheetBehavior.b(4);
                return;
            }
            return;
        }
        com.avito.android.lib.util.b.a(bottomSheetBehavior);
        Overlay overlay = ((c.a.C9382c) aVar).f305583a;
        if (overlay != null) {
            eVar.a(overlay);
            D6.H(eVar.f185676b);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            D6.w(eVar.f185676b);
        }
    }

    public final void e() {
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f306301o.m(c42784z0);
        this.f306302p.m(c42784z0);
        this.f306303q.m(c42784z0);
        this.f306304r = null;
        this.f306305s = null;
        this.f306306t = null;
        View view = this.f306287a;
        view.invalidate();
        view.requestLayout();
    }

    @Override // com.avito.android.universal_map.map_mvi.point_info.b
    public final boolean isVisible() {
        return this.f306307u.f355975L != 5;
    }

    @Override // com.avito.android.universal_map.map_mvi.point_info.b
    public final void k2() {
        this.f306307u.b(4);
    }
}
