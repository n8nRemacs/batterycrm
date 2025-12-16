package com.avito.android.captcha;

import Lj0.InterfaceC14403a;
import Mj0.InterfaceC14498a;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: AvitoCaptchaInteractor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14403a> f115116a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f115117b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.F f115118c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f115119d;

    public o(Provider provider, dagger.internal.u uVar, com.avito.android.F f12, Provider provider2) {
        this.f115116a = provider;
        this.f115117b = uVar;
        this.f115118c = f12;
        this.f115119d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f115116a.get(), (InterfaceC14498a) this.f115117b.get(), (com.avito.android.D) this.f115118c.get(), this.f115119d.get());
    }
}
