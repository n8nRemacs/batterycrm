package com.avito.android.advert.item.compatibility.v3;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import j.k0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: GarageCompatibilityV3Analytics.kt */
@P
@k0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v3/j;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class j implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f74463b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f74464c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f74465d;

    public j(@Y61.k String str, @Y61.k String str2) {
        this.f74463b = str;
        this.f74464c = str2;
        this.f74465d = new ParametrizedClickStreamEvent(13239, 0, P0.g(new Q("item_id", str), new Q("landing_action", "marka_click"), new Q("landing_slug", str2)), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f74463b, jVar.f74463b) && L.f(this.f74464c, jVar.f74464c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f74465d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f74465d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f74465d.f90248c;
    }

    public final int hashCode() {
        return this.f74464c.hashCode() + (this.f74463b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GarageCompatibilityV3MarkClickedEvent(advertId=");
        sb2.append(this.f74463b);
        sb2.append(", mark=");
        return C22026a.c(sb2, this.f74464c, ')');
    }
}
