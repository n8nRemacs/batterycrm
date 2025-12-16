package com.avito.android.messenger.di;

import com.avito.android.messenger.C32576y;
import com.avito.android.messenger.InterfaceC32575x;
import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Provider;

/* compiled from: MessengerModule_ProvideMessageMessageLocalIdGeneratorFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.o1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32488o1 implements dagger.internal.h<InterfaceC32575x> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f196165a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f196166b;

    public C32488o1(U0 u02, Provider<InterfaceC35863o4> provider) {
        this.f196165a = u02;
        this.f196166b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35863o4 interfaceC35863o4 = this.f196166b.get();
        this.f196165a.getClass();
        return new C32576y(interfaceC35863o4);
    }
}
