package com.avito.android.developments_agency_search.screen.deal_room.adapter.revenue_recalculation_banner;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RevenueRecalculationBannerItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/revenue_recalculation_banner/a;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f137415b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f137416c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f137417d;

    /* renamed from: e, reason: collision with root package name */
    public final int f137418e;

    /* renamed from: f, reason: collision with root package name */
    public final int f137419f;

    /* renamed from: g, reason: collision with root package name */
    public final int f137420g;

    public a(@InterfaceC42165v int i12, int i13, int i14, @k String str, @k String str2, @k String str3) {
        this.f137415b = str;
        this.f137416c = str2;
        this.f137417d = str3;
        this.f137418e = i12;
        this.f137419f = i13;
        this.f137420g = i14;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f137415b.equals(aVar.f137415b) && L.f(this.f137416c, aVar.f137416c) && L.f(this.f137417d, aVar.f137417d) && this.f137418e == aVar.f137418e && this.f137419f == aVar.f137419f && this.f137420g == aVar.f137420g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return getF135128b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF135128b() {
        return this.f137415b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f137420g) + r.e(this.f137419f, r.e(this.f137418e, H.d(H.d(this.f137415b.hashCode() * 31, 31, this.f137416c), 31, this.f137417d), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RevenueRecalculationBannerItem(stringId=");
        sb2.append(this.f137415b);
        sb2.append(", title=");
        sb2.append(this.f137416c);
        sb2.append(", subtitle=");
        sb2.append(this.f137417d);
        sb2.append(", leftDrawableIconId=");
        sb2.append(this.f137418e);
        sb2.append(", topCornersRadiusDp=");
        sb2.append(this.f137419f);
        sb2.append(", bottomCornersRadiusDp=");
        return r.t(sb2, this.f137420g, ')');
    }
}
