package com.avito.android.safety.tfa_enable_confirm.code_check.interactor;

import io0.InterfaceC42082a;
import javax.inject.Provider;

/* compiled from: TfaEnableCodeCheckPhoneRequestInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC42082a> f258188a;

    public p(Provider<InterfaceC42082a> provider) {
        this.f258188a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f258188a.get());
    }
}
