package com.avito.android.delivery_location_suggest;

import android.content.Context;
import android.content.Intent;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeliveryLocationSuggestIntentFactoryImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_location_suggest/i;", "Lcom/avito/android/delivery_location_suggest/h;", "<init>", "()V", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements h {
    @Inject
    public i() {
    }

    @Override // com.avito.android.delivery_location_suggest.h
    @Y61.k
    public final Intent a(@Y61.k Context context, @Y61.k DeliveryLocationSuggestParams deliveryLocationSuggestParams) {
        return new Intent(context, (Class<?>) DeliveryLocationSuggestActivity.class).putExtra("extra_params", deliveryLocationSuggestParams);
    }
}
