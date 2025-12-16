package Uc;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ModelReviewListViewEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUc/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics-ratings-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Uc.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15507a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f16514b;

    public C15507a(@k String str, @k String str2, int i12, float f12) {
        this.f16514b = new ParametrizedClickStreamEvent(6810, 1, P0.g(new Q("iid", str), new Q("rating", Float.valueOf(f12)), new Q("reviews_cnt", Integer.valueOf(i12)), new Q("model_type_id", str2)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f16514b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f16514b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f16514b.f90248c;
    }
}
