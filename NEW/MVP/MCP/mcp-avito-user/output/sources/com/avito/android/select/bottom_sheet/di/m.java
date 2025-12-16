package com.avito.android.select.bottom_sheet.di;

import com.avito.android.select.bottom_sheet_pagination.blueprints.PaginationState;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectBottomSheetModule_ReplayPaginationAction$_avito_select_implFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<com.jakewharton.rxrelay3.c<PaginationState>> {

    /* compiled from: SelectBottomSheetModule_ReplayPaginationAction$_avito_select_implFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final m f265286a = new m();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = c.f265261a;
        return new com.jakewharton.rxrelay3.c();
    }
}
