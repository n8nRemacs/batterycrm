package com.avito.android.return_checkout;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.delivery.DeliveryReturnCheckoutResult;
import com.avito.android.return_checkout.model.DeliveryReturnCheckoutData;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: DeliveryReturnCheckoutRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/return_checkout/l;", "", "_avito_return-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface l {
    @Y61.l
    Object a(@Y61.k DeliveryReturnCheckoutData deliveryReturnCheckoutData, @Y61.k Continuation<? super TypedResult<DeliveryReturnCheckoutResult>> continuation);
}
