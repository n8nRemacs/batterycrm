package com.avito.android.bxcontent.di.module;

import com.avito.android.C36135w2;
import il.C41420a;
import javax.inject.Provider;

/* compiled from: BxContentModule_ProvideAdapterPresenter$_avito_serp_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.bxcontent.di.module.u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29072u implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f111024a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C36135w2> f111025b;

    public C29072u(dagger.internal.u uVar, Provider provider) {
        this.f111024a = uVar;
        this.f111025b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f111024a.get();
        C36135w2 c36135w2 = this.f111025b.get();
        C29070s.f111022a.getClass();
        c36135w2.getClass();
        kotlin.reflect.n<Object> nVar = C36135w2.f327457X[46];
        return ((Boolean) c36135w2.f327474Q.a().invoke()).booleanValue() ? new C41420a(new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null)) : new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
