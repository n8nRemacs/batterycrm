package com.avito.android.publish.slots.imv;

import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.imv.InstantMarketValueSlot;

/* compiled from: InstantMarketValueSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    public final o f244308a;

    public m(o oVar) {
        this.f244308a = oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.publish.slots.x
    public final com.avito.android.category_parameters.j a(Slot slot) {
        InstantMarketValueSlot instantMarketValueSlot = (InstantMarketValueSlot) slot;
        o oVar = this.f244308a;
        return new k(instantMarketValueSlot, oVar.f244310a.get(), oVar.f244311b.get(), oVar.f244312c.get(), oVar.f244313d.get(), oVar.f244314e.get(), oVar.f244315f.get(), oVar.f244316g.get(), oVar.f244317h.get(), oVar.f244318i.get(), oVar.f244319j.get(), ((Boolean) oVar.f244320k.get()).booleanValue());
    }
}
