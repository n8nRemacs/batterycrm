package com.avito.android.messenger.di;

import com.avito.android.persistence.messenger.InterfaceC33095n0;
import com.avito.android.persistence.messenger.MessengerDatabase;
import javax.inject.Provider;

/* compiled from: MessengerRepoModule_ProvideChannelTagDao$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class O1 implements dagger.internal.h<InterfaceC33095n0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<MessengerDatabase> f195682a;

    public O1(Provider<MessengerDatabase> provider) {
        this.f195682a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        MessengerDatabase messengerDatabase = this.f195682a.get();
        L1.f195669a.getClass();
        InterfaceC33095n0 interfaceC33095n0W = messengerDatabase.w();
        dagger.internal.t.d(interfaceC33095n0W);
        return interfaceC33095n0W;
    }
}
