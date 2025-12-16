package com.avito.android.advert_core.short_term_rent;

import Y61.l;
import com.avito.android.remote.model.AdvertShortTermRent;
import com.avito.android.remote.model.item_discount.ShortTermRentItemDiscounts;
import com.avito.android.remote.model.item_discount.ShortTermRentNonRefundableDiscount;
import com.avito.android.remote.model.travel.AdvertDetailsTravelPrice;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;
import lE.C43624b;

/* compiled from: AdvertDetailsShortTermRentItemVariantInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/short_term_rent/b;", "Lcom/avito/android/advert_core/short_term_rent/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43624b f84339a;

    @Inject
    public b(@Y61.k C43624b c43624b) {
        this.f84339a = c43624b;
    }

    @Override // com.avito.android.advert_core.short_term_rent.a
    public final boolean a(@l AdvertShortTermRent advertShortTermRent) {
        return !c(advertShortTermRent);
    }

    @Override // com.avito.android.advert_core.short_term_rent.a
    public final boolean b(@l AdvertShortTermRent advertShortTermRent) {
        ShortTermRentItemDiscounts itemDiscounts;
        ShortTermRentNonRefundableDiscount nonRefundableDiscount;
        Boolean isBookingBottomBar;
        boolean zBooleanValue = (advertShortTermRent == null || (isBookingBottomBar = advertShortTermRent.getIsBookingBottomBar()) == null) ? false : isBookingBottomBar.booleanValue();
        C43624b c43624b = this.f84339a;
        c43624b.getClass();
        n<Object> nVar = C43624b.f413639o[4];
        if (((Boolean) c43624b.f413644f.a().invoke()).booleanValue() && zBooleanValue) {
            return ((advertShortTermRent != null ? advertShortTermRent.getItemDiscounts() : null) == null || (itemDiscounts = advertShortTermRent.getItemDiscounts()) == null || (nonRefundableDiscount = itemDiscounts.getNonRefundableDiscount()) == null || !nonRefundableDiscount.getIsAvailable()) ? false : true;
        }
        return false;
    }

    @Override // com.avito.android.advert_core.short_term_rent.a
    public final boolean c(@l AdvertShortTermRent advertShortTermRent) {
        Boolean isBookingBottomBar;
        C43624b c43624b = this.f84339a;
        c43624b.getClass();
        n<Object> nVar = C43624b.f413639o[4];
        if (((Boolean) c43624b.f413644f.a().invoke()).booleanValue()) {
            return (advertShortTermRent == null || (isBookingBottomBar = advertShortTermRent.getIsBookingBottomBar()) == null) ? false : isBookingBottomBar.booleanValue();
        }
        return false;
    }

    @Override // com.avito.android.advert_core.short_term_rent.a
    public final boolean d(@l AdvertShortTermRent advertShortTermRent) {
        C43624b c43624b = this.f84339a;
        c43624b.getClass();
        n<Object> nVar = C43624b.f413639o[5];
        if (((Boolean) c43624b.f413645g.a().invoke()).booleanValue()) {
            if ((advertShortTermRent != null ? advertShortTermRent.getPaymentToggles() : null) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.avito.android.advert_core.short_term_rent.a
    public final boolean e(@l AdvertDetailsTravelPrice advertDetailsTravelPrice) {
        return (advertDetailsTravelPrice == null || advertDetailsTravelPrice.getVersion() == null || advertDetailsTravelPrice.getPrice() == null) ? false : true;
    }
}
