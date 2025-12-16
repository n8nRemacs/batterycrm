package com.avito.android.inline_filters.dialog.location_group.adapter.checkbox;

import Y41.p;
import Y61.k;
import com.avito.android.inline_filters.dialog.location_group.adapter.GroupFilterItem;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GroupFilterItemCheckboxItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/location_group/adapter/checkbox/e;", "Lcom/avito/android/inline_filters/dialog/location_group/adapter/checkbox/c;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p<Integer, InlineFilterValue, G0> f171721b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k p<? super Integer, ? super InlineFilterValue, G0> pVar) {
        this.f171721b = pVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        GroupFilterItem groupFilterItem = (GroupFilterItem) aVar;
        String displayTitle = groupFilterItem.f171704c.getDisplayTitle();
        if (displayTitle == null && (displayTitle = groupFilterItem.f171704c.getTitle()) == null) {
            displayTitle = "";
        }
        fVar.setTitle(displayTitle);
        InlineFilterValue value = groupFilterItem.f171704c.getValue();
        InlineFilterValue.InlineFilterBooleanValue inlineFilterBooleanValue = value instanceof InlineFilterValue.InlineFilterBooleanValue ? (InlineFilterValue.InlineFilterBooleanValue) value : null;
        fVar.Z1(inlineFilterBooleanValue != null ? inlineFilterBooleanValue.getValue() : false);
        fVar.d7(new d(fVar, this, i12));
    }
}
