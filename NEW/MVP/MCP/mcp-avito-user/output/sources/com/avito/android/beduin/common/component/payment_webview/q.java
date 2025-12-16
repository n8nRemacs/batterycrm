package com.avito.android.beduin.common.component.payment_webview;

import android.app.Application;
import javax.inject.Provider;

/* compiled from: BeduinWebPaymentViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Application> f101893a;

    public q(Provider<Application> provider) {
        this.f101893a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f101893a.get());
    }
}
