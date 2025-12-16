package com.avito.android.messenger.di;

import com.avito.android.persistence.messenger.AbstractC33042a;
import com.avito.android.persistence.messenger.MessengerDatabase;
import javax.inject.Provider;

/* compiled from: MessengerRepoModule_ProvideChannelDao$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class M1 implements dagger.internal.h<AbstractC33042a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<MessengerDatabase> f195672a;

    public M1(Provider<MessengerDatabase> provider) {
        this.f195672a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        MessengerDatabase messengerDatabase = this.f195672a.get();
        L1.f195669a.getClass();
        AbstractC33042a abstractC33042aU = messengerDatabase.u();
        dagger.internal.t.d(abstractC33042aU);
        return abstractC33042aU;
    }
}
