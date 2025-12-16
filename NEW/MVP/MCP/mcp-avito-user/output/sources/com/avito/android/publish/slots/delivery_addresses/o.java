package com.avito.android.publish.slots.delivery_addresses;

import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.delivery_addresses.DeliveryAddressesSlot;

/* compiled from: DeliveryAddressesSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    public final p f243460a;

    public o(p pVar) {
        this.f243460a = pVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final com.avito.android.category_parameters.j a(Slot slot) {
        return new m((DeliveryAddressesSlot) slot, this.f243460a.f243461a.get());
    }
}
