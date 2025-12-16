package sd;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: AppRaterErrorEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsd/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_app-rater_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sd.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C48160a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f437935b;

    public C48160a(@k String str, @k String str2) {
        this.f437935b = new ParametrizedClickStreamEvent(14177, 0, P0.g(new Q("install_source", str), new Q("errors_detailed", str2)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f437935b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f437935b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f437935b.f90248c;
    }
}
