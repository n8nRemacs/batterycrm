package com.avito.android.publish.slots.images_groups_recommendations;

import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.images_groups_recommendations.ImagesGroupsRecommendationsSlot;

/* compiled from: ImagesGroupsRecommendationsSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    public final p f244251a;

    public n(p pVar) {
        this.f244251a = pVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final com.avito.android.category_parameters.j a(Slot slot) {
        ImagesGroupsRecommendationsSlot imagesGroupsRecommendationsSlot = (ImagesGroupsRecommendationsSlot) slot;
        p pVar = this.f244251a;
        return new i(imagesGroupsRecommendationsSlot, pVar.f244252a.get(), pVar.f244253b.get(), pVar.f244254c.get(), pVar.f244255d.get(), pVar.f244256e.get(), pVar.f244257f.get(), pVar.f244258g.get());
    }
}
