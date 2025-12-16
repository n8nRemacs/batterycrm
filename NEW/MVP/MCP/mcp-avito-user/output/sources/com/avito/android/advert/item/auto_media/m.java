package com.avito.android.advert.item.auto_media;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsAutoMediaAnalytics.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/auto_media/m;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class m implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f72932b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f72933c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f72934d;

    public m(@Y61.k String str, @Y61.k String str2) {
        this.f72932b = str;
        this.f72933c = str2;
        this.f72934d = new ParametrizedClickStreamEvent(9883, 2, P0.g(new Q("action_type", "Открытие видео"), new Q("from_page", str2), new Q("landing_slug", str), new Q("platform_name", "android"), new Q("platform", 3)), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f72932b, mVar.f72932b) && L.f(this.f72933c, mVar.f72933c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f72934d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f72934d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f72934d.f90248c;
    }

    public final int hashCode() {
        return this.f72933c.hashCode() + (this.f72932b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsAutoMediaVideoShowEvent(videoTitle=");
        sb2.append(this.f72932b);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f72933c, ')');
    }
}
