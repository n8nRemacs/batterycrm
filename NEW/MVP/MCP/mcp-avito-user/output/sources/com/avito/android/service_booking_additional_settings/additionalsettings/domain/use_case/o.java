package com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case;

import Qs0.InterfaceC14930a;
import Ss0.InterfaceC15219a;
import com.avito.android.B2;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PostTimeGapSettingUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14930a> f274941a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC15219a> f274942b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f274943c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters.x> f274944d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<B2> f274945e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<a> f274946f;

    public o(Provider<InterfaceC14930a> provider, Provider<InterfaceC15219a> provider2, Provider<R0> provider3, Provider<com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters.x> provider4, Provider<B2> provider5, Provider<a> provider6) {
        this.f274941a = provider;
        this.f274942b = provider2;
        this.f274943c = provider3;
        this.f274944d = provider4;
        this.f274945e = provider5;
        this.f274946f = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(dagger.internal.g.b(this.f274941a), dagger.internal.g.b(this.f274942b), this.f274943c.get(), this.f274944d.get(), this.f274945e.get(), this.f274946f.get());
    }
}
