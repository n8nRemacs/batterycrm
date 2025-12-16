package com.avito.android.safedeal_checkout.delivery_universal_checkout;

import android.content.Intent;
import com.avito.android.remote.model.ParametrizedEvent;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: DeliveryUniversalCheckoutIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/i;", "", "_avito_safedeal-checkout_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface i {
    @Y61.k
    Intent a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l ParametrizedEvent parametrizedEvent, @Y61.l String str8, @Y61.l String str9, @Y61.l String str10, @Y61.l Double d12, @Y61.l Double d13);

    @Y61.k
    Intent b(@Y61.k Map<String, String> map);

    @Y61.k
    Intent c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l ParametrizedEvent parametrizedEvent, @Y61.l String str8, @Y61.l Double d12, @Y61.l Double d13);
}
