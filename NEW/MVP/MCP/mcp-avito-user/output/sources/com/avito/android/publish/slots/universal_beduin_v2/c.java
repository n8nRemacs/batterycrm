package com.avito.android.publish.slots.universal_beduin_v2;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.universal_beduin_v2.UniversalBeduinV2Slot;
import dagger.internal.e;

/* compiled from: UniversalBeduinV2SlotWrapperFactory_Impl.java */
@e
/* loaded from: classes16.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final d f245081a;

    public c(d dVar) {
        this.f245081a = dVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        this.f245081a.getClass();
        return new a((UniversalBeduinV2Slot) slot);
    }
}
