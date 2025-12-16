package com.avito.android.publish.slots.promoblock;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.promoblock.PromoblockSlot;

/* compiled from: PromoblockSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final e f244715a;

    public d(e eVar) {
        this.f244715a = eVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        this.f244715a.getClass();
        return new b((PromoblockSlot) slot);
    }
}
