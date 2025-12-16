package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: PublishParamClickedEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/y0;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class y0 implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f2486b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f2487c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C50213a f2488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2489e;

    public y0(@Y61.k String str, @Y61.l String str2, @Y61.k C50213a c50213a) {
        this.f2486b = str;
        this.f2487c = str2;
        this.f2488d = c50213a;
        this.f2489e = new ParametrizedClickStreamEvent(5614, 2, z0.a(str, str2, c50213a), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF90129b() {
        return this.f2489e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2489e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF90130c() {
        return this.f2489e.f90248c;
    }

    @Y61.k
    public final String toString() {
        return "PublishInputClickedEvent(5614) " + z0.a(this.f2486b, this.f2487c, this.f2488d);
    }
}
