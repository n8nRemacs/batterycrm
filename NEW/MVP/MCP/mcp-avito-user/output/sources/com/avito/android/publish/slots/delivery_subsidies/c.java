package com.avito.android.publish.slots.delivery_subsidies;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlot;
import dagger.internal.e;

/* compiled from: DeliverySubsidiesSlotWrapperFactory_Impl.java */
@e
/* loaded from: classes16.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final d f243556a;

    public c(d dVar) {
        this.f243556a = dVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        this.f243556a.getClass();
        return new a((DeliverySubsidiesSlot) slot);
    }
}
