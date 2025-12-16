package ed0;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: TruckContactProgressToastBarClickEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Led0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_progress-info-toast-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ed0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C40090a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f395259b;

    public C40090a(@k String str) {
        this.f395259b = new ParametrizedClickStreamEvent(8335, 2, Collections.singletonMap("contact_iteration", str), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83096b() {
        return this.f395259b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f395259b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83097c() {
        return this.f395259b.f90248c;
    }
}
