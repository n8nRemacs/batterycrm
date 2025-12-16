package com.avito.android.rating_form.mvi;

import com.avito.android.rating_form.step.t;
import com.avito.android.rating_form.step.v;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingFormReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.y> f248797a;

    /* renamed from: b, reason: collision with root package name */
    public final v f248798b;

    public o(Provider provider, v vVar) {
        this.f248797a = provider;
        this.f248798b = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f248797a.get(), (t) this.f248798b.get());
    }
}
