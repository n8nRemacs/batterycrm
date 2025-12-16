package com.avito.android.search.filter.analytics;

import androidx.appcompat.app.r;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: FilterRequestLengthEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/analytics/g;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class g implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f262649b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f262650c;

    public g(int i12) {
        this.f262649b = i12;
        this.f262650c = new ParametrizedClickStreamEvent(7117, 1, P0.j(new Q("request_length", Integer.valueOf(i12))), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f262649b == ((g) obj).f262649b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f262650c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f262650c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f262650c.f90248c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f262649b);
    }

    @Y61.k
    public final String toString() {
        return r.t(new StringBuilder("FilterRequestLengthEvent(requestStringLength="), this.f262649b, ')');
    }
}
