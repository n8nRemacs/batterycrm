package com.avito.android.onboarding.dialog;

import com.avito.android.onboarding.dialog.mvi.n;
import com.avito.android.onboarding.dialog.mvi.o;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OnboardingDialogViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final o f208816a;

    public f(o oVar) {
        this.f208816a = oVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((n) this.f208816a.get(), null, 2, null);
    }
}
