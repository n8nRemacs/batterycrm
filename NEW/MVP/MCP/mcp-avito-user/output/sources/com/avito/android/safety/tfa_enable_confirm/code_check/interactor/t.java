package com.avito.android.safety.tfa_enable_confirm.code_check.interactor;

import io0.InterfaceC42082a;
import javax.inject.Provider;

/* compiled from: TfaEnableCodeCheckPreRequestInteractorBuilderImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC42082a> f258190a;

    public t(Provider<InterfaceC42082a> provider) {
        this.f258190a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s(this.f258190a.get());
    }
}
