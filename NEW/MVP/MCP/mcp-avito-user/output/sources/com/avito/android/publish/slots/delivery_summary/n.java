package com.avito.android.publish.slots.delivery_summary;

import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.delivery_summary.DeliverySummarySlot;
import dl0.InterfaceC39749a;

/* compiled from: DeliverySummarySlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    public final o f243677a;

    public n(o oVar) {
        this.f243677a = oVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final com.avito.android.category_parameters.j a(Slot slot) {
        DeliverySummarySlot deliverySummarySlot = (DeliverySummarySlot) slot;
        o oVar = this.f243677a;
        return new l(deliverySummarySlot, oVar.f243678a.get(), oVar.f243679b.get(), oVar.f243680c.get(), oVar.f243681d.get(), oVar.f243682e.get(), oVar.f243683f.get(), oVar.f243684g.get(), (InterfaceC39749a) oVar.f243685h.get(), oVar.f243686i.get());
    }
}
