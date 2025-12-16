package com.avito.android.publish.objects.di;

import com.avito.android.publish.analytics.InterfaceC33535v;
import javax.inject.Provider;

/* compiled from: ObjectFillFormModule_ProvideInstantMarketValuePresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class K implements dagger.internal.h<com.avito.android.publish.slots.imv.item.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC33535v> f237618a;

    public K(Provider<InterfaceC33535v> provider) {
        this.f237618a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC33535v interfaceC33535v = this.f237618a.get();
        C33939w.f238031a.getClass();
        return new com.avito.android.publish.slots.imv.item.d(interfaceC33535v);
    }
}
