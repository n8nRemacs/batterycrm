package com.avito.android.rating_ui.badge_score;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingBadgeScoreItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f249965a;

    public e(u uVar) {
        this.f249965a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((f) this.f249965a.get());
    }
}
