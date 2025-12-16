package com.avito.android.delivery_location_suggest.mvi;

import Gv.c;
import com.avito.android.arch.mvi.u;
import com.avito.android.delivery_location_suggest.mvi.entity.DeliveryLocationSuggestInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeliveryLocationSuggestReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/delivery_location_suggest/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/delivery_location_suggest/mvi/entity/DeliveryLocationSuggestInternalAction;", "LGv/c;", "<init>", "()V", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements u<DeliveryLocationSuggestInternalAction, Gv.c> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Gv.c a(DeliveryLocationSuggestInternalAction deliveryLocationSuggestInternalAction, Gv.c cVar) {
        DeliveryLocationSuggestInternalAction deliveryLocationSuggestInternalAction2 = deliveryLocationSuggestInternalAction;
        Gv.c cVar2 = cVar;
        return deliveryLocationSuggestInternalAction2 instanceof DeliveryLocationSuggestInternalAction.SearchFailed ? Gv.c.a(cVar2, null, new c.a.b(((DeliveryLocationSuggestInternalAction.SearchFailed) deliveryLocationSuggestInternalAction2).f135169b), 1) : deliveryLocationSuggestInternalAction2 instanceof DeliveryLocationSuggestInternalAction.SuggestionsLoaded ? Gv.c.a(cVar2, null, new c.a.C0380a(((DeliveryLocationSuggestInternalAction.SuggestionsLoaded) deliveryLocationSuggestInternalAction2).f135171b), 1) : deliveryLocationSuggestInternalAction2 instanceof DeliveryLocationSuggestInternalAction.QueryChanged ? Gv.c.a(cVar2, ((DeliveryLocationSuggestInternalAction.QueryChanged) deliveryLocationSuggestInternalAction2).f135168b, null, 2) : cVar2;
    }
}
