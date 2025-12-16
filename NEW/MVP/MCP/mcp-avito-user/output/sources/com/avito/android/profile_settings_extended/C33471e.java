package com.avito.android.profile_settings_extended;

import com.avito.android.remote.D0;
import com.google.gson.Gson;
import javax.inject.Provider;

/* compiled from: CommonValueInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.profile_settings_extended.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33471e implements dagger.internal.h<C33468b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<D0> f230251a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f230252b;

    public C33471e(Provider<D0> provider, Provider<Gson> provider2) {
        this.f230251a = provider;
        this.f230252b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33468b(this.f230252b.get(), dagger.internal.g.b(this.f230251a));
    }
}
