package com.avito.android.messenger.di;

import com.avito.android.messenger.conversation.mvi.sync.C32275m;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: MessengerSyncModule_ProvideMessageBodyResolver$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class d2 implements dagger.internal.h<com.avito.android.messenger.conversation.mvi.sync.G> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f195762a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.B> f195763b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f195764c;

    public d2(dagger.internal.f fVar, Provider provider, Provider provider2) {
        this.f195762a = fVar;
        this.f195763b = provider;
        this.f195764c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC47842z interfaceC47842z = (InterfaceC47842z) this.f195762a.get();
        com.avito.android.messenger.B b12 = this.f195763b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f195764c.get();
        int i12 = W1.f195723a;
        return new C32275m(interfaceC47842z, b12, interfaceC35745a5);
    }
}
