package nJ;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import qJ.C47304a;

/* compiled from: EventAndroidDoNotDisturbMode15990.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnJ/l;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nJ.l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C44277l implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415053b;

    public C44277l(boolean z12) {
        this.f415053b = new ParametrizedClickStreamEvent(15990, 0, C47304a.a(Collections.singletonMap("is_turn_on", Boolean.valueOf(z12))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19127b() {
        return this.f415053b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415053b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19128c() {
        return this.f415053b.f90248c;
    }
}
