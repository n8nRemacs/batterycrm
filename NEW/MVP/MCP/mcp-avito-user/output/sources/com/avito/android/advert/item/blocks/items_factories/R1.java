package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert_details_items.georeference.AdvertDetailsGeoReferenceItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AfterWithIcon;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsGeoReferenceItemFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/R1;", "Lcom/avito/android/advert/item/blocks/items_factories/Q1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class R1 implements Q1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73839a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.blocks.h f73840b;

    @Inject
    public R1(@Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k com.avito.android.advert_core.blocks.h hVar) {
        this.f73839a = jVar;
        this.f73840b = hVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.Q1
    @Y61.k
    public final List<PersistableSpannedItem> a(@Y61.k AdvertDetails advertDetails) {
        String after;
        List<GeoReference> geoReferences = advertDetails.getGeoReferences();
        ArrayList arrayList = null;
        if (geoReferences != null) {
            List<GeoReference> list = geoReferences;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            for (GeoReference geoReference : list) {
                String content = geoReference.getContent();
                AfterWithIcon afterWithIcon = geoReference.getAfterWithIcon();
                if (afterWithIcon == null || (after = afterWithIcon.getText()) == null) {
                    after = geoReference.getAfter();
                }
                String str = after;
                AfterWithIcon afterWithIcon2 = geoReference.getAfterWithIcon();
                arrayList2.add(new AdvertDetailsGeoReferenceItem(0L, null, content, str, afterWithIcon2 != null ? afterWithIcon2.getIconName() : null, geoReference.getColors(), advertDetails.getAddress(), advertDetails.getMultiAddressesInfo(), advertDetails.getCoordinates(), advertDetails.getTitle(), advertDetails.getRouteButtons(), advertDetails.isRestyle() || advertDetails.isRealtyRedesign(), this.f73839a.a(), 3, null));
            }
            arrayList = arrayList2;
        }
        return (arrayList == null || arrayList.isEmpty()) ? Collections.singletonList(this.f73840b.a(0)) : arrayList;
    }
}
