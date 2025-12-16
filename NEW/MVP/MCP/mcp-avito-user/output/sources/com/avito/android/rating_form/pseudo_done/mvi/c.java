package com.avito.android.rating_form.pseudo_done.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingFormPseudoDoneActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.interactor.i> f248850a;

    public c(Provider<com.avito.android.rating_form.interactor.i> provider) {
        this.f248850a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f248850a.get());
    }
}
