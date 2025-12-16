package com.avito.android.constructor_advert.ui.serp.constructor.blueprint;

import Cr.InterfaceC13346a;
import TV0.g;
import Y61.k;
import bj.InterfaceC25659b;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItemViewImpl;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HouseCardConstructorAdvertBlueprint.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/blueprint/d;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/blueprint/a;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItem;", "_avito_constructor-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d extends a<ConstructorAdvertItem> {

    /* renamed from: h, reason: collision with root package name */
    @k
    public final g.a<ConstructorAdvertItemViewImpl> f125810h;

    @Inject
    public d(@k com.avito.android.beduin.common.component.serp_layout.b bVar, @k InterfaceC13346a interfaceC13346a, @k InterfaceC25659b interfaceC25659b, @k com.avito.android.constructor_advert.ui.serp.constructor.b bVar2, @k C36135w2 c36135w2) {
        super(bVar, interfaceC13346a, interfaceC25659b, bVar2, null, c36135w2, null);
        this.f125810h = new g.a<>(R.layout.constructor_advert_house_card_item, new c(interfaceC13346a, c36135w2, interfaceC25659b, bVar2));
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.blueprint.a, TV0.b
    @k
    public final g.a<ConstructorAdvertItemViewImpl> b() {
        return this.f125810h;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.blueprint.a, TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof ConstructorAdvertItem) && ((ConstructorAdvertItem) aVar).getDisplayType().isHouseCard();
    }
}
