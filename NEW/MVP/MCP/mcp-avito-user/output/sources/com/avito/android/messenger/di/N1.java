package com.avito.android.messenger.di;

import com.avito.android.persistence.messenger.InterfaceC33043a0;
import com.avito.android.persistence.messenger.MessengerDatabase;
import javax.inject.Provider;

/* compiled from: MessengerRepoModule_ProvideChannelMetaInfoDao$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class N1 implements dagger.internal.h<InterfaceC33043a0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<MessengerDatabase> f195676a;

    public N1(Provider<MessengerDatabase> provider) {
        this.f195676a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        MessengerDatabase messengerDatabase = this.f195676a.get();
        L1.f195669a.getClass();
        InterfaceC33043a0 interfaceC33043a0V = messengerDatabase.v();
        dagger.internal.t.d(interfaceC33043a0V);
        return interfaceC33043a0V;
    }
}
