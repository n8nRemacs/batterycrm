package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.scroll_up.AdvertDetailsScrollUpItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsScrollUpItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/j4;", "Lcom/avito/android/advert/item/blocks/items_factories/i4;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.j4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27989j4 implements InterfaceC27982i4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73975a;

    @Inject
    public C27989j4(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73975a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC27982i4
    @Y61.k
    public final AdvertDetailsScrollUpItem a(@Y61.k String str) {
        return new AdvertDetailsScrollUpItem(0L, null, this.f73975a.a(), null, null, str, 27, null);
    }
}
