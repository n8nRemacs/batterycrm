package com.avito.android.profile_settings_extended;

import com.avito.android.remote.A1;
import com.avito.android.remote.D0;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: ExtendedProfileSettingsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.profile_settings_extended.x, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33510x implements dagger.internal.h<C33508v> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<D0> f230838a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<A1> f230839b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.profile_settings_extended.converter.a> f230840c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f230841d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f230842e;

    public C33510x(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f230838a = provider;
        this.f230839b = provider2;
        this.f230840c = provider3;
        this.f230841d = uVar;
        this.f230842e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C33508v(dagger.internal.g.b(this.f230838a), dagger.internal.g.b(this.f230839b), this.f230840c.get(), (com.avito.android.profile_settings_extended.converter.g) this.f230841d.get(), this.f230842e.get());
    }
}
