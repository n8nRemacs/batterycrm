package com.avito.android.das_date_picker.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DasCalendarItemsModule_ProvideAdapterPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f132291a;

    /* renamed from: b, reason: collision with root package name */
    public final u f132292b;

    public e(d dVar, u uVar) {
        this.f132291a = dVar;
        this.f132292b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f132292b.get();
        this.f132291a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
