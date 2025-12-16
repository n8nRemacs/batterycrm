package F4;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.similars.j;
import com.avito.android.advert.item.travel.trust.AdvertDetailsTravelTrustItem;
import com.avito.android.analytics.a0;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.short_term_rent.TravelTrustItemDto;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsTravelTrustItemFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LF4/f;", "LF4/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f4534a;

    @Inject
    public f(@k j jVar) {
        this.f4534a = jVar;
    }

    @Override // F4.e
    @l
    public final AdvertDetailsTravelTrustItem a(@k TravelTrustItemDto travelTrustItemDto) {
        AttributedText title = travelTrustItemDto.getTitle();
        if (title == null) {
            return null;
        }
        ParametrizedEvent onShowEvent = travelTrustItemDto.getOnShowEvent();
        return new AdvertDetailsTravelTrustItem(0L, null, this.f4534a.getSpanCount(), null, null, title, onShowEvent != null ? a0.a(onShowEvent) : null, travelTrustItemDto.getDeepLink(), 27, null);
    }
}
