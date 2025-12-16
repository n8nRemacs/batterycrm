package com.avito.android.safedeal_checkout.delivery_universal_checkout;

import android.content.Context;
import android.content.Intent;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.model.CheckoutCourierData;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.model.CheckoutData;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.model.CheckoutPvzData;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeliveryUniversalCheckoutIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/j;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/i;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f257060a;

    @Inject
    public j(@Y61.k Context context) {
        this.f257060a = context;
    }

    @Override // com.avito.android.safedeal_checkout.delivery_universal_checkout.i
    @Y61.k
    public final Intent a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l ParametrizedEvent parametrizedEvent, @Y61.l String str8, @Y61.l String str9, @Y61.l String str10, @Y61.l Double d12, @Y61.l Double d13) {
        return new Intent(this.f257060a, (Class<?>) DeliveryUniversalCheckoutActivity.class).putExtra("initial_data", new CheckoutCourierData(str, str2, str3, str4, str5, str6, str7, parametrizedEvent, str8, str9, str10, d12, d13));
    }

    @Override // com.avito.android.safedeal_checkout.delivery_universal_checkout.i
    @Y61.k
    public final Intent b(@Y61.k Map<String, String> map) {
        return new Intent(this.f257060a, (Class<?>) DeliveryUniversalCheckoutActivity.class).putExtra("initial_data", new CheckoutData(map));
    }

    @Override // com.avito.android.safedeal_checkout.delivery_universal_checkout.i
    @Y61.k
    public final Intent c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l ParametrizedEvent parametrizedEvent, @Y61.l String str8, @Y61.l Double d12, @Y61.l Double d13) {
        return new Intent(this.f257060a, (Class<?>) DeliveryUniversalCheckoutActivity.class).putExtra("initial_data", new CheckoutPvzData(str, str2, str3, str4, str5, str6, str7, parametrizedEvent, str8, d12, d13));
    }
}
