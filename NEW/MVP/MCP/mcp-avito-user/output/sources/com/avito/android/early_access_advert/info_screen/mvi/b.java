package com.avito.android.early_access_advert.info_screen.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EarlyAccessAdvertInfoActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.early_access_advert.a> f145728a;

    public b(Provider<com.avito.android.early_access_advert.a> provider) {
        this.f145728a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f145728a.get());
    }
}
