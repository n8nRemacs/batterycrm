package com.avito.android.publish.slots.address_from_profile;

import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.select_address_in_list.AddressesFromProfileSlot;

/* compiled from: SelectAddressInListSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class B implements A {

    /* renamed from: a, reason: collision with root package name */
    public final C f242823a;

    public B(C c12) {
        this.f242823a = c12;
    }

    @Override // com.avito.android.publish.slots.x
    public final com.avito.android.category_parameters.j a(Slot slot) {
        AddressesFromProfileSlot addressesFromProfileSlot = (AddressesFromProfileSlot) slot;
        C c12 = this.f242823a;
        return new z(addressesFromProfileSlot, (k) c12.f242824a.get(), c12.f242825b.get(), (g) c12.f242826c.get(), c12.f242827d.get(), c12.f242828e.get(), c12.f242829f.get());
    }
}
