package com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DevelopmentTooltipTableItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/development_tooltip_table/a;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f138390b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f138391c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f138392d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final DeepLink f138393e;

    public a(@k String str, @k String str2, @k String str3, @k DeepLink deepLink) {
        this.f138390b = str;
        this.f138391c = str2;
        this.f138392d = str3;
        this.f138393e = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f138390b, aVar.f138390b) && L.f(this.f138391c, aVar.f138391c) && L.f(this.f138392d, aVar.f138392d) && L.f(this.f138393e, aVar.f138393e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return getF132117b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF132117b() {
        return this.f138390b;
    }

    public final int hashCode() {
        return this.f138393e.hashCode() + H.d(H.d(this.f138390b.hashCode() * 31, 31, this.f138391c), 31, this.f138392d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DevelopmentTooltipTableItem(stringId=");
        sb2.append(this.f138390b);
        sb2.append(", title=");
        sb2.append(this.f138391c);
        sb2.append(", subtitle=");
        sb2.append(this.f138392d);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f138393e, ')');
    }
}
