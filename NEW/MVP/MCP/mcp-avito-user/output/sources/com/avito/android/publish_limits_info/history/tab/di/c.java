package com.avito.android.publish_limits_info.history.tab.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HistoryAdvertsListModule_ProvideAdapterPresenter$_avito_publish_limits_info_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f245912a;

    public c(u uVar) {
        this.f245912a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f245912a.get();
        b bVar = b.f245911a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
