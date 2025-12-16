package com.avito.android.publish.slots.accordion;

import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.accordion.AccordionSlot;

/* compiled from: AccordionSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final m f242817a;

    public l(m mVar) {
        this.f242817a = mVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final com.avito.android.category_parameters.j a(Slot slot) {
        AccordionSlot accordionSlot = (AccordionSlot) slot;
        m mVar = this.f242817a;
        return new j(accordionSlot, mVar.f242818a.get(), mVar.f242819b.get(), mVar.f242820c.get(), mVar.f242821d.get(), (com.avito.android.analytics.provider.a) mVar.f242822e.get());
    }
}
