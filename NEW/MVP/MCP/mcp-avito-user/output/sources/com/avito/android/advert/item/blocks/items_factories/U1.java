package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_details_items.geo_zones.AdvertDetailsGeoZonesItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.GeoZones;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsGeoZonesItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/U1;", "Lcom/avito/android/advert/item/blocks/items_factories/T1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class U1 implements T1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.B2 f73862a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73863b;

    @Inject
    public U1(@Y61.k com.avito.android.B2 b22, @Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73862a = b22;
        this.f73863b = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.T1
    @Y61.l
    public final AdvertDetailsGeoZonesItem a(@Y61.k AdvertDetails advertDetails) {
        GeoZones geoZones = advertDetails.getGeoZones();
        String title = geoZones != null ? geoZones.getTitle() : null;
        if (title == null || title.length() == 0 || !this.f73862a.v().invoke().booleanValue()) {
            return null;
        }
        int iA2 = this.f73863b.a();
        GeoZones geoZones2 = advertDetails.getGeoZones();
        String title2 = geoZones2 != null ? geoZones2.getTitle() : null;
        return new AdvertDetailsGeoZonesItem(0L, null, iA2, null, null, title2 == null ? "" : title2, 27, null);
    }
}
