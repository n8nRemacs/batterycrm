package com.avito.android.select.sectioned_multiselect.core.di;

import com.avito.android.select.bottom_sheet_pagination.blueprints.PaginationState;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SectionedMultiselectModule_ReplayPaginationAction$_avito_select_implFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes3.dex */
public final class m implements dagger.internal.h<com.jakewharton.rxrelay3.c<PaginationState>> {

    /* compiled from: SectionedMultiselectModule_ReplayPaginationAction$_avito_select_implFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final m f266637a = new m();
    }

    public static m a() {
        return a.f266637a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = d.f266618a;
        return new com.jakewharton.rxrelay3.c();
    }
}
