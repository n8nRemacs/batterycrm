package m30;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: OnBrandModelOpenBottomSheetEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lm30/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: m30.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C43871b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414283b = new ParametrizedClickStreamEvent(4160, 3, P0.g(new Q("cid", 9), new Q("filter_id", 110000), new Q("filter_name", "Марка"), new Q("from_source", "inline_filter")), null, 8, null);

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f414283b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f414283b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f414283b.f90248c;
    }
}
