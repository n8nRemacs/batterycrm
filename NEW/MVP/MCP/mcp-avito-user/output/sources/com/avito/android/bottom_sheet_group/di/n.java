package com.avito.android.bottom_sheet_group.di;

import com.avito.android.bottom_sheet_group.items.multiselect_item.BottomSheetMultiselectItem;
import dagger.internal.x;
import dagger.internal.y;
import io.reactivex.rxjava3.core.z;

/* compiled from: BottomSheetGroupModule_ProvideMultiselectClicksObservableFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes11.dex */
public final class n implements dagger.internal.h<z<BottomSheetMultiselectItem>> {

    /* compiled from: BottomSheetGroupModule_ProvideMultiselectClicksObservableFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final n f107302a = new n();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e.f107294a.getClass();
        com.avito.android.bottom_sheet_group.bottomsheetgroup.l.f107232a.getClass();
        return (com.jakewharton.rxrelay3.c) com.avito.android.bottom_sheet_group.bottomsheetgroup.l.f107234c.getValue();
    }
}
