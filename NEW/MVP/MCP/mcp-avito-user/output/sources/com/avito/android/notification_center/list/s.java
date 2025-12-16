package com.avito.android.notification_center.list;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.util.C35835l0;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: NotificationCenterListView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notification_center/list/s;", "Lcom/avito/android/notification_center/list/p;", "_avito_notification-center_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class s implements p {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f207723b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f207724c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.ui.adapter.r<com.avito.konveyor.adapter.b> f207725d;

    /* renamed from: e, reason: collision with root package name */
    public final View f207726e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f207727f;

    /* renamed from: g, reason: collision with root package name */
    public final RecyclerView f207728g;

    /* renamed from: h, reason: collision with root package name */
    public final SwipeRefreshLayout f207729h;

    /* renamed from: i, reason: collision with root package name */
    public final NavBar f207730i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f207731j;

    public s(@Y61.k View view, @Y61.k com.avito.konveyor.a aVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.konveyor.adapter.a aVar2, @Y61.k Y41.a<G0> aVar3) {
        this.f207723b = aVar2;
        this.f207724c = aVar3;
        com.avito.android.ui.adapter.r<com.avito.konveyor.adapter.b> rVar = new com.avito.android.ui.adapter.r<>(new com.avito.konveyor.adapter.j(aVar2, aVar), this, false);
        this.f207725d = rVar;
        this.f207726e = view.findViewById(R.id.empty);
        this.f207727f = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.content_holder), R.id.swipe_refresh_layout, interfaceC28373a, 0, 0, 24, null);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f207728g = recyclerView;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);
        this.f207729h = swipeRefreshLayout;
        NavBar navBar = (NavBar) view.findViewById(R.id.nc_nav_bar);
        this.f207730i = navBar;
        rVar.setHasStableIds(true);
        recyclerView.setAdapter(rVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        int[] iArrA = com.avito.android.lib.deprecated_design.c.a(view.getContext(), false);
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(C35835l0.d(R.attr.white, view.getContext()));
        swipeRefreshLayout.setColorSchemeColors(Arrays.copyOf(iArrA, iArrA.length));
        NavBar.e(navBar, navBar.getResources().getString(R.string.notification_center), R.attr.textH5, 4);
    }

    @Override // com.avito.android.ui.adapter.f
    /* renamed from: gk, reason: from getter */
    public final boolean getF207731j() {
        return this.f207731j;
    }

    @Override // com.avito.android.ui.adapter.f
    public final void rp() {
        this.f207724c.invoke();
    }
}
