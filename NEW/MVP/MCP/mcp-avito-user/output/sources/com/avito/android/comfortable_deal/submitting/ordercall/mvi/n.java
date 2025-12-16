package com.avito.android.comfortable_deal.submitting.ordercall.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.comfortable_deal.submitting.ordercall.mvi.entity.OrderCallInternalAction;
import com.avito.android.comfortable_deal.submitting.ordercall.mvi.entity.OrderCallState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rp.C47702e;

/* compiled from: OrderCallReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction;", "Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallState;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements u<OrderCallInternalAction, OrderCallState> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final OrderCallState a(OrderCallInternalAction orderCallInternalAction, OrderCallState orderCallState) {
        OrderCallInternalAction orderCallInternalAction2 = orderCallInternalAction;
        OrderCallState orderCallState2 = orderCallState;
        if (orderCallInternalAction2.equals(OrderCallInternalAction.SendPhoneLoading.f123070b)) {
            return OrderCallState.a(orderCallState2, null, false, false, true, 511);
        }
        if (orderCallInternalAction2 instanceof OrderCallInternalAction.PhoneInputCorrect) {
            return OrderCallState.a(orderCallState2, ((OrderCallInternalAction.PhoneInputCorrect) orderCallInternalAction2).f123067b, true, false, false, 827);
        }
        if (orderCallInternalAction2 instanceof OrderCallInternalAction.PhoneInputError) {
            return OrderCallState.a(orderCallState2, ((OrderCallInternalAction.PhoneInputError) orderCallInternalAction2).f123068b, false, true, false, 827);
        }
        if (orderCallInternalAction2 instanceof OrderCallInternalAction.SendPhoneSuccess ? true : orderCallInternalAction2 instanceof OrderCallInternalAction.SendPhoneFailed) {
            return OrderCallState.a(orderCallState2, null, false, false, false, 511);
        }
        if (!(orderCallInternalAction2 instanceof OrderCallInternalAction.ContentLoaded)) {
            return orderCallState2;
        }
        C47702e c47702e = ((OrderCallInternalAction.ContentLoaded) orderCallInternalAction2).f123065b;
        return new OrderCallState(c47702e.f430203a, c47702e.f430204b, "", c47702e.f430205c, c47702e.f430206d, c47702e.f430207e, false, false, "Укажите правильный номер", false);
    }
}
