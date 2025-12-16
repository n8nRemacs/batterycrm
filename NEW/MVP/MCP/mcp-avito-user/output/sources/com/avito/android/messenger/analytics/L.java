package com.avito.android.messenger.analytics;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: MessengerSuggestClickedBeforeSendText.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/analytics/L;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class L implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f186197b;

    public L(String str, String str2, int i12, boolean z12, String str3, String str4, String str5, int i13, C42822w c42822w) {
        this.f186197b = new ParametrizedClickStreamEvent(12424, 0, C35755b0.c(P0.g(new kotlin.Q("chatid", str), new kotlin.Q("tx", str2), new kotlin.Q("position", Integer.valueOf(i12)), new kotlin.Q("s", (i13 & 64) != 0 ? NotificationsSettings.Section.SECTION_MESSENGER : str5), new kotlin.Q("is_seller", Boolean.valueOf(z12)), new kotlin.Q("answerText", str3), new kotlin.Q("trigger_mid", str4))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f186197b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f186197b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f186197b.f90248c;
    }
}
