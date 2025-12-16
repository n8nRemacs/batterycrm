package qf0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.category_parameters.slot.market_price.MarketPriceResponse;
import java.util.Map;
import kotlin.Metadata;
import org.webrtc.h;
import yc.C50213a;

/* compiled from: ItemAddImvShieldShowEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqf0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qf0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C47393a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C50213a f429340b;

    /* renamed from: c, reason: collision with root package name */
    public final long f429341c;

    /* renamed from: d, reason: collision with root package name */
    public final long f429342d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final MarketPriceResponse.PriceRange f429343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f429344f;

    public C47393a(@k C50213a c50213a, long j12, long j13, @k MarketPriceResponse.PriceRange priceRange) {
        this.f429340b = c50213a;
        this.f429341c = j12;
        this.f429342d = j13;
        this.f429343e = priceRange;
        this.f429344f = new ParametrizedClickStreamEvent(4116, 6, C47394b.a(c50213a, j12, j13, priceRange), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF82866b() {
        return this.f429344f.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f429344f.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF82867c() {
        return this.f429344f.f90248c;
    }

    @k
    public final String toString() {
        return h.e(new StringBuilder("ItemAddScreenOpenEvent (eventId = 4116, params = "), C47394b.a(this.f429340b, this.f429341c, this.f429342d, this.f429343e), ')');
    }
}
