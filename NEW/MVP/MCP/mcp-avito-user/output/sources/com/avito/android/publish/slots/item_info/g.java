package com.avito.android.publish.slots.item_info;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.item_info.ItemInfoSlot;

/* compiled from: ItemInfoSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final h f244366a;

    public g(h hVar) {
        this.f244366a = hVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        return new e((ItemInfoSlot) slot, this.f244366a.f244367a.get());
    }
}
