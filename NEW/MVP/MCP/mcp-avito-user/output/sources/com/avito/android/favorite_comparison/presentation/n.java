package com.avito.android.favorite_comparison.presentation;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tab_bar.TabBarLayout;
import com.avito.android.util.C35835l0;
import com.avito.android.util.InterfaceC35745a5;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FavoriteComparisonView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_comparison/presentation/n;", "Lcom/avito/android/favorite_comparison/presentation/g;", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f155345a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final o f155346b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f155347c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f155348d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f155349e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f155350f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f155351g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Button f155352h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f155353i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f155354j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f155355k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f155356l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f155357m;

    public n(@Y61.k View view, @Y61.k com.avito.konveyor.a aVar, @Y61.k o oVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f155345a = view;
        this.f155346b = oVar;
        this.f155347c = interfaceC35745a5;
        View viewFindViewById = view.findViewById(R.id.comparison_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        TabBarLayout.a aVar2 = TabBarLayout.f180679h;
        TabBarLayout.a.e(aVar2, recyclerView, 0, 3);
        this.f155348d = recyclerView;
        View viewFindViewById2 = view.findViewById(R.id.swipe_refresh_layout);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById2;
        this.f155349e = swipeRefreshLayout;
        View viewFindViewById3 = view.findViewById(R.id.content_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.empty_state_layout);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        TabBarLayout.a.e(aVar2, viewFindViewById4, 0, 3);
        this.f155350f = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.stub_description);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f155351g = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.stub_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f155352h = (Button) viewFindViewById6;
        com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
        this.f155353i = hVar;
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(hVar, aVar);
        this.f155354j = jVar;
        int i12 = 0;
        InterfaceC28373a interfaceC28373a = null;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(frameLayout, i12, interfaceC28373a, 0, 0, 30, null);
        this.f155355k = lVar;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(jVar);
        int[] iArrA = com.avito.android.lib.deprecated_design.c.a(swipeRefreshLayout.getContext(), false);
        swipeRefreshLayout.setColorSchemeColors(Arrays.copyOf(iArrA, iArrA.length));
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(C35835l0.d(R.attr.white, swipeRefreshLayout.getContext()));
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(this, 18));
        lVar.f231600j = new h(this);
    }
}
