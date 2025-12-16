package com.avito.android.advert_core.price_list.dialog.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertPriceListBottomSheetDialogModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f84060a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advert_core.price_list.v2.section.b f84061b;

    public e(c cVar, com.avito.android.advert_core.price_list.v2.section.b bVar) {
        this.f84060a = cVar;
        this.f84061b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.advert_core.price_list.v2.section.a aVar = (com.avito.android.advert_core.price_list.v2.section.a) this.f84061b.get();
        this.f84060a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
