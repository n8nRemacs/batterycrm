package com.avito.android.free_delivery;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: FreeDeliveryEvents.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/free_delivery/u;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_free-delivery_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class u implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f158864b;

    public u(boolean z12, boolean z13, String str, String str2, Long l12, String str3, int i12, C42822w c42822w) {
        this.f158864b = new ParametrizedClickStreamEvent(12843, 4, C35755b0.c(P0.g(new Q("item_id", (i12 & 16) != 0 ? null : l12), new Q("esid", (i12 & 32) != 0 ? null : str3), new Q("price", str), new Q("srcp", str2), new Q("has_used_slider_for_new_free_delivery", Boolean.valueOf(z12)), new Q("has_used_keyboard_for_new_free_delivery", Boolean.valueOf(z13)))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f158864b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f158864b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f158864b.f90248c;
    }
}
