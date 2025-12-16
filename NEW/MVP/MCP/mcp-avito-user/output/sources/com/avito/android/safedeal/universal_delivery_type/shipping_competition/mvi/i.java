package com.avito.android.safedeal.universal_delivery_type.shipping_competition.mvi;

import Vn0.InterfaceC15696b;
import Vn0.InterfaceC15697c;
import com.avito.android.arch.mvi.t;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UniversalDeliveryTypeShippingCompetitionOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/shipping_competition/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "LVn0/b;", "LVn0/c;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements t<InterfaceC15696b, InterfaceC15697c> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC15697c b(InterfaceC15696b interfaceC15696b) {
        InterfaceC15696b interfaceC15696b2 = interfaceC15696b;
        if (interfaceC15696b2 instanceof InterfaceC15696b.C1197b) {
            return new InterfaceC15697c.b(((InterfaceC15696b.C1197b) interfaceC15696b2).f17370a);
        }
        if (interfaceC15696b2 instanceof InterfaceC15696b.f) {
            return new InterfaceC15697c.a(((InterfaceC15696b.f) interfaceC15696b2).f17375a);
        }
        return null;
    }
}
