package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FunnelItemData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/items/funnel/a;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f317459a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeepLink f317460b;

    public a(@Y61.k String str, @Y61.k DeepLink deepLink) {
        this.f317459a = str;
        this.f317460b = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f317459a, aVar.f317459a) && L.f(this.f317460b, aVar.f317460b);
    }

    public final int hashCode() {
        return this.f317460b.hashCode() + (this.f317459a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConversionData(value=");
        sb2.append(this.f317459a);
        sb2.append(", descriptionDeeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f317460b, ')');
    }
}
