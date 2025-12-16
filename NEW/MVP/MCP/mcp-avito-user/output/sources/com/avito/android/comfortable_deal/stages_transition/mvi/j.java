package com.avito.android.comfortable_deal.stages_transition.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StagesTransitionReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f122991a;

    public j(u uVar) {
        this.f122991a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.comfortable_deal.stages_transition.mvi.builder.a) this.f122991a.get());
    }
}
