package com.avito.android.extended_profile_universal_widget_edit.create;

import Y41.l;
import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetCreateArguments;
import com.avito.android.lib.design.nav_bar.NavBar;
import fB.C40272a;
import hB.InterfaceC40798a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalWidgetCreateView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/create/e;", "Lcom/avito/android/extended_profile_universal_widget_edit/create/d;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f153718a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f153719b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f153720c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l<InterfaceC40798a, G0> f153721d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f153722e;

    /* compiled from: UniversalWidgetCreateView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            e.this.f153721d.invoke(InterfaceC40798a.C11245a.f397092a);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k View view, @k ScreenPerformanceTracker screenPerformanceTracker, @k com.avito.konveyor.adapter.d dVar, @k UniversalWidgetCreateArguments universalWidgetCreateArguments, @k l<? super InterfaceC40798a, G0> lVar) {
        this.f153718a = view;
        this.f153719b = screenPerformanceTracker;
        this.f153720c = dVar;
        this.f153721d = lVar;
        View viewFindViewById = view.findViewById(R.id.extended_profile_universal_widget_create_nav_bar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        NavBar navBar = (NavBar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_universal_widget_create_recycler);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.extended_profile_universal_widget_create_progress);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f153722e = viewFindViewById3;
        navBar.c(R.attr.ic_close24, new a());
        String str = universalWidgetCreateArguments.f153647b;
        NavBar.e(navBar, str == null ? "" : str, R.attr.textH50, 4);
        recyclerView.setItemAnimator(null);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(2, 1));
        recyclerView.setAdapter(dVar);
        recyclerView.l(new C40272a(), -1);
    }
}
