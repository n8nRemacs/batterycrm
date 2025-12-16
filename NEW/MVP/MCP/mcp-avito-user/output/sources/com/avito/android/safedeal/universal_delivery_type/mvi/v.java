package com.avito.android.safedeal.universal_delivery_type.mvi;

import Un0.InterfaceC15541b;
import com.avito.android.safedeal.universal_delivery_type.mvi.entity.UniversalDeliveryTypeInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UniversalDeliveryTypeOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/mvi/v;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeInternalAction;", "LUn0/b;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v implements com.avito.android.arch.mvi.t<UniversalDeliveryTypeInternalAction, InterfaceC15541b> {
    @Inject
    public v() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC15541b b(UniversalDeliveryTypeInternalAction universalDeliveryTypeInternalAction) {
        InterfaceC15541b c1144b;
        UniversalDeliveryTypeInternalAction universalDeliveryTypeInternalAction2 = universalDeliveryTypeInternalAction;
        if (universalDeliveryTypeInternalAction2 instanceof UniversalDeliveryTypeInternalAction.CheckoutSuccess) {
            return InterfaceC15541b.a.f16590a;
        }
        if (universalDeliveryTypeInternalAction2 instanceof UniversalDeliveryTypeInternalAction.TabSelect) {
            c1144b = new InterfaceC15541b.c(((UniversalDeliveryTypeInternalAction.TabSelect) universalDeliveryTypeInternalAction2).f256674c);
        } else {
            if (!(universalDeliveryTypeInternalAction2 instanceof UniversalDeliveryTypeInternalAction.DeliveryMethodSelectTab)) {
                return null;
            }
            c1144b = new InterfaceC15541b.C1144b(((UniversalDeliveryTypeInternalAction.DeliveryMethodSelectTab) universalDeliveryTypeInternalAction2).f256668b);
        }
        return c1144b;
    }
}
