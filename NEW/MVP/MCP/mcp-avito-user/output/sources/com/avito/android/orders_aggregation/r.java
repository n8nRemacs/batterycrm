package com.avito.android.orders_aggregation;

import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import com.avito.android.B2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.orders_aggregation.OrdersAggregationIntentFactory;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OrdersAggregationViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orders_aggregation/r;", "Landroidx/lifecycle/a;", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class r extends AbstractC22993a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final f f210302d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f210303e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final OrdersAggregationIntentFactory.GeneralOrdersData f210304f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final B2 f210305g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f210306h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f210307i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final OrdersAggregationTabShownStatusStorage f210308j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f210309k;

    @Inject
    public r(@Y61.k InterfaceC23487e interfaceC23487e, @Y61.k f fVar, @Y61.k R0 r02, @Y61.l OrdersAggregationIntentFactory.GeneralOrdersData generalOrdersData, @Y61.k B2 b22, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k OrdersAggregationTabShownStatusStorage ordersAggregationTabShownStatusStorage, @Y61.l @com.avito.android.orders_aggregation.di.module.m String str) {
        super(interfaceC23487e, null);
        this.f210302d = fVar;
        this.f210303e = r02;
        this.f210304f = generalOrdersData;
        this.f210305g = b22;
        this.f210306h = interfaceC28373a;
        this.f210307i = screenPerformanceTracker;
        this.f210308j = ordersAggregationTabShownStatusStorage;
        this.f210309k = str;
    }

    @Override // androidx.view.AbstractC22993a
    @Y61.k
    public final <T extends M0> T create(@Y61.k String str, @Y61.k Class<T> cls, @Y61.k C23060r0 c23060r0) {
        if (!cls.isAssignableFrom(t.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new t(this.f210302d, this.f210303e, this.f210304f, this.f210306h, this.f210305g, this.f210307i, this.f210308j, this.f210309k);
    }
}
