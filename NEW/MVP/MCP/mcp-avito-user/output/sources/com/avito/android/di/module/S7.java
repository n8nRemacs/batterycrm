package com.avito.android.di.module;

import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ur.InterfaceC49101b;

/* compiled from: SerpInteractorModule_ProvideSearchDeepLinkInteractor$_avito_discouraged_avito_libs_serp_core_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class S7 implements dagger.internal.h<com.avito.android.search.h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.remote.V0> f144133a;

    /* renamed from: b, reason: collision with root package name */
    public final T7 f144134b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f144135c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC49101b> f144136d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f144137e;

    public S7(Provider provider, T7 t72, Provider provider2, Provider provider3, Provider provider4) {
        this.f144133a = provider;
        this.f144134b = t72;
        this.f144135c = provider2;
        this.f144136d = provider3;
        this.f144137e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = dagger.internal.g.a(dagger.internal.w.a(this.f144133a));
        SearchParamsConverter searchParamsConverter = (SearchParamsConverter) this.f144134b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f144135c.get();
        InterfaceC49101b interfaceC49101b = this.f144136d.get();
        com.avito.android.deep_linking.x xVar = this.f144137e.get();
        int i12 = R7.f144121a;
        return new com.avito.android.search.j(eVarA, searchParamsConverter, interfaceC35745a5, interfaceC49101b, xVar);
    }
}
