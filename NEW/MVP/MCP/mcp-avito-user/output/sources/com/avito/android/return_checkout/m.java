package com.avito.android.return_checkout;

import com.avito.android.remote.B;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.delivery.DeliveryReturnCheckoutResult;
import com.avito.android.return_checkout.model.DeliveryReturnCheckoutData;
import com.avito.android.util.InterfaceC35745a5;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;

/* compiled from: DeliveryReturnCheckoutRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/return_checkout/m;", "Lcom/avito/android/return_checkout/l;", "_avito_return-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<B> f255308a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f255309b;

    @Inject
    public m(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k h31.e eVar) {
        this.f255308a = eVar;
        this.f255309b = interfaceC35745a5;
    }

    @Override // com.avito.android.return_checkout.l
    @Y61.l
    public final Object a(@Y61.k DeliveryReturnCheckoutData deliveryReturnCheckoutData, @Y61.k Continuation<? super TypedResult<DeliveryReturnCheckoutResult>> continuation) {
        B b12 = this.f255308a.get();
        String str = deliveryReturnCheckoutData.f255310b;
        Map<String, String> mapC = deliveryReturnCheckoutData.f255311c;
        if (mapC == null) {
            mapC = P0.c();
        }
        return b12.g(str, mapC, continuation);
    }
}
