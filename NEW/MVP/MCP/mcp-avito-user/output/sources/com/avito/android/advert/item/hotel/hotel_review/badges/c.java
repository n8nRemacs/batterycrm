package com.avito.android.advert.item.hotel.hotel_review.badges;

import androidx.compose.runtime.internal.P;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.UniversalColor;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertHotelRatingBadgePresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_review/badges/c;", "LTV0/d;", "Lcom/avito/android/advert/item/hotel/hotel_review/badges/f;", "Lcom/avito/android/advert/item/hotel/hotel_review/badges/AdvertHotelRatingBadgeItem;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements TV0.d<f, AdvertHotelRatingBadgeItem> {
    @Inject
    public c() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        AdvertHotelRatingBadgeItem advertHotelRatingBadgeItem = (AdvertHotelRatingBadgeItem) aVar;
        fVar.b(advertHotelRatingBadgeItem.f76247f);
        fVar.j(advertHotelRatingBadgeItem.f76248g);
        String str = advertHotelRatingBadgeItem.f76249h;
        if (L.f(str, "korona")) {
            fVar.Qn();
        } else {
            fVar.gL(str != null ? q.a(str) : null);
        }
        fVar.v(advertHotelRatingBadgeItem.f76244c);
        fVar.D5(advertHotelRatingBadgeItem.f76245d);
        UniversalColor universalColor = advertHotelRatingBadgeItem.f76246e;
        fVar.GP(universalColor);
        fVar.je(universalColor);
    }
}
