package com.avito.android.publish.slots.images_groups;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.images_groups.ImagesGroupsSlot;

/* compiled from: ImagesGroupsSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final f f244151a;

    public d(f fVar) {
        this.f244151a = fVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        ImagesGroupsSlot imagesGroupsSlot = (ImagesGroupsSlot) slot;
        f fVar = this.f244151a;
        return new b(imagesGroupsSlot, fVar.f244152a.get(), fVar.f244153b.get(), fVar.f244154c.get(), fVar.f244155d.get(), fVar.f244156e.get(), fVar.f244157f.get(), (g80.d) fVar.f244158g.get(), fVar.f244159h.get());
    }
}
