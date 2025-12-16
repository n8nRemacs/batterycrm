package com.avito.android.rating_ui.reviews.review;

import android.app.Activity;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingReviewItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f250345a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f250346b;

    public b(dagger.internal.l lVar, Provider provider) {
        this.f250345a = provider;
        this.f250346b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f250345a.get(), (Activity) this.f250346b.f393949a);
    }
}
