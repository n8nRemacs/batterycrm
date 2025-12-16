package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.realty_usp.RealtyUspItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.RealtyUsp;
import com.avito.android.remote.model.RealtyUspChip;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsRealtyUspItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/I3;", "Lcom/avito/android/advert/item/blocks/items_factories/H3;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class I3 implements H3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73774a;

    @Inject
    public I3(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73774a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.H3
    @Y61.l
    public final RealtyUspItem a(@Y61.k AdvertDetails advertDetails) {
        RealtyUsp realtyUSP = advertDetails.getRealtyUSP();
        if (realtyUSP == null) {
            return null;
        }
        List<RealtyUspChip> list = realtyUSP.getList();
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new RealtyUspItem.UspChipData(((RealtyUspChip) it.next()).getTitle()));
        }
        return new RealtyUspItem(0L, null, this.f73774a.a(), arrayList, realtyUSP.getCollapsedMaxLines(), advertDetails.getId(), 3, null);
    }
}
