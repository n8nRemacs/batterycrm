package sd;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: AppRaterTryToShowEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsd/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_app-rater_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sd.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C48161b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f437936b;

    public C48161b(@k String str) {
        this.f437936b = new ParametrizedClickStreamEvent(4052, 0, Collections.singletonMap("from_page", str), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83096b() {
        return this.f437936b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f437936b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83097c() {
        return this.f437936b.f90248c;
    }
}
