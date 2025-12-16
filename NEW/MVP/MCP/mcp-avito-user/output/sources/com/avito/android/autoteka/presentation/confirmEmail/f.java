package com.avito.android.autoteka.presentation.confirmEmail;

import com.avito.android.autoteka.presentation.confirmEmail.mvi.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaConfirmEmailViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.autoteka.presentation.confirmEmail.mvi.h f97243a;

    public f(com.avito.android.autoteka.presentation.confirmEmail.mvi.h hVar) {
        this.f97243a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((g) this.f97243a.get(), null, 2, null);
    }
}
