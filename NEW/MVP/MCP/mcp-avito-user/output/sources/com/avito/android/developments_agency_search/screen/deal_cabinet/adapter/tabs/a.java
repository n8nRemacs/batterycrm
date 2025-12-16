package com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.tabs;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TabsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/tabs/a;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Tab f136884a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f136885b;

    public a(@k Tab tab, @l Integer num) {
        this.f136884a = tab;
        this.f136885b = num;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f136884a == aVar.f136884a && L.f(this.f136885b, aVar.f136885b);
    }

    public final int hashCode() {
        int iHashCode = this.f136884a.hashCode() * 31;
        Integer num = this.f136885b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabItem(tab=");
        sb2.append(this.f136884a);
        sb2.append(", count=");
        return s.j(sb2, this.f136885b, ')');
    }
}
