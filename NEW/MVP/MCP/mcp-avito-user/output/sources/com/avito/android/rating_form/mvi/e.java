package com.avito.android.rating_form.mvi;

import com.avito.android.rating_form.RatingFormArguments;
import com.avito.android.rating_form.RatingFormStepProgressInteractor;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingFormActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f248706a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.interactor.i> f248707b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.rating_form.x f248708c;

    public e(dagger.internal.l lVar, Provider provider, com.avito.android.rating_form.x xVar) {
        this.f248706a = lVar;
        this.f248707b = provider;
        this.f248708c = xVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((RatingFormArguments) this.f248706a.f393949a, this.f248707b.get(), (RatingFormStepProgressInteractor) this.f248708c.get());
    }
}
