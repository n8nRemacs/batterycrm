package com.avito.android.bottom_sheet_group;

import com.avito.android.bottom_sheet_group.items.multiselect_item.BottomSheetMultiselectItem;
import kotlin.Metadata;

/* compiled from: BottomSheetGroupDialogPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bottom_sheet_group/items/multiselect_item/BottomSheetMultiselectItem;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/bottom_sheet_group/items/multiselect_item/BottomSheetMultiselectItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f107292b;

    public d(j jVar) {
        this.f107292b = jVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        BottomSheetMultiselectItem bottomSheetMultiselectItem = (BottomSheetMultiselectItem) obj;
        j jVar = this.f107292b;
        BottomSheetGroupParameterWrapper bottomSheetGroupParameterWrapper = jVar.f107392g;
        bottomSheetGroupParameterWrapper.f107187e.put(bottomSheetMultiselectItem.f107356b, Boolean.valueOf(bottomSheetMultiselectItem.f107361g));
        jVar.d();
    }
}
