package com.avito.android.suggest_locations;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: SuggestLocationsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.suggest_locations.u, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35155u implements dagger.internal.h<C35154t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.geo_common.interactor.g> f292381a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f292382b;

    /* renamed from: c, reason: collision with root package name */
    public final C35158x f292383c;

    public C35155u(Provider provider, Provider provider2, C35158x c35158x) {
        this.f292381a = provider;
        this.f292382b = provider2;
        this.f292383c = c35158x;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.geo_common.interactor.g gVar = this.f292381a.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f292382b.get();
        this.f292383c.getClass();
        return new C35154t(gVar, interfaceC35745a5, new C35157w());
    }
}
