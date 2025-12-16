package com.avito.android.advert.item.leadauto.viewmodel;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import h30.InterfaceC40766a;
import javax.inject.Provider;
import k30.InterfaceC42490a;

/* compiled from: AutoNewCarsLeadFormViewModelFactory_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40766a> f77316a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC42490a> f77317b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f77318c;

    public b(Provider<InterfaceC40766a> provider, Provider<InterfaceC42490a> provider2, Provider<R0> provider3) {
        this.f77316a = provider;
        this.f77317b = provider2;
        this.f77318c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(g.a(w.a(this.f77316a)), this.f77317b.get(), this.f77318c.get());
    }
}
