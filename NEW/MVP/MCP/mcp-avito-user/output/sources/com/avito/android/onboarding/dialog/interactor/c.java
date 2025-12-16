package com.avito.android.onboarding.dialog.interactor;

import Nk0.InterfaceC14583a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CvStatusUpdateInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14583a> f208825a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f208826b;

    public c(Provider<InterfaceC14583a> provider, Provider<R0> provider2) {
        this.f208825a = provider;
        this.f208826b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f208825a.get(), this.f208826b.get());
    }
}
