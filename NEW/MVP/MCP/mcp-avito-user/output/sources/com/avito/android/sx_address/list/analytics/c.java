package com.avito.android.sx_address.list.analytics;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DeleteAddressConfirmClickEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/analytics/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f293052b;

    public c(@Y61.k String str) {
        ActionType actionType = ActionType.f293042b;
        HashMap mapG = org.webrtc.h.g("esid", str);
        mapG.put("button_name", "DELETE".toLowerCase(Locale.ROOT));
        G0 g02 = G0.f406611a;
        this.f293052b = new ParametrizedClickStreamEvent(12769, 0, mapG, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f293052b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f293052b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f293052b.f90248c;
    }
}
