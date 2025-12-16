package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.InterfaceC27969g5;
import com.avito.android.advert_core.advert.AdvertDetailsWithMeta;
import com.avito.android.advert_core.blocks.a;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsTitleBlockFactoryImpl.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/block_factories/N2;", "Lcom/avito/android/advert_core/blocks/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class N2 implements com.avito.android.advert_core.blocks.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27969g5 f73466a;

    @Inject
    public N2(@Y61.k InterfaceC27969g5 interfaceC27969g5) {
        this.f73466a = interfaceC27969g5;
    }

    @Override // com.avito.android.advert_core.blocks.a
    @Y61.k
    public final List<PersistableSpannedItem> a(@Y61.k a.b bVar) {
        AdvertDetailsWithMeta advertDetailsWithMeta = bVar.f83013a;
        String title = advertDetailsWithMeta.f82645b.getTitle();
        AdvertDetails advertDetails = advertDetailsWithMeta.f82645b;
        return C42745f0.V(this.f73466a.a(title, advertDetails.getAdditionalSubtitle(), !advertDetails.isActive(), advertDetails.isRestyle(), advertDetails.isGigItem(), advertDetails.isJobRedesign(), false, false));
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
