package com.avito.android.publish.slots.job_premoderation;

import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.job_premoderation.JobPremoderationSlot;
import dagger.internal.e;

/* compiled from: JobPremoderationSlotWrapperFactory_Impl.java */
@e
/* loaded from: classes16.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final d f244431a;

    public c(d dVar) {
        this.f244431a = dVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final j a(Slot slot) {
        d dVar = this.f244431a;
        return new a((JobPremoderationSlot) slot, dVar.f244432a.get(), dVar.f244433b.get(), dVar.f244434c.get());
    }
}
