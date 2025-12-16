package com.avito.android.select.bottom_sheet.di;

import com.avito.android.select.bottom_sheet.n;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectBottomSheetModule_ProvideSelectDiffCallback$_avito_select_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final u f265282a;

    public i(u uVar) {
        this.f265282a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.recycler.data_aware.a aVar = (com.avito.android.recycler.data_aware.a) this.f265282a.get();
        int i12 = c.f265261a;
        return new n(aVar);
    }
}
