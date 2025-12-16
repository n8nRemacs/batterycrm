package com.avito.android.return_checkout.mvi;

import Wm0.InterfaceC15776a;
import com.avito.android.arch.mvi.a;
import com.avito.android.return_checkout.mvi.entity.DeliveryReturnCheckoutInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: DeliveryReturnCheckoutActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/return_checkout/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LWm0/a;", "Lcom/avito/android/return_checkout/mvi/entity/DeliveryReturnCheckoutInternalAction;", "LWm0/c;", "_avito_return-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC15776a, DeliveryReturnCheckoutInternalAction, Wm0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.return_checkout.domain.a f255312a;

    @Inject
    public a(@Y61.k com.avito.android.return_checkout.domain.a aVar) {
        this.f255312a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<DeliveryReturnCheckoutInternalAction> b(InterfaceC15776a interfaceC15776a, Wm0.c cVar) {
        if (interfaceC15776a.equals(InterfaceC15776a.C1281a.f18033a)) {
            return this.f255312a.a();
        }
        throw new NoWhenBranchMatchedException();
    }
}
