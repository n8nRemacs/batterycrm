package com.avito.android.onboarding.dialog.mvi;

import com.avito.android.J0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OnboardingDialogReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<J0> f208960a;

    public s(Provider<J0> provider) {
        this.f208960a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r(this.f208960a.get());
    }
}
