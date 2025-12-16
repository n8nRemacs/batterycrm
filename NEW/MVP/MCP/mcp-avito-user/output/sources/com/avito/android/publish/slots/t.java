package com.avito.android.publish.slots;

import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.residential_complex.ResidentialComplexSlot;

/* compiled from: ResidentialComplexSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    public final v f245041a;

    public t(v vVar) {
        this.f245041a = vVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final com.avito.android.category_parameters.j a(Slot slot) {
        return new r((ResidentialComplexSlot) slot, this.f245041a.f245147a.get());
    }
}
