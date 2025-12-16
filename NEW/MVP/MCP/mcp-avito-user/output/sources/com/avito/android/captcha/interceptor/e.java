package com.avito.android.captcha.interceptor;

import com.avito.android.D;
import com.avito.android.F;
import com.avito.android.H0;
import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CaptchaTokenVerificationHandlerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class e implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Gson> f115055a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f115056b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<H0> f115057c;

    /* renamed from: d, reason: collision with root package name */
    public final F f115058d;

    public e(F f12, Provider provider, Provider provider2, Provider provider3) {
        this.f115055a = provider;
        this.f115056b = provider2;
        this.f115057c = provider3;
        this.f115058d = f12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(dagger.internal.g.b(this.f115055a), dagger.internal.g.b(this.f115056b), this.f115057c.get(), (D) this.f115058d.get());
    }
}
