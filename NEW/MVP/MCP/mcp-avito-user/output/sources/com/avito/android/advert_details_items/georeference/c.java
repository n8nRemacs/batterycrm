package com.avito.android.advert_details_items.georeference;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.MultiAddressesInfo;
import com.avito.android.remote.model.RouteButtons;
import kotlin.Metadata;

/* compiled from: AdvertDetailsGeoReferencePresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_details_items/georeference/c;", "LTV0/d;", "Lcom/avito/android/advert_details_items/georeference/f;", "Lcom/avito/android/advert_details_items/georeference/AdvertDetailsGeoReferenceItem;", "a", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface c extends TV0.d<f, AdvertDetailsGeoReferenceItem> {

    /* compiled from: AdvertDetailsGeoReferencePresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/georeference/c$a;", "", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: AdvertDetailsGeoReferencePresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.advert_details_items.georeference.c$a$a, reason: collision with other inner class name */
        public static final class C2522a {
        }

        void G0(@k String str, @l MultiAddressesInfo multiAddressesInfo, @k Coordinates coordinates, @k String str2, @l RouteButtons routeButtons);
    }

    void O3(@k a aVar);
}
