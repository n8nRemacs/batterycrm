package com.avito.android.delivery_location_suggest.mvi;

import Gv.InterfaceC13921b;
import com.avito.android.arch.mvi.t;
import com.avito.android.delivery_location_suggest.mvi.entity.DeliveryLocationSuggestInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeliveryLocationSuggestOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/delivery_location_suggest/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/delivery_location_suggest/mvi/entity/DeliveryLocationSuggestInternalAction;", "LGv/b;", "<init>", "()V", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements t<DeliveryLocationSuggestInternalAction, InterfaceC13921b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC13921b b(DeliveryLocationSuggestInternalAction deliveryLocationSuggestInternalAction) {
        DeliveryLocationSuggestInternalAction deliveryLocationSuggestInternalAction2 = deliveryLocationSuggestInternalAction;
        if (deliveryLocationSuggestInternalAction2 instanceof DeliveryLocationSuggestInternalAction.SuggestSelected) {
            return new InterfaceC13921b.a(((DeliveryLocationSuggestInternalAction.SuggestSelected) deliveryLocationSuggestInternalAction2).f135170b);
        }
        return null;
    }
}
