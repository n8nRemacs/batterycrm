package com.avito.android;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.app.task.C28604w0;
import com.avito.android.app.task.InterfaceC28601v0;
import javax.inject.Provider;

/* compiled from: PendingMessageHandlerModule_ProvideMessageSendingTrackerFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class G1 implements dagger.internal.h<InterfaceC28601v0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f67263a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f67264b;

    public G1(dagger.internal.u uVar, Provider provider) {
        this.f67263a = uVar;
        this.f67264b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f67263a.get();
        com.avito.android.server_time.h hVar = this.f67264b.get();
        int i12 = E1.f67255a;
        return new C28604w0(interfaceC28373a, hVar);
    }
}
