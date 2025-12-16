package com.avito.android.publish_limits_info.history.tab.di;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HistoryAdvertsListModule_ProvideSimpleRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f245916a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f245917b;

    public f(u uVar, Provider provider) {
        this.f245916a = uVar;
        this.f245917b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f245916a.get();
        com.avito.konveyor.a aVar2 = this.f245917b.get();
        b bVar = b.f245911a;
        return new j(aVar, aVar2);
    }
}
