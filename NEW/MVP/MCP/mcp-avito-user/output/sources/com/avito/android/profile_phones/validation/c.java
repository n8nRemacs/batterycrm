package com.avito.android.profile_phones.validation;

import com.avito.android.remote.A1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhoneSelfEmployedValidationInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A1> f228348a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f228349b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f228350c;

    public c(Provider<A1> provider, Provider<InterfaceC35745a5> provider2, Provider<com.avito.android.remote.error.f> provider3) {
        this.f228348a = provider;
        this.f228349b = provider2;
        this.f228350c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f228348a.get(), this.f228349b.get(), this.f228350c.get());
    }
}
