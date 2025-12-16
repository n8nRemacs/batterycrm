package com.avito.android.publish.screen.objects.di;

import com.avito.android.publish.analytics.InterfaceC33535v;
import javax.inject.Provider;

/* compiled from: ObjectFillFormItemsModule_ProvideInstantMarketValuePresenterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.screen.objects.di.g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34016g implements dagger.internal.h<com.avito.android.publish.slots.imv.item.d> {

    /* renamed from: a, reason: collision with root package name */
    public final C34014e f239868a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC33535v> f239869b;

    public C34016g(C34014e c34014e, Provider<InterfaceC33535v> provider) {
        this.f239868a = c34014e;
        this.f239869b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC33535v interfaceC33535v = this.f239869b.get();
        this.f239868a.getClass();
        return new com.avito.android.publish.slots.imv.item.d(interfaceC33535v);
    }
}
