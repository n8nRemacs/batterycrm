package com.avito.android.return_checkout.mvi;

import Wm0.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.return_checkout.mvi.entity.DeliveryReturnCheckoutInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeliveryReturnCheckoutOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/return_checkout/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/return_checkout/mvi/entity/DeliveryReturnCheckoutInternalAction;", "LWm0/b;", "<init>", "()V", "_avito_return-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements t<DeliveryReturnCheckoutInternalAction, Wm0.b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Wm0.b b(DeliveryReturnCheckoutInternalAction deliveryReturnCheckoutInternalAction) {
        DeliveryReturnCheckoutInternalAction deliveryReturnCheckoutInternalAction2 = deliveryReturnCheckoutInternalAction;
        if (deliveryReturnCheckoutInternalAction2 instanceof DeliveryReturnCheckoutInternalAction.ExecuteRequestFailed) {
            return new b.a(((DeliveryReturnCheckoutInternalAction.ExecuteRequestFailed) deliveryReturnCheckoutInternalAction2).f255337b);
        }
        return null;
    }
}
