package com.avito.android.authorization.confirm_3fa.mvi;

import com.avito.android.remote.r;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConfirmEmailListInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<r> f93624a;

    public o(Provider<r> provider) {
        this.f93624a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f93624a.get());
    }
}
