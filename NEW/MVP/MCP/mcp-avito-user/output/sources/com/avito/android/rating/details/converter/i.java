package com.avito.android.rating.details.converter;

import javax.inject.Provider;

/* compiled from: RatingDetailsConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<y> f246934a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<m> f246935b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC34171c> f246936c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<k> f246937d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f246938e;

    public i(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f246934a = provider;
        this.f246935b = provider2;
        this.f246936c = provider3;
        this.f246937d = provider4;
        this.f246938e = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f246934a.get(), this.f246935b.get(), this.f246936c.get(), this.f246937d.get(), ((Boolean) this.f246938e.get()).booleanValue());
    }
}
