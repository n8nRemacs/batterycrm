package com.avito.android.developments_agency_search.adapter.commission_promo_banner;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommissionPromoBannerItem.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/adapter/commission_promo_banner/a;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a, b.InterfaceC10495b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f136228b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f136229c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f136230d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f136231e;

    /* renamed from: f, reason: collision with root package name */
    public final long f136232f = -498373388;

    public a(@k String str, @k String str2, @k String str3, @k String str4) {
        this.f136228b = str;
        this.f136229c = str2;
        this.f136230d = str3;
        this.f136231e = str4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return L.f(this.f136228b, aVar.f136228b) && L.f(this.f136229c, aVar.f136229c) && L.f(this.f136230d, aVar.f136230d) && this.f136231e.equals(aVar.f136231e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83915c() {
        return -498373388;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF137249b() {
        return "commission-promo-banner-item";
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF83932t() {
        return this.f136232f;
    }

    public final int hashCode() {
        return this.f136231e.hashCode() + H.d(H.d(H.d(1730294156, 31, this.f136228b), 31, this.f136229c), 31, this.f136230d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommissionPromoBannerItem(stringId=commission-promo-banner-item, title=");
        sb2.append(this.f136228b);
        sb2.append(", subtitle=");
        sb2.append(this.f136229c);
        sb2.append(", conditionsUrl=");
        sb2.append(this.f136230d);
        sb2.append(", analyticsFromPage=");
        return C22026a.c(sb2, this.f136231e, ')');
    }
}
