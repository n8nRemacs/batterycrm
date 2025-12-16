package Nf0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: LimitsHistoryShowEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNf0/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish-limits-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Nf0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14571c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f11700b;

    public C14571c(@l String str) {
        this.f11700b = new ParametrizedClickStreamEvent(4966, 1, C35755b0.c(Collections.singletonMap("iid", str)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f11700b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f11700b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f11700b.f90248c;
    }
}
