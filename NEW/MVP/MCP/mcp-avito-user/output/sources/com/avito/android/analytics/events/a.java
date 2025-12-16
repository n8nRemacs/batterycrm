package com.avito.android.analytics.events;

import com.avito.android.analytics.clickstream.C28376a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AppStartEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/events/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-apps_shared_di"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f90152b;

    public a(long j12) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(" app_start_earliest", new C28376a().a(j12, TimeUnit.MILLISECONDS));
        G0 g02 = G0.f406611a;
        this.f90152b = new ParametrizedClickStreamEvent(4104, 0, linkedHashMap, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19127b() {
        return this.f90152b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f90152b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF11770c() {
        return this.f90152b.f90248c;
    }
}
