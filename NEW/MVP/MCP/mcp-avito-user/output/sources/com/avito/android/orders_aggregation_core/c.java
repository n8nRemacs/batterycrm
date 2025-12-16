package com.avito.android.orders_aggregation_core;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.orders_aggregation.OrdersAggregationIntentFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OrdersAggregationDeeplinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/orders_aggregation_core/c;", "Ldagger/internal/h;", "Lcom/avito/android/orders_aggregation_core/b;", "a", "_avito_orders-aggregation-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f210378e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dv.b f210379a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.orders_aggregation.d f210380b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C25721c f210381c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.navigation.c f210382d;

    /* compiled from: OrdersAggregationDeeplinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/orders_aggregation_core/c$a;", "", "<init>", "()V", "_avito_orders-aggregation-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@Y61.k dv.b bVar, @Y61.k com.avito.android.orders_aggregation.d dVar, @Y61.k C25721c c25721c, @Y61.k com.avito.android.navigation.c cVar) {
        this.f210379a = bVar;
        this.f210380b = dVar;
        this.f210381c = c25721c;
        this.f210382d = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f210379a.get();
        OrdersAggregationIntentFactory ordersAggregationIntentFactory = (OrdersAggregationIntentFactory) this.f210380b.get();
        C25719a c25719a = (C25719a) this.f210381c.get();
        com.avito.android.navigation.a aVar = (com.avito.android.navigation.a) this.f210382d.get();
        f210378e.getClass();
        return new b(interfaceC4053a, ordersAggregationIntentFactory, c25719a, aVar);
    }
}
