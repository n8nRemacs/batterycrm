package com.avito.android.onboarding.dialog.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OnboardingDialogBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f208944a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f208945b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f208946c;

    /* renamed from: d, reason: collision with root package name */
    public final u f208947d;

    public l(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, u uVar) {
        this.f208944a = lVar;
        this.f208945b = lVar2;
        this.f208946c = lVar3;
        this.f208947d = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k((String) this.f208944a.f393949a, (String) this.f208945b.f393949a, (String) this.f208946c.f393949a, (com.avito.android.onboarding.dialog.interactor.h) this.f208947d.get());
    }
}
