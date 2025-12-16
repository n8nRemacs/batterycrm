package com.avito.android.safedeal_checkout.delivery_universal_checkout.common.order_one_click;

import Hq0.C14020b;
import com.avito.android.remote.E;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeliveryOrderRealOneClickInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/common/order_one_click/n;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/common/order_one_click/m;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<E> f256961a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f256962b;

    @Inject
    public n(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k h31.e eVar) {
        this.f256961a = eVar;
        this.f256962b = interfaceC35745a5;
    }

    @Override // com.avito.android.safedeal_checkout.delivery_universal_checkout.common.order_one_click.m
    @Y61.k
    public final W a(@Y61.l Map map) {
        return new C42007e(new C14020b(17, this, map)).z(this.f256962b.a());
    }
}
