package com.avito.android.publish.draft_onboarding;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DraftOnboardingInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<i> f235307a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f235308b;

    /* renamed from: c, reason: collision with root package name */
    public final u f235309c;

    public d(u uVar, Provider provider, Provider provider2) {
        this.f235307a = provider;
        this.f235308b = provider2;
        this.f235309c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f235307a.get(), this.f235308b.get(), (e) this.f235309c.get());
    }
}
