package com.avito.android.publish.slots.market_price;

import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.market_price.MarketPriceSlot;

/* compiled from: MarketPriceSlotWrapperFactory_Impl.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    public final o f244553a;

    public m(o oVar) {
        this.f244553a = oVar;
    }

    @Override // com.avito.android.publish.slots.x
    public final com.avito.android.category_parameters.j a(Slot slot) {
        MarketPriceSlot marketPriceSlot = (MarketPriceSlot) slot;
        o oVar = this.f244553a;
        return new a(marketPriceSlot, oVar.f244555a.get(), oVar.f244556b.get(), oVar.f244557c.get(), oVar.f244558d.get(), oVar.f244559e.get(), oVar.f244560f.get(), oVar.f244561g.get(), oVar.f244562h.get(), oVar.f244563i.get(), oVar.f244564j.get(), oVar.f244565k.get(), oVar.f244566l.get());
    }
}
