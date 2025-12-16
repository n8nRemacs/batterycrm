package com.avito.android.tariff_cpt.info.ui.items.filters_tabs;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptInfoFiltersTabsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/info/ui/items/filters_tabs/b;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f298330b;

    public b(@k ArrayList arrayList) {
        this.f298330b = arrayList;
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
        return L.f(this.f298330b, bVar.f298330b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return 118729665;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF296475b() {
        return "cpt_info_features_filter";
    }

    public final int hashCode() {
        return this.f298330b.hashCode() - 614347681;
    }

    @k
    public final String toString() {
        return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("CptInfoFiltersTabsItem(stringId=cpt_info_features_filter, filters="), this.f298330b, ')');
    }
}
