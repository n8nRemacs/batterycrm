package com.avito.android.publish.slots.sleeping_places;

import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.sleeping_places.SleepingPlacesSlot;

/* compiled from: SleepingPlacesSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final h f244867a;

    public g(h hVar) {
        this.f244867a = hVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final com.avito.android.category_parameters.j a(Slot slot) {
        h hVar = this.f244867a;
        a aVar = (a) hVar.f244868a.get();
        hVar.f244869b.getClass();
        return new e((SleepingPlacesSlot) slot, aVar, new i());
    }
}
