package com.avito.android.search.filter.adapter.group_clearance;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GroupClearanceResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/group_clearance/k;", "Lcom/avito/android/search/filter/adapter/group_clearance/j;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f262334a;

    @Inject
    public k(@Y61.k Resources resources) {
        this.f262334a = resources;
    }

    @Override // com.avito.android.search.filter.adapter.group_clearance.j
    @Y61.k
    public final String a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4) {
        return this.f262334a.getString(R.string.search_filter_clearance_from_to_range, str, str2, str4, str3, str4);
    }

    @Override // com.avito.android.search.filter.adapter.group_clearance.j
    @Y61.k
    public final String b(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        return this.f262334a.getString(R.string.search_filter_clearance_range, str, str2, str3);
    }

    @Override // com.avito.android.search.filter.adapter.group_clearance.j
    @Y61.k
    public final String c() {
        return this.f262334a.getString(R.string.search_filter_clearance_unit_of_measure);
    }
}
