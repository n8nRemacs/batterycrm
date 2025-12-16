package com.avito.android.messenger.map.sharing;

import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: SharingMapInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f196752a;

    public v(Provider<InterfaceC47842z> provider) {
        this.f196752a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u(this.f196752a.get());
    }
}
