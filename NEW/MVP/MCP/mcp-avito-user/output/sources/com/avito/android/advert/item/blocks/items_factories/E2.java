package com.avito.android.advert.item.blocks.items_factories;

import aO.InterfaceC19797c;
import com.avito.android.advert.di.C27710t;
import com.avito.android.advert.item.installments.InstallmentsBlockItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.credit_broker.CreditBrokerProduct;
import com.avito.android.remote.model.credit_broker.InstallmentsV3Product;
import com.avito.android.remote.model.credit_broker.installments_block.InstallmentsBlockDto;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsInstallmentsBlockItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/E2;", "Lcom/avito/android/advert/item/blocks/items_factories/D2;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class E2 implements D2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73738a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19797c f73739b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f73740c;

    @Inject
    public E2(@Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k InterfaceC19797c interfaceC19797c, @C27710t.q boolean z12) {
        this.f73738a = jVar;
        this.f73739b = interfaceC19797c;
        this.f73740c = z12;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.D2
    @Y61.l
    public final InstallmentsBlockItem a(@Y61.k AdvertDetails advertDetails) {
        InstallmentsBlockDto bottomBlock;
        if (this.f73740c) {
            return null;
        }
        CreditBrokerProduct creditInfo = advertDetails.getCreditInfo();
        InstallmentsV3Product installmentsV3Product = creditInfo instanceof InstallmentsV3Product ? (InstallmentsV3Product) creditInfo : null;
        if (installmentsV3Product == null || (bottomBlock = installmentsV3Product.getBottomBlock()) == null) {
            return null;
        }
        return new InstallmentsBlockItem(this.f73739b.a(bottomBlock), this.f73738a.a(), 0L, null, null, null, 60, null);
    }
}
