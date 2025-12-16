package com.avito.android.messenger.di;

import com.avito.android.persistence.messenger.InterfaceC33130w0;
import com.avito.android.persistence.messenger.MessengerDatabase;
import javax.inject.Provider;

/* compiled from: MessengerRepoModule_ProvideDbPurgeDao$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class P1 implements dagger.internal.h<InterfaceC33130w0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<MessengerDatabase> f195696a;

    public P1(Provider<MessengerDatabase> provider) {
        this.f195696a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        MessengerDatabase messengerDatabase = this.f195696a.get();
        L1.f195669a.getClass();
        InterfaceC33130w0 interfaceC33130w0X = messengerDatabase.x();
        dagger.internal.t.d(interfaceC33130w0X);
        return interfaceC33130w0X;
    }
}
