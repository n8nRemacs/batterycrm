package com.avito.android.orderBeduinV2.mvi;

import com.avito.android.orderBeduinV2.mvi.entity.OrderInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: OrderBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/orderBeduinV2/mvi/n;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction;", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n implements com.avito.android.arch.mvi.b<OrderInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.orderBeduinV2.mvi.domain.a f209917a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final W40.b f209918b;

    @Inject
    public n(@Y61.k com.avito.android.orderBeduinV2.mvi.domain.a aVar, @Y61.k W40.b bVar) {
        this.f209917a = aVar;
        this.f209918b = bVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<OrderInternalAction> a() {
        return C43175k.N(this.f209917a.a(), C43175k.G(new m(this, null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
