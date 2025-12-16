package Yn0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.delivery.DeliveryUniversalCheckoutSummary;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.model.CheckoutCourierData;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.model.CheckoutData;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.model.CheckoutPvzData;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: DeliveryUniversalCheckoutRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYn0/a;", "", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yn0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC18304a {
    @l
    @InterfaceC42830m
    Object a(@k CheckoutPvzData checkoutPvzData, @k Continuation<? super TypedResult<DeliveryUniversalCheckoutSummary>> continuation);

    @l
    Object b(@k CheckoutData checkoutData, @k Continuation<? super TypedResult<DeliveryUniversalCheckoutSummary>> continuation);

    @l
    @InterfaceC42830m
    Object c(@k CheckoutCourierData checkoutCourierData, @k Continuation<? super TypedResult<DeliveryUniversalCheckoutSummary>> continuation);
}
