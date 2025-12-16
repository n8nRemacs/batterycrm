package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert_core.advert.AdvertDetailsWithMeta;
import com.avito.android.advert_core.blocks.a;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertShortTermRent;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsShortTermRentBlockFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/block_factories/w2;", "Lcom/avito/android/advert_core/blocks/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.block_factories.w2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27908w2 implements com.avito.android.advert_core.blocks.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.short_term_rent.a f73672a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E4.d f73673b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E4.a f73674c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E4.l f73675d;

    @Inject
    public C27908w2(@Y61.k com.avito.android.advert_core.short_term_rent.a aVar, @Y61.k E4.d dVar, @Y61.k E4.a aVar2, @Y61.k E4.l lVar) {
        this.f73672a = aVar;
        this.f73673b = dVar;
        this.f73674c = aVar2;
        this.f73675d = lVar;
    }

    @Override // com.avito.android.advert_core.blocks.a
    @Y61.k
    public final List<PersistableSpannedItem> a(@Y61.k a.b bVar) {
        AdvertDetailsWithMeta advertDetailsWithMeta = bVar.f83013a;
        AdvertShortTermRent shortTermRent = advertDetailsWithMeta.f82645b.getShortTermRent();
        com.avito.android.advert_core.short_term_rent.a aVar = this.f73672a;
        boolean zB2 = aVar.b(shortTermRent);
        AdvertDetails advertDetails = advertDetailsWithMeta.f82645b;
        return C42745f0.V(zB2 ? this.f73674c.a(advertDetails.getShortTermRent()) : aVar.d(advertDetails.getShortTermRent()) ? this.f73675d.a(advertDetails) : this.f73673b.a(advertDetails));
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
