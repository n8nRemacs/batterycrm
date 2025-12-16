package com.avito.android.main_start_onboarding;

import AK0.l;
import com.avito.android.account.E;
import com.avito.android.di.module.C30214v6;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OnboardingSnoozeTimestampStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f184235a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f184236b;

    public f(C30214v6 c30214v6, Provider provider) {
        this.f184235a = c30214v6;
        this.f184236b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((l) this.f184235a.get(), this.f184236b.get());
    }
}
