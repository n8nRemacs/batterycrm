package com.avito.android.messenger.di;

import ru.avito.messenger.InterfaceC47835s;
import ru.avito.messenger.MessengerApi;

/* compiled from: MessengerModule_ProvideFallbackMessengerApiFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.c1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32427c1 implements dagger.internal.h<MessengerApi> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f195752a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f195753b;

    public C32427c1(U0 u02, dagger.internal.f fVar) {
        this.f195752a = u02;
        this.f195753b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC47835s interfaceC47835s = (InterfaceC47835s) this.f195753b.get();
        this.f195752a.getClass();
        MessengerApi messengerApiB = interfaceC47835s.b();
        dagger.internal.t.d(messengerApiB);
        return messengerApiB;
    }
}
