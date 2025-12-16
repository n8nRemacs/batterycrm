package com.avito.android.advert_core.price_list.dialog.mvi;

import com.avito.android.advert_core.price_list.dialog.AdvertPriceListBottomSheetDialogOpenParams;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertPriceListBottomSheetDialogBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f84081a;

    /* renamed from: b, reason: collision with root package name */
    public final u f84082b;

    public b(l lVar, u uVar) {
        this.f84081a = lVar;
        this.f84082b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((AdvertPriceListBottomSheetDialogOpenParams) this.f84081a.f393949a, (com.avito.android.advert_core.price_list.converter.a) this.f84082b.get());
    }
}
