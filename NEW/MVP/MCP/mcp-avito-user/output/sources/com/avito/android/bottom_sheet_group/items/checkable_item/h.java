package com.avito.android.bottom_sheet_group.items.checkable_item;

import Y41.l;
import Y61.k;
import com.avito.android.lib.design.list_item.ListItemCheckbox;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BottomSheetGroupCheckableItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bottom_sheet_group/items/checkable_item/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/bottom_sheet_group/items/checkable_item/g;", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemCheckbox f107355b;

    public h(@k ListItemCheckbox listItemCheckbox) {
        super(listItemCheckbox);
        this.f107355b = listItemCheckbox;
    }

    @Override // com.avito.android.bottom_sheet_group.items.checkable_item.g
    public final void l0(@k l<? super Boolean, G0> lVar) {
        this.f107355b.setOnClickListener(new com.avito.android.body_condition.h(2, lVar, this));
    }

    @Override // com.avito.android.bottom_sheet_group.items.checkable_item.g
    public final void setChecked(boolean z12) {
        this.f107355b.setChecked(z12);
    }

    @Override // com.avito.android.bottom_sheet_group.items.checkable_item.g
    public final void setTitle(@k String str) {
        this.f107355b.setTitle(str);
    }
}
