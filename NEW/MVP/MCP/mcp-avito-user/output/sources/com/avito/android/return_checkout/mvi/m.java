package com.avito.android.return_checkout.mvi;

import Wm0.c;
import com.avito.android.arch.mvi.u;
import com.avito.android.return_checkout.mvi.entity.DeliveryReturnCheckoutInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeliveryReturnCheckoutReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/return_checkout/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/return_checkout/mvi/entity/DeliveryReturnCheckoutInternalAction;", "LWm0/c;", "<init>", "()V", "_avito_return-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements u<DeliveryReturnCheckoutInternalAction, Wm0.c> {
    @Inject
    public m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.u
    public final Wm0.c a(DeliveryReturnCheckoutInternalAction deliveryReturnCheckoutInternalAction, Wm0.c cVar) {
        Wm0.c cVar2;
        DeliveryReturnCheckoutInternalAction deliveryReturnCheckoutInternalAction2 = deliveryReturnCheckoutInternalAction;
        Wm0.c cVar3 = cVar;
        if (deliveryReturnCheckoutInternalAction2 instanceof DeliveryReturnCheckoutInternalAction.LoadingStarted) {
            return new Wm0.c(c.a.C1283c.f18044a);
        }
        if (deliveryReturnCheckoutInternalAction2 instanceof DeliveryReturnCheckoutInternalAction.LoadingError) {
            cVar2 = new Wm0.c(new c.a.b(((DeliveryReturnCheckoutInternalAction.LoadingError) deliveryReturnCheckoutInternalAction2).f255338b));
        } else {
            if (!(deliveryReturnCheckoutInternalAction2 instanceof DeliveryReturnCheckoutInternalAction.ContentLoaded)) {
                if (!(deliveryReturnCheckoutInternalAction2 instanceof DeliveryReturnCheckoutInternalAction.ContentChanged)) {
                    return cVar3;
                }
                l lVar = new l((DeliveryReturnCheckoutInternalAction.ContentChanged) deliveryReturnCheckoutInternalAction2);
                c.a aVar = cVar3.f18035b;
                return aVar instanceof c.a.C1282a ? new Wm0.c((c.a) lVar.invoke(aVar)) : cVar3;
            }
            DeliveryReturnCheckoutInternalAction.ContentLoaded contentLoaded = (DeliveryReturnCheckoutInternalAction.ContentLoaded) deliveryReturnCheckoutInternalAction2;
            cVar2 = new Wm0.c(new c.a.C1282a(contentLoaded.f255330b, contentLoaded.f255331c, contentLoaded.f255332d, contentLoaded.f255333e, contentLoaded.f255334f, contentLoaded.f255335g, contentLoaded.f255336h));
        }
        return cVar2;
    }
}
