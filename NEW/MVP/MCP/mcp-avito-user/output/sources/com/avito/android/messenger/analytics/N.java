package com.avito.android.messenger.analytics;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: OpenChatEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/analytics/N;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class N implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f186238b;

    public N(@Y61.l Integer num, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, boolean z12) {
        this.f186238b = new ParametrizedClickStreamEvent(2919, 7, C35755b0.c(P0.g(new kotlin.Q("chatid", str), new kotlin.Q("s", z12 ? "push" : "app"), new kotlin.Q("channel_number", num), new kotlin.Q("mid", str2), new kotlin.Q("msg_search_query", str3), new kotlin.Q("avito_user_hash", str4))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f186238b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f186238b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f186238b.f90248c;
    }

    public /* synthetic */ N(String str, boolean z12, Integer num, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this((i12 & 4) != 0 ? null : num, str, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4, z12);
    }
}
