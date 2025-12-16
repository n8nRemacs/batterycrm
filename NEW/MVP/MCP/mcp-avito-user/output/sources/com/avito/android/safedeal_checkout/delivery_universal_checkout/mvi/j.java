package com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi;

import co0.InterfaceC27233b;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.model.DeliveryUniversalCheckoutData;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.entity.DeliveryUniversalCheckoutInternalAction;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43221z1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: DeliveryUniversalCheckoutBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/j;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements com.avito.android.arch.mvi.b<DeliveryUniversalCheckoutInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DeliveryUniversalCheckoutData f257159a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.safedeal_checkout.delivery_universal_checkout.domain.a f257160b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f257161c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.safedeal_checkout.delivery_universal_checkout.a f257162d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f257163e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27233b f257164f;

    @Inject
    public j(@Y61.k DeliveryUniversalCheckoutData deliveryUniversalCheckoutData, @Y61.k com.avito.android.safedeal_checkout.delivery_universal_checkout.domain.a aVar, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k com.avito.android.safedeal_checkout.delivery_universal_checkout.a aVar2, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar3, @Y61.k InterfaceC27233b interfaceC27233b) {
        this.f257159a = deliveryUniversalCheckoutData;
        this.f257160b = aVar;
        this.f257161c = interfaceC40691b;
        this.f257162d = aVar2;
        this.f257163e = aVar3;
        this.f257164f = interfaceC27233b;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<DeliveryUniversalCheckoutInternalAction> a() {
        InterfaceC43160i<DeliveryUniversalCheckoutInternalAction> interfaceC43160iA = this.f257160b.a();
        com.avito.android.safedeal_checkout.delivery_universal_checkout.a aVar = this.f257162d;
        C43221z1 c43221z1K = C43175k.k(y.a(aVar.f256888a.getF103348p()), y.a(aVar.f256889b.getF103348p()), y.a(aVar.f256890c.getF103348p()), new g(4, null));
        InterfaceC43160i interfaceC43160iG = C43175k.G(new f(y.a(this.f257161c.q()), null));
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = this.f257163e;
        return C43175k.N(interfaceC43160iA, c43221z1K, interfaceC43160iG, C43175k.G(new e(y.a(aVar2.d9()), null)), C43175k.G(new i(new h(y.a(aVar2.V9())), null, this)), C43175k.G(new d(new c(y.a(aVar2.d9())), null, this)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        this.f257161c.onCleared();
        return G0.f406611a;
    }
}
