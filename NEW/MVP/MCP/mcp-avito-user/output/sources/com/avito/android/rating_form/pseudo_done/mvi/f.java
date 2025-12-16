package com.avito.android.rating_form.pseudo_done.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingFormPseudoDoneBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.interactor.i> f248855a;

    public f(Provider<com.avito.android.rating_form.interactor.i> provider) {
        this.f248855a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f248855a.get());
    }
}
