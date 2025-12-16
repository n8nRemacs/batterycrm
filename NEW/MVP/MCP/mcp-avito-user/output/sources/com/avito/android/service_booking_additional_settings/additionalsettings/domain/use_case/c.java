package com.avito.android.service_booking_additional_settings.additionalsettings.domain.use_case;

import Qs0.InterfaceC14930a;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GetSettingsScreenDataUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14930a> f274883a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f274884b;

    /* renamed from: c, reason: collision with root package name */
    public final u f274885c;

    public c(u uVar, Provider provider, Provider provider2) {
        this.f274883a = provider;
        this.f274884b = provider2;
        this.f274885c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(dagger.internal.g.b(this.f274883a), this.f274884b.get(), (com.avito.android.service_booking_additional_settings.additionalsettings.domain.converters.k) this.f274885c.get());
    }
}
