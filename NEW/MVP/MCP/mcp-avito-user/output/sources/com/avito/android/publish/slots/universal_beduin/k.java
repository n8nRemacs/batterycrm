package com.avito.android.publish.slots.universal_beduin;

import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.universal_beduin.UniversalBeduinSlot;

/* compiled from: UniversalBeduinSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    public final m f245068a;

    public k(m mVar) {
        this.f245068a = mVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final com.avito.android.category_parameters.j a(Slot slot) {
        UniversalBeduinSlot universalBeduinSlot = (UniversalBeduinSlot) slot;
        m mVar = this.f245068a;
        return new i(universalBeduinSlot, mVar.f245070a.get(), mVar.f245071b.get(), mVar.f245072c.get(), mVar.f245073d.get(), mVar.f245074e.get(), mVar.f245075f.get(), mVar.f245076g.get(), mVar.f245077h.get(), mVar.f245078i.get(), mVar.f245079j.get());
    }
}
