package com.avito.android.profile.remove.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileRemoveActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f223944a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f223945b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f223946c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f223947d;

    public b(u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f223944a = uVar;
        this.f223945b = provider;
        this.f223946c = provider2;
        this.f223947d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.profile.remove.e) this.f223944a.get(), this.f223945b.get(), this.f223946c.get(), this.f223947d.get());
    }
}
