package com.avito.android.profile.user_profile;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C22984Q;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.design.tab_bar.TabBarLayout;
import com.avito.android.profile.logout_view.ProfileLogoutView;
import com.avito.android.util.C35739a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import j.InterfaceC42150f;
import j.InterfaceC42165v;
import j.L;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UserProfileView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/D;", "LM81/b;", "a", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class D implements M81.b {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f224198b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final UserProfileFragment f224199c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final w f224200d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f224201e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f224202f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ M81.c f224203g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f224204h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f224205i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_ui_components.l f224206j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f224207k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final View f224208l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final View f224209m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.user_profile.header.b f224210n;

    /* compiled from: UserProfileView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/D$a;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: UserProfileView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile.user_profile.D$a$a, reason: collision with other inner class name */
        public static final class C6790a {
        }
    }

    public D() {
        throw null;
    }

    public D(View view, UserProfileFragment userProfileFragment, w wVar, com.avito.konveyor.adapter.d dVar, ScreenPerformanceTracker screenPerformanceTracker, InterfaceC43160i interfaceC43160i, InterfaceC43160i interfaceC43160i2, com.avito.android.profile.user_profile.cards.o oVar, boolean z12, int i12, C42822w c42822w) {
        boolean z13 = (i12 & 256) != 0 ? view.getContext().getResources().getBoolean(R.bool.profile_concealable_toolbar_shadow) : z12;
        this.f224198b = view;
        this.f224199c = userProfileFragment;
        this.f224200d = wVar;
        this.f224201e = dVar;
        this.f224202f = screenPerformanceTracker;
        View viewFindViewById = view.findViewById(R.id.recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        M81.c cVar = new M81.c(view, viewFindViewById, z13);
        this.f224203g = cVar;
        Context context = view.getContext();
        View viewFindViewById2 = view.findViewById(R.id.recycler_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f224204h = (ViewGroup) viewFindViewById2;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.user_profile_swipe_refresh);
        this.f224205i = swipeRefreshLayout;
        this.f224206j = new com.avito.android.extended_profile_ui_components.l(new F(this), view);
        View viewFindViewById3 = view.findViewById(R.id.recycler);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        TabBarLayout.a.e(TabBarLayout.f180679h, recyclerView, 0, 3);
        this.f224207k = recyclerView;
        View viewFindViewById4 = view.findViewById(R.id.logout_progress);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f224208l = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.profile_logout_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f224209m = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.profile_logout_view);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.profile.logout_view.ProfileLogoutView");
        }
        ProfileLogoutView profileLogoutView = (ProfileLogoutView) viewFindViewById6;
        C35739a.f318787a.getClass();
        TypedValue typedValue = new TypedValue();
        int iComplexToDimensionPixelSize = context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true) ? TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()) : 0;
        this.f224210n = new com.avito.android.profile.user_profile.header.b(this, new E(this), oVar, C22984Q.a(userProfileFragment.getViewLifecycleOwner()));
        if (!z13) {
            View viewFindViewById7 = view.findViewById(R.id.shadow);
            if (viewFindViewById7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            D6.H(viewFindViewById7);
        }
        C43175k.K(new C43197r1(new y(this, null), kotlinx.coroutines.rx3.y.a(cVar.f10413b)), C22984Q.a(userProfileFragment.getViewLifecycleOwner()));
        C43175k.K(new C43197r1(new z(this, null), interfaceC43160i), C22984Q.a(userProfileFragment.getViewLifecycleOwner()));
        C43175k.K(new C43197r1(new A(this, null), interfaceC43160i2), C22984Q.a(userProfileFragment.getViewLifecycleOwner()));
        profileLogoutView.setLoginButtonClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(this, 2));
        recyclerView.setAdapter(dVar);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        swipeRefreshLayout.setColorSchemeColors(C35835l0.d(R.attr.blue, context), C35835l0.d(R.attr.violet, context), C35835l0.d(R.attr.green, context), C35835l0.d(R.attr.red, context));
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(C35835l0.d(R.attr.white, context));
        swipeRefreshLayout.g(iComplexToDimensionPixelSize, iComplexToDimensionPixelSize * 2, true);
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.offlinization.ui.a(this, 7));
        com.avito.android.analytics.screens.mvi.a.g(userProfileFragment, screenPerformanceTracker, wVar, new B(1, this, D.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileOneTimeEvent;)V", 0), new C(1, this, D.class, "render", "render(Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileState;)V", 0));
    }

    public final void a(@Y61.l Drawable drawable) {
        this.f224203g.f10415d.setNavigationIcon((Drawable) null);
    }

    public final void b(@Y61.l CharSequence charSequence) {
        this.f224203g.f10415d.setTitle(charSequence);
    }

    public final void c(List<? extends TV0.a> list) {
        this.f224201e.l(list, null);
        D6.H(this.f224204h);
        D6.w(this.f224209m);
        this.f224206j.a();
        D6.w(this.f224208l);
        this.f224205i.setRefreshing(false);
    }

    @Override // M81.b
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Integer> e5() {
        return this.f224203g.f10413b;
    }

    @Override // M81.b
    public final void f5(@Y61.k Y41.a<G0> aVar) {
        this.f224203g.f5(aVar);
    }

    @Override // M81.b
    public final void g5(@InterfaceC42165v int i12, @InterfaceC42150f @Y61.l Integer num) {
        this.f224203g.g5(i12, num);
    }

    @Override // M81.b
    public final void h5(@InterfaceC42150f int i12) {
        this.f224203g.h5(R.attr.blue600);
    }

    @Override // M81.b
    public final void setMenu(@L int i12) {
        this.f224203g.setMenu(R.menu.extend_profile_menu);
    }
}
