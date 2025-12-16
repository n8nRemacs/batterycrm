package com.avito.android.inline_filters.dialog.location_group.adapter;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GroupFilterItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/location_group/adapter/e;", "Lcom/avito/android/inline_filters/dialog/location_group/adapter/c;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<Integer, G0> f171739b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<Integer, G0> f171740c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k l<? super Integer, G0> lVar, @k l<? super Integer, G0> lVar2) {
        this.f171739b = lVar;
        this.f171740c = lVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        GroupFilterItem groupFilterItem = (GroupFilterItem) aVar;
        boolean zF2 = L.f(groupFilterItem.f171704c.isHighlighted(), Boolean.TRUE);
        String displayTitle = groupFilterItem.f171704c.getDisplayTitle();
        if (displayTitle == null && (displayTitle = groupFilterItem.f171704c.getTitle()) == null) {
            displayTitle = "";
        }
        fVar.r4(displayTitle, zF2, groupFilterItem.f171706e);
        fVar.a(new d(this, i12));
        if (groupFilterItem.f171704c.getValue() instanceof InlineFilterValue.InlineFilterLocationValue) {
            fVar.s7();
            fVar.J6(null);
        } else {
            fVar.J6(zF2 ? new com.avito.android.fakedoor_dialog.a(i12, 1, this) : null);
        }
        fVar.I(groupFilterItem.f171706e);
    }
}
