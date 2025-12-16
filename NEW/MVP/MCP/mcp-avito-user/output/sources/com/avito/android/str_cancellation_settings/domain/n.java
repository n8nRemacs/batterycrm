package com.avito.android.str_cancellation_settings.domain;

import Oy0.InterfaceC14756a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrCancellationSettingsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class n implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f288376a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14756a> f288377b;

    public n(Provider<R0> provider, Provider<InterfaceC14756a> provider2) {
        this.f288376a = provider;
        this.f288377b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f288376a.get(), this.f288377b.get());
    }
}
