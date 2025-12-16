package com.avito.android.universal_map.map_mvi.point_filters;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC25658a;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.point.Point;
import com.avito.android.lib.design.tooltip.o;
import com.avito.android.lib.design.tooltip.p;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.publish.screen.objects.view.actions.h;
import com.avito.android.tariff_lf.edit_info.item.button.i;
import com.avito.android.universal_map.map.mvi.entity.b;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import dj.InterfaceC39736a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import qG0.C47293d;
import rG0.AbstractC47541a;

/* compiled from: UniversalMapPinFiltersMviView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map_mvi/point_filters/d;", "Lcom/avito/android/universal_map/map_mvi/point_filters/b;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements com.avito.android.universal_map.map_mvi.point_filters.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f306249a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC25659b f306250b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC39736a f306251c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.universal_map.map.tracker.c f306252d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f306253e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final l<AbstractC47541a, G0> f306254f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ViewGroup f306255g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.progress_overlay.l f306256h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ViewGroup f306257i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final View f306258j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final RecyclerView f306259k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final RecyclerView f306260l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final RecyclerView f306261m;

    /* renamed from: n, reason: collision with root package name */
    public final Button f306262n;

    /* renamed from: o, reason: collision with root package name */
    public final Point f306263o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public String f306264p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public String f306265q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public String f306266r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final AbstractC25658a<? extends RecyclerView.C> f306267s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final AbstractC25658a<? extends RecyclerView.C> f306268t;

    /* renamed from: u, reason: collision with root package name */
    @k
    public final AbstractC25658a<? extends RecyclerView.C> f306269u;

    /* renamed from: v, reason: collision with root package name */
    @k
    public final BottomSheetBehavior<ViewGroup> f306270v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f306271w;

    /* renamed from: x, reason: collision with root package name */
    @k
    public final h f306272x;

    /* compiled from: UniversalMapPinFiltersMviView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            d.this.f306254f.invoke(AbstractC47541a.AbstractC12359a.d.f429675a);
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalMapPinFiltersMviView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<o, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C47293d f306274l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C47293d c47293d) {
            super(1);
            this.f306274l = c47293d;
        }

        @Override // Y41.l
        public final G0 invoke(o oVar) {
            o oVar2 = oVar;
            C47293d c47293d = this.f306274l;
            oVar2.i(c47293d.f429147a);
            oVar2.b(c47293d.f429148b);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k View view, @k InterfaceC25659b interfaceC25659b, @k InterfaceC39736a interfaceC39736a, @k com.avito.android.universal_map.map.tracker.c cVar, boolean z12, @k l<? super AbstractC47541a, G0> lVar) throws Resources.NotFoundException {
        this.f306249a = view;
        this.f306250b = interfaceC25659b;
        this.f306251c = interfaceC39736a;
        this.f306252d = cVar;
        this.f306253e = z12;
        this.f306254f = lVar;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bottom_sheet_beduin_pins_filter);
        this.f306255g = viewGroup;
        View viewFindViewById = view.findViewById(R.id.universal_map_pin_filters_beduin_overlay_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.progress_overlay.l lVar2 = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById, 0, null, 0, 0, 30, null);
        this.f306256h = lVar2;
        this.f306257i = (ViewGroup) view.findViewById(R.id.universal_map_pin_filters_beduin_overlay_container);
        this.f306258j = view.findViewById(R.id.universal_map_pin_filters_beduin_content_container);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.universal_map_pin_filters_beduin_top_list);
        this.f306259k = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.universal_map_pin_filters_beduin_main_list);
        this.f306260l = recyclerView2;
        RecyclerView recyclerView3 = (RecyclerView) view.findViewById(R.id.universal_map_pin_filters_beduin_bottom_list);
        this.f306261m = recyclerView3;
        Button button = (Button) view.findViewById(R.id.universal_map_filter_button);
        this.f306262n = button;
        Point point = (Point) view.findViewById(R.id.universal_map_filter_indicator);
        this.f306263o = point;
        AbstractC25658a<? extends RecyclerView.C> abstractC25658aA = a();
        this.f306267s = abstractC25658aA;
        AbstractC25658a<? extends RecyclerView.C> abstractC25658aA2 = a();
        this.f306268t = abstractC25658aA2;
        AbstractC25658a<? extends RecyclerView.C> abstractC25658aA3 = a();
        this.f306269u = abstractC25658aA3;
        this.f306270v = BottomSheetBehavior.B(viewGroup);
        this.f306272x = new h(this, 28);
        if (!z12) {
            D6.w(button);
            D6.w(point);
            D6.w(viewGroup);
            return;
        }
        lVar2.f231600j = new a();
        lVar2.i();
        lVar2.g();
        for (Q q12 : C42745f0.U(new Q(recyclerView, abstractC25658aA), new Q(recyclerView2, abstractC25658aA2), new Q(recyclerView3, abstractC25658aA3))) {
            RecyclerView recyclerView4 = (RecyclerView) q12.f406619b;
            AbstractC25658a abstractC25658a = (AbstractC25658a) q12.f406620c;
            abstractC25658a.o(this.f306251c);
            this.f306249a.getContext();
            recyclerView4.setLayoutManager(new LinearLayoutManager());
            recyclerView4.setAdapter(abstractC25658a);
        }
        this.f306252d.b(recyclerView2);
        e eVar = new e(this);
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.f306270v;
        bottomSheetBehavior.I(eVar);
        com.avito.android.lib.util.b.a(bottomSheetBehavior);
        ViewGroup viewGroup2 = this.f306255g;
        ConstraintLayout constraintLayout = viewGroup2 instanceof ConstraintLayout ? (ConstraintLayout) viewGroup2 : null;
        if (constraintLayout != null) {
            int id2 = this.f306260l.getId();
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.g(constraintLayout);
            dVar.p(id2).f44269e.f44315b0 = (int) (C35835l0.g(this.f306249a.getContext()).y * 0.5d);
            dVar.c(constraintLayout);
        }
        Button button2 = this.f306262n;
        Drawable drawableH = C35835l0.h(R.attr.ic_filter20, button2.getContext());
        if (drawableH != null) {
            button2.setImageDrawable(drawableH);
            D6.G(button2, true);
            button2.setOnClickListener(new i(this, 19));
        }
        D6.G(this.f306255g, true);
    }

    public final AbstractC25658a<? extends RecyclerView.C> a() {
        return this.f306250b.b(Integer.valueOf(this.f306249a.getContext().getResources().getDimensionPixelSize(R.dimen.universal_map_horizontal_margin)));
    }

    public final void b(@k com.avito.android.universal_map.map.mvi.entity.b bVar) {
        if (this.f306253e) {
            D6.G(this.f306263o, bVar.f305558a);
            b.a aVar = bVar.f305561d;
            if (aVar instanceof b.a.C9379a) {
                final b.a.C9379a c9379a = (b.a.C9379a) aVar;
                final io.reactivex.rxjava3.subjects.e eVarA = com.avito.android.universal_map.map.util.d.a(new f(this));
                RecyclerView.j itemAnimator = this.f306259k.getItemAnimator();
                if (itemAnimator != null) {
                    final int i12 = 0;
                    itemAnimator.m(new RecyclerView.j.b(this) { // from class: com.avito.android.universal_map.map_mvi.point_filters.c

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ d f306246b;

                        {
                            this.f306246b = this;
                        }

                        @Override // androidx.recyclerview.widget.RecyclerView.j.b
                        public final void a() {
                            switch (i12) {
                                case 0:
                                    this.f306246b.f306267s.l(c9379a.f305565d, new com.avito.android.universal_map.map.point_info.i(eVarA, 3));
                                    break;
                                case 1:
                                    this.f306246b.f306268t.l(c9379a.f305566e, new com.avito.android.universal_map.map.point_info.i(eVarA, 4));
                                    break;
                                default:
                                    this.f306246b.f306269u.l(c9379a.f305567f, new com.avito.android.universal_map.map.point_info.i(eVarA, 2));
                                    break;
                            }
                        }
                    });
                }
                RecyclerView.j itemAnimator2 = this.f306260l.getItemAnimator();
                if (itemAnimator2 != null) {
                    final int i13 = 1;
                    itemAnimator2.m(new RecyclerView.j.b(this) { // from class: com.avito.android.universal_map.map_mvi.point_filters.c

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ d f306246b;

                        {
                            this.f306246b = this;
                        }

                        @Override // androidx.recyclerview.widget.RecyclerView.j.b
                        public final void a() {
                            switch (i13) {
                                case 0:
                                    this.f306246b.f306267s.l(c9379a.f305565d, new com.avito.android.universal_map.map.point_info.i(eVarA, 3));
                                    break;
                                case 1:
                                    this.f306246b.f306268t.l(c9379a.f305566e, new com.avito.android.universal_map.map.point_info.i(eVarA, 4));
                                    break;
                                default:
                                    this.f306246b.f306269u.l(c9379a.f305567f, new com.avito.android.universal_map.map.point_info.i(eVarA, 2));
                                    break;
                            }
                        }
                    });
                }
                RecyclerView.j itemAnimator3 = this.f306261m.getItemAnimator();
                if (itemAnimator3 != null) {
                    final int i14 = 2;
                    itemAnimator3.m(new RecyclerView.j.b(this) { // from class: com.avito.android.universal_map.map_mvi.point_filters.c

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ d f306246b;

                        {
                            this.f306246b = this;
                        }

                        @Override // androidx.recyclerview.widget.RecyclerView.j.b
                        public final void a() {
                            switch (i14) {
                                case 0:
                                    this.f306246b.f306267s.l(c9379a.f305565d, new com.avito.android.universal_map.map.point_info.i(eVarA, 3));
                                    break;
                                case 1:
                                    this.f306246b.f306268t.l(c9379a.f305566e, new com.avito.android.universal_map.map.point_info.i(eVarA, 4));
                                    break;
                                default:
                                    this.f306246b.f306269u.l(c9379a.f305567f, new com.avito.android.universal_map.map.point_info.i(eVarA, 2));
                                    break;
                            }
                        }
                    });
                }
                this.f306264p = c9379a.f305562a;
                this.f306265q = c9379a.f305563b;
                this.f306266r = c9379a.f305564c;
                return;
            }
            boolean z12 = aVar instanceof b.a.C9380b;
            com.avito.android.progress_overlay.l lVar = this.f306256h;
            View view = this.f306258j;
            ViewGroup viewGroup = this.f306257i;
            if (z12) {
                viewGroup.setMinimumHeight(0);
                lVar.a(z.k(((b.a.C9380b) aVar).f305569a));
                D6.g(view);
                return;
            }
            boolean z13 = aVar instanceof b.a.c;
            BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.f306270v;
            if (z13) {
                com.avito.android.lib.util.b.a(bottomSheetBehavior);
                return;
            }
            if (L.f(aVar, b.a.d.f305571a)) {
                viewGroup.setMinimumHeight(this.f306255g.getMeasuredHeight());
                lVar.k(null);
                D6.g(view);
                c();
                bottomSheetBehavior.b(4);
            }
        }
    }

    public final void c() {
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f306267s.m(c42784z0);
        this.f306268t.m(c42784z0);
        this.f306269u.m(c42784z0);
        this.f306264p = null;
        this.f306265q = null;
        this.f306266r = null;
        View view = this.f306249a;
        view.invalidate();
        view.requestLayout();
    }

    public final void d(@k C47293d c47293d) {
        h hVar = this.f306272x;
        Button button = this.f306262n;
        button.removeCallbacks(hVar);
        com.avito.android.lib.design.tooltip.k kVar = this.f306271w;
        if (kVar != null) {
            kVar.dismiss();
        }
        this.f306271w = null;
        com.avito.android.lib.design.tooltip.k kVar2 = new com.avito.android.lib.design.tooltip.k(button.getContext(), 0, 0, 6, null);
        kVar2.f181224j = new r.b(null, 1, null);
        p.a(kVar2, new b(c47293d));
        this.f306271w = kVar2;
        button.postDelayed(hVar, c47293d.f429149c);
    }
}
