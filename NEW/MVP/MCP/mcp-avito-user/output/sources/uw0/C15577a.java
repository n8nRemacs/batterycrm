package Uw0;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SoaStatProfileSettingToggleEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUw0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_soa-stat_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Uw0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15577a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f16782b;

    public C15577a(boolean z12) {
        this.f16782b = new ParametrizedClickStreamEvent(4138, 0, Collections.singletonMap("sold_on_avito_feature", z12 ? "1" : "0"), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF441796b() {
        return this.f16782b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f16782b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF441797c() {
        return this.f16782b.f90248c;
    }
}
