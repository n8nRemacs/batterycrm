package com.avito.android.publish.slots.images_enhancement;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.images_enhancement.ImagesEnhancementSlot;

/* compiled from: ImagesEnhancementSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final h f244119a;

    public g(h hVar) {
        this.f244119a = hVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        ImagesEnhancementSlot imagesEnhancementSlot = (ImagesEnhancementSlot) slot;
        h hVar = this.f244119a;
        return new e(imagesEnhancementSlot, hVar.f244120a.get(), hVar.f244121b.get(), hVar.f244122c.get(), hVar.f244123d.get());
    }
}
