package com.avito.android.messenger.deeplink;

import com.avito.android.messenger.di.I1;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: MarkChannelUnreadDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.deeplink.d0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32377d0 implements dagger.internal.h<C32375c0> {

    /* renamed from: a, reason: collision with root package name */
    public final I1 f195504a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.channels.mvi.sync.E0> f195505b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f195506c;

    public C32377d0(I1 i12, Provider provider, Provider provider2) {
        this.f195504a = i12;
        this.f195505b = provider;
        this.f195506c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C32375c0((ru.avito.messenger.F0) this.f195504a.get(), this.f195505b.get(), this.f195506c.get());
    }
}
