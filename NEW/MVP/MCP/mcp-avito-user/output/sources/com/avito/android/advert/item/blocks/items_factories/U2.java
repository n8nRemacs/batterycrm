package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.note.AdvertDetailsNoteItem;
import com.avito.android.remote.model.AdvertDetails;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsNoteItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/U2;", "Lcom/avito/android/advert/item/blocks/items_factories/T2;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class U2 implements T2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73864a;

    @Inject
    public U2(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73864a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.T2
    @Y61.k
    public final AdvertDetailsNoteItem a(@Y61.k AdvertDetails advertDetails) {
        return new AdvertDetailsNoteItem(0L, null, advertDetails.getNote(), this.f73864a.a(), null, null, 51, null);
    }
}
