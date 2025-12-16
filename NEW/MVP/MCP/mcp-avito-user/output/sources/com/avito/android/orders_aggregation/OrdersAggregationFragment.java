package com.avito.android.orders_aggregation;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.view.InterfaceC22983P;
import com.avito.android.B2;
import com.avito.android.K;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.lib.deprecated_design.tab.TabPagerAdapter;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.orders_aggregation.OrdersAggregationIntentFactory;
import com.avito.android.orders_aggregation.di.module.b;
import com.avito.android.orders_aggregation.perf.OrdersAggregationScreen;
import com.avito.android.ui.fragments.TabBaseFragment;
import i50.AbstractC41226a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;

/* compiled from: OrdersAggregationFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/orders_aggregation/OrdersAggregationFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/K;", "Lcom/avito/android/orders_aggregation/di/module/b;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OrdersAggregationFragment extends TabBaseFragment implements K<com.avito.android.orders_aggregation.di.module.b>, InterfaceC28477j.b {

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public static final a f210185B0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.l
    public Integer f210186A0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public TabPagerAdapter f210187t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.deprecated_design.tab.adapter.j<AbstractC41226a> f210188u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public t f210189v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f210190w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public B2 f210191x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public OrdersAggregationTabShownStatusStorage f210192y0;

    /* renamed from: z0, reason: collision with root package name */
    public com.avito.android.orders_aggregation.di.module.b f210193z0;

    /* compiled from: OrdersAggregationFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/orders_aggregation/OrdersAggregationFragment$a;", "", "<init>", "()V", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: OrdersAggregationFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.a<G0> {
        @Override // Y41.a
        public final G0 invoke() {
            OrdersAggregationFragment ordersAggregationFragment = (OrdersAggregationFragment) this.receiver;
            a aVar = OrdersAggregationFragment.f210185B0;
            ordersAggregationFragment.requireActivity().onBackPressed();
            return G0.f406611a;
        }
    }

    public OrdersAggregationFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        OrdersAggregationIntentFactory.GeneralOrdersData generalOrdersData;
        new D();
        F f12 = new F();
        f12.c();
        b.a aVarA = com.avito.android.orders_aggregation.di.module.a.a();
        aVarA.b(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            generalOrdersData = (OrdersAggregationIntentFactory.GeneralOrdersData) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("key.general_orders_data", OrdersAggregationIntentFactory.GeneralOrdersData.class) : arguments.getParcelable("key.general_orders_data"));
        } else {
            generalOrdersData = null;
        }
        aVarA.d(generalOrdersData);
        Bundle arguments2 = getArguments();
        aVarA.c(arguments2 != null ? arguments2.getString("key.preselected_tab") : null);
        aVarA.a(new C28478k(OrdersAggregationScreen.f210296d, com.avito.android.analytics.screens.s.c(this), "ordersAggregation"));
        aVarA.e((com.avito.android.orders_aggregation.di.module.c) C29972i.a(C29972i.b(this), com.avito.android.orders_aggregation.di.module.c.class));
        this.f210193z0 = aVarA.build();
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f210190w0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(f12.b());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f210190w0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.orders_aggregation_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Integer num = this.f210186A0;
        if (num != null) {
            requireActivity().getWindow().setSoftInputMode(num.intValue());
        }
        this.f210186A0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f210186A0 = Integer.valueOf(requireActivity().getWindow().getAttributes().softInputMode);
        requireActivity().getWindow().setSoftInputMode(48);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f210190w0;
        ScreenPerformanceTracker screenPerformanceTracker2 = screenPerformanceTracker != null ? screenPerformanceTracker : null;
        t tVar = this.f210189v0;
        t tVar2 = tVar != null ? tVar : null;
        InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
        TabPagerAdapter tabPagerAdapter = this.f210187t0;
        TabPagerAdapter tabPagerAdapter2 = tabPagerAdapter != null ? tabPagerAdapter : null;
        com.avito.android.lib.deprecated_design.tab.adapter.j<AbstractC41226a> jVar = this.f210188u0;
        com.avito.android.lib.deprecated_design.tab.adapter.j<AbstractC41226a> jVar2 = jVar != null ? jVar : null;
        B2 b22 = this.f210191x0;
        B2 b23 = b22 != null ? b22 : null;
        OrdersAggregationTabShownStatusStorage ordersAggregationTabShownStatusStorage = this.f210192y0;
        new m(view, screenPerformanceTracker2, tVar2, viewLifecycleOwner, tabPagerAdapter2, jVar2, b23, ordersAggregationTabShownStatusStorage != null ? ordersAggregationTabShownStatusStorage : null, new b(0, this, OrdersAggregationFragment.class, "onClickBack", "onClickBack()V", 0));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f210190w0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.orders_aggregation.di.module.b bVar = this.f210193z0;
        if (bVar == null) {
            bVar = null;
        }
        bVar.pf(this);
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        com.avito.android.orders_aggregation.di.module.b bVar = this.f210193z0;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }
}
