package com.avito.android.di.module;

import com.avito.android.serp.l;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: SerpInteractorModule_ProvideSerpSnippetInteractor$_avito_discouraged_avito_libs_serp_core_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class U7 implements dagger.internal.h<com.avito.android.serp.l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f144149a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.remote.V0> f144150b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f144151c;

    public U7(Provider<InterfaceC35745a5> provider, Provider<com.avito.android.remote.V0> provider2, Provider<com.avito.android.remote.error.f> provider3) {
        this.f144149a = provider;
        this.f144150b = provider2;
        this.f144151c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = this.f144149a.get();
        com.avito.android.remote.V0 v02 = this.f144150b.get();
        com.avito.android.remote.error.f fVar = this.f144151c.get();
        int i12 = R7.f144121a;
        return new l.a(interfaceC35745a5, v02, fVar);
    }
}
