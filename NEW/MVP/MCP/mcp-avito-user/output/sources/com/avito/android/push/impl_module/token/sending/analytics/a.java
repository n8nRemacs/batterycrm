package com.avito.android.push.impl_module.token.sending.analytics;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: NotificationSystemSettingsChangeEvent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/push/impl_module/token/sending/analytics/a;", "Lcc/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements cc.e, com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f245997b;

    public a(@Y61.k String str, boolean z12) {
        this.f245997b = new ParametrizedClickStreamEvent(2558, 1, P0.g(new Q("push_token", str), new Q("bool_param", Boolean.valueOf(z12))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF222438b() {
        return this.f245997b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f245997b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF222439c() {
        return this.f245997b.f90248c;
    }
}
