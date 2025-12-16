package com.avito.android.cv_validation_bottom_sheet.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CvValidationBottomSheetModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f131827a;

    /* renamed from: b, reason: collision with root package name */
    public final e f131828b;

    public h(dagger.internal.f fVar, e eVar) {
        this.f131827a = fVar;
        this.f131828b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f131827a.get();
        com.avito.konveyor.a aVar2 = (com.avito.konveyor.a) this.f131828b.get();
        c.f131820a.getClass();
        j jVar = new j(aVar, aVar2);
        jVar.setHasStableIds(true);
        return jVar;
    }
}
