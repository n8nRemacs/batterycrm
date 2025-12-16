package com.avito.android.rating.details.answer.photo.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingAddAnswerPhotoBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.j> f246753a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f246754b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f246755c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f246756d;

    public g(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2) {
        this.f246753a = provider;
        this.f246754b = provider2;
        this.f246755c = lVar;
        this.f246756d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f246753a.get(), this.f246754b.get(), (Long) this.f246755c.f393949a, ((Boolean) this.f246756d.f393949a).booleanValue());
    }
}
