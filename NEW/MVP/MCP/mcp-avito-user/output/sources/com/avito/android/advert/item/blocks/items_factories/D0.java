package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.di.C27710t;
import com.avito.android.credits.broker_link.CreditBrokerLinkItem;
import com.avito.android.credits.models.CreditCalculator;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.credit_broker.CreditBrokerProduct;
import com.avito.android.remote.model.credit_broker.EntryPoint;
import com.avito.android.remote.model.credit_broker.InstallmentsV3Product;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsCreditBrokerLinkItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/D0;", "Lcom/avito/android/advert/item/blocks/items_factories/C0;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class D0 implements C0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credits.q f73724a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73725b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f73726c;

    @Inject
    public D0(@Y61.k com.avito.android.credits.q qVar, @Y61.k com.avito.android.advert.item.similars.j jVar, @C27710t.q boolean z12) {
        this.f73724a = qVar;
        this.f73725b = jVar;
        this.f73726c = z12;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.C0
    @Y61.l
    public final CreditBrokerLinkItem a(@Y61.k AdvertDetails advertDetails) {
        EntryPoint.CreditBrokerLinkType type;
        if (this.f73726c) {
            return null;
        }
        CreditBrokerProduct creditInfo = advertDetails.getCreditInfo();
        InstallmentsV3Product installmentsV3Product = creditInfo instanceof InstallmentsV3Product ? (InstallmentsV3Product) creditInfo : null;
        EntryPoint topBlock = installmentsV3Product != null ? installmentsV3Product.getTopBlock() : null;
        com.avito.android.advert.item.similars.j jVar = this.f73725b;
        if (topBlock != null) {
            CreditCalculator.Type type2 = CreditCalculator.Type.f128983h;
            EntryPoint.CreditBrokerLinkType type3 = topBlock.getType();
            if (type3 == null) {
                type3 = EntryPoint.CreditBrokerLinkType.CUSTOM;
            }
            return new CreditBrokerLinkItem(type2, type3, "", topBlock, null, 0L, null, jVar.a(), null, null, 864, null);
        }
        CreditCalculator data = this.f73724a.getData();
        if (data == null) {
            return null;
        }
        boolean z12 = (data instanceof com.avito.android.credits.models.h) || (data instanceof com.avito.android.credits.models.c) || (data instanceof com.avito.android.credits.models.d);
        if (data.getF129016C() == null && z12) {
            return null;
        }
        EntryPoint f129016c = data.getF129016C();
        if (f129016c == null || (type = f129016c.getType()) == null) {
            type = EntryPoint.CreditBrokerLinkType.DEFAULT;
        }
        EntryPoint.CreditBrokerLinkType creditBrokerLinkType = type;
        String str = data.f128974x;
        EntryPoint f129016c2 = data.getF129016C();
        com.avito.android.credits.models.e eVar = data instanceof com.avito.android.credits.models.e ? (com.avito.android.credits.models.e) data : null;
        return new CreditBrokerLinkItem(data.f128957g, creditBrokerLinkType, str, f129016c2, eVar != null ? eVar.f129002A : null, 0L, null, jVar.a(), null, null, 864, null);
    }
}
