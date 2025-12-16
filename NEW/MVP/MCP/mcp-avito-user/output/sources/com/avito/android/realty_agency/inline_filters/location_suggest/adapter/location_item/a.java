package com.avito.android.realty_agency.inline_filters.location_suggest.adapter.location_item;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LocationItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/location_suggest/adapter/location_item/a;", "Lcom/avito/conveyor_item/a;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f251639b;

    /* renamed from: c, reason: collision with root package name */
    public final long f251640c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f251641d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f251642e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f251643f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f251644g;

    public a(@k String str, long j12, @k String str2, @l String str3, boolean z12, boolean z13) {
        this.f251639b = str;
        this.f251640c = j12;
        this.f251641d = str2;
        this.f251642e = str3;
        this.f251643f = z12;
        this.f251644g = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f251639b, aVar.f251639b) && this.f251640c == aVar.f251640c && L.f(this.f251641d, aVar.f251641d) && L.f(this.f251642e, aVar.f251642e) && this.f251643f == aVar.f251643f && this.f251644g == aVar.f251644g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83054c() {
        return getF199668b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF199668b() {
        return this.f251639b;
    }

    public final int hashCode() {
        int iD2 = H.d(r.g(this.f251639b.hashCode() * 31, 31, this.f251640c), 31, this.f251641d);
        String str = this.f251642e;
        return Boolean.hashCode(this.f251644g) + r.i((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f251643f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocationItem(stringId=");
        sb2.append(this.f251639b);
        sb2.append(", locationId=");
        sb2.append(this.f251640c);
        sb2.append(", name=");
        sb2.append(this.f251641d);
        sb2.append(", parentLocation=");
        sb2.append(this.f251642e);
        sb2.append(", showRecentLocationIcon=");
        sb2.append(this.f251643f);
        sb2.append(", checked=");
        return r.x(sb2, this.f251644g, ')');
    }
}
