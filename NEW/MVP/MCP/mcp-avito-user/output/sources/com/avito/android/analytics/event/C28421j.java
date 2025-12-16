package com.avito.android.analytics.event;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ApplicationWarmStartTimeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/j;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.event.j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28421j implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f90098b;

    public C28421j(@Y61.k String str, boolean z12, long j12) {
        this.f90098b = new ParametrizedClickStreamEvent(6978, 1, kotlin.collections.P0.g(new kotlin.Q("mobile_event_duration", Long.valueOf(j12)), new kotlin.Q("screen", str), new kotlin.Q("is_first_time", Boolean.valueOf(z12))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f90098b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f90098b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f90098b.f90248c;
    }
}
