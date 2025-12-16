package com.avito.android.select.bottom_sheet.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectBottomSheetModule_ProvideSelectableGroupPayloadCreator$_avito_select_implFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<com.avito.android.recycler.data_aware.a> {

    /* compiled from: SelectBottomSheetModule_ProvideSelectableGroupPayloadCreator$_avito_select_implFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final l f265285a = new l();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i12 = c.f265261a;
        return new com.avito.android.select.bottom_sheet.blueprints.group.diff_util.b();
    }
}
