package qy;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.edit_carousel.analytics.CarouselAnalyticsScenario;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ExtendedProfileCarouselSaveItemsEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqy/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qy.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C47460a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f429533b;

    public C47460a(int i12, @k CarouselAnalyticsScenario carouselAnalyticsScenario) {
        this.f429533b = new ParametrizedClickStreamEvent(5949, 2, "ext_profile_window_save_items", P0.g(new Q("items_count", Integer.valueOf(i12)), new Q("window_scenario", carouselAnalyticsScenario.f146325b)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f429533b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f429533b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f429533b.f90248c;
    }
}
