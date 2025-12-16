package com.avito.android.rating.details.answer.photo.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingAddAnswerPhotoOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f246769a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f246770b;

    public l(dagger.internal.l lVar, Provider provider) {
        this.f246769a = provider;
        this.f246770b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f246769a.get(), (Long) this.f246770b.f393949a);
    }
}
