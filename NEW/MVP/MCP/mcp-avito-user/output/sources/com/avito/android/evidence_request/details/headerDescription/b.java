package com.avito.android.evidence_request.details.headerDescription;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HeaderDescriptionBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f148528a;

    public b(Provider<c> provider) {
        this.f148528a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f148528a.get());
    }
}
