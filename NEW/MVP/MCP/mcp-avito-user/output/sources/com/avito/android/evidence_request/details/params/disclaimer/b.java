package com.avito.android.evidence_request.details.params.disclaimer;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DisclaimerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f148549a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f148550b;

    public b(Provider<c> provider, Provider<com.avito.android.util.text.a> provider2) {
        this.f148549a = provider;
        this.f148550b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f148549a.get(), this.f148550b.get());
    }
}
