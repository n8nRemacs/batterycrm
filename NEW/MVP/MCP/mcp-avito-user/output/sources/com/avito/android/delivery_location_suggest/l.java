package com.avito.android.delivery_location_suggest;

import com.avito.android.geo_common.model.CoordsByAddressResult;
import io.reactivex.rxjava3.internal.operators.single.W;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: DeliveryLocationSuggestInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_location_suggest/l;", "", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface l {
    @Y61.k
    W a(@Y61.k String str, @Y61.k DeliveryLocationSuggestParams deliveryLocationSuggestParams);

    @Y61.k
    InterfaceC43160i<CoordsByAddressResult> b(@Y61.k String str);
}
