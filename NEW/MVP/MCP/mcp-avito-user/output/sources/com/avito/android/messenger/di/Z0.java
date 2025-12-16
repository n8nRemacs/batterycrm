package com.avito.android.messenger.di;

import com.avito.android.messenger.channels.mvi.data.C31694b;
import com.avito.android.messenger.channels.mvi.data.InterfaceC31693a;
import ru.avito.messenger.InterfaceC47835s;

/* compiled from: MessengerModule_ProvideChannelContextSerializerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class Z0 implements dagger.internal.h<InterfaceC31693a> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f195731a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f195732b;

    public Z0(U0 u02, dagger.internal.f fVar) {
        this.f195731a = u02;
        this.f195732b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC47835s interfaceC47835s = (InterfaceC47835s) this.f195732b.get();
        this.f195731a.getClass();
        return new C31694b(interfaceC47835s.getF430738c());
    }
}
