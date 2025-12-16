package com.avito.android.return_checkout;

import android.content.Context;
import android.content.Intent;
import com.avito.android.return_checkout.model.DeliveryReturnCheckoutData;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeliveryReturnCheckoutIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/return_checkout/i;", "Lcom/avito/android/return_checkout/h;", "_avito_return-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f255306a;

    @Inject
    public i(@Y61.k Context context) {
        this.f255306a = context;
    }

    @Override // com.avito.android.return_checkout.h
    @Y61.k
    public final Intent a(@Y61.k String str, @Y61.l Map<String, String> map) {
        return new Intent(this.f255306a, (Class<?>) DeliveryReturnCheckoutActivity.class).putExtra("extra_return_checkout_data", new DeliveryReturnCheckoutData(str, map));
    }
}
