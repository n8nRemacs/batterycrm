package com.avito.android.advert_core.price_list.dialog;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertPriceListBottomSheetDialogViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.advert_core.price_list.dialog.mvi.e f84078a;

    public e(com.avito.android.advert_core.price_list.dialog.mvi.e eVar) {
        this.f84078a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.advert_core.price_list.dialog.mvi.d) this.f84078a.get(), null, 2, null);
    }
}
