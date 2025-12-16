package com.avito.android.messenger.di;

import com.avito.android.persistence.messenger.InterfaceC33140y2;
import com.avito.android.persistence.messenger.MessengerDatabase;
import javax.inject.Provider;

/* compiled from: MessengerRepoModule_ProvideMessageUploadPartDao$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class U1 implements dagger.internal.h<InterfaceC33140y2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<MessengerDatabase> f195715a;

    public U1(Provider<MessengerDatabase> provider) {
        this.f195715a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        MessengerDatabase messengerDatabase = this.f195715a.get();
        L1.f195669a.getClass();
        InterfaceC33140y2 interfaceC33140y2C = messengerDatabase.C();
        dagger.internal.t.d(interfaceC33140y2C);
        return interfaceC33140y2C;
    }
}
