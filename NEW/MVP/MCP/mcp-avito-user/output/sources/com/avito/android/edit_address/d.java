package com.avito.android.edit_address;

import android.app.Application;
import javax.inject.Provider;

/* compiled from: EditAddressIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f145823a;

    public d(Provider<Application> provider) {
        this.f145823a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f145823a.get());
    }
}
