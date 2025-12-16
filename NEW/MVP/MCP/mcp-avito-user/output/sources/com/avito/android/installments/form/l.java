package com.avito.android.installments.form;

import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InstallmentsFormInteractor_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SV0.a> f172703a;

    public l(Provider<SV0.a> provider) {
        this.f172703a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(dagger.internal.g.a(dagger.internal.w.a(this.f172703a)));
    }
}
