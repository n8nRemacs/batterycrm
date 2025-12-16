package com.avito.android.brandspace.vm;

import com.avito.android.brandspace.interactor.BrandspaceAnalyticsInteractor;
import com.avito.android.brandspace.interactor.f;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;
import pk.InterfaceC47104b;

/* compiled from: BrandspaceViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f107814a;

    /* renamed from: b, reason: collision with root package name */
    public final f f107815b;

    /* renamed from: c, reason: collision with root package name */
    public final u f107816c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC47104b> f107817d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f107818e;

    public c(Provider provider, f fVar, u uVar, Provider provider2, Provider provider3) {
        this.f107814a = provider;
        this.f107815b = fVar;
        this.f107816c = uVar;
        this.f107817d = provider2;
        this.f107818e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = this.f107814a.get();
        com.avito.android.brandspace.interactor.d dVar = (com.avito.android.brandspace.interactor.d) this.f107815b.get();
        return new b((BrandspaceAnalyticsInteractor) this.f107816c.get(), dVar, interfaceC35745a5, this.f107818e.get(), this.f107817d.get());
    }
}
