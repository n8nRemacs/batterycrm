package com.avito.android.publish.slots;

import com.avito.android.publish.O;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.auto_publish.AutoPublishSlot;

/* compiled from: AutoPublishSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final j f244061a;

    public h(j jVar) {
        this.f244061a = jVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final com.avito.android.category_parameters.j a(Slot slot) {
        AutoPublishSlot autoPublishSlot = (AutoPublishSlot) slot;
        j jVar = this.f244061a;
        return new C34116a(autoPublishSlot, jVar.f244407a.get(), jVar.f244408b.get(), jVar.f244409c.get(), jVar.f244410d.get(), jVar.f244411e.get(), jVar.f244412f.get(), jVar.f244413g.get(), jVar.f244414h.get(), (O) jVar.f244415i.get());
    }
}
