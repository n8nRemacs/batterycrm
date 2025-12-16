package com.avito.android.rating.details.mvi;

import com.avito.android.rating.details.RatingDetailsArguments;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: RatingDetailsBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class M implements dagger.internal.h<I> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.rating.details.interactor.e> f247247a;

    /* renamed from: b, reason: collision with root package name */
    public final cv.e f247248b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f247249c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f247250d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f247251e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f247252f;

    public M(Provider provider, cv.e eVar, Provider provider2, dagger.internal.u uVar, dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f247247a = provider;
        this.f247248b = eVar;
        this.f247249c = provider2;
        this.f247250d = uVar;
        this.f247251e = lVar;
        this.f247252f = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new I(this.f247247a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f247248b.get(), this.f247249c.get(), (com.avito.android.rating_ux_feedback.b) this.f247250d.get(), (RatingDetailsArguments) this.f247251e.f393949a, ((Boolean) this.f247252f.f393949a).booleanValue());
    }
}
