package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FunnelItemData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/items/funnel/l;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f317484a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f317485b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final UniversalColor f317486c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final DeepLink f317487d;

    public l(@Y61.l String str, @Y61.l String str2, @Y61.l UniversalColor universalColor, @Y61.l DeepLink deepLink) {
        this.f317484a = str;
        this.f317485b = str2;
        this.f317486c = universalColor;
        this.f317487d = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.f317484a, lVar.f317484a) && L.f(this.f317485b, lVar.f317485b) && L.f(this.f317486c, lVar.f317486c) && L.f(this.f317487d, lVar.f317487d);
    }

    public final int hashCode() {
        String str = this.f317484a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f317485b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalColor universalColor = this.f317486c;
        int iHashCode3 = (iHashCode2 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        DeepLink deepLink = this.f317487d;
        return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IncrementData(value=");
        sb2.append(this.f317484a);
        sb2.append(", description=");
        sb2.append(this.f317485b);
        sb2.append(", color=");
        sb2.append(this.f317486c);
        sb2.append(", detailsLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f317487d, ')');
    }

    public /* synthetic */ l(String str, String str2, UniversalColor universalColor, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, universalColor, deepLink);
    }
}
