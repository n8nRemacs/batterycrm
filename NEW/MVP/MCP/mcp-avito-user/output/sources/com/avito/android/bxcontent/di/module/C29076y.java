package com.avito.android.bxcontent.di.module;

import Oi0.InterfaceC14698b;
import com.avito.android.C36135w2;
import il.C41421b;
import javax.inject.Provider;

/* compiled from: BxContentModule_ProvideBxContentAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.bxcontent.di.module.y, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29076y implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f111037a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f111038b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C36135w2> f111039c;

    public C29076y(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f111037a = provider;
        this.f111038b = uVar;
        this.f111039c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f111037a.get();
        InterfaceC14698b interfaceC14698b = (InterfaceC14698b) this.f111038b.get();
        C36135w2 c36135w2 = this.f111039c.get();
        C29070s.f111022a.getClass();
        c36135w2.getClass();
        kotlin.reflect.n<Object> nVar = C36135w2.f327457X[46];
        com.avito.konveyor.adapter.d dVar = ((Boolean) c36135w2.f327474Q.a().invoke()).booleanValue() ? new com.avito.konveyor.adapter.d(aVar, interfaceC14698b, C41421b.f398716a) : new com.avito.konveyor.adapter.d(aVar, interfaceC14698b, null, 4, null);
        dVar.setHasStableIds(true);
        return dVar;
    }
}
