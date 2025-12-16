package com.avito.android.orders_aggregation;

import c50.InterfaceC26944a;
import com.avito.android.orders_aggregation.api.remote.model.OrdersAggregationResult;
import com.avito.android.remote.model.TypedResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;

/* compiled from: OrdersAggregationInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/orders_aggregation/g;", "Lcom/avito/android/orders_aggregation/f;", "_avito_orders-aggregation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC26944a f210259a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<String> f210260b;

    @Inject
    public g(@Y61.k InterfaceC26944a interfaceC26944a, @com.avito.android.orders_aggregation.di.module.n @Y61.k Set<String> set) {
        this.f210259a = interfaceC26944a;
        this.f210260b = set;
    }

    @Override // com.avito.android.orders_aggregation.f
    @Y61.l
    public final Object a(@Y61.k Continuation<? super TypedResult<OrdersAggregationResult>> continuation) {
        List listM0 = C42745f0.M0(this.f210260b);
        ArrayList arrayList = new ArrayList(C42745f0.q(listM0, 10));
        int i12 = 0;
        for (Object obj : listM0) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList.add(new Q(androidx.appcompat.app.r.p("supportedTabs[", i12, ']'), (String) obj));
            i12 = i13;
        }
        return this.f210259a.a(P0.p(arrayList), continuation);
    }
}
