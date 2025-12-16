package com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi;

import ao0.InterfaceC23645b;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.entity.DeliveryUniversalCheckoutInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeliveryUniversalCheckoutOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/o;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction;", "Lao0/b;", "<init>", "()V", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o implements com.avito.android.arch.mvi.t<DeliveryUniversalCheckoutInternalAction, InterfaceC23645b> {
    @Inject
    public o() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC23645b b(DeliveryUniversalCheckoutInternalAction deliveryUniversalCheckoutInternalAction) {
        DeliveryUniversalCheckoutInternalAction deliveryUniversalCheckoutInternalAction2 = deliveryUniversalCheckoutInternalAction;
        if (deliveryUniversalCheckoutInternalAction2 instanceof DeliveryUniversalCheckoutInternalAction.ExecuteRequestFailed) {
            return new InterfaceC23645b.C1970b(((DeliveryUniversalCheckoutInternalAction.ExecuteRequestFailed) deliveryUniversalCheckoutInternalAction2).f257121b);
        }
        if (deliveryUniversalCheckoutInternalAction2 instanceof DeliveryUniversalCheckoutInternalAction.DeeplinkResultAction) {
            return new InterfaceC23645b.a(((DeliveryUniversalCheckoutInternalAction.DeeplinkResultAction) deliveryUniversalCheckoutInternalAction2).f257120b);
        }
        return null;
    }
}
