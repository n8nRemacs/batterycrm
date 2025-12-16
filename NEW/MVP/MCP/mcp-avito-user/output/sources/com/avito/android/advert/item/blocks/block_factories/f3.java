package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.K5;
import com.avito.android.advert_core.blocks.a;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: MarketplaceStocksBlockFactoryImpl.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/block_factories/f3;", "Lcom/avito/android/advert_core/blocks/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f3 implements com.avito.android.advert_core.blocks.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final K5 f73560a;

    @Inject
    public f3(@Y61.k K5 k52) {
        this.f73560a = k52;
    }

    @Override // com.avito.android.advert_core.blocks.a
    @Y61.l
    public final List<PersistableSpannedItem> a(@Y61.k a.b bVar) {
        return C42745f0.V(this.f73560a.a(bVar.f83013a.f82645b));
    }

    @Override // com.avito.android.advert_core.blocks.a
    @Y61.l
    public final List<PersistableSpannedItem> b(@Y61.k a.b bVar) {
        return a.C2462a.a(this, bVar);
    }

    @Override // com.avito.android.advert_core.blocks.a
    public final boolean c(@Y61.k a.b bVar) {
        return true;
    }
}
