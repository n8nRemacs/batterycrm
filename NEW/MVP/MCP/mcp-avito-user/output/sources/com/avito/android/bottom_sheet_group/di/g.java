package com.avito.android.bottom_sheet_group.di;

import com.avito.android.bottom_sheet_group.items.checkable_item.BottomSheetGroupCheckableItem;
import dagger.internal.x;
import dagger.internal.y;
import io.reactivex.rxjava3.core.z;

/* compiled from: BottomSheetGroupModule_ProvideCheckableClicksObservableFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<z<BottomSheetGroupCheckableItem>> {

    /* compiled from: BottomSheetGroupModule_ProvideCheckableClicksObservableFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final g f107296a = new g();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e.f107294a.getClass();
        com.avito.android.bottom_sheet_group.bottomsheetgroup.l.f107232a.getClass();
        return (com.jakewharton.rxrelay3.c) com.avito.android.bottom_sheet_group.bottomsheetgroup.l.f107233b.getValue();
    }
}
