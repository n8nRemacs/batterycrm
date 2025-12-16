package com.avito.android.publish.slots.delivery_all_toggles;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.delivery_all_toggles.DeliveryAllTogglesSlot;

/* compiled from: DeliveryAllTogglesSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final g f243463a;

    public e(g gVar) {
        this.f243463a = gVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        g gVar = this.f243463a;
        return new f((DeliveryAllTogglesSlot) slot, gVar.f243471a.get(), gVar.f243472b.get());
    }
}
