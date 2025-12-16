package com.avito.android.sx_address.list.analytics;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ShowInfoBannerEvent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/analytics/f;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f293055b;

    public f(@Y61.k String str, @l Long l12, long j12, @Y61.k String str2) {
        HashMap map = new HashMap();
        map.put("esid", str);
        if (l12 != null) {
            map.put("subs_tariff_id", Long.valueOf(l12.longValue()));
        }
        map.put("tariff_level_id", Long.valueOf(j12));
        map.put("banner_type", str2);
        G0 g02 = G0.f406611a;
        this.f293055b = new ParametrizedClickStreamEvent(12772, 0, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF270967b() {
        return this.f293055b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f293055b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF270968c() {
        return this.f293055b.f90248c;
    }
}
