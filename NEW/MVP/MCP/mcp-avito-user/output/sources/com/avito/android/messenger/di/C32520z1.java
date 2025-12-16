package com.avito.android.messenger.di;

import com.avito.android.C30713g1;

/* compiled from: MessengerModule_ProvideNetworkMonitor$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.z1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32520z1 implements dagger.internal.h<ru.avito.messenger.r0> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f196325a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f196326b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f196327c;

    /* renamed from: d, reason: collision with root package name */
    public final C30713g1 f196328d;

    public C32520z1(U0 u02, dagger.internal.l lVar, dagger.internal.u uVar, C30713g1 c30713g1) {
        this.f196325a = u02;
        this.f196326b = lVar;
        this.f196327c = uVar;
        this.f196328d = c30713g1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.connection_quality.connectivity.a aVar = (com.avito.android.connection_quality.connectivity.a) this.f196327c.get();
        this.f196328d.get();
        this.f196325a.getClass();
        return new com.avito.android.messenger.k0(aVar);
    }
}
