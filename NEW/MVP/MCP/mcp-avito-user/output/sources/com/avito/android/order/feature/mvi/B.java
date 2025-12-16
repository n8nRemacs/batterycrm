package com.avito.android.order.feature.mvi;

import P40.c;
import com.avito.android.order.feature.mvi.entity.OrderInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OrderReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/order/feature/mvi/B;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/order/feature/mvi/entity/OrderInternalAction;", "LP40/c;", "<init>", "()V", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class B implements com.avito.android.arch.mvi.u<OrderInternalAction, P40.c> {
    @Inject
    public B() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.u
    public final P40.c a(OrderInternalAction orderInternalAction, P40.c cVar) {
        OrderInternalAction orderInternalAction2 = orderInternalAction;
        P40.c cVar2 = cVar;
        if (orderInternalAction2 instanceof OrderInternalAction.LoadingStarted) {
            return P40.c.a(cVar2, null, null, 0L, c.a.C0832c.f12829a, false, 23);
        }
        if (orderInternalAction2 instanceof OrderInternalAction.LoadingFailed) {
            return P40.c.a(cVar2, null, null, 0L, new c.a.b(((OrderInternalAction.LoadingFailed) orderInternalAction2).f209632b), false, 23);
        }
        if (orderInternalAction2 instanceof OrderInternalAction.ContentLoaded) {
            OrderInternalAction.ContentLoaded contentLoaded = (OrderInternalAction.ContentLoaded) orderInternalAction2;
            return P40.c.a(cVar2, contentLoaded.f209625b, null, 0L, new c.a.C0831a(contentLoaded.f209626c, contentLoaded.f209627d, false), false, 22);
        }
        if (orderInternalAction2 instanceof OrderInternalAction.ContentChanged) {
            z zVar = new z(orderInternalAction2);
            c.a aVar = cVar2.f12823e;
            return aVar instanceof c.a.C0831a ? P40.c.a(cVar2, null, null, 0L, (c.a) zVar.invoke(aVar), false, 23) : cVar2;
        }
        if (orderInternalAction2 instanceof OrderInternalAction.ExecuteRequestStateChanged) {
            A a12 = new A(orderInternalAction2);
            c.a aVar2 = cVar2.f12823e;
            return aVar2 instanceof c.a.C0831a ? P40.c.a(cVar2, null, null, 0L, (c.a) a12.invoke(aVar2), false, 23) : cVar2;
        }
        if (!(orderInternalAction2 instanceof OrderInternalAction.LastUpdateChanged)) {
            return orderInternalAction2 instanceof OrderInternalAction.ShouldPollChanged ? P40.c.a(cVar2, null, null, 0L, null, ((OrderInternalAction.ShouldPollChanged) orderInternalAction2).f209633b, 15) : cVar2;
        }
        OrderInternalAction.LastUpdateChanged lastUpdateChanged = (OrderInternalAction.LastUpdateChanged) orderInternalAction2;
        return P40.c.a(cVar2, null, Integer.valueOf(lastUpdateChanged.f209630b), lastUpdateChanged.f209631c, null, false, 25);
    }
}
