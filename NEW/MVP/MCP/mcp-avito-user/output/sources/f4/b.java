package F4;

import F4.d;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.similars.j;
import com.avito.android.advert.item.travel.price.AdvertDetailsTravelPriceItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.travel.AdvertDetailsTravelPrice;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AdvertDetailsTravelPriceFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LF4/b;", "LF4/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f4531a;

    @Inject
    public b(@k j jVar) {
        this.f4531a = jVar;
    }

    @Override // F4.a
    @l
    public final AdvertDetailsTravelPriceItem a(@k AdvertDetails advertDetails) {
        AdvertDetailsTravelPriceItem.Version version;
        AdvertDetailsTravelPriceItem.Version version2;
        AdvertDetailsTravelPrice travelPrice = advertDetails.getTravelPrice();
        if (travelPrice == null) {
            return null;
        }
        AdvertDetailsTravelPrice.Version version3 = travelPrice.getVersion();
        int i12 = version3 == null ? -1 : d.a.f4533a[version3.ordinal()];
        if (i12 != -1) {
            if (i12 == 1) {
                version2 = AdvertDetailsTravelPriceItem.Version.f80566b;
            } else if (i12 == 2) {
                version2 = AdvertDetailsTravelPriceItem.Version.f80567c;
            } else if (i12 == 3) {
                version2 = AdvertDetailsTravelPriceItem.Version.f80568d;
            } else {
                if (i12 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                version2 = AdvertDetailsTravelPriceItem.Version.f80569e;
            }
            version = version2;
        } else {
            version = null;
        }
        if (version == null) {
            return null;
        }
        return new AdvertDetailsTravelPriceItem(0L, null, this.f4531a.getSpanCount(), null, null, travelPrice.getPrice(), travelPrice.getOldPrice(), travelPrice.getDiscount(), travelPrice.getSubTitle(), version, 27, null);
    }
}
