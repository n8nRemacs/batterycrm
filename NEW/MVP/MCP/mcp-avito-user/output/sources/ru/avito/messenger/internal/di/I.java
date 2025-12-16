package ru.avito.messenger.internal.di;

import ru.avito.messenger.MessengerApiService;

/* compiled from: ServiceModule_ProvideServiceFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes9.dex */
public final class I implements dagger.internal.h<Class<? extends MessengerApiService>> {

    /* renamed from: a, reason: collision with root package name */
    public final H f431553a;

    public I(H h12) {
        this.f431553a = h12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f431553a.getClass();
        return MessengerApiService.class;
    }
}
