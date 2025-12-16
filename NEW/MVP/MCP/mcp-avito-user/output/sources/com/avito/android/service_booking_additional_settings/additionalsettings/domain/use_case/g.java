package com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case;

import Qs0.InterfaceC14930a;
import Ss0.InterfaceC15219a;
import com.avito.android.B2;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PostBookingToggleUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14930a> f274897a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC15219a> f274898b;

    /* renamed from: c, reason: collision with root package name */
    public final u f274899c;

    /* renamed from: d, reason: collision with root package name */
    public final u f274900d;

    public g(u uVar, u uVar2, Provider provider, Provider provider2) {
        this.f274897a = provider;
        this.f274898b = provider2;
        this.f274899c = uVar;
        this.f274900d = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(dagger.internal.g.b(this.f274897a), dagger.internal.g.b(this.f274898b), (B2) this.f274899c.get(), (com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters.x) this.f274900d.get());
    }
}
