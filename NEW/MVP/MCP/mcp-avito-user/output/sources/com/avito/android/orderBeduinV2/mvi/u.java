package com.avito.android.orderBeduinV2.mvi;

import U40.c;
import com.avito.android.error.z;
import com.avito.android.orderBeduinV2.mvi.entity.OrderInternalAction;
import javax.inject.Inject;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: OrderReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/orderBeduinV2/mvi/u;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/orderBeduinV2/mvi/entity/OrderInternalAction;", "LU40/c;", "<init>", "()V", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class u implements com.avito.android.arch.mvi.u<OrderInternalAction, U40.c> {
    @Inject
    public u() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final U40.c a(OrderInternalAction orderInternalAction, U40.c cVar) {
        OrderInternalAction orderInternalAction2 = orderInternalAction;
        U40.c cVar2 = cVar;
        if (orderInternalAction2 instanceof OrderInternalAction.LoadingStarted) {
            return U40.c.a(cVar2, c.b.C1099c.f16179a, null, 0L, false, null, 30);
        }
        if (orderInternalAction2 instanceof OrderInternalAction.LoadingFailed) {
            return U40.c.a(cVar2, new c.b.C1098b(((OrderInternalAction.LoadingFailed) orderInternalAction2).f209880b), null, 0L, false, null, 30);
        }
        if (!(orderInternalAction2 instanceof OrderInternalAction.HandleBeduinState)) {
            if (orderInternalAction2 instanceof OrderInternalAction.ShouldPollChanged) {
                return U40.c.a(cVar2, null, null, 0L, ((OrderInternalAction.ShouldPollChanged) orderInternalAction2).f209881b, null, 23);
            }
            if (!(orderInternalAction2 instanceof OrderInternalAction.LastUpdateChanged)) {
                return orderInternalAction2 instanceof OrderInternalAction.ContentLoaded ? U40.c.a(cVar2, null, null, 0L, false, ((OrderInternalAction.ContentLoaded) orderInternalAction2).f209875c, 15) : cVar2;
            }
            OrderInternalAction.LastUpdateChanged lastUpdateChanged = (OrderInternalAction.LastUpdateChanged) orderInternalAction2;
            return U40.c.a(cVar2, null, Integer.valueOf(lastUpdateChanged.f209878b), lastUpdateChanged.f209879c, false, null, 25);
        }
        AbstractC40048c.C11084c c11084c = AbstractC40048c.C11084c.f395217b;
        AbstractC40048c abstractC40048c = ((OrderInternalAction.HandleBeduinState) orderInternalAction2).f209877b;
        if (L.f(abstractC40048c, c11084c) ? true : L.f(abstractC40048c, AbstractC40048c.d.f395218b)) {
            return U40.c.a(cVar2, c.b.C1099c.f16179a, null, 0L, false, null, 30);
        }
        if (abstractC40048c instanceof AbstractC40048c.a) {
            return U40.c.a(cVar2, new c.b.a(((AbstractC40048c.a) abstractC40048c).getF395211c()), null, 0L, false, null, 30);
        }
        if (abstractC40048c instanceof AbstractC40048c.b) {
            return U40.c.a(cVar2, new c.b.C1098b(z.n(((AbstractC40048c.b) abstractC40048c).f395216b)), null, 0L, false, null, 30);
        }
        throw new NoWhenBranchMatchedException();
    }
}
