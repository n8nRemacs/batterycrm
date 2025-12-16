package com.avito.android.comfortable_deal.stages_transition;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StagesTransitionViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.stages_transition.mvi.f f122856a;

    public h(com.avito.android.comfortable_deal.stages_transition.mvi.f fVar) {
        this.f122856a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.comfortable_deal.stages_transition.mvi.e) this.f122856a.get(), null, 2, null);
    }
}
