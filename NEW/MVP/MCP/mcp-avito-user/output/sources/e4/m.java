package E4;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.short_term_rent.payment_toggles.AdvertDetailsTravelPaymentTogglesItem;
import com.avito.android.advert.item.short_term_rent.payment_toggles.toggle.AdvertDetailsTravelPaymentToggleItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertShortTermRent;
import com.avito.android.remote.model.short_term_rent.TravelPaymentToggles;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsTravelPaymentTogglesItemFactory.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE4/m;", "LE4/l;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f3740a;

    @Inject
    public m(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f3740a = jVar;
    }

    @Override // E4.l
    @Y61.l
    public final AdvertDetailsTravelPaymentTogglesItem a(@Y61.k AdvertDetails advertDetails) {
        TravelPaymentToggles paymentToggles;
        TravelPaymentToggles paymentToggles2;
        AdvertShortTermRent shortTermRent = advertDetails.getShortTermRent();
        AttributedText title = null;
        List<TravelPaymentToggles.Item> items = (shortTermRent == null || (paymentToggles2 = shortTermRent.getPaymentToggles()) == null) ? null : paymentToggles2.getItems();
        if (!O2.a(items)) {
            items = null;
        }
        if (items == null) {
            return null;
        }
        int iA2 = this.f3740a.a();
        AdvertShortTermRent shortTermRent2 = advertDetails.getShortTermRent();
        if (shortTermRent2 != null && (paymentToggles = shortTermRent2.getPaymentToggles()) != null) {
            title = paymentToggles.getTitle();
        }
        AttributedText attributedText = title;
        List<TravelPaymentToggles.Item> list = items;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (TravelPaymentToggles.Item item : list) {
            String id2 = item.getId();
            Boolean enabled = item.getEnabled();
            arrayList.add(new AdvertDetailsTravelPaymentToggleItem(id2, enabled != null ? enabled.booleanValue() : false, item.getOnboardingDeeplink(), item.getText(), item.getPrice(), item.getDiscountPercent(), item.getPriceWithDiscount(), item.getOnClickEvent()));
        }
        return new AdvertDetailsTravelPaymentTogglesItem(0L, null, iA2, null, null, attributedText, arrayList, null, 155, null);
    }
}
