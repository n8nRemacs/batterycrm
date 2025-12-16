package E4;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.short_term_rent.entity.ShortTermRentItemDiscount;
import com.avito.android.advert.item.short_term_rent.item_discount.AdvertDetailsShortTermRentItemDiscountItem;
import com.avito.android.remote.model.AdvertShortTermRent;
import com.avito.android.remote.model.item_discount.ShortTermRentItemDiscounts;
import com.avito.android.remote.model.item_discount.ShortTermRentNonRefundableDiscount;
import com.avito.android.util.C35794g;
import com.avito.android.util.C35842m;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsShortTermRentItemDiscountItemFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE4/b;", "LE4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f3725a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C35794g f3726b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C35842m f3727c;

    @Inject
    public b(@Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k C35794g c35794g, @Y61.k C35842m c35842m) {
        this.f3725a = jVar;
        this.f3726b = c35794g;
        this.f3727c = c35842m;
    }

    @Override // E4.a
    @Y61.l
    public final AdvertDetailsShortTermRentItemDiscountItem a(@Y61.l AdvertShortTermRent advertShortTermRent) {
        ShortTermRentItemDiscount shortTermRentItemDiscount;
        if (advertShortTermRent == null) {
            return null;
        }
        ShortTermRentItemDiscounts itemDiscounts = advertShortTermRent.getItemDiscounts();
        ShortTermRentNonRefundableDiscount nonRefundableDiscount = itemDiscounts != null ? itemDiscounts.getNonRefundableDiscount() : null;
        if (nonRefundableDiscount == null || !nonRefundableDiscount.getIsAvailable()) {
            shortTermRentItemDiscount = null;
        } else {
            String title = itemDiscounts.getTitle();
            if (title == null) {
                title = "";
            }
            String str = title;
            String description = nonRefundableDiscount.getDescription();
            boolean isEnabled = nonRefundableDiscount.getIsEnabled();
            Long lValueOf = Long.valueOf(nonRefundableDiscount.getTotalPrice());
            C35794g c35794g = this.f3726b;
            String strA = c35794g.a(lValueOf);
            String strA2 = c35794g.a(Long.valueOf(nonRefundableDiscount.getPriceWithDiscount()));
            Integer numValueOf = Integer.valueOf(nonRefundableDiscount.getDiscountPercent());
            this.f3727c.getClass();
            shortTermRentItemDiscount = new ShortTermRentItemDiscount(str, description, isEnabled, strA, strA2, "-" + numValueOf + '%', nonRefundableDiscount.getDeepLink());
        }
        if (shortTermRentItemDiscount == null) {
            return null;
        }
        return new AdvertDetailsShortTermRentItemDiscountItem(0L, null, shortTermRentItemDiscount, this.f3725a.a(), null, null, 51, null);
    }
}
