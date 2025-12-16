package com.avito.android.search.subscriptions;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.tab_bar.TabBarLayout;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import zo0.InterfaceC50600b;

/* compiled from: SearchSubscriptionView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/subscriptions/w;", "Lcom/avito/android/search/subscriptions/u;", "Lzo0/b;", "_avito_search_subscriptions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class w implements u, InterfaceC50600b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f264022b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final d f264023c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f264024d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f264025e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f264026f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f264027g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f264028h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f264029i;

    public w(@Y61.k View view, @Y61.k d dVar, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.a aVar2, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f264022b = view;
        this.f264023c = dVar;
        this.f264024d = aVar;
        this.f264025e = aVar2;
        View viewFindViewById = view.findViewById(R.id.swipe_refresh_layout);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById;
        this.f264026f = swipeRefreshLayout;
        View viewFindViewById2 = view.findViewById(R.id.empty);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f264027g = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.search_subscription_list);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        TabBarLayout.a.e(TabBarLayout.f180679h, recyclerView, 0, 3);
        this.f264028h = recyclerView;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) view, R.id.content, interfaceC28373a, 0, 0, 24, null);
        this.f264029i = lVar;
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.offlinization.ui.a(this, 18));
        swipeRefreshLayout.setColorSchemeColors(C35835l0.d(R.attr.blue, view.getContext()), C35835l0.d(R.attr.violet, view.getContext()), C35835l0.d(R.attr.green, view.getContext()), C35835l0.d(R.attr.red, view.getContext()));
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(C35835l0.d(R.attr.white, view.getContext()));
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        lVar.f231600j = new v(this);
    }

    public final void a() {
        this.f264029i.a("");
    }

    public final void b() {
        D6.G(this.f264027g, true);
    }

    public final void c(@Y61.k PrintableText printableText, @Y61.k Throwable th2) {
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, this.f264022b, printableText, null, null, null, new f.c(th2), 0, null, null, false, false, null, null, 4078);
    }

    public final void d() {
        this.f264029i.k(null);
    }
}
