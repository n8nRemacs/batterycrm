package com.avito.android.push.impl_module.token.sending.auth;

import com.avito.android.push.public_module.token.sending.sending_interactor.SendPushTokenInteractor;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import fg0.InterfaceC40417a;
import javax.inject.Provider;
import jg0.InterfaceC42375a;

/* compiled from: SendPushTokenOnLogoutAuthPlugin_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC42375a> f246027a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40417a> f246028b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<SendPushTokenInteractor> f246029c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.push.impl_module.features.b f246030d;

    public c(Provider provider, Provider provider2, Provider provider3, com.avito.android.push.impl_module.features.b bVar) {
        this.f246027a = provider;
        this.f246028b = provider2;
        this.f246029c = provider3;
        this.f246030d = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC42375a interfaceC42375a = this.f246027a.get();
        InterfaceC40417a interfaceC40417a = this.f246028b.get();
        SendPushTokenInteractor sendPushTokenInteractor = this.f246029c.get();
        this.f246030d.get();
        return new a(interfaceC42375a, interfaceC40417a, sendPushTokenInteractor);
    }
}
