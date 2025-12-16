package com.avito.android.publish.slots;

import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.delivery_dbs_toggles.DeliveryDbsTogglesSlot;

/* compiled from: DeliveryDbsTogglesSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    public final o f244599a;

    public n(o oVar) {
        this.f244599a = oVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final com.avito.android.category_parameters.j a(Slot slot) {
        o oVar = this.f244599a;
        return new l((DeliveryDbsTogglesSlot) slot, oVar.f244664a.get(), oVar.f244665b.get());
    }
}
