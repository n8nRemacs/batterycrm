package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import io.reactivex.rxjava3.internal.operators.observable.C;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BasicIndicatorsTabView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/g;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f317412a;

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f317413b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f317414c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f317415d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C f317416e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f317417f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c f317418g;

    public g(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f317412a = aVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_tab_stats);
        this.f317413b = recyclerView;
        this.f317414c = (ConstraintLayout) view.findViewById(R.id.cl_stats_error);
        recyclerView.setAdapter(jVar);
        recyclerView.setItemAnimator(null);
        View viewFindViewById = view.findViewById(R.id.fl_tab_stats);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById, R.id.rv_tab_stats, interfaceC28373a, 0, 0, 24, null);
        this.f317415d = lVar;
        this.f317416e = lVar.e();
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f317417f = cVar;
        this.f317418g = cVar;
    }
}
