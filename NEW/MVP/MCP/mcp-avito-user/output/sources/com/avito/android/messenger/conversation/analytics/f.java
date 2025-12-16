package com.avito.android.messenger.conversation.analytics;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ClickIcebreakerMessengerEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/analytics/f;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f189336b;

    public f(String str, int i12, String str2, boolean z12, String str3, int i13, C42822w c42822w) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("s", (i13 & 16) != 0 ? NotificationsSettings.Section.SECTION_MESSENGER : str3), new Q("chatid", str), new Q("is_seller", Boolean.valueOf(z12)), new Q("ice_breakers_id", Integer.valueOf(i12)));
        if (str2 != null) {
            linkedHashMapJ.put("intent", str2);
        }
        G0 g02 = G0.f406611a;
        this.f189336b = new ParametrizedClickStreamEvent(4210, 6, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f189336b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f189336b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f189336b.f90248c;
    }
}
