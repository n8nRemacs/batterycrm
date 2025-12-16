package com.avito.android.vas_performance.ui.items.competitive_vas_tabs;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: CompetitiveVasTabsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/competitive_vas_tabs/b;", "Lcom/avito/conveyor_item/a;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f321664b;

    /* renamed from: c, reason: collision with root package name */
    public final int f321665c;

    public b(int i12, @k ArrayList arrayList) {
        this.f321664b = arrayList;
        this.f321665c = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        return this.f321664b.equals(bVar.f321664b) && this.f321665c == bVar.f321665c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269950b() {
        return 277835237;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF289505b() {
        return "competitive_vas_tabs";
    }

    public final int hashCode() {
        return Integer.hashCode(this.f321665c) + androidx.compose.ui.graphics.colorspace.e.g(this.f321664b, 22957755, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CompetitiveVasTabsItem(stringId=competitive_vas_tabs, tabs=");
        sb2.append(this.f321664b);
        sb2.append(", selectedPosition=");
        return r.t(sb2, this.f321665c, ')');
    }
}
