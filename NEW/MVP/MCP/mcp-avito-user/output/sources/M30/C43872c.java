package m30;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: SelectBrandModelFiltersBottomSheetEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lm30/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_new-cars-mark-model-filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: m30.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C43872c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<Long> f414284b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414285c;

    public C43872c(int i12, @k String str, @k List list) {
        this.f414284b = list;
        int i13 = 4196;
        this.f414285c = new ParametrizedClickStreamEvent(i13, 7, P0.g(new Q("cid", 9), new Q("filter_id", Integer.valueOf(i12)), new Q("filter_name", str), new Q("from_source", "inline_filter"), new Q("filter_value_ids", list)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f414285c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f414285c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f414285c.f90248c;
    }
}
