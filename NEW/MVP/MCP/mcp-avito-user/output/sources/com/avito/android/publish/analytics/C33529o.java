package com.avito.android.publish.analytics;

import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import javax.inject.Provider;

/* compiled from: PublishContactsTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.analytics.o, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33529o implements dagger.internal.h<C33528n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28499v> f232266a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28501x> f232267b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f232268c;

    public C33529o(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f232266a = provider;
        this.f232267b = provider2;
        this.f232268c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33528n(this.f232266a.get(), this.f232267b.get(), (com.avito.android.analytics.screens.o) this.f232268c.get());
    }
}
