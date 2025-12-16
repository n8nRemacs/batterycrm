package com.avito.android.loyalty.di.criteria_gray;

import com.avito.konveyor.adapter.j;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CriteriaGrayModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f183078a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f183079b;

    public d(u uVar, Provider provider) {
        this.f183078a = uVar;
        this.f183079b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.h hVar = (com.avito.konveyor.adapter.h) this.f183078a.get();
        com.avito.konveyor.a aVar = this.f183079b.get();
        c.f183077a.getClass();
        return new j(hVar, aVar);
    }
}
