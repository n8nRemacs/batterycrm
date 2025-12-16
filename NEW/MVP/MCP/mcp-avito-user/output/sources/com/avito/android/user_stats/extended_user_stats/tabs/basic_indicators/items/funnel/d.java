package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FunnelItemData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/items/funnel/d;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f317467a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f317468b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f317469c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final l f317470d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final a f317471e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final DeepLink f317472f;

    public d(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l l lVar, @Y61.l a aVar, @Y61.l DeepLink deepLink) {
        this.f317467a = str;
        this.f317468b = str2;
        this.f317469c = str3;
        this.f317470d = lVar;
        this.f317471e = aVar;
        this.f317472f = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f317467a, dVar.f317467a) && L.f(this.f317468b, dVar.f317468b) && L.f(this.f317469c, dVar.f317469c) && L.f(this.f317470d, dVar.f317470d) && L.f(this.f317471e, dVar.f317471e) && L.f(this.f317472f, dVar.f317472f);
    }

    public final int hashCode() {
        int iHashCode = this.f317467a.hashCode() * 31;
        String str = this.f317468b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f317469c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        l lVar = this.f317470d;
        int iHashCode4 = (iHashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        a aVar = this.f317471e;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        DeepLink deepLink = this.f317472f;
        return iHashCode5 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FunnelItem(title=");
        sb2.append(this.f317467a);
        sb2.append(", count=");
        sb2.append(this.f317468b);
        sb2.append(", description=");
        sb2.append(this.f317469c);
        sb2.append(", increment=");
        sb2.append(this.f317470d);
        sb2.append(", conversion=");
        sb2.append(this.f317471e);
        sb2.append(", itemDetailsLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f317472f, ')');
    }

    public /* synthetic */ d(String str, String str2, String str3, l lVar, a aVar, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, lVar, aVar, (i12 & 32) != 0 ? null : deepLink);
    }
}
