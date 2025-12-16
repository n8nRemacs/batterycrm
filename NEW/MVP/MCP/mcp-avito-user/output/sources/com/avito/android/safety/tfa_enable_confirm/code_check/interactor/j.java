package com.avito.android.safety.tfa_enable_confirm.code_check.interactor;

import To.InterfaceC15383a;
import io0.InterfaceC42082a;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Y1;

/* compiled from: TfaEnableCodeCheckCodeConfirmInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final d f258173a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f258174b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC42082a> f258175c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Y1<InterfaceC15383a>> f258176d;

    public j(d dVar, Provider provider, Provider provider2, Provider provider3) {
        this.f258173a = dVar;
        this.f258174b = provider;
        this.f258175c = provider2;
        this.f258176d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((a) this.f258173a.get(), this.f258174b.get(), this.f258175c.get(), this.f258176d.get());
    }
}
