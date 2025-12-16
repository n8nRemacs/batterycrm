package com.avito.android.onboarding.dialog.interactor;

import com.avito.android.remote.InterfaceC34389t0;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OnboardingQuizInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34389t0> f208865a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f208866b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f208867c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f208868d;

    public m(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2) {
        this.f208865a = provider;
        this.f208866b = provider2;
        this.f208867c = lVar;
        this.f208868d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f208865a.get(), this.f208866b.get(), (String) this.f208867c.f393949a, (String) this.f208868d.f393949a);
    }
}
