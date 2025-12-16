package com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TabLayoutItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/adapter/tab_layout/b;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f138457b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<a> f138458c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Tab f138459d;

    public b() {
        throw null;
    }

    public b(String str, List list, Tab tab, int i12, C42822w c42822w) {
        this.f138457b = (i12 & 1) != 0 ? "tab_layout" : str;
        this.f138458c = list;
        this.f138459d = tab;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f138457b, bVar.f138457b) && L.f(this.f138458c, bVar.f138458c) && this.f138459d == bVar.f138459d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return getF135128b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF137846b() {
        return this.f138457b;
    }

    public final int hashCode() {
        return this.f138459d.hashCode() + H.e(this.f138457b.hashCode() * 31, 31, this.f138458c);
    }

    @k
    public final String toString() {
        return "TabLayoutItem(stringId=" + this.f138457b + ", tabItems=" + this.f138458c + ", selectedTab=" + this.f138459d + ')';
    }
}
