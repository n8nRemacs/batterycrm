package com.avito.android.notifications_settings.screen;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.design.nav_bar.NavBar;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NotificationSettingsViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/notifications_settings/screen/c;", "", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f208052a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f208053b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f208054c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f208055d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final NavBar f208056e;

    public c(@Y61.k View view, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.konveyor.a aVar, @Y61.k com.avito.konveyor.adapter.a aVar2) {
        this.f208052a = aVar2;
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar2, aVar);
        this.f208053b = jVar;
        View viewFindViewById = view.findViewById(R.id.container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f208054c = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById, R.id.content, interfaceC28373a, 0, 0, 24, null);
        View viewFindViewById2 = view.findViewById(R.id.content);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f208055d = recyclerView;
        View viewFindViewById3 = view.findViewById(R.id.nc_settings_nav_bar);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        NavBar navBar = (NavBar) viewFindViewById3;
        this.f208056e = navBar;
        recyclerView.setAdapter(jVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        NavBar.e(navBar, navBar.getResources().getString(R.string.notifications_settings), R.attr.textH5, 4);
    }
}
