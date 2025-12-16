package com.avito.android.rating_form;

/* compiled from: RatingFormIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.rating_form.features.c f248863a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.rating_form.activity.b f248864b;

    public q(com.avito.android.rating_form.features.c cVar, com.avito.android.rating_form.activity.b bVar) {
        this.f248863a = cVar;
        this.f248864b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p((com.avito.android.rating_form.features.a) this.f248863a.get(), (com.avito.android.rating_form.activity.a) this.f248864b.get());
    }
}
