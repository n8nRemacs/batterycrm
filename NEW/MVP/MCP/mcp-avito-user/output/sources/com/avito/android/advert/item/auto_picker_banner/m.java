package com.avito.android.advert.item.auto_picker_banner;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: AutoPickerBannerAnalytics.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/auto_picker_banner/m;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class m implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f73001b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f73002c;

    public m(@Y61.k String str) {
        this.f73001b = str;
        this.f73002c = new ParametrizedClickStreamEvent(10776, 0, P0.g(new Q("iid", str), new Q("banner_type", "autoPickerBanner"), new Q("srcp", "item_card")), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && L.f(this.f73001b, ((m) obj).f73001b);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f73002c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f73002c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f73002c.f90248c;
    }

    public final int hashCode() {
        return this.f73001b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("AutoPickerItemShownEvent(advertId="), this.f73001b, ')');
    }
}
