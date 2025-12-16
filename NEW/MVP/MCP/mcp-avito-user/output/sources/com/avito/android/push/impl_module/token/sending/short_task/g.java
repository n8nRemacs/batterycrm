package com.avito.android.push.impl_module.token.sending.short_task;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.push.public_module.token.sending.sending_interactor.SendPushTokenInteractor;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SendPushTokenShortTask_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SendPushTokenInteractor> f246084a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f246085b;

    public g(dagger.internal.f fVar, Provider provider) {
        this.f246084a = provider;
        this.f246085b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f246084a.get(), (InterfaceC28373a) this.f246085b.get());
    }
}
