package com.avito.android.publish.slots.network_stores_fake_door_slot;

import com.avito.android.publish.analytics.T;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.network_stores_fake_door.NetworkStoresFakeDoorSlot;

/* compiled from: GenerateNetworkStoresFakeDoorSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* renamed from: com.avito.android.publish.slots.network_stores_fake_door_slot.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34123c implements InterfaceC34122b {

    /* renamed from: a, reason: collision with root package name */
    public final E f244612a;

    public C34123c(E e12) {
        this.f244612a = e12;
    }

    @Override // com.avito.android.publish.slots.x
    public final com.avito.android.category_parameters.j a(Slot slot) {
        return new D((NetworkStoresFakeDoorSlot) slot, (T) this.f244612a.f244606a.get());
    }
}
