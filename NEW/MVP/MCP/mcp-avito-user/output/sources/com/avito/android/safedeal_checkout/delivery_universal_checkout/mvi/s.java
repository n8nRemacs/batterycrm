package com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi;

import ao0.C23646c;
import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.delivery.DeliveryUniversalCheckoutSummary;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.entity.DeliveryUniversalCheckoutInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeliveryUniversalCheckoutReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/s;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction;", "Lao0/c;", "<init>", "()V", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s implements u<DeliveryUniversalCheckoutInternalAction, C23646c> {
    @Inject
    public s() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.u
    public final C23646c a(DeliveryUniversalCheckoutInternalAction deliveryUniversalCheckoutInternalAction, C23646c c23646c) {
        C23646c c23646c2;
        Boolean showBottomFormBackground;
        DeliveryUniversalCheckoutInternalAction deliveryUniversalCheckoutInternalAction2 = deliveryUniversalCheckoutInternalAction;
        C23646c c23646c3 = c23646c;
        if (deliveryUniversalCheckoutInternalAction2 instanceof DeliveryUniversalCheckoutInternalAction.LoadingStarted) {
            return new C23646c(C23646c.a.C1972c.f56237a);
        }
        if (deliveryUniversalCheckoutInternalAction2 instanceof DeliveryUniversalCheckoutInternalAction.LoadedError) {
            c23646c2 = new C23646c(new C23646c.a.b(((DeliveryUniversalCheckoutInternalAction.LoadedError) deliveryUniversalCheckoutInternalAction2).f257132b));
        } else {
            if (!(deliveryUniversalCheckoutInternalAction2 instanceof DeliveryUniversalCheckoutInternalAction.Loaded)) {
                if (deliveryUniversalCheckoutInternalAction2 instanceof DeliveryUniversalCheckoutInternalAction.ContentChanged) {
                    q qVar = new q(deliveryUniversalCheckoutInternalAction2);
                    C23646c.a aVar = c23646c3.f56225b;
                    return aVar instanceof C23646c.a.C1971a ? new C23646c((C23646c.a) qVar.invoke(aVar)) : c23646c3;
                }
                if (!(deliveryUniversalCheckoutInternalAction2 instanceof DeliveryUniversalCheckoutInternalAction.ExecuteRequestStateChanged)) {
                    return c23646c3;
                }
                r rVar = new r(deliveryUniversalCheckoutInternalAction2);
                C23646c.a aVar2 = c23646c3.f56225b;
                return aVar2 instanceof C23646c.a.C1971a ? new C23646c((C23646c.a) rVar.invoke(aVar2)) : c23646c3;
            }
            DeliveryUniversalCheckoutInternalAction.Loaded loaded = (DeliveryUniversalCheckoutInternalAction.Loaded) deliveryUniversalCheckoutInternalAction2;
            DeliveryUniversalCheckoutSummary.Settings settings = loaded.f257131j;
            c23646c2 = new C23646c(new C23646c.a.C1971a(loaded.f257123b, loaded.f257124c, loaded.f257125d, loaded.f257126e, loaded.f257127f, loaded.f257128g, loaded.f257129h, loaded.f257130i, false, (settings == null || (showBottomFormBackground = settings.getShowBottomFormBackground()) == null) ? true : showBottomFormBackground.booleanValue()));
        }
        return c23646c2;
    }
}
