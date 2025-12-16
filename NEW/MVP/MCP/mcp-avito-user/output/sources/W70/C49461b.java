package w70;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: PhoneReverificationInfoShownEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw70/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: w70.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49461b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f441298b;

    public C49461b(boolean z12) {
        this.f441298b = new ParametrizedClickStreamEvent(5115, 0, Collections.singletonMap("is_rebinding_available", Boolean.valueOf(z12)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83096b() {
        return this.f441298b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f441298b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83097c() {
        return this.f441298b.f90248c;
    }
}
