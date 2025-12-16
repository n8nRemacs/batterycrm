package com.avito.android.referral_contacts.domain;

import android.app.Application;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ContactsDataSource_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f252456a;

    public d(Provider<Application> provider) {
        this.f252456a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f252456a.get());
    }
}
