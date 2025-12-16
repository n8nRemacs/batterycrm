package y80;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: PinchToZoomShowOnboardingEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly80/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_pinch-to-zoom_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: y80.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C50083b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f442957b;

    public C50083b(@l String str, @l String str2, @k String str3, @l String str4, @k PinchToZoomSource pinchToZoomSource) {
        this.f442957b = new ParametrizedClickStreamEvent(14939, 2, C35755b0.c(P0.g(new Q("uid", str), new Q("cid", str2), new Q("mcid", null), new Q("iid", str3), new Q("x", str4), new Q("from_page", pinchToZoomSource.f219968b))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f442957b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f442957b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f442957b.f90248c;
    }
}
