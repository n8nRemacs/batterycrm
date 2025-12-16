package com.avito.android.rating.details.mvi;

/* compiled from: RatingDetailsOneTimeEventProducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class S implements dagger.internal.h<Q> {

    /* renamed from: a, reason: collision with root package name */
    public final cv.e f247264a;

    public S(cv.e eVar) {
        this.f247264a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Q((com.avito.android.deeplink_handler.handler.composite.a) this.f247264a.get());
    }
}
