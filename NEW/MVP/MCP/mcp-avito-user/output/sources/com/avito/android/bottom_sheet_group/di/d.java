package com.avito.android.bottom_sheet_group.di;

import com.avito.android.bottom_sheet_group.items.checkable_item.BottomSheetGroupCheckableItem;
import com.avito.android.bottom_sheet_group.items.multiselect_item.BottomSheetMultiselectItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class d implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f107293b;

    @Override // l41.g
    public final void accept(Object obj) {
        switch (this.f107293b) {
            case 0:
                e eVar = e.f107294a;
                com.avito.android.bottom_sheet_group.bottomsheetgroup.l.f107232a.getClass();
                ((com.jakewharton.rxrelay3.c) com.avito.android.bottom_sheet_group.bottomsheetgroup.l.f107234c.getValue()).accept((BottomSheetMultiselectItem) obj);
                break;
            default:
                e eVar2 = e.f107294a;
                com.avito.android.bottom_sheet_group.bottomsheetgroup.l.f107232a.getClass();
                ((com.jakewharton.rxrelay3.c) com.avito.android.bottom_sheet_group.bottomsheetgroup.l.f107233b.getValue()).accept((BottomSheetGroupCheckableItem) obj);
                break;
        }
    }
}
