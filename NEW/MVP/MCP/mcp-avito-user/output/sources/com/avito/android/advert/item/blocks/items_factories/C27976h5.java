package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_details_items.title.AdvertDetailsTitleItem;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsTitleItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/h5;", "Lcom/avito/android/advert/item/blocks/items_factories/g5;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.h5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27976h5 implements InterfaceC27969g5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73967a;

    @Inject
    public C27976h5(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73967a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC27969g5
    @Y61.k
    public final AdvertDetailsTitleItem a(@Y61.k String str, @Y61.l AttributedText attributedText, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        return new AdvertDetailsTitleItem(0L, null, str, attributedText, z12, z13, z14, z15, z16, z17, this.f73967a.a(), null, null, 6147, null);
    }
}
