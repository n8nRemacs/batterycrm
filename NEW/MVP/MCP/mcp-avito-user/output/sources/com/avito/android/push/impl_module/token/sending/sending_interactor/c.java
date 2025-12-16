package com.avito.android.push.impl_module.token.sending.sending_interactor;

import com.avito.android.P;
import com.avito.android.S;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics_adjust.InterfaceC28533a;
import com.avito.android.push.public_module.token.sending.sender.PushTokenSender;
import com.avito.android.server_time.f;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import fg0.InterfaceC40417a;
import hg0.InterfaceC40932a;
import javax.inject.Provider;
import jg0.InterfaceC42375a;

/* compiled from: SendPushTokenInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<PushTokenSender> f246069a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC42375a> f246070b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<f> f246071c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28533a> f246072d;

    /* renamed from: e, reason: collision with root package name */
    public final S f246073e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.push.impl_module.features.b f246074f;

    /* renamed from: g, reason: collision with root package name */
    public final u f246075g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.f f246076h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<InterfaceC40932a> f246077i;

    public c(Provider provider, Provider provider2, Provider provider3, Provider provider4, S s5, com.avito.android.push.impl_module.features.b bVar, u uVar, dagger.internal.f fVar, Provider provider5) {
        this.f246069a = provider;
        this.f246070b = provider2;
        this.f246071c = provider3;
        this.f246072d = provider4;
        this.f246073e = s5;
        this.f246074f = bVar;
        this.f246075g = uVar;
        this.f246076h = fVar;
        this.f246077i = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        PushTokenSender pushTokenSender = this.f246069a.get();
        InterfaceC42375a interfaceC42375a = this.f246070b.get();
        f fVar = this.f246071c.get();
        InterfaceC28533a interfaceC28533a = this.f246072d.get();
        P p12 = (P) this.f246073e.get();
        this.f246074f.get();
        return new a(pushTokenSender, interfaceC42375a, fVar, interfaceC28533a, p12, (InterfaceC40417a) this.f246075g.get(), (InterfaceC28373a) this.f246076h.get(), this.f246077i.get());
    }
}
