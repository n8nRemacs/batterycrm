package com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TabLayoutItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/tab_layout/a;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Tab f138455a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Long f138456b;

    public a(@k Tab tab, @l Long l12) {
        this.f138455a = tab;
        this.f138456b = l12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f138455a == aVar.f138455a && L.f(this.f138456b, aVar.f138456b);
    }

    public final int hashCode() {
        int iHashCode = this.f138455a.hashCode() * 31;
        Long l12 = this.f138456b;
        return iHashCode + (l12 == null ? 0 : l12.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabItem(tab=");
        sb2.append(this.f138455a);
        sb2.append(", count=");
        return m.m(sb2, this.f138456b, ')');
    }
}
