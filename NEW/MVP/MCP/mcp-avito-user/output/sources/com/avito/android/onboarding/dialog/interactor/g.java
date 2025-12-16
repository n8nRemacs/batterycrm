package com.avito.android.onboarding.dialog.interactor;

import Sm0.C15204c;
import Sm0.InterfaceC15202a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lI0.InterfaceC43640a;

/* compiled from: DeactivateItemInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43640a> f208839a;

    /* renamed from: b, reason: collision with root package name */
    public final C15204c f208840b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f208841c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<A40.a> f208842d;

    public g(Provider provider, C15204c c15204c, Provider provider2, Provider provider3) {
        this.f208839a = provider;
        this.f208840b = c15204c;
        this.f208841c = provider2;
        this.f208842d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(dagger.internal.g.b(this.f208839a), (InterfaceC15202a) this.f208840b.get(), this.f208841c.get(), this.f208842d.get());
    }
}
