package com.avito.android;

import android.app.Application;

/* compiled from: PendingMessageHandlerModule_ProvideImageUploadStarterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class F1 implements dagger.internal.h<com.avito.android.messenger.service.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f67260a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f67261b;

    public F1(dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f67260a = uVar;
        this.f67261b = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Application application = (Application) this.f67260a.get();
        InterfaceC31091j1 interfaceC31091j1 = (InterfaceC31091j1) this.f67261b.get();
        int i12 = E1.f67255a;
        return new com.avito.android.messenger.service.b(application, interfaceC31091j1);
    }
}
