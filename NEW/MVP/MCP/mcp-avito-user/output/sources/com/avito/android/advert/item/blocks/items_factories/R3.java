package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.C36135w2;
import com.avito.android.advert.item.reservation.AdvertReservationInfoItem;
import com.avito.android.remote.model.AdvertDetails;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsReservationInfoItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/R3;", "Lcom/avito/android/advert/item/blocks/items_factories/Q3;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class R3 implements Q3 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73845a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f73846b;

    @Inject
    public R3(@Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k C36135w2 c36135w2) {
        this.f73845a = jVar;
        this.f73846b = c36135w2;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.Q3
    @Y61.l
    public final AdvertReservationInfoItem a(@Y61.k AdvertDetails advertDetails) {
        String reservationInfo;
        C36135w2 c36135w2 = this.f73846b;
        c36135w2.getClass();
        kotlin.reflect.n<Object> nVar = C36135w2.f327457X[4];
        if (((Boolean) c36135w2.f327485f.a().invoke()).booleanValue() && (reservationInfo = advertDetails.getReservationInfo()) != null) {
            return new AdvertReservationInfoItem(0L, null, reservationInfo, this.f73845a.a(), null, 19, null);
        }
        return null;
    }
}
