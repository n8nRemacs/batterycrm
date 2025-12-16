package com.avito.android.messenger.di;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: MessengerSyncModule_ProvideChannelsRxLock$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class c2 implements dagger.internal.h<com.avito.android.mvi.rx3.locks.j<IY.a>> {

    /* renamed from: a, reason: collision with root package name */
    public final C30713g1 f195754a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f195755b;

    public c2(C30713g1 c30713g1, Provider provider) {
        this.f195754a = c30713g1;
        this.f195755b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C30277e1 c30277e1 = (C30277e1) this.f195754a.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f195755b.get();
        int i12 = W1.f195723a;
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[32];
        if (!((Boolean) c30277e1.f144957F.a().invoke()).booleanValue()) {
            return new com.avito.android.mvi.rx3.locks.legacy.a("ChannelsLock", new Y1(interfaceC35745a5), IY.b.f8195a, false, null, null, 48, null);
        }
        return new com.avito.android.mvi.rx3.locks.k("ChannelsLock", new X1(interfaceC35745a5), new com.avito.android.mvi.rx3.locks.e("ChannelsLock", new Z1(interfaceC35745a5), IY.b.f8195a, false, null, null, 48, null), null, false, null, 40, null);
    }
}
