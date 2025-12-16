package com.avito.android.service_orders.mvi;

import com.avito.android.service_orders.mvi.entity.ServiceOrdersListInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ServiceOrdersListBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_orders/mvi/w;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class w implements com.avito.android.arch.mvi.b<ServiceOrdersListInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_orders.mvi.domain.d f279672a;

    @Inject
    public w(@Y61.k com.avito.android.service_orders.mvi.domain.d dVar) {
        this.f279672a = dVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ServiceOrdersListInternalAction> a() {
        return this.f279672a.a(null, true);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
