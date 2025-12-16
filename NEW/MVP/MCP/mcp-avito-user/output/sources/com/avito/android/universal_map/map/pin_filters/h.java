package com.avito.android.universal_map.map.pin_filters;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC25658a;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import dj.InterfaceC39736a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalMapPinFiltersView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/pin_filters/h;", "Lcom/avito/android/universal_map/map/pin_filters/g;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f305727a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25659b f305728b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39736a f305729c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.map.tracker.c f305730d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f305731e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f305732f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f305733g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f305734h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final AbstractC25658a<? extends RecyclerView.C> f305735i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final AbstractC25658a<? extends RecyclerView.C> f305736j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final AbstractC25658a<? extends RecyclerView.C> f305737k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final BottomSheetBehavior<ViewGroup> f305738l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f305739m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f305740n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f305741o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f305742p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f305743q;

    /* compiled from: UniversalMapPinFiltersView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c cVar = h.this.f305739m;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@Y61.k View view, @Y61.k InterfaceC25659b interfaceC25659b, @Y61.k InterfaceC39736a interfaceC39736a, @Y61.k com.avito.android.universal_map.map.tracker.c cVar) throws Resources.NotFoundException {
        this.f305727a = view;
        this.f305728b = interfaceC25659b;
        this.f305729c = interfaceC39736a;
        this.f305730d = cVar;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bottom_sheet_beduin_pins_filter);
        this.f305731e = viewGroup;
        View viewFindViewById = view.findViewById(R.id.universal_map_pin_filters_beduin_overlay_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById, 0, null, 0, 0, 30, null);
        this.f305732f = lVar;
        this.f305733g = view.findViewById(R.id.universal_map_pin_filters_beduin_content_container);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.universal_map_pin_filters_beduin_top_list);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.universal_map_pin_filters_beduin_main_list);
        this.f305734h = recyclerView2;
        RecyclerView recyclerView3 = (RecyclerView) view.findViewById(R.id.universal_map_pin_filters_beduin_bottom_list);
        AbstractC25658a<? extends RecyclerView.C> abstractC25658aA = a();
        this.f305735i = abstractC25658aA;
        AbstractC25658a<? extends RecyclerView.C> abstractC25658aA2 = a();
        this.f305736j = abstractC25658aA2;
        AbstractC25658a<? extends RecyclerView.C> abstractC25658aA3 = a();
        this.f305737k = abstractC25658aA3;
        this.f305738l = BottomSheetBehavior.B(viewGroup);
        com.jakewharton.rxrelay3.c cVar2 = new com.jakewharton.rxrelay3.c();
        this.f305739m = cVar2;
        com.jakewharton.rxrelay3.c cVar3 = new com.jakewharton.rxrelay3.c();
        this.f305740n = cVar3;
        this.f305741o = cVar2;
        this.f305742p = cVar3;
        this.f305743q = true;
        lVar.f231600j = new a();
        lVar.i();
        lVar.g();
        for (Q q12 : C42745f0.U(new Q(recyclerView, abstractC25658aA), new Q(recyclerView2, abstractC25658aA2), new Q(recyclerView3, abstractC25658aA3))) {
            RecyclerView recyclerView4 = (RecyclerView) q12.f406619b;
            AbstractC25658a abstractC25658a = (AbstractC25658a) q12.f406620c;
            abstractC25658a.o(this.f305729c);
            this.f305727a.getContext();
            recyclerView4.setLayoutManager(new LinearLayoutManager());
            recyclerView4.setAdapter(abstractC25658a);
        }
        this.f305730d.b(recyclerView2);
        i iVar = new i(this);
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.f305738l;
        bottomSheetBehavior.I(iVar);
        com.avito.android.lib.util.b.a(bottomSheetBehavior);
        ViewGroup viewGroup2 = this.f305731e;
        ConstraintLayout constraintLayout = viewGroup2 instanceof ConstraintLayout ? (ConstraintLayout) viewGroup2 : null;
        if (constraintLayout != null) {
            int id2 = this.f305734h.getId();
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.g(constraintLayout);
            dVar.p(id2).f44269e.f44315b0 = (int) (C35835l0.g(this.f305727a.getContext()).y * 0.5d);
            dVar.c(constraintLayout);
        }
    }

    public final AbstractC25658a<? extends RecyclerView.C> a() {
        return this.f305728b.b(Integer.valueOf(this.f305727a.getContext().getResources().getDimensionPixelSize(R.dimen.universal_map_horizontal_margin)));
    }
}
