package com.avito.android.loyalty.di.quality_service;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WidgetListModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class n implements dagger.internal.h<com.avito.konveyor.adapter.j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f183169a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f183170b;

    public n(u uVar, Provider provider) {
        this.f183169a = uVar;
        this.f183170b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f183169a.get();
        com.avito.konveyor.a aVar2 = this.f183170b.get();
        m.f183168a.getClass();
        return new com.avito.konveyor.adapter.j(aVar, aVar2);
    }
}
