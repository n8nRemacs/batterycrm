package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.abuse.AdvertDetailsAbuseItem;
import com.avito.android.advert_details.AdvertDetailsStyle;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAbuseItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/e;", "Lcom/avito/android/advert/item/blocks/items_factories/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27949e implements InterfaceC27942d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73939a;

    @Inject
    public C27949e(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73939a = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC27942d
    @Y61.k
    public final AdvertDetailsAbuseItem a(@Y61.k AdvertDetailsStyle advertDetailsStyle, boolean z12, boolean z13) {
        return new AdvertDetailsAbuseItem(z12, z13, 0L, null, this.f73939a.a(), advertDetailsStyle, null, null, 204, null);
    }
}
