package com.avito.android.profile_settings_extended;

import com.avito.android.remote.D0;
import javax.inject.Provider;

/* compiled from: DisableExtendedProfileInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.profile_settings_extended.h, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33474h implements dagger.internal.h<C33473g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<D0> f230371a;

    public C33474h(Provider<D0> provider) {
        this.f230371a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33473g(dagger.internal.g.b(this.f230371a));
    }
}
