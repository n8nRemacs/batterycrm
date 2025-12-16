package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC27961f4;
import com.avito.android.advert.item.safedeal.trust_factors.TrustFactorsItem;
import com.avito.android.advert_core.blocks.a;
import com.avito.android.advert_core.gap.AdvertDetailsGapItem;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: AdvertDetailsSafeDealBlockFactoryImpl.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/block_factories/Y1;", "Lcom/avito/android/advert_core/blocks/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Y1 implements com.avito.android.advert_core.blocks.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C4.c f73512a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27961f4 f73513b;

    @Inject
    public Y1(@Y61.k C4.c cVar, @Y61.k InterfaceC27961f4 interfaceC27961f4) {
        this.f73512a = cVar;
        this.f73513b = interfaceC27961f4;
    }

    @Override // com.avito.android.advert_core.blocks.a
    @Y61.k
    public final List<PersistableSpannedItem> a(@Y61.k a.b bVar) {
        AdvertDetailsGapItem advertDetailsGapItemA = bVar.f83015c.getOffset() != null ? null : this.f73512a.a(24);
        List<TrustFactorsItem> listA = this.f73513b.a(bVar.f83013a.f82645b);
        if (listA.isEmpty()) {
            return C42784z0.f406748b;
        }
        if (advertDetailsGapItemA == null) {
            return listA;
        }
        return C42745f0.h0(listA, Collections.singletonList(advertDetailsGapItemA));
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
