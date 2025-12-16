package com.avito.android.publish.slots.iac_devices;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.iac_devices.IacDevicesSlot;

/* compiled from: IacDevicesSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final e f244087a;

    public d(e eVar) {
        this.f244087a = eVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        IacDevicesSlot iacDevicesSlot = (IacDevicesSlot) slot;
        e eVar = this.f244087a;
        return new b(eVar.f244088a.get(), eVar.f244089b.get(), iacDevicesSlot, eVar.f244090c.get(), eVar.f244091d.get(), eVar.f244092e.get(), eVar.f244093f.get(), eVar.f244094g.get(), eVar.f244095h.get(), (com.avito.android.publish.iac_devices.d) eVar.f244096i.get(), eVar.f244097j.get());
    }
}
