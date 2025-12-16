package com.avito.android.return_checkout.mvi;

import com.avito.android.return_checkout.mvi.entity.DeliveryReturnCheckoutInternalAction;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: DeliveryReturnCheckoutBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/return_checkout/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/return_checkout/mvi/entity/DeliveryReturnCheckoutInternalAction;", "_avito_return-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements com.avito.android.arch.mvi.b<DeliveryReturnCheckoutInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f255324a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.return_checkout.a f255325b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.return_checkout.domain.a f255326c;

    @Inject
    public e(@Y61.k InterfaceC40691b interfaceC40691b, @Y61.k com.avito.android.return_checkout.a aVar, @Y61.k com.avito.android.return_checkout.domain.a aVar2) {
        this.f255324a = interfaceC40691b;
        this.f255325b = aVar;
        this.f255326c = aVar2;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<DeliveryReturnCheckoutInternalAction> a() {
        InterfaceC43160i<DeliveryReturnCheckoutInternalAction> interfaceC43160iA = this.f255326c.a();
        com.avito.android.return_checkout.a aVar = this.f255325b;
        return C43175k.N(interfaceC43160iA, C43175k.k(y.a(aVar.f255237a.getF103348p()), y.a(aVar.f255238b.getF103348p()), y.a(aVar.f255239c.getF103348p()), new d(4, null)), C43175k.G(new c(y.a(com.avito.android.beduin_shared.model.utils.b.b(this.f255324a)), null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        this.f255324a.onCleared();
        return G0.f406611a;
    }
}
