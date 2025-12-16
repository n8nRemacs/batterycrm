package com.avito.android.map.view.adverts_in_pin;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bY.InterfaceC25585b;
import com.avito.android.R;
import com.avito.android.floating_views.FloatingViewsPresenter;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tab_bar.TabBarLayout;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalColorKt;
import com.avito.android.serp.adapter.skeleton.ScrollUnpredictiveGridLayoutManager;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35976x4;
import com.avito.android.util.D6;
import com.avito.android.util.V2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import fY.InterfaceC40372a;
import io.reactivex.rxjava3.internal.operators.observable.C;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.rx3.y;
import sK0.C48063a;
import z80.InterfaceC50396b;

/* compiled from: AdvertsInPinView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/map/view/adverts_in_pin/f;", "Lcom/avito/android/map/view/adverts_in_pin/a;", "a", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements com.avito.android.map.view.adverts_in_pin.a {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f185384z = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f185385b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map.view.adverts_in_pin.b f185386c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.retry.a f185387d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40372a f185388e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final GridLayoutManager.c f185389f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.floating_views.f f185390g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.utils.a f185391h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.pinch_to_zoom.b f185392i;

    /* renamed from: j, reason: collision with root package name */
    public View f185393j;

    /* renamed from: k, reason: collision with root package name */
    public Y41.l<? super InterfaceC25585b, G0> f185394k;

    /* renamed from: l, reason: collision with root package name */
    public FrameLayout f185395l;

    /* renamed from: m, reason: collision with root package name */
    public RecyclerView f185396m;

    /* renamed from: n, reason: collision with root package name */
    public Button f185397n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC42726C<ScrollUnpredictiveGridLayoutManager> f185398o;

    /* renamed from: p, reason: collision with root package name */
    public BottomSheetBehavior<View> f185399p;

    /* renamed from: q, reason: collision with root package name */
    public View f185400q;

    /* renamed from: r, reason: collision with root package name */
    public com.avito.android.floating_views.h f185401r;

    /* renamed from: s, reason: collision with root package name */
    public Object f185402s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.view.pin_items.j f185403t = new com.avito.android.map_core.view.pin_items.j(null, 1, null);

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.view.pin_items.c f185404u = new com.avito.android.map_core.view.pin_items.c();

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final b f185405v = new b();

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final kotlin.ranges.f<Float> f185406w = s.m(0.5f, 1.0f);

    /* renamed from: x, reason: collision with root package name */
    public final int f185407x;

    /* renamed from: y, reason: collision with root package name */
    public final int f185408y;

    /* compiled from: AdvertsInPinView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/map/view/adverts_in_pin/f$a;", "", "<init>", "()V", "", "SCROLL_TO_TOP_FADE_IN_DURATION", "J", "SCROLL_TO_TOP_FADE_OUT_DURATION", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AdvertsInPinView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/map/view/adverts_in_pin/f$b", "Lz80/b;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC50396b {
        public b() {
        }

        @Override // z80.InterfaceC50396b
        public final void a(@Y61.l ImageView imageView) {
            f fVar = f.this;
            BottomSheetBehavior<View> bottomSheetBehavior = fVar.f185399p;
            if (bottomSheetBehavior == null) {
                bottomSheetBehavior = null;
            }
            bottomSheetBehavior.f355974K = false;
            InterfaceC42726C<ScrollUnpredictiveGridLayoutManager> interfaceC42726C = fVar.f185398o;
            (interfaceC42726C != null ? interfaceC42726C : null).getValue().f272230O = false;
        }

        @Override // z80.InterfaceC50396b
        public final void b(@Y61.l ImageView imageView) {
            f fVar = f.this;
            BottomSheetBehavior<View> bottomSheetBehavior = fVar.f185399p;
            if (bottomSheetBehavior == null) {
                bottomSheetBehavior = null;
            }
            bottomSheetBehavior.f355974K = true;
            InterfaceC42726C<ScrollUnpredictiveGridLayoutManager> interfaceC42726C = fVar.f185398o;
            (interfaceC42726C != null ? interfaceC42726C : null).getValue().f272230O = true;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public f(@com.avito.android.map.di.a @Y61.k com.avito.konveyor.adapter.j jVar, @com.avito.android.map.di.a @Y61.k com.avito.android.map.view.adverts_in_pin.b bVar, @com.avito.android.map.di.a @Y61.k com.avito.android.serp.adapter.retry.a aVar, @Y61.k InterfaceC40372a interfaceC40372a, @com.avito.android.map.di.a @Y61.k GridLayoutManager.c cVar, @Y61.k com.avito.android.floating_views.f fVar, @Y61.k @com.avito.android.map.di.b com.avito.android.map_core.utils.a aVar2, @Y61.k com.avito.android.pinch_to_zoom.b bVar2, @Y61.k Resources resources) {
        this.f185385b = jVar;
        this.f185386c = bVar;
        this.f185387d = aVar;
        this.f185388e = interfaceC40372a;
        this.f185389f = cVar;
        this.f185390g = fVar;
        this.f185391h = aVar2;
        this.f185392i = bVar2;
        this.f185407x = resources.getDimensionPixelSize(R.dimen.search_map_pin_items_scroll_to_top_button_margin);
        this.f185408y = resources.getDimensionPixelSize(R.dimen.search_map_pin_items_scroll_to_top_button_corner_radius);
    }

    @Override // com.avito.android.favorite.s, com.avito.android.advert.viewed.j, com.avito.android.serp.adapter.closable.e
    public final void C3(int i12) {
        try {
            try {
                RecyclerView recyclerView = this.f185396m;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                C35976x4.c(i12, recyclerView);
            } catch (Throwable unused) {
                this.f185385b.notifyItemChanged(i12);
            }
        } catch (Throwable th2) {
            V2.f318762a.f(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v48, types: [kotlin.C] */
    /* JADX WARN: Type inference failed for: r9v64 */
    /* JADX WARN: Type inference failed for: r9v77 */
    @Override // com.avito.android.map.view.adverts_in_pin.a
    public final void Iz(@Y61.k View view, @Y61.k Y41.l<? super InterfaceC25585b, G0> lVar) {
        this.f185393j = view;
        this.f185394k = lVar;
        View viewFindViewById = view.findViewById(R.id.pin_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f185395l = (FrameLayout) viewFindViewById;
        View view2 = this.f185393j;
        if (view2 == null) {
            view2 = null;
        }
        View viewFindViewById2 = view2.findViewById(R.id.pin_items);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        TabBarLayout.a.e(TabBarLayout.f180679h, recyclerView, 0, 3);
        this.f185396m = recyclerView;
        View view3 = this.f185393j;
        if (view3 == null) {
            view3 = null;
        }
        View viewFindViewById3 = view3.findViewById(R.id.pin_items_scroll_to_top_arrow);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f185397n = (Button) viewFindViewById3;
        View view4 = this.f185393j;
        if (view4 == null) {
            view4 = null;
        }
        View viewFindViewById4 = view4.findViewById(R.id.back_to_map_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f185400q = viewFindViewById4;
        this.f185398o = C42727D.c(new g(this));
        FrameLayout frameLayout = this.f185395l;
        if (frameLayout == null) {
            frameLayout = null;
        }
        this.f185399p = BottomSheetBehavior.B(frameLayout);
        InterfaceC42726C<ScrollUnpredictiveGridLayoutManager> interfaceC42726C = this.f185398o;
        if (interfaceC42726C == null) {
            interfaceC42726C = null;
        }
        ScrollUnpredictiveGridLayoutManager value = interfaceC42726C.getValue();
        com.avito.android.floating_views.f fVar = this.f185390g;
        this.f185401r = new com.avito.android.floating_views.h(fVar, value);
        this.f185402s = C42727D.b(LazyThreadSafetyMode.f406616d, new i(this));
        this.f185392i.f(this.f185405v);
        Button button = this.f185397n;
        if (button == null) {
            button = null;
        }
        View view5 = this.f185393j;
        if (view5 == null) {
            view5 = null;
        }
        Context context = view5.getContext();
        View view6 = this.f185393j;
        if (view6 == null) {
            view6 = null;
        }
        int iD2 = C35835l0.d(R.attr.constantWhite, view6.getContext());
        View view7 = this.f185393j;
        if (view7 == null) {
            view7 = null;
        }
        UniversalColor universalColorUniversalColorOf = UniversalColorKt.universalColorOf((String) null, iD2, C35835l0.d(R.attr.gray12, view7.getContext()));
        C48063a.f437606a.getClass();
        button.e(this.f185408y, C48063a.e(context, universalColorUniversalColorOf), null);
        Button button2 = this.f185397n;
        if (button2 == null) {
            button2 = null;
        }
        View view8 = this.f185393j;
        if (view8 == null) {
            view8 = null;
        }
        button2.setTextColor(C35835l0.d(R.attr.black, view8.getContext()));
        Button button3 = this.f185397n;
        if (button3 == null) {
            button3 = null;
        }
        final int i12 = 1;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.map.view.adverts_in_pin.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f185383c;

            {
                this.f185383c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view9) {
                switch (i12) {
                    case 0:
                        f fVar2 = this.f185383c;
                        View view10 = fVar2.f185400q;
                        if (view10 == null) {
                            view10 = null;
                        }
                        D6.w(view10);
                        Y41.l<? super InterfaceC25585b, G0> lVar2 = fVar2.f185394k;
                        if (lVar2 == null) {
                            lVar2 = null;
                        }
                        lVar2.invoke(new InterfaceC25585b.C25594j(new FloatingViewsPresenter.Subscriber.b.C4630b(FloatingViewsPresenter.Subscriber.DisplayMode.f158442c, false, true), true));
                        RecyclerView recyclerView2 = fVar2.f185396m;
                        if (recyclerView2 == null) {
                            recyclerView2 = null;
                        }
                        recyclerView2.A0(0);
                        RecyclerView recyclerView3 = fVar2.f185396m;
                        if (recyclerView3 == null) {
                            recyclerView3 = null;
                        }
                        InterfaceC40372a interfaceC40372a = fVar2.f185388e;
                        interfaceC40372a.getClass();
                        recyclerView3.setMinimumHeight(4);
                        BottomSheetBehavior<View> bottomSheetBehavior = fVar2.f185399p;
                        if (bottomSheetBehavior == null) {
                            bottomSheetBehavior = null;
                        }
                        View view11 = fVar2.f185393j;
                        if (view11 == null) {
                            view11 = null;
                        }
                        bottomSheetBehavior.N(interfaceC40372a.e(C35835l0.g(view11.getContext()).y, false), false);
                        BottomSheetBehavior<View> bottomSheetBehavior2 = fVar2.f185399p;
                        if (bottomSheetBehavior2 == null) {
                            bottomSheetBehavior2 = null;
                        }
                        com.avito.android.map_core.utils.a aVar = fVar2.f185391h;
                        bottomSheetBehavior2.G(aVar);
                        BottomSheetBehavior<View> bottomSheetBehavior3 = fVar2.f185399p;
                        if (bottomSheetBehavior3 == null) {
                            bottomSheetBehavior3 = null;
                        }
                        bottomSheetBehavior3.b(4);
                        BottomSheetBehavior<View> bottomSheetBehavior4 = fVar2.f185399p;
                        (bottomSheetBehavior4 != null ? bottomSheetBehavior4 : null).v(aVar);
                        break;
                    default:
                        Y41.l<? super InterfaceC25585b, G0> lVar3 = this.f185383c.f185394k;
                        if (lVar3 == null) {
                            lVar3 = null;
                        }
                        lVar3.invoke(InterfaceC25585b.A.f57116a);
                        break;
                }
            }
        });
        BottomSheetBehavior<View> bottomSheetBehavior = this.f185399p;
        if (bottomSheetBehavior == null) {
            bottomSheetBehavior = null;
        }
        com.avito.android.lib.util.b.a(bottomSheetBehavior);
        BottomSheetBehavior<View> bottomSheetBehavior2 = this.f185399p;
        if (bottomSheetBehavior2 == null) {
            bottomSheetBehavior2 = null;
        }
        bottomSheetBehavior2.v(this.f185391h);
        BottomSheetBehavior<View> bottomSheetBehavior3 = this.f185399p;
        if (bottomSheetBehavior3 == null) {
            bottomSheetBehavior3 = null;
        }
        bottomSheetBehavior3.N(this.f185388e.c(C35835l0.g(view.getContext()).y), false);
        RecyclerView recyclerView2 = this.f185396m;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setItemAnimator(null);
        RecyclerView recyclerView3 = this.f185396m;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        InterfaceC42726C<ScrollUnpredictiveGridLayoutManager> interfaceC42726C2 = this.f185398o;
        if (interfaceC42726C2 == null) {
            interfaceC42726C2 = null;
        }
        recyclerView3.setLayoutManager(interfaceC42726C2.getValue());
        RecyclerView recyclerView4 = this.f185396m;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        recyclerView4.setMinimumHeight(4);
        RecyclerView recyclerView5 = this.f185396m;
        if (recyclerView5 == null) {
            recyclerView5 = null;
        }
        com.avito.android.floating_views.h hVar = this.f185401r;
        if (hVar == null) {
            hVar = null;
        }
        recyclerView5.o(hVar);
        RecyclerView recyclerView6 = this.f185396m;
        if (recyclerView6 == null) {
            recyclerView6 = null;
        }
        Object obj = this.f185402s;
        ?? r92 = obj;
        if (obj == null) {
            r92 = 0;
        }
        recyclerView6.o((RecyclerView.r) r92.getValue());
        RecyclerView recyclerView7 = this.f185396m;
        RecyclerView recyclerView8 = recyclerView7 == null ? null : recyclerView7;
        if (recyclerView7 == null) {
            recyclerView7 = null;
        }
        recyclerView8.l(new com.avito.android.serp.adapter.rich_snippets.i(recyclerView7.getContext(), true), -1);
        RecyclerView recyclerView9 = this.f185396m;
        RecyclerView recyclerView10 = recyclerView9 == null ? null : recyclerView9;
        if (recyclerView9 == null) {
            recyclerView9 = null;
        }
        recyclerView10.l(new Jr0.c(recyclerView9.getContext()), -1);
        RecyclerView recyclerView11 = this.f185396m;
        if (recyclerView11 == null) {
            recyclerView11 = null;
        }
        recyclerView11.setAdapter(this.f185385b);
        RecyclerView recyclerView12 = this.f185396m;
        if (recyclerView12 == null) {
            recyclerView12 = null;
        }
        FrameLayout frameLayout2 = this.f185395l;
        if (frameLayout2 == null) {
            frameLayout2 = null;
        }
        this.f185404u.a(frameLayout2, recyclerView12);
        InterfaceC42726C<ScrollUnpredictiveGridLayoutManager> interfaceC42726C3 = this.f185398o;
        if (interfaceC42726C3 == null) {
            interfaceC42726C3 = null;
        }
        interfaceC42726C3.getValue().o2(1);
        InterfaceC42726C<ScrollUnpredictiveGridLayoutManager> interfaceC42726C4 = this.f185398o;
        if (interfaceC42726C4 == null) {
            interfaceC42726C4 = null;
        }
        interfaceC42726C4.getValue().f53667M = this.f185389f;
        a(false);
        fVar.d(true);
        View view9 = this.f185400q;
        final int i13 = 0;
        (view9 != null ? view9 : null).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.map.view.adverts_in_pin.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f f185383c;

            {
                this.f185383c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view92) {
                switch (i13) {
                    case 0:
                        f fVar2 = this.f185383c;
                        View view10 = fVar2.f185400q;
                        if (view10 == null) {
                            view10 = null;
                        }
                        D6.w(view10);
                        Y41.l<? super InterfaceC25585b, G0> lVar2 = fVar2.f185394k;
                        if (lVar2 == null) {
                            lVar2 = null;
                        }
                        lVar2.invoke(new InterfaceC25585b.C25594j(new FloatingViewsPresenter.Subscriber.b.C4630b(FloatingViewsPresenter.Subscriber.DisplayMode.f158442c, false, true), true));
                        RecyclerView recyclerView22 = fVar2.f185396m;
                        if (recyclerView22 == null) {
                            recyclerView22 = null;
                        }
                        recyclerView22.A0(0);
                        RecyclerView recyclerView32 = fVar2.f185396m;
                        if (recyclerView32 == null) {
                            recyclerView32 = null;
                        }
                        InterfaceC40372a interfaceC40372a = fVar2.f185388e;
                        interfaceC40372a.getClass();
                        recyclerView32.setMinimumHeight(4);
                        BottomSheetBehavior<View> bottomSheetBehavior4 = fVar2.f185399p;
                        if (bottomSheetBehavior4 == null) {
                            bottomSheetBehavior4 = null;
                        }
                        View view11 = fVar2.f185393j;
                        if (view11 == null) {
                            view11 = null;
                        }
                        bottomSheetBehavior4.N(interfaceC40372a.e(C35835l0.g(view11.getContext()).y, false), false);
                        BottomSheetBehavior<View> bottomSheetBehavior22 = fVar2.f185399p;
                        if (bottomSheetBehavior22 == null) {
                            bottomSheetBehavior22 = null;
                        }
                        com.avito.android.map_core.utils.a aVar = fVar2.f185391h;
                        bottomSheetBehavior22.G(aVar);
                        BottomSheetBehavior<View> bottomSheetBehavior32 = fVar2.f185399p;
                        if (bottomSheetBehavior32 == null) {
                            bottomSheetBehavior32 = null;
                        }
                        bottomSheetBehavior32.b(4);
                        BottomSheetBehavior<View> bottomSheetBehavior42 = fVar2.f185399p;
                        (bottomSheetBehavior42 != null ? bottomSheetBehavior42 : null).v(aVar);
                        break;
                    default:
                        Y41.l<? super InterfaceC25585b, G0> lVar3 = this.f185383c.f185394k;
                        if (lVar3 == null) {
                            lVar3 = null;
                        }
                        lVar3.invoke(InterfaceC25585b.A.f57116a);
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.map.view.adverts_in_pin.a
    public final void Us() {
        RecyclerView recyclerView = this.f185396m;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.F0(0);
    }

    public final void a(boolean z12) {
        View view = this.f185400q;
        if (view == null) {
            view = null;
        }
        D6.w(view);
    }

    @Override // com.avito.android.map.view.adverts_in_pin.a
    @Y61.k
    public final kotlinx.coroutines.flow.internal.m ba() {
        com.avito.android.serp.adapter.retry.a aVar = this.f185387d;
        j jVar = new j(y.a(aVar.pS()), this);
        k kVar = new k(y.a(aVar.iT()), this);
        com.avito.android.map_core.utils.a aVar2 = this.f185391h;
        l lVar = new l(y.a(aVar2.a()), this);
        m mVar = new m(y.a(aVar2.f185685b), this);
        RecyclerView recyclerView = this.f185396m;
        if (recyclerView == null) {
            recyclerView = null;
        }
        InterfaceC42726C<ScrollUnpredictiveGridLayoutManager> interfaceC42726C = this.f185398o;
        ScrollUnpredictiveGridLayoutManager value = (interfaceC42726C != null ? interfaceC42726C : null).getValue();
        com.avito.android.map_core.view.pin_items.j jVar2 = this.f185403t;
        jVar2.getClass();
        return C43175k.N(jVar, kVar, lVar, mVar, new n(y.a(new C(new FX0.b(value, recyclerView, jVar2, 11))), this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.map.view.adverts_in_pin.a
    public final void destroy() {
        RecyclerView recyclerView = this.f185396m;
        if (recyclerView == null) {
            recyclerView = null;
        }
        com.avito.android.floating_views.h hVar = this.f185401r;
        if (hVar == null) {
            hVar = null;
        }
        recyclerView.v0(hVar);
        RecyclerView recyclerView2 = this.f185396m;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        Object obj = this.f185402s;
        recyclerView2.v0((RecyclerView.r) (obj != 0 ? obj : null).getValue());
        this.f185392i.g(this.f185405v);
    }

    @Override // com.avito.android.floating_views.FloatingViewsPresenter.Subscriber
    public final void l(@Y61.k FloatingViewsPresenter.Subscriber.b bVar) {
        Y41.l<? super InterfaceC25585b, G0> lVar = this.f185394k;
        if (lVar == null) {
            return;
        }
        lVar.invoke(new InterfaceC25585b.C25594j(bVar, false, 2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094  */
    @Override // com.avito.android.map.view.adverts_in_pin.a
    @android.annotation.SuppressLint({"NotifyDataSetChanged"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void st(@Y61.l com.avito.android.map.mvi.entity.b.a r23, @Y61.k com.avito.android.map.mvi.entity.b.a r24) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.map.view.adverts_in_pin.f.st(com.avito.android.map.mvi.entity.b$a, com.avito.android.map.mvi.entity.b$a):void");
    }

    @Override // com.avito.android.floating_views.FloatingViewsPresenter.Subscriber
    public final void i(boolean z12) {
    }
}
