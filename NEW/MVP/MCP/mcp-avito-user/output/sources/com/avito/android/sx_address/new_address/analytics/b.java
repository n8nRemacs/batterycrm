package com.avito.android.sx_address.new_address.analytics;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.sx_address.list.analytics.FromPage;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SaveNewAddressClickEvent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/analytics/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f293573b;

    public b(@k String str, @l Long l12, @l Long l13, @l String str2, @k FromPage fromPage) {
        HashMap map = new HashMap();
        map.put("esid", str);
        if (l12 != null) {
            map.put("address_id", Long.valueOf(l12.longValue()));
        }
        if (l13 != null) {
            map.put("location_id", Long.valueOf(l13.longValue()));
        }
        if (str2 != null) {
            map.put("error_type", str2);
        }
        map.put("from_page", fromPage.name().toLowerCase(Locale.ROOT));
        G0 g02 = G0.f406611a;
        this.f293573b = new ParametrizedClickStreamEvent(12767, 1, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f293573b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f293573b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f293573b.f90248c;
    }
}
