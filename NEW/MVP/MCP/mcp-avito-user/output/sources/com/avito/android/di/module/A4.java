package com.avito.android.di.module;

import com.avito.android.permissions.InterfaceC33034d;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: DefaultSearchLocationModule_ProvideDefaultLocationPresenter$_avito_serp_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class A4 implements dagger.internal.h<com.avito.android.home.default_search_location.f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.home.default_search_location.c> f143823a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.location.r> f143824b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.home.default_search_location.a> f143825c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f143826d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.geo.j> f143827e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.home.default_search_location.u> f143828f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f143829g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.u f143830h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.main_start_onboarding.a> f143831i;

    public A4(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8) {
        this.f143823a = provider;
        this.f143824b = provider2;
        this.f143825c = provider3;
        this.f143826d = provider4;
        this.f143827e = provider5;
        this.f143828f = provider6;
        this.f143829g = provider7;
        this.f143830h = uVar;
        this.f143831i = provider8;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.home.default_search_location.c cVar = this.f143823a.get();
        com.avito.android.location.r rVar = this.f143824b.get();
        com.avito.android.home.default_search_location.a aVar = this.f143825c.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f143826d.get();
        com.avito.android.geo.j jVar = this.f143827e.get();
        com.avito.android.home.default_search_location.u uVar = this.f143828f.get();
        com.avito.android.server_time.f fVar = this.f143829g.get();
        InterfaceC33034d interfaceC33034d = (InterfaceC33034d) this.f143830h.get();
        com.avito.android.main_start_onboarding.a aVar2 = this.f143831i.get();
        int i12 = C30245y4.f144719a;
        return new com.avito.android.home.default_search_location.s(interfaceC35745a5, cVar, aVar, rVar, jVar, uVar, fVar, interfaceC33034d, aVar2);
    }
}
