package com.avito.android.publish.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.details.S0;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: PublishAuctionOfferShownEventTrackerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.analytics.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33520f implements dagger.internal.h<C33519e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f232237a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<S0> f232238b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f232239c;

    public C33520f(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider) {
        this.f232237a = uVar;
        this.f232238b = provider;
        this.f232239c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33519e((InterfaceC28373a) this.f232237a.get(), this.f232238b.get(), (InterfaceC35745a5) this.f232239c.get());
    }
}
