package com.avito.android.inline_filters.dialog.location_group.adapter.local_priority;

import Y41.p;
import Y61.k;
import com.avito.android.inline_filters.dialog.location_group.adapter.GroupFilterItem;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GroupFilterItemLocalPriorityPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/location_group/adapter/local_priority/d;", "Lcom/avito/android/inline_filters/dialog/location_group/adapter/local_priority/c;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p<Integer, InlineFilterValue, G0> f171749b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k p<? super Integer, ? super InlineFilterValue, G0> pVar) {
        this.f171749b = pVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        GroupFilterItem groupFilterItem = (GroupFilterItem) aVar;
        eVar2.setTitle(groupFilterItem.f171704c.getTitle());
        eVar2.NU(groupFilterItem.f171704c, this.f171749b, i12);
    }
}
