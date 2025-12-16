package com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.search_bar;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SearchBarItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/search_bar/a;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f136861b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f136862c;

    public a(@k String str, boolean z12) {
        this.f136861b = str;
        this.f136862c = z12;
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
        return L.f(this.f136861b, aVar.f136861b) && this.f136862c == aVar.f136862c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123912b() {
        return -2023967187;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF135364b() {
        return "clients_section_search_bar";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f136862c) + H.d(1681526643, 31, this.f136861b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchBarItem(stringId=clients_section_search_bar, query=");
        sb2.append(this.f136861b);
        sb2.append(", showFilterRedPoint=");
        return r.x(sb2, this.f136862c, ')');
    }
}
