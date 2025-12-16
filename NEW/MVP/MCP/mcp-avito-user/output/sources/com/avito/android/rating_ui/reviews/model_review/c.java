package com.avito.android.rating_ui.reviews.model_review;

import android.app.Activity;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingModelReviewItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f250175a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f250176b;

    public c(dagger.internal.l lVar, u uVar) {
        this.f250175a = uVar;
        this.f250176b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f250175a.get(), (Activity) this.f250176b.f393949a);
    }
}
