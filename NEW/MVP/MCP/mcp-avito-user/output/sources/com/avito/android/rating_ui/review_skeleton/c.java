package com.avito.android.rating_ui.review_skeleton;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingReviewSkeletonItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f250123a;

    public c(u uVar) {
        this.f250123a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f250123a.get());
    }
}
