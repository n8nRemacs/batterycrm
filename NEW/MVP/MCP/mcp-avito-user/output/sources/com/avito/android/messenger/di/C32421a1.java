package com.avito.android.messenger.di;

import com.avito.android.messenger.channels.mvi.data.C31707o;
import com.avito.android.messenger.channels.mvi.data.InterfaceC31706n;
import ru.avito.messenger.InterfaceC47835s;

/* compiled from: MessengerModule_ProvideChannelPropertySerializerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.a1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32421a1 implements dagger.internal.h<InterfaceC31706n> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f195736a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f195737b;

    public C32421a1(U0 u02, dagger.internal.f fVar) {
        this.f195736a = u02;
        this.f195737b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC47835s interfaceC47835s = (InterfaceC47835s) this.f195737b.get();
        this.f195736a.getClass();
        return new C31707o(interfaceC47835s.getF430738c());
    }
}
