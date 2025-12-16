package com.avito.android.serp.adapter.mini_menu;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import js0.InterfaceC42421a;

/* compiled from: MiniMenuBlockPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.mini_menu.item.h> f270388a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<rs0.c> f270389b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f270390c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC42421a> f270391d;

    public n(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f270388a = provider;
        this.f270389b = provider2;
        this.f270390c = uVar;
        this.f270391d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f270388a.get(), this.f270389b.get(), (com.avito.android.onboarding_manager.e) this.f270390c.get(), this.f270391d.get());
    }
}
