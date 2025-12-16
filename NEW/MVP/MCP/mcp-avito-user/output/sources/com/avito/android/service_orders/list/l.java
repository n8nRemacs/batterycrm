package com.avito.android.service_orders.list;

import Ku0.C14352a;
import Mu0.InterfaceC14531a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.lib.design.tab_bar.TabBarLayout;
import com.avito.android.service_orders.di.z;
import com.avito.android.service_orders.list.blueprints.ServiceOrdersListSnippetItem;
import com.avito.android.service_orders.list.blueprints.banner_item.c;
import com.avito.android.service_orders.list.blueprints.calendar_button_item.c;
import com.avito.android.service_orders.list.blueprints.management_panels.c;
import com.avito.android.service_orders.list.blueprints.snippet_item.c;
import com.avito.android.service_orders.list.toolbar.c;
import com.avito.android.util.D6;
import com.google.android.material.appbar.MaterialToolbar;
import i31.InterfaceC41220a;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceOrdersListView.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/service_orders/list/l;", "Lcom/avito/android/service_orders/list/g;", "Landroidx/lifecycle/q;", "Lcom/avito/android/service_orders/list/blueprints/snippet_item/c$a;", "Lcom/avito/android/service_orders/list/blueprints/calendar_button_item/c$a;", "Lcom/avito/android/service_orders/list/blueprints/banner_item/c$a;", "Lcom/avito/android/service_orders/list/blueprints/management_panels/c$a;", "Lcom/avito/android/service_orders/list/toolbar/c$a;", "a", "b", "c", "d", "e", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements g, InterfaceC23057q, c.a, c.a, c.a, c.a, c.a {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f279386r = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f279387b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_orders.mvi.h f279388c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f279389d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f279390e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Set<TV0.d<?, ?>> f279391f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f279392g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f279393h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Ju0.e f279394i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_utils.ux_feedback.a f279395j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_orders.list.toolbar.c f279396k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final d f279397l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final c f279398m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final View f279399n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final b f279400o;

    /* renamed from: p, reason: collision with root package name */
    public final MaterialToolbar f279401p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f279402q;

    /* compiled from: ServiceOrdersListView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_orders/list/l$a;", "", "<init>", "()V", "", "TOOLTIP_DELAY", "J", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ServiceOrdersListView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/list/l$b;", "", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final View f279403a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final SwipeRefreshLayout f279404b;

        public b(@Y61.k l lVar, View view) {
            this.f279403a = view;
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.service_orders_list);
            TabBarLayout.a.e(TabBarLayout.f180679h, recyclerView, 0, 3);
            recyclerView.l(new C14352a(recyclerView.getContext()), -1);
            this.f279404b = (SwipeRefreshLayout) view.findViewById(R.id.service_orders_swipe_to_refresh);
            recyclerView.setAdapter(lVar.f279392g);
        }
    }

    /* compiled from: ServiceOrdersListView.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/list/l$c;", "", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final View f279405a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ListItem f279406b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final TextView f279407c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final TextView f279408d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final SwipeRefreshLayout f279409e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final Button f279410f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.service_orders.list.blueprints.management_panels.j f279411g;

        public c(@Y61.k View view) {
            this.f279405a = view;
            this.f279406b = (ListItem) view.findViewById(R.id.srv_orders_empty_settings_btn);
            this.f279407c = (TextView) view.findViewById(R.id.srv_orders_empty_title);
            this.f279408d = (TextView) view.findViewById(R.id.srv_orders_empty_subtitle);
            this.f279409e = (SwipeRefreshLayout) view.findViewById(R.id.service_orders_empty_swipe_to_refresh);
            this.f279410f = (Button) view.findViewById(R.id.srv_orders_empty_btn);
            View viewFindViewById = view.findViewById(R.id.service_orders_management_panels);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            this.f279411g = new com.avito.android.service_orders.list.blueprints.management_panels.j(viewFindViewById);
        }
    }

    /* compiled from: ServiceOrdersListView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/list/l$d;", "", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final View f279412a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final TextView f279413b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final TextView f279414c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Button f279415d;

        public d(@Y61.k l lVar, View view) {
            this.f279412a = view;
            this.f279413b = (TextView) view.findViewById(R.id.srv_orders_error_title);
            this.f279414c = (TextView) view.findViewById(R.id.srv_orders_error_subtitle);
            Button button = (Button) view.findViewById(R.id.srv_orders_error_btn);
            this.f279415d = button;
            button.setOnClickListener(new k(lVar, 1));
        }
    }

    /* compiled from: ServiceOrdersListView.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_orders/list/l$e;", "", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface e {
        @Y61.k
        l a(@Y61.k View view, @Y61.k com.avito.android.service_orders.mvi.h hVar, @Y61.k ServiceOrdersListFragment serviceOrdersListFragment);
    }

    static {
        new a(null);
    }

    @i31.c
    public l(@InterfaceC41220a @Y61.k View view, @InterfaceC41220a @Y61.k com.avito.android.service_orders.mvi.h hVar, @InterfaceC41220a @Y61.k ServiceOrdersListFragment serviceOrdersListFragment, @z @Y61.k com.avito.konveyor.adapter.a aVar, @z @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k Set set, @Y61.k com.avito.konveyor.adapter.j jVar2, @Y61.k com.avito.konveyor.adapter.a aVar2, @Y61.k Ju0.e eVar, @Y61.k com.avito.android.service_booking_utils.ux_feedback.a aVar3, @Y61.k com.avito.android.service_orders.list.toolbar.c cVar) {
        this.f279387b = view;
        this.f279388c = hVar;
        this.f279389d = aVar;
        this.f279390e = jVar;
        this.f279391f = set;
        this.f279392g = jVar2;
        this.f279393h = aVar2;
        this.f279394i = eVar;
        this.f279395j = aVar3;
        this.f279396k = cVar;
        this.f279397l = new d(this, view.findViewById(R.id.service_orders_error));
        this.f279398m = new c(view.findViewById(R.id.service_orders_list_empty));
        this.f279399n = view.findViewById(R.id.service_orders_list_skeleton);
        this.f279400o = new b(this, view.findViewById(R.id.service_orders_content_root));
        MaterialToolbar materialToolbar = (MaterialToolbar) view.findViewById(R.id.toolbar);
        this.f279401p = materialToolbar;
        View viewFindViewById = view.findViewById(R.id.srv_orders_toolbar_actions);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f279402q = (ViewGroup) view.findViewById(R.id.service_orders_root);
        serviceOrdersListFragment.getLifecycle().a(this);
        D6.H(materialToolbar);
        materialToolbar.setNavigationOnClickListener(new k(this, 0));
        ((RecyclerView) viewFindViewById).setAdapter(jVar);
    }

    public final void a(@Y61.k String str) {
        this.f279388c.accept(new InterfaceC14531a.C0704a(str));
    }

    public final void b(@Y61.k DeepLink deepLink, @Y61.l String str, @Y61.l String str2) {
        this.f279388c.accept(new InterfaceC14531a.h(deepLink, str, str2));
    }

    public final void c(@Y61.l DeepLink deepLink) {
        this.f279388c.accept(new InterfaceC14531a.f(deepLink));
    }

    public final void d(@Y61.l String str, @Y61.k ServiceOrdersListSnippetItem.a aVar) {
        this.f279388c.accept(new InterfaceC14531a.p(str, aVar));
    }

    public final void e(@Y61.l DeepLink deepLink) {
        this.f279388c.accept(new InterfaceC14531a.i(deepLink));
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onStart(@Y61.k InterfaceC22983P interfaceC22983P) {
        Iterator<T> it = this.f279391f.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof com.avito.android.service_orders.list.blueprints.snippet_item.c) {
                ((com.avito.android.service_orders.list.blueprints.snippet_item.c) dVar).Q1(this);
            } else if (dVar instanceof com.avito.android.service_orders.list.blueprints.calendar_button_item.c) {
                ((com.avito.android.service_orders.list.blueprints.calendar_button_item.c) dVar).K1(this);
            } else if (dVar instanceof com.avito.android.service_orders.list.blueprints.banner_item.c) {
                ((com.avito.android.service_orders.list.blueprints.banner_item.c) dVar).t3(this);
            } else if (dVar instanceof com.avito.android.service_orders.list.blueprints.management_panels.c) {
                ((com.avito.android.service_orders.list.blueprints.management_panels.c) dVar).F1(this);
            }
        }
        this.f279396k.w1(this);
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onStop(@Y61.k InterfaceC22983P interfaceC22983P) {
        Iterator<T> it = this.f279391f.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof com.avito.android.service_orders.list.blueprints.snippet_item.c) {
                ((com.avito.android.service_orders.list.blueprints.snippet_item.c) dVar).e();
            } else if (dVar instanceof com.avito.android.service_orders.list.blueprints.calendar_button_item.c) {
                ((com.avito.android.service_orders.list.blueprints.calendar_button_item.c) dVar).e();
            } else if (dVar instanceof com.avito.android.service_orders.list.blueprints.banner_item.c) {
                ((com.avito.android.service_orders.list.blueprints.banner_item.c) dVar).e();
            } else if (dVar instanceof com.avito.android.service_orders.list.blueprints.management_panels.c) {
                ((com.avito.android.service_orders.list.blueprints.management_panels.c) dVar).e();
            }
        }
        this.f279396k.e();
    }
}
