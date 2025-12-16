package com.avito.android.messenger.di;

import ru.avito.messenger.InterfaceC47835s;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: MessengerModule_ProvideMessengerClient$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.r1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32496r1 implements dagger.internal.h<InterfaceC47842z> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f196288a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f196289b;

    public C32496r1(U0 u02, dagger.internal.f fVar) {
        this.f196288a = u02;
        this.f196289b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC47835s interfaceC47835s = (InterfaceC47835s) this.f196289b.get();
        this.f196288a.getClass();
        InterfaceC47842z f430736a = interfaceC47835s.getF430736a();
        dagger.internal.t.d(f430736a);
        return f430736a;
    }
}
