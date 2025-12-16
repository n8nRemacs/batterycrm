package E4;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.short_term_rent.entity.ShortTermRentStrButtons;
import com.avito.android.advert.item.short_term_rent.str_buttons.AdvertDetailsShortTermRentStrButtonsItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertShortTermRent;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsShortTermRentStrButtonsItemFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LE4/e;", "LE4/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f3731a;

    @Inject
    public e(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f3731a = jVar;
    }

    @Override // E4.d
    @Y61.l
    public final AdvertDetailsShortTermRentStrButtonsItem a(@Y61.k AdvertDetails advertDetails) {
        AdvertShortTermRent shortTermRent = advertDetails.getShortTermRent();
        if (shortTermRent == null || shortTermRent.getActions() == null) {
            return null;
        }
        return new AdvertDetailsShortTermRentStrButtonsItem(0L, null, new ShortTermRentStrButtons(shortTermRent.getActions(), shortTermRent.getInsights()), advertDetails.isRedesign(), this.f3731a.a(), null, null, 99, null);
    }
}
