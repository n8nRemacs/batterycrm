package com.avito.android.onboarding.dialog.view.quiz;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OnboardingQuizPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A40.a> f209049a;

    /* renamed from: b, reason: collision with root package name */
    public final l f209050b;

    /* renamed from: c, reason: collision with root package name */
    public final l f209051c;

    public c(l lVar, l lVar2, Provider provider) {
        this.f209049a = provider;
        this.f209050b = lVar;
        this.f209051c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f209049a.get(), (String) this.f209050b.f393949a, (Y41.l) this.f209051c.f393949a);
    }
}
