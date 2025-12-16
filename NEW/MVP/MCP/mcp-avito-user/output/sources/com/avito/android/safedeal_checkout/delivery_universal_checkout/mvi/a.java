package com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi;

import ao0.C23646c;
import ao0.InterfaceC23644a;
import com.avito.android.arch.mvi.a;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.entity.DeliveryUniversalCheckoutInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: DeliveryUniversalCheckoutActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lao0/a;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction;", "Lao0/c;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC23644a, DeliveryUniversalCheckoutInternalAction, C23646c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.safedeal_checkout.delivery_universal_checkout.domain.a f257093a;

    @Inject
    public a(@Y61.k com.avito.android.safedeal_checkout.delivery_universal_checkout.domain.a aVar) {
        this.f257093a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<DeliveryUniversalCheckoutInternalAction> b(InterfaceC23644a interfaceC23644a, C23646c c23646c) {
        if (interfaceC23644a instanceof InterfaceC23644a.C1969a) {
            return this.f257093a.a();
        }
        throw new NoWhenBranchMatchedException();
    }
}
