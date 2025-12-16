package com.avito.android.advert_details_items.comfortable_deal_info;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.C35755b0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ComfortableDealInfoBannerClickedEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/comfortable_deal_info/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f84576b = new com.avito.android.analytics.provider.clickstream.b(14859, 2);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f84577c;

    public a(@l String str) {
        this.f84577c = C35755b0.c(P0.j(new Q("pagetype", str)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f84576b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, String> getParams() {
        return this.f84577c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f84576b.f90263c;
    }
}
