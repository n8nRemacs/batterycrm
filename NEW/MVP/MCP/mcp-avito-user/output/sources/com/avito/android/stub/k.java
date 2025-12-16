package com.avito.android.stub;

import dagger.internal.x;
import dagger.internal.y;
import ru.avito.messenger.MessengerApi;

/* compiled from: StubMessengerModule_ProvideAvitoMessengerApiFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<MessengerApi> {

    /* compiled from: StubMessengerModule_ProvideAvitoMessengerApiFactory.java */
    public static final class a {
        static {
            new k();
        }
    }

    @Override // javax.inject.Provider
    public final Object get() {
        j.f291479a.getClass();
        return new com.avito.android.stub.a();
    }
}
