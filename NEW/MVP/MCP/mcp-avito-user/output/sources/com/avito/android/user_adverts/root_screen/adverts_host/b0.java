package com.avito.android.user_adverts.root_screen.adverts_host;

import TI0.a;
import TI0.c;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.R;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tab_bar.TabBarLayout;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.lib.design.tab_group.b;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.profile.logout_view.ProfileLogoutView;
import com.avito.android.remote.error.ApiError;
import com.avito.android.user_adverts.root_screen.adverts_host.placeholder.UserAdvertsPlaceholderView;
import com.avito.android.user_adverts.root_screen.adverts_host.scroll_proxy_view.ScrollProxyView;
import com.avito.android.user_adverts.space.UserAdvertsSpace;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import zI0.InterfaceC50474d;
import zq0.AbstractC50612a;

/* compiled from: UserAdvertsHostView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/b0;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/V;", "Landroidx/viewpager/widget/ViewPager$i;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b0 implements V, ViewPager.i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f312376b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FragmentManager f312377c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50474d f312378d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AbstractC50612a f312379e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 f312380f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.tab.adapter.c f312381g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.tab.adapter.j<TabItem> f312382h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final UserAdvertsSpace f312383i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final CoordinatorLayout f312384j;

    /* renamed from: k, reason: collision with root package name */
    public int f312385k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public C35563a f312386l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final AppBarLayout f312387m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final View f312388n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final View f312389o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final ViewPager f312390p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final View f312391q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final UserAdvertsPlaceholderView f312392r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final ProfileLogoutView f312393s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f312394t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final a.C9534a f312395u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final NI0.a f312396v;

    /* renamed from: w, reason: collision with root package name */
    public final Button f312397w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f312398x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.k f312399y;

    /* renamed from: z, reason: collision with root package name */
    public int f312400z;

    /* compiled from: UserAdvertsHostView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/b0$a;", "", "a", "Lcom/avito/android/user_adverts/root_screen/adverts_host/b0$a$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: UserAdvertsHostView.kt */
        @s0
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/b0$a$a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/b0$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.b0$a$a, reason: collision with other inner class name */
        public static final class C9534a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final TabGroup f312401a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final com.avito.android.publish.screen.objects.view.actions.h f312402b = new com.avito.android.publish.screen.objects.view.actions.h(this, 29);

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public com.avito.android.lib.design.tab_group.d f312403c;

            public C9534a(@Y61.k Y41.l<? super Integer, G0> lVar, @Y61.k TabGroup tabGroup) {
                this.f312401a = tabGroup;
                this.f312403c = new com.avito.android.lib.design.tab_group.d(C42784z0.f406748b, -1, lVar);
            }
        }
    }

    public b0(@Y61.k ViewGroup viewGroup, @Y61.k FragmentManager fragmentManager, @Y61.k InterfaceC50474d interfaceC50474d, @Y61.k AbstractC50612a abstractC50612a, @Y61.k com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var, @Y61.k com.avito.android.lib.deprecated_design.tab.adapter.c cVar, @Y61.k com.avito.android.lib.deprecated_design.tab.adapter.j jVar, @Y61.k UserAdvertsSpace userAdvertsSpace, boolean z12) throws Resources.NotFoundException {
        int measuredHeight;
        this.f312376b = viewGroup;
        this.f312377c = fragmentManager;
        this.f312378d = interfaceC50474d;
        this.f312379e = abstractC50612a;
        this.f312380f = e0Var;
        this.f312381g = cVar;
        this.f312382h = jVar;
        this.f312383i = userAdvertsSpace;
        View viewFindViewById = viewGroup.findViewById(R.id.content_holder);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout");
        }
        this.f312384j = (CoordinatorLayout) viewFindViewById;
        this.f312385k = -1;
        this.f312386l = new C35563a(fragmentManager, jVar, userAdvertsSpace);
        View viewFindViewById2 = viewGroup.findViewById(R.id.app_bar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout");
        }
        AppBarLayout appBarLayout = (AppBarLayout) viewFindViewById2;
        this.f312387m = appBarLayout;
        View viewFindViewById3 = viewGroup.findViewById(R.id.toolbar);
        this.f312388n = viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.navbar_offset);
        this.f312389o = viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.scroll_proxy);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.user_adverts.root_screen.adverts_host.scroll_proxy_view.ScrollProxyView");
        }
        ScrollProxyView scrollProxyView = (ScrollProxyView) viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(R.id.pager);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.viewpager.widget.ViewPager");
        }
        ViewPager viewPager = (ViewPager) viewFindViewById6;
        this.f312390p = viewPager;
        View viewFindViewById7 = viewGroup.findViewById(R.id.user_adverts_content_placeholder_container);
        this.f312391q = viewFindViewById7;
        UserAdvertsPlaceholderView userAdvertsPlaceholderView = (UserAdvertsPlaceholderView) viewGroup.findViewById(R.id.user_adverts_content_placeholder);
        this.f312392r = userAdvertsPlaceholderView;
        ProfileLogoutView profileLogoutView = (ProfileLogoutView) viewGroup.findViewById(R.id.profile_logout_view);
        this.f312393s = profileLogoutView;
        View viewFindViewById8 = viewGroup.findViewById(R.id.swipe_refresh_layout);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById8;
        this.f312394t = swipeRefreshLayout;
        TabGroup tabGroup = (TabGroup) viewGroup.findViewById(R.id.tabs_re23);
        this.f312395u = new a.C9534a(new g0(this), tabGroup);
        View viewFindViewById9 = viewGroup.findViewById(R.id.publish_fab_stub_re23);
        TabBarLayout.a.e(TabBarLayout.f180679h, viewFindViewById9, 0, 3);
        viewFindViewById9.setVisibility(0);
        this.f312396v = new NI0.a(new d0(this), viewFindViewById9);
        this.f312397w = (Button) viewGroup.findViewById(R.id.publish_fab_button_secondary_re23);
        this.f312400z = -1;
        userAdvertsPlaceholderView.setRefreshClickListener(new a0(this));
        if (viewFindViewById9.getMeasuredHeight() != 0) {
            measuredHeight = viewFindViewById9.getMeasuredHeight();
        } else {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            viewFindViewById9.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            measuredHeight = viewFindViewById9.getMeasuredHeight();
        }
        viewFindViewById7.setPaddingRelative(viewFindViewById7.getPaddingStart(), viewFindViewById7.getPaddingTop(), viewFindViewById7.getPaddingEnd(), viewFindViewById7.getPaddingBottom() + measuredHeight);
        D6.H(tabGroup);
        viewPager.setAdapter(this.f312386l);
        viewPager.c(this);
        com.avito.android.lib.design.tab_group.layout.i.a(tabGroup, viewPager);
        if (profileLogoutView != null) {
            profileLogoutView.setLoginButtonClickListener(new com.avito.android.tariff_lf.edit_info.item.button.i(this, 29));
        }
        appBarLayout.setStateListAnimator(null);
        viewFindViewById3.setVisibility(z12 ? 0 : 8);
        viewFindViewById4.setVisibility(z12 ? 8 : 0);
        int[] iArrA = com.avito.android.lib.deprecated_design.c.a(swipeRefreshLayout.getContext(), false);
        swipeRefreshLayout.setColorSchemeColors(Arrays.copyOf(iArrA, iArrA.length));
        swipeRefreshLayout.g(swipeRefreshLayout.getProgressViewStartOffset(), swipeRefreshLayout.getProgressViewEndOffset(), false);
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(C35835l0.d(R.attr.white, swipeRefreshLayout.getContext()));
        l0.f fVar = new l0.f();
        final l0.f fVar2 = new l0.f();
        fVar2.f406840b = 1;
        appBarLayout.a(new com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.n(fVar, 5));
        scrollProxyView.setProxyScrollListener(new QI0.a() { // from class: com.avito.android.user_adverts.root_screen.adverts_host.X
            @Override // QI0.a
            public final void a(int i12) {
                fVar2.f406840b = i12;
            }
        });
        swipeRefreshLayout.setOnChildScrollUpCallback(new com.avito.android.gig_shift_action.ui.a(9, fVar, fVar2));
        viewPager.c(new c0(swipeRefreshLayout));
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.str_seller_orders.orders_seller.d(this, 5));
        e(e0Var.getState().getValue().f15561j);
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.V
    public final void a(@Y61.k final String str, @Y61.l final ApiError apiError, final int i12) {
        com.avito.android.lib.design.toast_bar.k kVar = this.f312399y;
        if (kVar != null) {
            kVar.f();
        }
        this.f312399y = null;
        this.f312376b.postDelayed(new Runnable() { // from class: com.avito.android.user_adverts.root_screen.adverts_host.Z
            @Override // java.lang.Runnable
            public final void run() {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                PrintableText printableTextF = com.avito.android.printable_text.b.f(str);
                ApiError apiError2 = apiError;
                com.avito.android.component.toast.f cVar2 = apiError2 != null ? new f.c(apiError2) : f.a.f125253a;
                b0 b0Var = this.f312358b;
                b0Var.f312399y = com.avito.android.component.toast.c.b(cVar, b0Var.f312376b, printableTextF, null, Collections.singletonList(new c.a.C3719a(b0Var.f312376b.getContext().getString(R.string.user_adverts_pending_message_action_text), true, null, e0.f312645l, 4, null)), null, cVar2, i12, null, null, false, false, null, null, 4042);
            }
        }, 0L);
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void b(int i12) {
        this.f312396v.c((3 & 1) != 0, true);
        this.f312380f.accept(new a.j(i12, i12 != this.f312400z));
        this.f312400z = -1;
    }

    public final void d() {
        D6.w(this.f312390p);
        D6.w(this.f312395u.f312401a);
    }

    public final void e(@Y61.k c.b bVar) throws Resources.NotFoundException {
        int i12;
        boolean z12 = bVar instanceof c.b.C1059b;
        UserAdvertsPlaceholderView userAdvertsPlaceholderView = this.f312392r;
        View view = this.f312391q;
        NI0.a aVar = this.f312396v;
        CoordinatorLayout coordinatorLayout = this.f312384j;
        ProfileLogoutView profileLogoutView = this.f312393s;
        SwipeRefreshLayout swipeRefreshLayout = this.f312394t;
        if (z12) {
            view.setVisibility(0);
            userAdvertsPlaceholderView.setAdvertsError(((c.b.C1059b) bVar).f15571a);
            if (profileLogoutView != null) {
                D6.w(profileLogoutView);
            }
            d();
            D6.H(coordinatorLayout);
            aVar.c((3 & 1) != 0, true);
            swipeRefreshLayout.setEnabled(false);
            swipeRefreshLayout.post(new W(swipeRefreshLayout, 0));
            return;
        }
        if (bVar instanceof c.b.C1060c) {
            g();
            return;
        }
        if (bVar instanceof c.b.e) {
            d();
            D6.w(coordinatorLayout);
            if (profileLogoutView != null) {
                D6.H(profileLogoutView);
            }
            aVar.b();
            swipeRefreshLayout.setEnabled(false);
            swipeRefreshLayout.post(new W(swipeRefreshLayout, 2));
            return;
        }
        if (!(bVar instanceof c.b.a)) {
            if (bVar instanceof c.b.d) {
                g();
                return;
            }
            return;
        }
        c.b.a aVar2 = (c.b.a) bVar;
        List<TabItem> list = aVar2.f15569e;
        boolean zIsEmpty = list.isEmpty();
        Button button = this.f312397w;
        a.C9534a c9534a = this.f312395u;
        ViewPager viewPager = this.f312390p;
        int i13 = aVar2.f15568d;
        if (zIsEmpty) {
            view.setVisibility(0);
            userAdvertsPlaceholderView.d();
            viewPager.setAdapter(null);
            com.avito.android.lib.design.tab_group.d dVarA = com.avito.android.lib.design.tab_group.d.a(c9534a.f312403c, C42784z0.f406748b, -1);
            c9534a.f312403c = dVarA;
            c9534a.f312401a.setState(dVarA);
            d();
            D6.H(coordinatorLayout);
            if (profileLogoutView != null) {
                D6.w(profileLogoutView);
            }
            aVar.c(false, false);
            D6.G(button, this.f312398x);
            swipeRefreshLayout.setEnabled(true);
            i12 = i13;
        } else {
            int i14 = this.f312385k;
            boolean z13 = i13 != i14;
            boolean z14 = i14 != -1;
            if (z13) {
                UV0.c<TabItem> cVar = aVar2.f15570f;
                com.avito.android.lib.deprecated_design.tab.adapter.j<TabItem> jVar = this.f312382h;
                jVar.b(cVar);
                com.avito.android.lib.deprecated_design.tab.adapter.c cVar2 = this.f312381g;
                if (z14) {
                    i12 = i13;
                    C35563a c35563a = new C35563a(this.f312377c, jVar, this.f312383i);
                    this.f312386l = c35563a;
                    viewPager.setAdapter(c35563a);
                    cVar2.f178155d.notifyInvalidated();
                } else {
                    i12 = i13;
                }
                this.f312386l.h();
                cVar2.d();
                com.avito.android.publish.screen.objects.view.actions.h hVar = c9534a.f312402b;
                TabGroup tabGroup = c9534a.f312401a;
                tabGroup.post(hVar);
                com.avito.android.lib.design.tab_group.d dVar = c9534a.f312403c;
                List<TabItem> list2 = list;
                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    TabItem tabItem = (TabItem) it.next();
                    Iterator it2 = it;
                    PrintableText printableTextF = com.avito.android.printable_text.b.f(tabItem.f312285b);
                    Integer num = tabItem.f312287d;
                    arrayList.add(new com.avito.android.lib.design.tab_group.b(printableTextF, new b.a.c(num != null ? num.intValue() : 0, null, null, 2, null), false, 4, null));
                    it = it2;
                }
                int i15 = aVar2.f15567c;
                com.avito.android.lib.design.tab_group.d dVarA2 = com.avito.android.lib.design.tab_group.d.a(dVar, arrayList, i15);
                c9534a.f312403c = dVarA2;
                tabGroup.setState(dVarA2);
                if (viewPager.getCurrentItem() != i15) {
                    f(i15);
                }
            } else {
                i12 = i13;
            }
            view.setVisibility(8);
            if (profileLogoutView != null) {
                D6.w(profileLogoutView);
            }
            D6.H(viewPager);
            D6.H(c9534a.f312401a);
            D6.H(coordinatorLayout);
            aVar.c((3 & 1) != 0, true);
            D6.w(button);
            swipeRefreshLayout.setEnabled(true);
        }
        if (aVar2.f15565a) {
            final int i16 = 0;
            swipeRefreshLayout.post(new Runnable(this) { // from class: com.avito.android.user_adverts.root_screen.adverts_host.Y

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b0 f312357c;

                {
                    this.f312357c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i16) {
                        case 0:
                            this.f312357c.f312394t.setRefreshing(true);
                            break;
                        default:
                            this.f312357c.f312394t.setRefreshing(false);
                            break;
                    }
                }
            });
        } else {
            final int i17 = 1;
            swipeRefreshLayout.post(new Runnable(this) { // from class: com.avito.android.user_adverts.root_screen.adverts_host.Y

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b0 f312357c;

                {
                    this.f312357c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i17) {
                        case 0:
                            this.f312357c.f312394t.setRefreshing(true);
                            break;
                        default:
                            this.f312357c.f312394t.setRefreshing(false);
                            break;
                    }
                }
            });
        }
        this.f312385k = i12;
    }

    public final void f(int i12) throws Resources.NotFoundException {
        ViewPager viewPager = this.f312390p;
        androidx.viewpager.widget.a adapter = viewPager.getAdapter();
        if (adapter == null || i12 < 0 || i12 >= adapter.c()) {
            return;
        }
        viewPager.x(i12, false);
    }

    public final void g() {
        this.f312391q.setVisibility(0);
        UserAdvertsPlaceholderView userAdvertsPlaceholderView = this.f312392r;
        userAdvertsPlaceholderView.f313773b.setVisibility(0);
        userAdvertsPlaceholderView.f313774c.setVisibility(8);
        d();
        ProfileLogoutView profileLogoutView = this.f312393s;
        if (profileLogoutView != null) {
            D6.w(profileLogoutView);
        }
        D6.H(this.f312384j);
        this.f312396v.b();
        SwipeRefreshLayout swipeRefreshLayout = this.f312394t;
        swipeRefreshLayout.setEnabled(false);
        swipeRefreshLayout.post(new W(swipeRefreshLayout, 1));
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void c(int i12) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void h(int i12, float f12, int i13) {
    }
}
