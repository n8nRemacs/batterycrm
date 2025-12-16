package com.avito.android.publish.slots.delivery_summary_edit;

import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary_edit.DeliverySummaryEditSlot;

/* compiled from: DeliverySummaryEditSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final s f243829a;

    public r(s sVar) {
        this.f243829a = sVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final com.avito.android.category_parameters.j a(Slot slot) {
        DeliverySummaryEditSlot deliverySummaryEditSlot = (DeliverySummaryEditSlot) slot;
        s sVar = this.f243829a;
        return new f(deliverySummaryEditSlot, sVar.f243855a.get(), sVar.f243856b.get(), sVar.f243857c.get(), sVar.f243858d.get(), sVar.f243859e.get(), sVar.f243860f.get(), sVar.f243861g.get(), sVar.f243862h.get(), sVar.f243863i.get(), sVar.f243864j.get(), sVar.f243865k.get());
    }
}
