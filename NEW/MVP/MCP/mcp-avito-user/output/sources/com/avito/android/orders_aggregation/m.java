package com.avito.android.orders_aggregation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.view.C22981N;
import androidx.view.InterfaceC22983P;
import androidx.view.N0;
import com.avito.android.B2;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.deprecated_design.tab.TabPagerAdapter;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.lib.design.tab_group.layout.d;
import com.avito.android.orders_aggregation.x;
import com.avito.android.ui.SafeViewPager;
import com.avito.android.util.C35835l0;
import com.avito.android.util.K2;
import com.avito.android.util.P5;
import com.google.android.material.appbar.MaterialToolbar;
import e50.C39953b;
import i50.AbstractC41226a;
import java.util.List;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import ru.avito.component.appbar.ActionMenu;

/* compiled from: OrdersAggregationView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/orders_aggregation/m;", "", "a", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f210268a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final t f210269b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22983P f210270c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.tab.adapter.j<AbstractC41226a> f210271d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final B2 f210272e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final OrdersAggregationTabShownStatusStorage f210273f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f210274g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f210275h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final MaterialToolbar f210276i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TabGroup f210277j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final SafeViewPager f210278k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C42670a f210279l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final View f210280m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final Input f210281n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final View f210282o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public List<? extends AbstractC41226a> f210283p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final b f210284q;

    /* compiled from: OrdersAggregationView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/orders_aggregation/m$a;", "", "<init>", "()V", "", "searchOrdersMenuItemIndex", "I", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: OrdersAggregationView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/orders_aggregation/m$b", "Lcom/avito/android/lib/design/tab_group/layout/b;", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.lib.design.tab_group.layout.b {
        public b() {
        }

        @Override // com.avito.android.lib.design.tab_group.layout.b
        public final void a(@Y61.l d.c cVar) {
            if (cVar != null) {
                int i12 = cVar.f180792b;
                t tVar = m.this.f210269b;
                x value = tVar.f210328R.getValue();
                x.b bVar = value instanceof x.b ? (x.b) value : null;
                if (bVar == null) {
                    return;
                }
                List<AbstractC41226a> list = bVar.f210367c;
                if (list.size() > i12) {
                    tVar.f210322L.c(new C39953b(list.get(i12).f398359d));
                    tVar.f210327Q.setValue(x.b.a(bVar, i12, null, false, 61));
                }
            }
        }
    }

    /* compiled from: OrdersAggregationView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<View> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return m.this.f210278k;
        }
    }

    static {
        new a(null);
    }

    public m(@Y61.k View view, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k t tVar, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k TabPagerAdapter tabPagerAdapter, @Y61.k com.avito.android.lib.deprecated_design.tab.adapter.j<AbstractC41226a> jVar, @Y61.k B2 b22, @Y61.k OrdersAggregationTabShownStatusStorage ordersAggregationTabShownStatusStorage, @Y61.k Y41.a<G0> aVar) {
        this.f210268a = screenPerformanceTracker;
        this.f210269b = tVar;
        this.f210270c = interfaceC22983P;
        this.f210271d = jVar;
        this.f210272e = b22;
        this.f210273f = ordersAggregationTabShownStatusStorage;
        this.f210274g = aVar;
        Context context = view.getContext();
        this.f210275h = context;
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.MaterialToolbar");
        }
        MaterialToolbar materialToolbar = (MaterialToolbar) viewFindViewById;
        this.f210276i = materialToolbar;
        View viewFindViewById2 = view.findViewById(R.id.orders_root_tabs);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.tab_group.TabGroup");
        }
        TabGroup tabGroup = (TabGroup) viewFindViewById2;
        this.f210277j = tabGroup;
        View viewFindViewById3 = view.findViewById(R.id.orders_root_view_pager);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.ui.SafeViewPager");
        }
        SafeViewPager safeViewPager = (SafeViewPager) viewFindViewById3;
        this.f210278k = safeViewPager;
        View viewFindViewById4 = view.findViewById(R.id.orders_root_overlay);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        C42670a c42670a = new C42670a((ViewGroup) viewFindViewById4, new c(), 0, 4, null);
        this.f210279l = c42670a;
        View viewFindViewById5 = view.findViewById(R.id.search_group);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f210280m = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.search_orders_input);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById6;
        this.f210281n = input;
        View viewFindViewById7 = view.findViewById(R.id.cancel_search);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f210282o = viewFindViewById7;
        this.f210284q = new b();
        safeViewPager.setPagingEnabled(false);
        b22.getClass();
        kotlin.reflect.n<Object> nVar = B2.f67184X[43];
        if (!((Boolean) b22.f67200P.a().invoke()).booleanValue()) {
            tabGroup.setVisibility(8);
        }
        safeViewPager.setAdapter(tabPagerAdapter);
        materialToolbar.setNavigationIcon(C35835l0.h(R.attr.ic_arrowBack24, context));
        Drawable navigationIcon = materialToolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setTint(C35835l0.d(R.attr.black, context));
        }
        final int i12 = 2;
        materialToolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.orders_aggregation.k

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f210266c;

            {
                this.f210266c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        t tVar2 = this.f210266c.f210269b;
                        x value = tVar2.f210328R.getValue();
                        x.a aVar2 = value instanceof x.a ? (x.a) value : null;
                        String str = aVar2 != null ? aVar2.f210364b : null;
                        ScreenPerformanceTracker.a.b(tVar2.f210324N, null, 3);
                        C43259k.d(N0.a(tVar2), null, null, new u(tVar2, str, null), 3);
                        break;
                    case 1:
                        m mVar = this.f210266c;
                        t tVar3 = mVar.f210269b;
                        x value2 = tVar3.f210328R.getValue();
                        x.b bVar = value2 instanceof x.b ? (x.b) value2 : null;
                        if (bVar != null) {
                            tVar3.f210327Q.setValue(x.b.a(bVar, 0, "", false, 39));
                        }
                        K2.d(mVar.f210281n, true);
                        break;
                    default:
                        this.f210266c.f210274g.invoke();
                        break;
                }
            }
        });
        P5.a(materialToolbar, R.id.search_button_id, new ActionMenu(context.getString(R.string.search_menu_title), 2, Integer.valueOf(R.drawable.ic_search_24), Integer.valueOf(R.attr.black), null, 16, null));
        MenuItem item = materialToolbar.getMenu().getItem(0);
        item.setVisible(false);
        com.avito.android.ui.d.a(item, new MenuItem.OnMenuItemClickListener() { // from class: com.avito.android.orders_aggregation.l
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                t tVar2 = this.f210267b.f210269b;
                x value = tVar2.f210328R.getValue();
                x.b bVar = value instanceof x.b ? (x.b) value : null;
                if (bVar != null) {
                    tVar2.f210327Q.setValue(x.b.a(bVar, 0, null, true, 47));
                }
                return true;
            }
        });
        final int i13 = 1;
        viewFindViewById7.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.orders_aggregation.k

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f210266c;

            {
                this.f210266c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        t tVar2 = this.f210266c.f210269b;
                        x value = tVar2.f210328R.getValue();
                        x.a aVar2 = value instanceof x.a ? (x.a) value : null;
                        String str = aVar2 != null ? aVar2.f210364b : null;
                        ScreenPerformanceTracker.a.b(tVar2.f210324N, null, 3);
                        C43259k.d(N0.a(tVar2), null, null, new u(tVar2, str, null), 3);
                        break;
                    case 1:
                        m mVar = this.f210266c;
                        t tVar3 = mVar.f210269b;
                        x value2 = tVar3.f210328R.getValue();
                        x.b bVar = value2 instanceof x.b ? (x.b) value2 : null;
                        if (bVar != null) {
                            tVar3.f210327Q.setValue(x.b.a(bVar, 0, "", false, 39));
                        }
                        K2.d(mVar.f210281n, true);
                        break;
                    default:
                        this.f210266c.f210274g.invoke();
                        break;
                }
            }
        });
        com.avito.android.lib.design.input.n.c(input, new p(this));
        C43259k.d(C22981N.a(interfaceC22983P.getLifecycle()), null, null, new q(this, null), 3);
        final int i14 = 0;
        c42670a.a(new View.OnClickListener(this) { // from class: com.avito.android.orders_aggregation.k

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f210266c;

            {
                this.f210266c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        t tVar2 = this.f210266c.f210269b;
                        x value = tVar2.f210328R.getValue();
                        x.a aVar2 = value instanceof x.a ? (x.a) value : null;
                        String str = aVar2 != null ? aVar2.f210364b : null;
                        ScreenPerformanceTracker.a.b(tVar2.f210324N, null, 3);
                        C43259k.d(N0.a(tVar2), null, null, new u(tVar2, str, null), 3);
                        break;
                    case 1:
                        m mVar = this.f210266c;
                        t tVar3 = mVar.f210269b;
                        x value2 = tVar3.f210328R.getValue();
                        x.b bVar = value2 instanceof x.b ? (x.b) value2 : null;
                        if (bVar != null) {
                            tVar3.f210327Q.setValue(x.b.a(bVar, 0, "", false, 39));
                        }
                        K2.d(mVar.f210281n, true);
                        break;
                    default:
                        this.f210266c.f210274g.invoke();
                        break;
                }
            }
        });
        C43259k.d(C22981N.a(interfaceC22983P.getLifecycle()), null, null, new n(this, tVar, null), 3);
    }
}
