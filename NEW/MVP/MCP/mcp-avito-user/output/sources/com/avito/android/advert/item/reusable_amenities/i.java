package com.avito.android.advert.item.reusable_amenities;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.Z0;
import com.avito.android.advert_amenities.Amenities;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AmenitiesPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/reusable_amenities/i;", "Lcom/avito/android/advert/item/reusable_amenities/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final B7.a f78614b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Z0 f78615c;

    @Inject
    public i(@Y61.k B7.a aVar) {
        this.f78614b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        AmenitiesItem amenitiesItem = (AmenitiesItem) aVar;
        kVar.w(amenitiesItem.f78601k);
        List<Amenities.Amenity> list = amenitiesItem.f78600j;
        if (list != null) {
            this.f78614b.b(amenitiesItem.f78603m, amenitiesItem.f78602l);
            int i13 = amenitiesItem.f78597g;
            List<Amenities.Amenity> listE0 = C42745f0.E0(list, i13);
            boolean z12 = list.size() > i13;
            kVar.s1(listE0);
            if (z12) {
                kVar.RP(amenitiesItem.f78598h, new h(this, amenitiesItem));
            } else {
                kVar.fH();
            }
        }
    }

    @Override // com.avito.android.advert.item.reusable_amenities.g
    public final void U5(@Y61.k Z0 z02) {
        this.f78615c = z02;
    }

    @Override // com.avito.android.advert.item.reusable_amenities.g
    public final void c0() {
        this.f78615c = null;
    }
}
