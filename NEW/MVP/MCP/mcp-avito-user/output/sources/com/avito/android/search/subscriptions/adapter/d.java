package com.avito.android.search.subscriptions.adapter;

import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SearchSubscriptionItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/subscriptions/adapter/d;", "Lcom/avito/conveyor_item/a;", "_avito_search_subscriptions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class d implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f263864b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f263865c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f263866d;

    /* renamed from: e, reason: collision with root package name */
    public final long f263867e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f263868f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f263869g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final DeepLink f263870h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final DeepLink f263871i;

    public d(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, long j12, boolean z12, @Y61.l String str4, @Y61.l DeepLink deepLink, @Y61.l DeepLink deepLink2) {
        this.f263864b = str;
        this.f263865c = str2;
        this.f263866d = str3;
        this.f263867e = j12;
        this.f263868f = z12;
        this.f263869g = str4;
        this.f263870h = deepLink;
        this.f263871i = deepLink2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f263864b, dVar.f263864b) && L.f(this.f263865c, dVar.f263865c) && L.f(this.f263866d, dVar.f263866d) && this.f263867e == dVar.f263867e && this.f263868f == dVar.f263868f && L.f(this.f263869g, dVar.f263869g) && L.f(this.f263870h, dVar.f263870h) && L.f(this.f263871i, dVar.f263871i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207600b() {
        return getF263864b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF263864b() {
        return this.f263864b;
    }

    public final int hashCode() {
        int iHashCode = this.f263864b.hashCode() * 31;
        String str = this.f263865c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f263866d;
        int i12 = r.i(r.g((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f263867e), 31, this.f263868f);
        String str3 = this.f263869g;
        int iHashCode3 = (i12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DeepLink deepLink = this.f263870h;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        DeepLink deepLink2 = this.f263871i;
        return iHashCode4 + (deepLink2 != null ? deepLink2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchSubscriptionItem(stringId=");
        sb2.append(this.f263864b);
        sb2.append(", title=");
        sb2.append(this.f263865c);
        sb2.append(", description=");
        sb2.append(this.f263866d);
        sb2.append(", lastUpdateTime=");
        sb2.append(this.f263867e);
        sb2.append(", hasNewItems=");
        sb2.append(this.f263868f);
        sb2.append(", ssid=");
        sb2.append(this.f263869g);
        sb2.append(", editAction=");
        sb2.append(this.f263870h);
        sb2.append(", openAction=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f263871i, ')');
    }
}
