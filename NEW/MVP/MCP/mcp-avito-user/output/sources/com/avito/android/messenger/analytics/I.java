package com.avito.android.messenger.analytics;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: MessengerPlatformActionClickedEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/analytics/I;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class I implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f186194b;

    public I(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.l String str5) {
        this.f186194b = new ParametrizedClickStreamEvent(3439, 4, C35755b0.c(P0.g(new kotlin.Q("chatid", str), new kotlin.Q("mid", str2), new kotlin.Q("flow_id", str3), new kotlin.Q("msg_button_type", str4), new kotlin.Q("action_payload", str5))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f186194b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f186194b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f186194b.f90248c;
    }
}
