package Yn0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.E;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.delivery.DeliveryUniversalCheckoutSummary;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.model.CheckoutCourierData;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.model.CheckoutData;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.model.CheckoutPvzData;
import h31.e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;

/* compiled from: DeliveryUniversalCheckoutRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYn0/b;", "LYn0/a;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yn0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18305b implements InterfaceC18304a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<E> f19659a;

    @Inject
    public C18305b(@k e<E> eVar) {
        this.f19659a = eVar;
    }

    @Override // Yn0.InterfaceC18304a
    @l
    public final Object a(@k CheckoutPvzData checkoutPvzData, @k Continuation<? super TypedResult<DeliveryUniversalCheckoutSummary>> continuation) {
        return this.f19659a.get().c(checkoutPvzData.f257082b, checkoutPvzData.f257083c, checkoutPvzData.f257084d, checkoutPvzData.f257085e, checkoutPvzData.f257086f, checkoutPvzData.f257087g, checkoutPvzData.f257090j, Boxing.boxInt(1), Boxing.boxInt(1), checkoutPvzData.f257091k, checkoutPvzData.f257092l, continuation);
    }

    @Override // Yn0.InterfaceC18304a
    @l
    public final Object b(@k CheckoutData checkoutData, @k Continuation<? super TypedResult<DeliveryUniversalCheckoutSummary>> continuation) {
        return this.f19659a.get().d(checkoutData.f257081b, Boxing.boxInt(1), Boxing.boxInt(1), continuation);
    }

    @Override // Yn0.InterfaceC18304a
    @l
    public final Object c(@k CheckoutCourierData checkoutCourierData, @k Continuation<? super TypedResult<DeliveryUniversalCheckoutSummary>> continuation) {
        return this.f19659a.get().b(checkoutCourierData.f257068b, checkoutCourierData.f257069c, checkoutCourierData.f257070d, checkoutCourierData.f257071e, checkoutCourierData.f257072f, checkoutCourierData.f257073g, checkoutCourierData.f257076j, Boxing.boxInt(1), Boxing.boxInt(1), checkoutCourierData.f257077k, checkoutCourierData.f257078l, checkoutCourierData.f257079m, checkoutCourierData.f257080n, continuation);
    }
}
