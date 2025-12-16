package com.avito.android.messenger.di;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.internal.connection.InterfaceC47748a;

/* compiled from: MessengerModule_ProvideForegroundStateProvider$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.d1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32430d1 implements dagger.internal.h<InterfaceC47748a> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f195760a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f195761b;

    public C32430d1(U0 u02, Provider<InterfaceC35745a5> provider) {
        this.f195760a = u02;
        this.f195761b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = this.f195761b.get();
        this.f195760a.getClass();
        return new ru.avito.messenger.internal.connection.k0(interfaceC35745a5);
    }
}
