package com.avito.android.tariff.detailssheet.vm;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TariffDetailsSheetViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f297460a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f297461b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f297462c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<e> f297463d;

    /* renamed from: e, reason: collision with root package name */
    public final u f297464e;

    public n(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f297460a = lVar;
        this.f297461b = provider;
        this.f297462c = provider2;
        this.f297463d = provider3;
        this.f297464e = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m((DeepLink) this.f297460a.f393949a, this.f297461b.get(), this.f297462c.get(), this.f297463d.get(), (a) this.f297464e.get());
    }
}
