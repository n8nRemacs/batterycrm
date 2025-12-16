package com.avito.android.rating_ui.lmm_summary;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingLLMSummaryBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f250075a;

    public b(Provider<c> provider) {
        this.f250075a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f250075a.get());
    }
}
