package com.avito.android.comfortable_deal.submitting.ordercall.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.comfortable_deal.submitting.ordercall.mvi.entity.OrderCallInternalAction;
import javax.inject.Inject;
import jq.InterfaceC42414b;
import kotlin.Metadata;

/* compiled from: OrderCallOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction;", "Ljq/b;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements t<OrderCallInternalAction, InterfaceC42414b> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC42414b b(OrderCallInternalAction orderCallInternalAction) {
        OrderCallInternalAction orderCallInternalAction2 = orderCallInternalAction;
        if (orderCallInternalAction2 instanceof OrderCallInternalAction.SendPhoneFailed) {
            return new InterfaceC42414b.c(((OrderCallInternalAction.SendPhoneFailed) orderCallInternalAction2).f123069b);
        }
        if (orderCallInternalAction2.equals(OrderCallInternalAction.NavigateBack.f123066b)) {
            return InterfaceC42414b.a.f405823a;
        }
        if (orderCallInternalAction2.equals(OrderCallInternalAction.SendPhoneSuccess.f123071b)) {
            return InterfaceC42414b.C11583b.f405824a;
        }
        return null;
    }
}
