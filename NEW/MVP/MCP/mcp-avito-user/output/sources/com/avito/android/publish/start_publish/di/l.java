package com.avito.android.publish.start_publish.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StartPublishSheetModule_ProvideAdapterPresenter$_avito_publish_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final j f245397a;

    /* renamed from: b, reason: collision with root package name */
    public final u f245398b;

    public l(j jVar, u uVar) {
        this.f245397a = jVar;
        this.f245398b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f245398b.get();
        this.f245397a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
