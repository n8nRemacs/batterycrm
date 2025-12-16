package com.avito.android.rating_form.mvi;

import com.avito.android.rating_form.RatingFormArguments;
import com.avito.android.rating_form.step.t;
import com.avito.android.rating_form.step.v;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingResultMapperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class s implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f248805a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.y> f248806b;

    /* renamed from: c, reason: collision with root package name */
    public final v f248807c;

    public s(dagger.internal.l lVar, Provider provider, v vVar) {
        this.f248805a = lVar;
        this.f248806b = provider;
        this.f248807c = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q((RatingFormArguments) this.f248805a.f393949a, this.f248806b.get(), (t) this.f248807c.get());
    }
}
